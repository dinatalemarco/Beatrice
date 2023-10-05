package it.univaq.disim.sose.project.placesofcity.business.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import it.univaq.disim.sose.project.placesofcity.business.AccountUserService;
import it.univaq.disim.sose.project.placesofcity.business.BusinessException;
import it.univaq.disim.sose.project.placesofcity.business.model.Login;
import it.univaq.disim.sose.project.placesofcity.business.model.MessageResponse;


@Service
public class AccountUserServiceImpl implements AccountUserService<MessageResponse,Login> {

	private static Logger LOGGER = LoggerFactory.getLogger(InfoCityServiceImpl.class);
	@Value("#{cfg.QueryDebug}")
	private Boolean DEBUG; 
	
	
	@Autowired
	private DataSource dataSource;	
	
	/* Definiamo una funzione che ci permetterà di creare un nuovo utente */
	@Override	
	public MessageResponse newUser(String name,String surname,String email, String password) throws BusinessException {
		
		MessageResponse result = new MessageResponse();

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;		
		
		try {

			/* Verifichiamo che la mail passata in input non sia già registrata nel sistema */
		    String queryValidateUser = "SELECT email FROM users WHERE  email = '"+ email +"'" ;

			con = dataSource.getConnection();
			st = con.createStatement();

			rs = st.executeQuery(queryValidateUser);
			con.close();
			
			if(rs.next()) {
				result.setResultValue(false);
				result.setMessage("La mail risulta essere già in uso");
				return result; 
			}else {
				/* La mail non risulta in uso procedo con la creazione dell'utente */
				
				con = dataSource.getConnection();
				
				/* Genero una user key per l'utente */
		        String CHARS = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890";
		        StringBuilder key = new StringBuilder();
		        while (key.length() < 20) { // length of the random string.
		            int index = (int) (new Random().nextFloat() * CHARS.length());
		            key.append(CHARS.charAt(index));
		        }
			 				
				/* Scrivo l'utente sul database */
				String query = "INSERT INTO users(name,surname,email,password,keystring) VALUES(?,?,?,?,?)";
				PreparedStatement preparedStatement = con.prepareStatement(query);
				preparedStatement.setString(1, name);
				preparedStatement.setString(2, surname);
				preparedStatement.setString(3, email);
				preparedStatement.setString(4, password);			
				preparedStatement.setString(5, key.toString());

				// execute insert SQL stetement
				preparedStatement .executeUpdate();	
				if(DEBUG) LOGGER.info(query);
				con.close();
								
				
				result.setResultValue(true);
				result.setMessage("Inserimento avvenuto con successo!!");
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
	public Login getSession(String email, String password) throws BusinessException {
		

		Login login = new Login();
	    String sql = "SELECT * FROM users WHERE  email = '"+ email +"' && password = '" + password +"'" ;
		if(DEBUG) LOGGER.info(sql);

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			st = con.createStatement();

			rs = st.executeQuery(sql);
			while (rs.next()) {
					
				login.setId(rs.getInt("id"));
				login.setEmail(rs.getString("email"));
				login.setName(rs.getString("name"));
				login.setSurname(rs.getString("surname"));
				login.setToken(rs.getString("keystring"));
					
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
		
		return login;
	}		
	
}
