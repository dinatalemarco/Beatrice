package it.univaq.disim.sose.project.travelmanager.business;


public interface ActivityCityService<T> {

	T activityList(String city) throws BusinessException;
	
	T activityListProfile(String city, String profile) throws BusinessException;	
	
}
