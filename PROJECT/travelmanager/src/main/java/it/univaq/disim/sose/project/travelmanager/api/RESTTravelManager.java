package it.univaq.disim.sose.project.travelmanager.api;


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

import it.univaq.disim.sose.project.client.placesofcity.AddCommentResponse;
import it.univaq.disim.sose.project.client.placesofcity.AddLikeResponse;
import it.univaq.disim.sose.project.client.placesofcity.GetCommentResponse;
import it.univaq.disim.sose.project.client.placesofcity.GetLikeResponse;
import it.univaq.disim.sose.project.client.placesofcity.LoginResponse;
import it.univaq.disim.sose.project.client.placesofcity.RegisterResponse;
import it.univaq.disim.sose.project.travelmanager.business.CommentService;
import it.univaq.disim.sose.project.travelmanager.business.MapBoxService;
import it.univaq.disim.sose.project.travelmanager.business.ActivityCityService;
import it.univaq.disim.sose.project.travelmanager.business.LikeService;
import it.univaq.disim.sose.project.travelmanager.business.UserAccountService;
import it.univaq.disim.sose.project.travelmanager.model.ActivityCollectionResult;
import it.univaq.disim.sose.project.travelmanager.model.InfoPointToPoint;
import it.univaq.disim.sose.project.travelmanager.model.Route;



@Controller("controller_travelmanager")
public class RESTTravelManager {
	private static Logger LOGGER = LoggerFactory.getLogger(RESTTravelManager.class);
	
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
	@Path("/maps-info-point2point/start/{startLon}/{startLat}/end/{endLon}/{endLat}")
	/* Richiesta di calcolo della distanza e dei tempi tra un punto e d un altro per i diversi
	   tipi di mezzi di locomozione */
	//http://localhost:8080/travelmanager/api/maps-info-point2point/start/13.894653000000062/42.056678/end/13.9216768/42.0587382
	public InfoPointToPoint infoPoint2PointByMeans(@PathParam("startLon")String startLon,@PathParam("startLat")String startLat,@PathParam("endLon")String endLon,@PathParam("endLat")String endLat) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (GET INFO POINT TO POIN) :" + startLon + "/" + startLat + "/" + endLon + "/" + endLat); 
		return MapBoxService.getInfoPointToPointMap(startLon,startLat,endLon,endLat);
	}	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/maps-cordinates/means/{means}/start/{startLon}/{startLat}/end/{endLon}/{endLat}")
	/* Richiede il percorso più conveniete per spostarsi da un punto ad un altro della mappa, 
	   a seconda del mezzo di locomozione scelto */
	//http://localhost:8080/travelmanager/api/maps-cordinates/means/cycling/start/13.894653000000062/42.056678/end/13.9216768/42.0587382
	public Route routePoint2Point(@PathParam("means")String means,@PathParam("startLon")String startLon,@PathParam("startLat")String startLat,@PathParam("endLon")String endLon,@PathParam("endLat")String endLat) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (GET COORDINATES ROUTE POINT TO POINT) :" + means + "/" + startLon + "/" + startLat + "/" + endLon + "/" + endLat);
		
		return MapBoxService.getCoordinatesDestinationMap(means,startLon,startLat,endLon,endLat);
	}
	
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/register/{name}/{surname}/{email}/{password}")
	/* Effettuaiamo il login, passando email e password */
	//http://localhost:8080/travelmanager/api/register/provaname/provasurname/prova@gmail.com/123456789
	public RegisterResponse register(@PathParam("name") String name,@PathParam("surname") String surname,@PathParam("email") String email,@PathParam("password") String password) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (LOGIN) :"+name+"/"+surname+"/"+ email +"/"+ password);
		
		return UserAccountService.register(name, surname, email, password);
	}	
	
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/login/{email}/{password}")
	/* Effettuaiamo il login, passando email e password */
	//http://localhost:8080/travelmanager/api/login/dinatalemarco90@gmail.com/123456789
	public LoginResponse login(@PathParam("email") String email,@PathParam("password") String password) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (LOGIN) :" + email +"/"+ password);
		
		return UserAccountService.login(email,password);
	}					
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/city-activities/{city}")
	/* Richiede tutte le attività presenti in una città */
	//http://localhost:8080/travelmanager/api/city-activities/Aquila
	public ActivityCollectionResult activityList(@PathParam("city")String city) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (GET ACTIVITY LIST BY CITY) :" +city+"/"); 
		return ActivityCityService.activityList(city);
	}	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/city-activities-by-profile/{city}/profile/{profile}")
	/* Richiede le attività presenti in una città per una determinata categoria */
	//http://localhost:8080/travelmanager/api/city-activities-by-profile/Aquila/profile/NERD
	public ActivityCollectionResult activityListByProfile(@PathParam("city")String city,@PathParam("profile")String profile) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (INFO ACTIVITY CITY BY PROFILE) :" +city+"/"+profile); 
		return ActivityCityService.activityListProfile(city,profile);
	}	
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/like/activities/{activityId}/user-key/{userKey}")
	/* Richiesta di aggiunta di un like per una determinata attività da un utente */
	//http://localhost:8080/travelmanager/api/like/activities/1/user-key/dhsjgfhjdsfjhdsgfhjdsgjhf
	public AddLikeResponse addLike(@PathParam("activityId") int activityId,@PathParam("userKey") String userKey){
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (INSERT NEW LIKE) :" +activityId+"/"+userKey);
		
		return LikeService.addlike(activityId,userKey);
	}	
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/user-likes/{userKey}")
	/* Restituimo tutti i likes che l'utente ha inserito sulle varie attività*/
	//http://localhost:8080/travelmanager/api/user-likes/176876tuyghfgfd
	public GetLikeResponse likeByUser(@PathParam("userKey") String userKey) {
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (VERIFICATION LIKES) : verificationlike/" + userKey );
		
		return LikeService.getLikeByUser(userKey);
	}	
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/add-comment/activities/{activityId}/user-key/{userKey}/title/{title}/comment/{comment}")
	/* Richiesta di aggiunta di un like per una determinata attività da un utente */
	//http://localhost:8080/travelmanager/api/add-comment/activities/1/user-key/dhsjgfhjdsfjhdsgfhjdsgjhf/title/provarest/comment/prova
	public AddCommentResponse addComment(@PathParam("activityId") int activityId,@PathParam("userKey") String userKey,@PathParam("title") String title,@PathParam("comment") String comment){
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (INSERT NEW COMMENT) :" + activityId +"/"+activityId+"/"+userKey+"/"+title+"/"+comment);
		
		return CommentService.addComment(activityId, userKey, title, comment);
	}	
	
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/comments-by-activity/activities/{activityId}")
	/* Richiesta di aggiunta di un like per una determinata attività da un utente */
	//http://localhost:8080/travelmanager/api/comments-by-activity/activities/1
	public GetCommentResponse allComment(@PathParam("activityId") int activityId){
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (INSERT NEW COMMENT) :" + activityId );
		
		return CommentService.getComment(activityId);
	}		

	
}
