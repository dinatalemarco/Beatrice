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

import it.univaq.disim.sose.project.placesofcity.CommentItem;
import it.univaq.disim.sose.project.placesofcity.business.BusinessException;
import it.univaq.disim.sose.project.placesofcity.business.CommentService;
import it.univaq.disim.sose.project.placesofcity.business.model.MessageResponse;


@Service
public class CommentServiceImpl implements CommentService<MessageResponse,CommentItem> {

	private static Logger LOGGER = LoggerFactory.getLogger(InfoCityServiceImpl.class);
	@Value("#{cfg.QueryDebug}")
	private Boolean DEBUG; 
	
	
	@Autowired
	private DataSource dataSource;	
	
	
	@Override	
	public MessageResponse addComment(int id_activity, String key, String title, String comment) throws BusinessException {

		MessageResponse result = new MessageResponse();
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;	
		
		int User=0;
		Boolean checkActivity=false;
		
		try {

		    String queryValidateUser = "SELECT id FROM users WHERE  keystring = '"+ key +"'" ;

			con = dataSource.getConnection();
			st = con.createStatement();

			rs = st.executeQuery(queryValidateUser);
			con.close();
				
			while(rs.next()) {
				User = rs.getInt("id");
			}	
	
			
		    String queryValidateLike = "SELECT COUNT(*) AS count FROM activity WHERE id = '"+ id_activity + "'";

			con = dataSource.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(queryValidateLike);
			
			con.close();
			
			while(rs.next()){
				checkActivity = rs.getBoolean("count");	
			}
				
			
				
			if(User != 0 && checkActivity) {
				con = dataSource.getConnection();
				
				String query = "INSERT INTO comments(id_activity,user,title,text) VALUES(?,?,?,?)";
				PreparedStatement preparedStatement = con.prepareStatement(query);
				preparedStatement.setInt(1, id_activity);
				preparedStatement.setInt(2, User);
				preparedStatement.setString(3, title);
				preparedStatement.setString(4, comment);

				// execute insert SQL stetement
				preparedStatement .executeUpdate();	
				if(DEBUG) LOGGER.info(query);
				con.close();
				
				result.setResultValue(true);
				result.setMessage("Inserimento avvenuto con successo");
				return result; 
				
			}else {
				result.setResultValue(false);
				result.setMessage("L'utente non risulta essere valido");
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
	public List<CommentItem> getComments(int activity) throws BusinessException {
		

		List<CommentItem> result = new ArrayList<>();
		
		String sql = "SELECT * FROM comments WHERE  id_activity = '"+ activity +"' ORDER BY id DESC";

		if(DEBUG) LOGGER.info(sql);

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			st = con.createStatement();

			rs = st.executeQuery(sql);
			while (rs.next()) {
					
				CommentItem comment = new CommentItem();
				comment.setId(rs.getInt("id"));
				comment.setTitle(rs.getString("title"));
				comment.setText(rs.getString("text"));
								
				result.add(comment);	

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
		
		return result;
	}			
	
}
