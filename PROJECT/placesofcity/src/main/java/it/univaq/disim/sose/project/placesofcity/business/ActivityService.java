package it.univaq.disim.sose.project.placesofcity.business;

import java.util.List;


public interface ActivityService<T> {

	List<T> getActivityCity(int city) throws BusinessException;
	
	List<T> getActivityCityByProfile(int city, String profile) throws BusinessException;	
	
}
