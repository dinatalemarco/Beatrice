package ${package}.business.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ${package}.client.placesofcity.PlacesOfCity;
import ${package}.client.placesofcity.PlacesOfCityService;

@Service
public class LoadBalancerRequest extends PlacesOfCityService {
	
	private static Logger LOGGER = LoggerFactory.getLogger(LoadBalancerRequest.class);	
	
	public PlacesOfCity getPlacesOfCityPort() {
	
		return null;
		
	}

}
