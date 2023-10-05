package it.univaq.disim.sose.project.travelmanager.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.univaq.disim.sose.project.client.placesofcity.AddLikeRequest;
import it.univaq.disim.sose.project.client.placesofcity.AddLikeResponse;
import it.univaq.disim.sose.project.client.placesofcity.GetLikeRequest;
import it.univaq.disim.sose.project.client.placesofcity.GetLikeResponse;
import it.univaq.disim.sose.project.client.placesofcity.PlacesOfCity;
import it.univaq.disim.sose.project.client.placesofcity.PlacesOfCityService;
import it.univaq.disim.sose.project.travelmanager.business.BusinessException;
import it.univaq.disim.sose.project.travelmanager.business.LikeService;
import it.univaq.disim.sose.project.travelmanager.business.LoadBalancerRequestUrlService;


@Service
public class LikeServiceImpl implements LikeService<AddLikeResponse,GetLikeResponse> {

	@Autowired
	private LoadBalancerRequestUrlService UrlService;
	
	@Override
	public AddLikeResponse addlike(int id_activity, String key) throws BusinessException {

		/* Definisco il servizio */
		PlacesOfCityService service = new PlacesOfCityService(UrlService.getUrlService());
		
		/* Definisco la porta di connessione del servizio */
		PlacesOfCity port = service.getPlacesOfCityPort();
		
		/* Preparo la richiesta */
		AddLikeRequest like = new AddLikeRequest();
					   like.setIdActivity(id_activity);
					   like.setKey(key);
					
					
		AddLikeResponse response = port.addLike(like);


		return response;
		
	}	
	
	
	@Override
	public GetLikeResponse getLikeByUser(String token_user) throws BusinessException {
		

		/* Definisco il servizio */
		PlacesOfCityService service = new PlacesOfCityService(UrlService.getUrlService());
		
		/* Definisco la porta di connessione del servizio */
		PlacesOfCity port = service.getPlacesOfCityPort();
		
		/* Preparo la richiesta */
		GetLikeRequest val = new GetLikeRequest();
					   val.setTokenUser(token_user);
								
					
		GetLikeResponse response = port.getLikeByUser(val);

		return response;
		
	}	
	
	
	
}
