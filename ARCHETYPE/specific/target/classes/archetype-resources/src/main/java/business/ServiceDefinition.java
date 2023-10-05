package ${package}.business;

import java.util.List;


import ${package}.client.placesofcity.InsertVerificationLikeResponse;
import ${package}.client.placesofcity.LikeResponse;
import ${package}.client.placesofcity.LoginResponse;
import ${package}.model.ActivityCollectionResult;
import ${package}.model.InfoPointToPoint;
import ${package}.model.Route;
import ${package}.model.Weather;


public interface ServiceDefinition {

	int countLikesActivity(int id_activity) throws BusinessException;
	
	LoginResponse login(String email,String password) throws BusinessException;
	
	InsertVerificationLikeResponse InsertVerificationLike(int id_user) throws BusinessException;
	
	LikeResponse addlike(int id_user, int id_activity, String key) throws BusinessException;	
	
	InfoPointToPoint getInfoPointToPointMap(String stratLon,String startLat,String endLon,String endLat) throws BusinessException;

	Route getCoordinatesDestinationMap(String menas,String stratLon,String startLat,String endLon,String endLat) throws BusinessException;
	
	List<Weather> getWeatherCity(String city,String country) throws BusinessException;
	
	ActivityCollectionResult ActivityList(String city) throws BusinessException;
	
	ActivityCollectionResult ActivityListProfile(String city, String profile) throws BusinessException;
	
} 
