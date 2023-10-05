package it.univaq.disim.sose.project.travelmanager.business.impl;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.univaq.disim.sose.project.client.placesofcity.ActivityByProfileRequest;
import it.univaq.disim.sose.project.client.placesofcity.ActivityItem;
import it.univaq.disim.sose.project.client.placesofcity.ActivityRequest;
import it.univaq.disim.sose.project.client.placesofcity.CityRequest;
import it.univaq.disim.sose.project.client.placesofcity.PlacesOfCity;
import it.univaq.disim.sose.project.client.placesofcity.PlacesOfCityService;
import it.univaq.disim.sose.project.travelmanager.business.ActivityCityService;
import it.univaq.disim.sose.project.travelmanager.business.BusinessException;
import it.univaq.disim.sose.project.travelmanager.business.WeatherService;
import it.univaq.disim.sose.project.travelmanager.business.LoadBalancerRequestUrlService;
import it.univaq.disim.sose.project.travelmanager.model.ActivityCollectionResult;
import it.univaq.disim.sose.project.travelmanager.model.Features;
import it.univaq.disim.sose.project.travelmanager.model.Geometry;
import it.univaq.disim.sose.project.travelmanager.model.Properties;
import it.univaq.disim.sose.project.travelmanager.model.Weather;



@Service
public class ActivityCityServiceImpl implements ActivityCityService<ActivityCollectionResult> {

	@Autowired
	private WeatherService<Weather> WeatherService;
	@Autowired
	private LoadBalancerRequestUrlService UrlService;
	
	
	
	@Override
	public ActivityCollectionResult activityList(String city) throws BusinessException{
		
		
		/* Definisco il servizio */
		PlacesOfCityService service = new PlacesOfCityService(UrlService.getUrlService());	
		
		/* Definisco la porta di connessione del servizio */
		PlacesOfCity port = service.getPlacesOfCityPort();
		
		/* Dal nome della città richiedo l'id della città per estrarre le informazioni */
		CityRequest requestIdCity = new CityRequest();
		requestIdCity.setCity(city);
					
		/* Recuperato l'id della città posso procedere al recupero di tutte le attività */
		ActivityRequest activitisRequest = new ActivityRequest();
						activitisRequest.setCity(port.city(requestIdCity).getId());
					
					
		/* Voglio effettuare le chiamate al servizio meteo e al servizio placesofcity
		 * queste chiamate possono essere effettuate in parallelo così da ottimizzare i tempi 
		 * di risposta */
					
		// Definisco le due chiamate e il loro tipo di ritorno	
		CompletableFuture<List<ActivityItem>> RequestActivity = CompletableFuture.supplyAsync(() -> port.activity(activitisRequest).getItem());
		CompletableFuture<List<Weather>> RequestWeather  = CompletableFuture.supplyAsync(() -> WeatherService.getWeatherCity(city, "it"));
		
		// Attendo il copletamento delle richieste 
		CompletableFuture<Void> ParallelRequest = CompletableFuture.allOf(RequestActivity, RequestWeather);
		
		try {
			ParallelRequest.get();
		} catch (InterruptedException | ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
					
		List<ActivityItem> activities = null; //port.activity(activitisRequest).getItem();	
		List<Weather> weather = null; //this.getWeatherCity(city, "it");
		try {
			// Estraggo i dati eleborati dalle chiamate
			weather = RequestWeather.get();
			activities = RequestActivity.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		/* Semplici chiamate sequenziali ai servizi */
		/*	
		List<ActivityItem> activities  = port.activity(activitisRequest).getItem();
		List<Weather> weather = this.getWeatherCity(city, "it");	
		*/
			
		return this.GetActivityList(city, activities, weather);
		
	}
	
	@Override
	public ActivityCollectionResult activityListProfile(String city, String profile) throws BusinessException{
				

		/* Definisco il servizio */
		PlacesOfCityService service = new PlacesOfCityService(UrlService.getUrlService());
		
		/* Definisco la porta di connessione del servizio */
		PlacesOfCity port = service.getPlacesOfCityPort();
		
		/* Dal nome della città richiedo l'id della città per estrarre le informazioni */
		CityRequest requestIdCity = new CityRequest();
					requestIdCity.setCity(city);
					
		/* Preparo la richiesta */
	    ActivityByProfileRequest activity = new ActivityByProfileRequest();
								 activity.setCity(port.city(requestIdCity).getId());
								 activity.setProfile(profile);
								
									
								 
		/* Voglio effettuare le chiamate al servizio meteo e al servizio placesofcity
		 * queste chiamate possono essere effettuate in parallelo così da ottimizzare i tempi 
		 * di risposta */
													
		// Definisco le due chiamate e il loro tipo di ritorno	
		CompletableFuture<List<ActivityItem>> RequestActivity = CompletableFuture.supplyAsync(() -> port.activityByProfile(activity).getItem());
		CompletableFuture<List<Weather>> RequestWeather  = CompletableFuture.supplyAsync(() -> WeatherService.getWeatherCity(city, "it"));
									
		// Effettuo due chiamate in parallelo sui servizi	
		// Attendo il copletamento delle richieste
		CompletableFuture<Void> ParallelRequest = CompletableFuture.allOf(RequestActivity, RequestWeather);
									
			try {
				ParallelRequest.get();
			} catch (InterruptedException | ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
									
												
		List<ActivityItem> activities = null; //port.activity(activitisRequest).getItem();	
		List<Weather> weather = null; //this.getWeatherCity(city, "it");
			try {
				// Estraggo i dati eleborati dalle chiamate
				weather = RequestWeather.get();
				activities = RequestActivity.get();
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
									
		/* Semplici chiamate sequenziali ai servizi */
		/*
		List<ActivityItem> activities  = port.activityByProfile(activity).getItem();
		List<Weather> weather = this.getWeatherCity(city, "it");	
		*/
							
	
		return this.GetActivityList(city, activities, weather);
		
	}	
	
	
	public ActivityCollectionResult GetActivityList(String city, List<ActivityItem> activities, List<Weather> weather) throws BusinessException{
		
		ActivityCollectionResult result = new ActivityCollectionResult();	
		
		for(Weather element : weather) {
		
			for (ActivityItem activity : activities) {
				
				boolean activityTime = false ;
				
				if(!activity.getStartHour().toString().equals("00:00:00")) {
					Time HourWeather = Time.valueOf(element.getHourWeather().toString().substring(1, 6)+":00");
					Time startHour = Time.valueOf(activity.getStartHour().toString());
					Time endHour = Time.valueOf(activity.getEndHour().toString());
		
					if(startHour.after(endHour)) {
						activityTime = HourWeather.after(startHour) && endHour.before(HourWeather); 
					}else {
						activityTime = HourWeather.after(startHour) && HourWeather.before(endHour); 
					}
					
				}else {
					activityTime = true;
				}
				
				if((activity.getWeather().indexOf(element.getWeather().toUpperCase()) !=-1? true:false) && activityTime) {
				
				Features feature = new Features();
				Geometry geometry = new Geometry();
				Properties properties = new Properties();
				
				geometry.setType("Point");
				/* Definisco le cordinate sulla mappa del servizio */
				float coordinate[] = new float[2];
				coordinate[0] = (Float.valueOf(activity.getLongitude())).floatValue();
				coordinate[1] = (Float.valueOf(activity.getLatitude())).floatValue();			
				geometry.setCoordinates(coordinate);
				
				properties.setId(activity.getId());
				properties.setName(activity.getName());
				properties.setImage(activity.getImage());
				properties.setStreet(activity.getStreet());
				properties.setPhone(activity.getPhone());
				
				properties.setMyLike(0);
				
				properties.setLike(activity.getNumberOfLikes());
				properties.setCity(city);
				properties.setProfile(activity.getProfile());
				
				// Preparo l'oggetto in modo da avere la struttura già realizzata
				properties.setCar(0); 	
				properties.setCycling(0);
				properties.setWalking(0);
				
				
				/* Definisco l'attività proposta con la condizione metereologica in una determinata ora */
		
				if((Integer.parseInt(element.getHourWeather().substring(1,3)) > 19 || Integer.parseInt(element.getHourWeather().substring(1,3)) < 6 )  && element.getWeather().toUpperCase().equals("CLEAR")) {
					properties.setWeather(element.getWeather()+"_NIGHT");
				}else {
					properties.setWeather(element.getWeather());
				}
				
				properties.setHourWeather(element.getHourWeather());
				properties.setOpeningTime(activity.getStartHour().substring(0,5));
				properties.setClosingTime(activity.getEndHour().substring(0,5));
				
				result.setType("FeatureCollection");
				feature.setType("Feature");
				feature.setGeometry(geometry);
				feature.setProperties(properties);
				
				result.setFeatures(feature);	
				}
			
			}		
		}


		
		
		return result;
		
	}		
	
	
	
}
