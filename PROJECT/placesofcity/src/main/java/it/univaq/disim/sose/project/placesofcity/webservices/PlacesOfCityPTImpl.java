package it.univaq.disim.sose.project.placesofcity.webservices;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import it.univaq.disim.sose.project.placesofcity.ActivityByProfileRequest;
import it.univaq.disim.sose.project.placesofcity.ActivityItem;
import it.univaq.disim.sose.project.placesofcity.ActivityRequest;
import it.univaq.disim.sose.project.placesofcity.ActivityResponse;
import it.univaq.disim.sose.project.placesofcity.AddCommentRequest;
import it.univaq.disim.sose.project.placesofcity.AddCommentResponse;
import it.univaq.disim.sose.project.placesofcity.AddLikeRequest;
import it.univaq.disim.sose.project.placesofcity.AddLikeResponse;
import it.univaq.disim.sose.project.placesofcity.CityRequest;
import it.univaq.disim.sose.project.placesofcity.CityResponse;
import it.univaq.disim.sose.project.placesofcity.CommentItem;
import it.univaq.disim.sose.project.placesofcity.GetCommentRequest;
import it.univaq.disim.sose.project.placesofcity.GetCommentResponse;
import it.univaq.disim.sose.project.placesofcity.GetLikeRequest;
import it.univaq.disim.sose.project.placesofcity.GetLikeResponse;
import it.univaq.disim.sose.project.placesofcity.LoginRequest;
import it.univaq.disim.sose.project.placesofcity.LoginResponse;
import it.univaq.disim.sose.project.placesofcity.PlacesOfCity;
import it.univaq.disim.sose.project.placesofcity.RegisterRequest;
import it.univaq.disim.sose.project.placesofcity.RegisterResponse;
import it.univaq.disim.sose.project.placesofcity.ResponseLoginType;
import it.univaq.disim.sose.project.placesofcity.business.ActivityService;
import it.univaq.disim.sose.project.placesofcity.business.CommentService;
import it.univaq.disim.sose.project.placesofcity.business.LikeService;
import it.univaq.disim.sose.project.placesofcity.business.InfoCityService;
import it.univaq.disim.sose.project.placesofcity.business.AccountUserService;
import it.univaq.disim.sose.project.placesofcity.business.model.ActivityModel;
import it.univaq.disim.sose.project.placesofcity.business.model.City;
import it.univaq.disim.sose.project.placesofcity.business.model.Login;
import it.univaq.disim.sose.project.placesofcity.business.model.MessageResponse;


@Component(value = "PlacesOfCityPTImpl")
public class PlacesOfCityPTImpl implements PlacesOfCity {

	private static Logger LOGGER = LoggerFactory.getLogger(PlacesOfCityPTImpl.class);
	@Value("#{cfg.WebServiceDebug}")
	private Boolean DEBUG; 
	
	@Autowired
	private InfoCityService<City> InfoCityService;
	@Autowired
	private ActivityService<ActivityModel> ActivityService;	
	@Autowired
	private CommentService<MessageResponse,CommentItem> CommentService;	
	@Autowired
	private LikeService<MessageResponse,Integer> LikeService;	
	@Autowired
	private AccountUserService<MessageResponse,Login> AccountUserService;		

	
	
	@Override
	public CityResponse city(CityRequest parameters) {

		if(DEBUG) LOGGER.info("REST PROUMER REQUEST (GET INFO CITY)");
		try {

			City city = InfoCityService.getCity(parameters.getCity());
			CityResponse response = new CityResponse();
			response.setId(city.getId());
			response.setName(city.getName());
			response.setLongitude(city.getLongitude());
			response.setLatitude(city.getLatitude());
			
			return response;
			
		} 
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
		
	}	
	
	
	@Override
	public RegisterResponse register(RegisterRequest parameters) {

		if(DEBUG) LOGGER.info("REST PROUMER REQUEST (REGISTER)");
		try {

			MessageResponse registerResult = AccountUserService.newUser(parameters.getName(),parameters.getSurname(),parameters.getEmail(), parameters.getPassword());

			RegisterResponse response = new RegisterResponse();
							 response.setValueResponse(registerResult.getResultValue());
							 response.setMessageResponse(registerResult.getMessage());
							 


			return response;
		} 
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}

	}	
	
	
	@Override
	public LoginResponse login(LoginRequest parameters) {

		if(DEBUG) LOGGER.info("REST PROUMER REQUEST (GET INFO LOGIN)");
		try {

			Login login = AccountUserService.getSession(parameters.getEmail(), parameters.getPassword());
			LoginResponse response = new LoginResponse();
		
				ResponseLoginType sessionInfoType = new ResponseLoginType();
				sessionInfoType.setId(login.getId());
				sessionInfoType.setName(login.getName());
				sessionInfoType.setSurname(login.getSurname());
				sessionInfoType.setEmail(login.getEmail());
				sessionInfoType.setToken(login.getToken());
				
				response.setSession(sessionInfoType);
				response.getSession();

			return response;
		} 
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}

	}		
	

	@Override
	public ActivityResponse activity(ActivityRequest parameters) {

		if(DEBUG) LOGGER.info("REST PROUMER REQUEST (GET ACTIVITY CITY)");
		try {

			List<ActivityModel> activities = ActivityService.getActivityCity(parameters.getCity());

			ActivityResponse response = new ActivityResponse();
				
			
			for (ActivityModel activity : activities) {

				ActivityItem item = new ActivityItem();
				item.setId(activity.getId());
				item.setName(activity.getName());
				item.setPhone(activity.getPhone());
				item.setLongitude(activity.getLongitude());
				item.setLatitude(activity.getLatitude());
				item.setImage(activity.getImage());
				item.setStreet(activity.getStreet());
				item.setProfile(activity.getProfile());
				item.setWeather(activity.getWeather());
				item.setStartHour(activity.getStartHour());
				item.setEndHour(activity.getEndHour());
				item.setNumberOfLikes(activity.getNumberOfLikes());
				response.getItem().add(item);
							
			
			}

			return response;
		} 
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
		
	}
	
	@Override
	public ActivityResponse activityByProfile(ActivityByProfileRequest parameters) {

		if(DEBUG) LOGGER.info("REST PROUMER REQUEST (GET ACTIVITY CITY BY PROFILE)");
		try {

			List<ActivityModel> activitis = ActivityService.getActivityCityByProfile(parameters.getCity(),parameters.getProfile());

			ActivityResponse response = new ActivityResponse();
				
			
			for (ActivityModel activity : activitis) {

				ActivityItem item = new ActivityItem();
				item.setId(activity.getId());
				item.setName(activity.getName());
				item.setPhone(activity.getPhone());
				item.setLongitude(activity.getLongitude());
				item.setLatitude(activity.getLatitude());
				item.setImage(activity.getImage());
				item.setStreet(activity.getStreet());
				item.setProfile(activity.getProfile());
				item.setWeather(activity.getWeather());
				item.setStartHour(activity.getStartHour());
				item.setEndHour(activity.getEndHour());
				item.setNumberOfLikes(activity.getNumberOfLikes());
				response.getItem().add(item);
							
			
			}

			return response;
		} 
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
		
	}	
	
	
	@Override
	public AddLikeResponse addLike(AddLikeRequest parameters) {

		if(DEBUG) LOGGER.info("REST PROUMER REQUEST (GET INFO INSERT LIKE)");
		try {

			MessageResponse like = LikeService.addLike(parameters.getIdActivity(), parameters.getKey());
			AddLikeResponse response = new AddLikeResponse();
			response.setValueResponse(like.getResultValue());
			response.setMessageResponse(like.getMessage());
			
			return response;
			
		} 
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
		
	}
	
	
	@Override
	public GetLikeResponse getLikeByUser(GetLikeRequest parameters) {
		
		if(DEBUG) LOGGER.info("REST PROUMER REQUEST (GET INFO LIKES USER)");
		try {
			
			
			List<Integer> likes = LikeService.getLikeByUser(parameters.getTokenUser());

			GetLikeResponse response = new GetLikeResponse();

			response.getIdActivity().addAll(likes);
			
			
			return response;
			
		} 
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
	
	
	
	
	@Override
	public AddCommentResponse addComment(AddCommentRequest parameters) {

		if(DEBUG) LOGGER.info("REST PROUMER REQUEST (GET INFO INSERT LIKE)");
		try {

			MessageResponse comment = CommentService.addComment(parameters.getIdActivity(), parameters.getKey(), parameters.getTitle(),parameters.getComment());
			AddCommentResponse response = new AddCommentResponse();
			response.setValueResponse(comment.getResultValue());
			response.setMessageResponse(comment.getMessage());
			
			return response;
			
		} 
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
		
	}	
	
	@Override
	public GetCommentResponse getComment(GetCommentRequest parameters) {

		if(DEBUG) LOGGER.info("REST PROUMER REQUEST (GET INFO COMMENTS)");
		try {

			List<CommentItem> comments = CommentService.getComments(parameters.getActivity());
			GetCommentResponse response = new GetCommentResponse();
			
			for (CommentItem comment : comments) {

				CommentItem item = new CommentItem();
				item.setId(comment.getId());
				item.setTitle(comment.getTitle());
				item.setText(comment.getText());

				response.getItem().add(item);
							
			
			}

			return response;			
			
			
			
			
			
		} 
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
		
	}		
	
	
}
