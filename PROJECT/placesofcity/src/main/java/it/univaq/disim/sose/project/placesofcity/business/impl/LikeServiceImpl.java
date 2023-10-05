package it.univaq.disim.sose.project.placesofcity.business.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

import it.univaq.disim.sose.project.placesofcity.business.BusinessException;
import it.univaq.disim.sose.project.placesofcity.business.LikeService;
import it.univaq.disim.sose.project.placesofcity.business.model.MessageResponse;

@Service
public class LikeServiceImpl implements LikeService<MessageResponse, Integer> {

	
	private static Logger LOGGER = LoggerFactory.getLogger(InfoCityServiceImpl.class);
	@Value("#{cfg.QueryDebug}")
	private Boolean DEBUG; 
	
	
	@Autowired
	private DataSource dataSource;	
	
	
	@Override
	public MessageResponse addLike(int id_activity, String token_user) throws BusinessException {

		MessageResponse result = new MessageResponse();
		
		int user = 0;
		int val_like = 0;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;		
		
		try {

		    String queryValidateUser = "SELECT * FROM users WHERE  keystring = '"+ token_user +"'" ;

			con = dataSource.getConnection();
			st = con.createStatement();

			rs = st.executeQuery(queryValidateUser);
			con.close();
				
			while(rs.next()) {
				user = rs.getInt("id");
			}
			
			if(user != 0) {
			
			
		    String queryValidateLike = "SELECT * FROM likes WHERE  id_user = '"+ user +"' AND id_activity = '"+ id_activity + "'";

			con = dataSource.getConnection();
			st = con.createStatement();

			rs = st.executeQuery(queryValidateLike);
			con.close();
				
			while(rs.next()) {val_like++;}				
				
				if(val_like == 0) {
					con = dataSource.getConnection();
					
					String query = "INSERT INTO likes(id_user,id_activity) VALUES(?,?)";
					PreparedStatement preparedStatement = con.prepareStatement(query);
					preparedStatement.setInt(1, user);
					preparedStatement.setInt(2, id_activity);
	
					// execute insert SQL stetement
					preparedStatement .executeUpdate();	
					if(DEBUG) LOGGER.info(query);
					con.close();
					
					result.setResultValue(true);
					result.setMessage("Inserimento avvenuto con successo!!");
					return result; 
					
				}else {
					result.setResultValue(false);
					result.setMessage("Like già inserito per questa attività");
					return result; 
				} 
			
			}else {
				result.setResultValue(false);
				result.setMessage("L'utente non risulta nel sistema");
				return result; 
			}
			



		} catch (SQLException e) {
			e.printStackTrace();
			throw new BusinessException(e);
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}

		}
		
	}	

	
	@Override
	public List<Integer> getLikeByUser(String token_user) throws BusinessException {

		List<Integer> result = new ArrayList<Integer>();
		int cont=0;
		int User = 0;

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			
		    String queryValidateUser = "SELECT id FROM users WHERE  keystring = '"+ token_user +"'" ;
		    if(DEBUG) LOGGER.info(queryValidateUser);
		    
			con = dataSource.getConnection();
			st = con.createStatement();

			rs = st.executeQuery(queryValidateUser);
			con.close();
				
			while(rs.next()) {
				User = rs.getInt("id");
			}			
			
			String sql = "SELECT * FROM likes WHERE id_user = '"+User+"'" ;
			if(DEBUG) LOGGER.info(sql);

			con = dataSource.getConnection();
			st = con.createStatement();

			rs = st.executeQuery(sql);
			
			while (rs.next()) {
				result.add(rs.getInt("id_activity")) ;
				cont++;
			}			
			
			con.close();
			
		return result;
			

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
		
		
	}			
	
	
}
