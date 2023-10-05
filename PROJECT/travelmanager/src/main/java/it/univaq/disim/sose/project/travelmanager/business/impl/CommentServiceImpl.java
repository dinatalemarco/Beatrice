package it.univaq.disim.sose.project.travelmanager.business.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.univaq.disim.sose.project.client.placesofcity.AddCommentRequest;
import it.univaq.disim.sose.project.client.placesofcity.AddCommentResponse;
import it.univaq.disim.sose.project.client.placesofcity.GetCommentRequest;
import it.univaq.disim.sose.project.client.placesofcity.GetCommentResponse;
import it.univaq.disim.sose.project.client.placesofcity.PlacesOfCity;
import it.univaq.disim.sose.project.client.placesofcity.PlacesOfCityService;
import it.univaq.disim.sose.project.travelmanager.business.BusinessException;
import it.univaq.disim.sose.project.travelmanager.business.LoadBalancerRequestUrlService;
import it.univaq.disim.sose.project.travelmanager.business.CommentService;



@Service
public class CommentServiceImpl implements CommentService<AddCommentResponse,GetCommentResponse> {
		
	@Autowired
	private LoadBalancerRequestUrlService UrlService;


	@Override
	public AddCommentResponse addComment(int activity, String key, String title, String text) throws BusinessException {
		

		/* Definisco il servizio */
		PlacesOfCityService service = new PlacesOfCityService(UrlService.getUrlService());
		
		/* Definisco la porta di connessione del servizio */
		PlacesOfCity port = service.getPlacesOfCityPort();
		
		/* Preparo la richiesta */
		AddCommentRequest comment = new AddCommentRequest();
						  comment.setIdActivity(activity);
						  comment.setKey(key);
						  comment.setTitle(title);
						  comment.setComment(text);
					
					
		AddCommentResponse response = port.addComment(comment);

		return response;
		
	}	
	
	
	@Override
	public GetCommentResponse getComment(int activity) throws BusinessException {
		
		/* Definisco il servizio */
		PlacesOfCityService service = new PlacesOfCityService(UrlService.getUrlService());
		
		/* Definisco la porta di connessione del servizio */
		PlacesOfCity port = service.getPlacesOfCityPort();
		
		/* Preparo la richiesta */
		GetCommentRequest comment = new GetCommentRequest();
						  comment.setActivity(activity);

					
					
		GetCommentResponse response = port.getComment(comment);

		return response;
		
	}	
				
	

}
