package it.univaq.disim.sose.project.travelmanager.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.univaq.disim.sose.project.client.placesofcity.LoginRequest;
import it.univaq.disim.sose.project.client.placesofcity.LoginResponse;
import it.univaq.disim.sose.project.client.placesofcity.PlacesOfCity;
import it.univaq.disim.sose.project.client.placesofcity.PlacesOfCityService;
import it.univaq.disim.sose.project.client.placesofcity.RegisterRequest;
import it.univaq.disim.sose.project.client.placesofcity.RegisterResponse;
import it.univaq.disim.sose.project.travelmanager.business.BusinessException;
import it.univaq.disim.sose.project.travelmanager.business.LoadBalancerRequestUrlService;
import it.univaq.disim.sose.project.travelmanager.business.UserAccountService;


@Service
public class UserAccountServiceImpl implements UserAccountService<RegisterResponse,LoginResponse> {

	@Autowired
	private LoadBalancerRequestUrlService UrlService;
	
	@Override
	public RegisterResponse register(String name,String surname,String email,String password) throws BusinessException {
		
		
		/* Definisco il servizio */
		PlacesOfCityService service = new PlacesOfCityService(UrlService.getUrlService());
		
		/* Definisco la porta di connessione del servizio */
		PlacesOfCity port = service.getPlacesOfCityPort();
		
		/* Preparo la richiesta */
		RegisterRequest newUser = new RegisterRequest();
						newUser.setName(name);
						newUser.setSurname(surname);
						newUser.setEmail(email);
						newUser.setPassword(password);
					
		RegisterResponse response = port.register(newUser);

		return response;
		
	}	
	
	
	@Override
	public LoginResponse login(String email,String password) throws BusinessException {
		

		/* Definisco il servizio */
		PlacesOfCityService service = new PlacesOfCityService(UrlService.getUrlService());
		
		/* Definisco la porta di connessione del servizio */
		PlacesOfCity port = service.getPlacesOfCityPort();
		
		/* Preparo la richiesta */
		LoginRequest user = new LoginRequest();
					 user.setEmail(email);
					 user.setPassword(password);
					
		LoginResponse response = port.login(user);

		return response;
		
	}				
	
	
}
