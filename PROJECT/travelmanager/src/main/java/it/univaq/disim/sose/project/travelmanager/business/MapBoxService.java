package it.univaq.disim.sose.project.travelmanager.business;


public interface MapBoxService<T,S> {

	T getInfoPointToPointMap(String stratLon,String startLat,String endLon,String endLat) throws BusinessException;

	S getCoordinatesDestinationMap(String menas,String stratLon,String startLat,String endLon,String endLat) throws BusinessException;	
	
}
