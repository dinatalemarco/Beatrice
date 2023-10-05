package ${package}.api;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import ${package}.client.placesofcity.InsertVerificationLikeResponse;
import ${package}.client.placesofcity.LikeResponse;
import ${package}.client.placesofcity.LoginResponse;
import ${package}.business.ServiceDefinition;
import ${package}.business.impl.LoadBalancerRequest;
import ${package}.model.ActivityCollectionResult;
import ${package}.model.InfoPointToPoint;
import ${package}.model.Route;



@Controller("controller_${artifactId}")
public class REST {
	private static Logger LOGGER = LoggerFactory.getLogger(REST.class);
	
	@Value("#{cfg.RequestServiceDebug}")
	private Boolean DEBUG; 

	@Autowired
	private LoadBalancerRequest loadbalancer;
	
	@Autowired
	private ServiceDefinition service;		

	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/mapsp2p/{startLon}/{startLat}/{endLon}/{endLat}")
	/* Richiesta di calcolo della distanza e dei tempi tra un punto e d un altro per i diversi
	   tipi di mezzi di locomozione */
	//http://localhost:8080/travelmanager/api/mapsp2p/13.894653000000062/42.056678/13.9216768/42.0587382
	public InfoPointToPoint REST_allPointToPoint(@PathParam("startLon")String startLon,@PathParam("startLat")String startLat,@PathParam("endLon")String endLon,@PathParam("endLat")String endLat) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (GET INFO POINT TO POIN) :" + startLon + "/" + startLat + "/" + endLon + "/" + endLat); 
		return service.getInfoPointToPointMap(startLon,startLat,endLon,endLat);
	}	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/mapsc/{means}/{startLon}/{startLat}/{endLon}/{endLat}")
	/* Richiede il percorso più conveniete per spostarsi da un punto ad un altro della mappa, 
	   a seconda del mezzo di locomozione scelto */
	//http://localhost:8080/travelmanager/api/mapsc/cycling/13.894653000000062/42.056678/13.9216768/42.0587382
	public Route REST_allCoordinates(@PathParam("means")String means,@PathParam("startLon")String startLon,@PathParam("startLat")String startLat,@PathParam("endLon")String endLon,@PathParam("endLat")String endLat) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (GET COORDINATES ROUTE POINT TO POINT) :" + means + "/" + startLon + "/" + startLat + "/" + endLon + "/" + endLat);
		
		return service.getCoordinatesDestinationMap(means,startLon,startLat,endLon,endLat);
	}
	
	
	
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/login/{email}/{password}")
	/* Effettuaiamo il login, passando email e password */
	//http://localhost:8080/travelmanager/api/login/dinatalemarco90@gmail.com/123456789
	public LoginResponse REST_login(@PathParam("email") String email,@PathParam("password") String password) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (LOGIN) :" + email +"/"+ password);
		
		return service.login(email,password);
	}	
	
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/verificationlike/{id_user}")
	/* Restituimo tutti i likes che l'utente ha inserito sulle varie attività*/
	//http://localhost:8080/travelmanager/api/verificationlike/1
	public InsertVerificationLikeResponse REST_VerificationLike(@PathParam("id_user") int id_user) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (VERIFICATION LIKES) : verificationlike/" + id_user );
		
		return service.InsertVerificationLike(id_user);
	}				
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/mapsViewActivity/{city}")
	/* Richiede tutte le attività presenti in una città */
	//http://localhost:8080/travelmanager/api/mapsViewActivity/Aquila
	public ActivityCollectionResult REST_InfoViewActivity(@PathParam("city")String city) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (GET ACTIVITY LIST BY CITY) :" +city+"/"); 
		return service.ActivityList(city);
	}	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/mapsView/{city}/profile/{profile}")
	/* Richiede le attività presenti in una città per una determinata categoria */
	//http://localhost:8080/travelmanager/api/mapsView/Aquila/NERD
	public ActivityCollectionResult REST_InfoViewActivity(@PathParam("city")String city,@PathParam("profile")String profile) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (INFO ACTIVITY CITY BY PROFILE) :" +city+"/"+profile); 
		return service.ActivityListProfile(city,profile);
	}	
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/like/user/{id_user}/activity/{id_activity}/key/{key}")
	/* Richiesta di aggiunta di un like per una determinata attività da un utente */
	//http://localhost:8080/travelmanager/api/like/user/1/activity/1/key/dhsjgfhjdsfjhdsgfhjdsgjhf
	public LikeResponse REST_addLike(@PathParam("id_user") int id_user,@PathParam("id_activity") int id_activity,@PathParam("key") String key){
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (INSERT NEW LIKE) :" + id_user +"/"+id_activity+"/"+key);
		
		return service.addlike(id_user,id_activity,key);
	}	
	
	

	
}
