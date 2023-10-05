package ${package}.business.impl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import ${package}.client.placesofcity.ActivityByProfileRequest;

import ${package}.client.placesofcity.ActivityItem;
import ${package}.client.placesofcity.ActivityRequest;

import ${package}.client.placesofcity.CityRequest;
import ${package}.client.placesofcity.CountLikeRequest;
import ${package}.client.placesofcity.CountLikeResponse;
import ${package}.client.placesofcity.InsertVerificationLikeRequest;
import ${package}.client.placesofcity.InsertVerificationLikeResponse;
import ${package}.client.placesofcity.LikeRequest;
import ${package}.client.placesofcity.LikeResponse;
import ${package}.client.placesofcity.LoginRequest;
import ${package}.client.placesofcity.LoginResponse;
import ${package}.client.placesofcity.PlacesOfCity;
import ${package}.business.BusinessException;
import ${package}.business.ServiceDefinition;
import ${package}.model.ActivityCollectionResult;
import ${package}.model.Features;
import ${package}.model.Geometry;
import ${package}.model.InfoPointToPoint;
import ${package}.model.Properties;
import ${package}.model.Route;
import ${package}.model.RouteInfo;
import ${package}.model.Weather;




@Service
public class ServiceImpl implements ServiceDefinition {
	
	@Value("#{cfg.ProviderWeather}")
	String Provider; // Fornitore del servizio
	@Value("#{cfg.KeyWeatherProviderAPI}")
	String APIcodeWeather; 
	String format = "gson"; // formato dell'output richiesto	

	@Value("#{cfg.Provider_MapBoxMatrix}")
	String Provider_MapBoxMatrix; // MapBox Distance
	@Value("#{cfg.Provider_MapBoxRoute}")
	String Provider_MapBoxRoute; // MapBox Route	
	@Value("#{cfg.KeyMapboxProviderAPI}")
	String APIcodeMap; 
	@Value("#{cfg.MapBoxMeans}")
	String MeansType[];	
	
	
	@Override
	public InfoPointToPoint getInfoPointToPointMap(String startLon,String startLat,String endLon,String endLat) throws BusinessException {
		
		InfoPointToPoint info = new InfoPointToPoint();
		return info;

	}	
	
	
	
	@Override
	public Route getCoordinatesDestinationMap(String means,String startLon,String startLat,String endLon,String endLat) throws BusinessException {
		
		Route c = new Route();
		return c;
		
	}
	

	@Override
	public List<Weather> getWeatherCity(String city, String country) throws BusinessException {

		List<Weather> weather = new ArrayList<>();
		return weather;

	}	
	
	
	@Override
	public LoginResponse login(String email,String password) throws BusinessException {
		
		LoginResponse response = new LoginResponse();
		return response;
		
	}			
	

	@Override
	public LikeResponse addlike(int id_user, int id_activity, String key) throws BusinessException {
		
		LikeResponse response = new LikeResponse();
		return response;
		
	}	
	
	@Override
	public InsertVerificationLikeResponse InsertVerificationLike(int id_user) throws BusinessException {
		
		InsertVerificationLikeResponse response = new InsertVerificationLikeResponse();
		return response;
		
	}		
	
	
	@Override
	public int countLikesActivity(int id_activity) throws BusinessException {
		
		CountLikeResponse response = new CountLikeResponse();
		return response.getNumberOfLikes();
		
	}	
	
	
	@Override
	public ActivityCollectionResult ActivityList(String city) throws BusinessException{
		
		ActivityCollectionResult x = new ActivityCollectionResult();
		return x;
		
	}
	
	@Override
	public ActivityCollectionResult ActivityListProfile(String city, String profile) throws BusinessException{
				
		ActivityCollectionResult x = new ActivityCollectionResult();
		return x;
		
	}	
	

}
