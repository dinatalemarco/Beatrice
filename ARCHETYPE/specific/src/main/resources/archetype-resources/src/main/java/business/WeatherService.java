package ${package}.business;

import java.util.List;

public interface WeatherService<T> {
	
	/* Richieste al servizio meteo */
	List<T> getWeatherCity(String city,String country) throws BusinessException;	

}
