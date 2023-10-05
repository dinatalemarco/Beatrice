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

import ${package}.client.placesofcity.AddCommentResponse;
import ${package}.client.placesofcity.AddLikeResponse;
import ${package}.client.placesofcity.GetCommentResponse;
import ${package}.client.placesofcity.GetLikeResponse;
import ${package}.client.placesofcity.LoginResponse;
import ${package}.client.placesofcity.RegisterResponse;
import ${package}.model.ActivityCollectionResult;
import ${package}.model.InfoPointToPoint;
import ${package}.model.Route;
import ${package}.business.CommentService;
import ${package}.business.MapBoxService;
import ${package}.business.ActivityCityService;
import ${package}.business.LikeService;
import ${package}.business.UserAccountService;



@Controller("controller_${artifactId}")
public class REST${artifactId} {
	private static Logger LOGGER = LoggerFactory.getLogger(REST${artifactId}.class);
	
	@Value("#{cfg.RequestServiceDebug}")
	private Boolean DEBUG; 
	
	@Autowired
	private CommentService<AddCommentResponse,GetCommentResponse> CommentService;		
	@Autowired
	private MapBoxService<InfoPointToPoint,Route> MapBoxService;	
	@Autowired
	private ActivityCityService<ActivityCollectionResult> ActivityCityService;	
	@Autowired
	private UserAccountService<RegisterResponse,LoginResponse> UserAccountService;		
	@Autowired
	private LikeService<AddLikeResponse,GetLikeResponse> LikeService;	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/mapsp2p/{startLon}/{startLat}/{endLon}/{endLat}")
	/* Richiesta di calcolo della distanza e dei tempi tra un punto e d un altro per i diversi
	   tipi di mezzi di locomozione */
	//http://localhost:8080/travelmanager/api/mapsp2p/13.894653000000062/42.056678/13.9216768/42.0587382
	public InfoPointToPoint REST_getInfoPoint2PointByMeans(@PathParam("startLon")String startLon,@PathParam("startLat")String startLat,@PathParam("endLon")String endLon,@PathParam("endLat")String endLat) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (GET INFO POINT TO POIN) :" + startLon + "/" + startLat + "/" + endLon + "/" + endLat); 
		return MapBoxService.getInfoPointToPointMap(startLon,startLat,endLon,endLat);
	}	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/mapsc/{means}/{startLon}/{startLat}/{endLon}/{endLat}")
	/* Richiede il percorso più conveniete per spostarsi da un punto ad un altro della mappa, 
	   a seconda del mezzo di locomozione scelto */
	//http://localhost:8080/travelmanager/api/mapsc/cycling/13.894653000000062/42.056678/13.9216768/42.0587382
	public Route REST_getRoutePoint2Point(@PathParam("means")String means,@PathParam("startLon")String startLon,@PathParam("startLat")String startLat,@PathParam("endLon")String endLon,@PathParam("endLat")String endLat) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (GET COORDINATES ROUTE POINT TO POINT) :" + means + "/" + startLon + "/" + startLat + "/" + endLon + "/" + endLat);
		
		return MapBoxService.getCoordinatesDestinationMap(means,startLon,startLat,endLon,endLat);
	}
	
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/register/{name}/{surname}/{email}/{password}")
	/* Effettuaiamo il login, passando email e password */
	//http://localhost:8080/travelmanager/api/register/provaname/provasurname/prova@gmail.com/123456789
	public RegisterResponse REST_register(@PathParam("name") String name,@PathParam("surname") String surname,@PathParam("email") String email,@PathParam("password") String password) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (LOGIN) :"+name+"/"+surname+"/"+ email +"/"+ password);
		
		return UserAccountService.register(name, surname, email, password);
	}	
	
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/login/{email}/{password}")
	/* Effettuaiamo il login, passando email e password */
	//http://localhost:8080/travelmanager/api/login/dinatalemarco90@gmail.com/123456789
	public LoginResponse REST_login(@PathParam("email") String email,@PathParam("password") String password) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (LOGIN) :" + email +"/"+ password);
		
		return UserAccountService.login(email,password);
	}					
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/mapsViewActivity/{city}")
	/* Richiede tutte le attività presenti in una città */
	//http://localhost:8080/travelmanager/api/mapsViewActivity/Aquila
	public ActivityCollectionResult REST_ActivityList(@PathParam("city")String city) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (GET ACTIVITY LIST BY CITY) :" +city+"/"); 
		return ActivityCityService.ActivityList(city);
	}	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/mapsView/{city}/profile/{profile}")
	/* Richiede le attività presenti in una città per una determinata categoria */
	//http://localhost:8080/travelmanager/api/mapsView/Aquila/NERD
	public ActivityCollectionResult REST_ActivityListByProfile(@PathParam("city")String city,@PathParam("profile")String profile) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (INFO ACTIVITY CITY BY PROFILE) :" +city+"/"+profile); 
		return ActivityCityService.ActivityListProfile(city,profile);
	}	
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/like/activity/{id_activity}/key/{key}")
	/* Richiesta di aggiunta di un like per una determinata attività da un utente */
	//http://localhost:8080/travelmanager/api/like/activity/1/key/dhsjgfhjdsfjhdsgfhjdsgjhf
	public AddLikeResponse REST_addLike(@PathParam("id_activity") int id_activity,@PathParam("key") String key){
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (INSERT NEW LIKE) :" +id_activity+"/"+key);
		
		return LikeService.addlike(id_activity,key);
	}	
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/getlike/{token_user}")
	/* Restituimo tutti i likes che l'utente ha inserito sulle varie attività*/
	//http://localhost:8080/travelmanager/api/getlike/1
	public GetLikeResponse REST_getLikeByUser(@PathParam("token_user") String token_user) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (VERIFICATION LIKES) : verificationlike/" + token_user );
		
		return LikeService.getLikeByUser(token_user);
	}	
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/addcomment/activity/{activity}/key/{key}/title/{title}/comment/{comment}")
	/* Richiesta di aggiunta di un like per una determinata attività da un utente */
	//http://localhost:8080/travelmanager/api/addcomment/activity/1/key/dhsjgfhjdsfjhdsgfhjdsgjhf/title/provarest/comment/prova
	public AddCommentResponse REST_addComment(@PathParam("activity") int activity,@PathParam("key") String key,@PathParam("title") String title,@PathParam("comment") String comment){
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (INSERT NEW COMMENT) :" + activity +"/"+key+"/"+key+"/"+title+"/"+comment);
		
		return CommentService.addComment(activity, key, title, comment);
	}	
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/getcomment/activity/{activity}")
	/* Richiesta di aggiunta di un like per una determinata attività da un utente */
	//http://localhost:8080/travelmanager/api/getcomment/activity/1
	public GetCommentResponse REST_getComment(@PathParam("activity") int activity){
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (INSERT NEW COMMENT) :" + activity );
		
		return CommentService.getComment(activity);
	}		

	
}
