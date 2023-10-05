package it.univaq.disim.sose.project.placesofcity.business;

public interface InfoCityService<T> {
	
	T getCity(String name) throws BusinessException;

	
}
