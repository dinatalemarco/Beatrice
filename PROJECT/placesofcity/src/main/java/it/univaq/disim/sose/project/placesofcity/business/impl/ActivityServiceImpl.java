package it.univaq.disim.sose.project.placesofcity.business.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import it.univaq.disim.sose.project.placesofcity.business.ActivityService;
import it.univaq.disim.sose.project.placesofcity.business.BusinessException;
import it.univaq.disim.sose.project.placesofcity.business.model.ActivityModel;
import it.univaq.disim.sose.project.placesofcity.webservices.PlacesOfCityPTImpl;

@Service
public class ActivityServiceImpl implements ActivityService<ActivityModel> {

	private static Logger LOGGER = LoggerFactory.getLogger(PlacesOfCityPTImpl.class);
	@Value("#{cfg.WebServiceDebug}")
	private Boolean DEBUG; 
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public List<ActivityModel> getActivityCity(int city) throws BusinessException {
		

		List<ActivityModel> result = new ArrayList<>();

		String sql = "SELECT * FROM activity WHERE  city = '"+ city +"' ORDER BY name ASC" ;
		
		if(DEBUG) LOGGER.info(sql);

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ResultSet resc = null;
		
		try {
			con = dataSource.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(sql);
			con.close();
			while (rs.next()) {
	
				ActivityModel activity = new ActivityModel();
					
				activity.setId(rs.getInt("id"));
				activity.setName(rs.getString("name"));
				activity.setPhone(rs.getString("phone"));
				activity.setLongitude(rs.getString("longitude"));
				activity.setLatitude(rs.getString("latitude"));
				activity.setImage(rs.getString("image"));
				activity.setStreet(rs.getString("street"));
				activity.setProfile(rs.getString("profile"));
				activity.setWeather(rs.getString("weather"));
				activity.setStartHour(rs.getString("start_hour"));
				activity.setEndHour(rs.getString("end_hour"));
					
				con = dataSource.getConnection();
				st = con.createStatement();
				resc = st.executeQuery("SELECT COUNT(*) AS count "
									 + "FROM likes "
									 + "WHERE id_activity = '"+rs.getInt("id")+"'");
				con.close();
				
				while (resc.next()) {
					activity.setNumberOfLikes(resc.getInt("count"));
				}				
				
				result.add(activity);
					
			}
			

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
		
		return result;
	}

	@Override
	public List<ActivityModel> getActivityCityByProfile(int city,String profile) throws BusinessException {
		

		List<ActivityModel> result = new ArrayList<>();
		
		String sql = "SELECT * FROM activity WHERE  city = '"+ city +"' AND profile = '"+profile+"' ORDER BY name ASC";

		if(DEBUG) LOGGER.info(sql);

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ResultSet resc = null;
		
		try {
			con = dataSource.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(sql);
			con.close();
			while (rs.next()) {
					
				ActivityModel activity = new ActivityModel();
					
				activity.setId(rs.getInt("id"));
				activity.setName(rs.getString("name"));
				activity.setPhone(rs.getString("phone"));
				activity.setLongitude(rs.getString("longitude"));
				activity.setLatitude(rs.getString("latitude"));
				activity.setImage(rs.getString("image"));
				activity.setStreet(rs.getString("street"));
				activity.setProfile(rs.getString("profile"));
				activity.setWeather(rs.getString("weather"));
				activity.setStartHour(rs.getString("start_hour"));
				activity.setEndHour(rs.getString("end_hour"));
				
				con = dataSource.getConnection();
				st = con.createStatement();
				resc = st.executeQuery("SELECT COUNT(*) AS count "
									 + "FROM likes "
									 + "WHERE id_activity = '"+rs.getInt("id")+"'");
				con.close();
				
				while (resc.next()) {
					activity.setNumberOfLikes(resc.getInt("count"));
				}
								
				result.add(activity);	

			}
			

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
		
		return result;
	}	
	
	
	
}
