package it.univaq.disim.sose.project.placesofcity.business.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import it.univaq.disim.sose.project.placesofcity.business.BusinessException;
import it.univaq.disim.sose.project.placesofcity.business.InfoCityService;
import it.univaq.disim.sose.project.placesofcity.business.model.City;

@Service
public class InfoCityServiceImpl implements InfoCityService<City> {
	
	private static Logger LOGGER = LoggerFactory.getLogger(InfoCityServiceImpl.class);
	@Value("#{cfg.QueryDebug}")
	private Boolean DEBUG; 
	
	
	@Autowired
	private DataSource dataSource;
	
	
	@Override
	public City getCity(String name) throws BusinessException {
		

		City city = new City();
	    String sql = "SELECT * FROM city WHERE  name = '"+ name +"'" ;
	    if(DEBUG) LOGGER.info(sql);

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			st = con.createStatement();

			rs = st.executeQuery(sql);
			while (rs.next()) {
			
				city.setId(rs.getInt("id"));
				city.setName(rs.getString("name"));
				city.setLongitude(rs.getString("longitude"));
				city.setLatitude(rs.getString("latitude"));
				
			}
			
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new BusinessException(e);
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}

		}
		
		return city;
	}	
	
	
}
