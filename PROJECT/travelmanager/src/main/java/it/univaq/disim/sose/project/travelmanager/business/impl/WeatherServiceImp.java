package it.univaq.disim.sose.project.travelmanager.business.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import it.univaq.disim.sose.project.travelmanager.business.BusinessException;
import it.univaq.disim.sose.project.travelmanager.business.WeatherService;
import it.univaq.disim.sose.project.travelmanager.model.Weather;


@Service
public class WeatherServiceImp implements WeatherService<Weather> {
	
	@Value("#{cfg.ProviderWeather}")
	String Provider; // Fornitore del servizio
	@Value("#{cfg.KeyWeatherProviderAPI}")
	String APIcodeWeather; 
	String format = "gson"; // formato dell'output richiesto		
	
	
	@Override
	public List<Weather> getWeatherCity(String city, String country) throws BusinessException {

		List<Weather> weather = new ArrayList<>();
		  		
		  		
		  try {
				/* Preparo l'url per la chiamata rest al fornitore di servizio meteo api.openweathermap.org */
				URL url = new URL(Provider+ "/data/2.5/forecast?q="+city+","
														           +country+"&mode="
																   +format+"&appid="
																   +APIcodeWeather);
				
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("Accept", "application/json");

				if (conn.getResponseCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
							+ conn.getResponseCode());
				}
				
				
				BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));
				
				JSONParser jsonParser = new JSONParser();
				JSONObject jsonObject = (JSONObject) jsonParser.parse(br);

				/* Il gson fornito dal provider ha al suo interno un blocco list che identifica 
				   la lista di tuttel le previsioni sulle ore della giornata e sui giorni successivi
				   voglio scorrere tutta la lista per estrarre le informazioni di cui ho bisogno */
				JSONArray list= (JSONArray) jsonObject.get("list");
				
				Iterator i = list.iterator();
				
				/* Scorro la lista */
				while (i.hasNext()) {
					
					Weather item = new Weather();
					JSONObject innerObj = (JSONObject) i.next();
					JSONArray w = (JSONArray) innerObj.get("weather");
				
					
					Date curDate = new Date();
			        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			        String date = format.format(curDate);

			        /* Voglio estrarre solo le previsioni meteo della giornata corrente */
					if(innerObj.get("dt_txt").toString().substring(0,10).equals(date)) {
						
						item.setHourWeather(innerObj.get("dt_txt").toString().substring(10,16));
						/* Il campo weather in realtà è un array di lunghezza 1, devo forzare il
						   sistema a gestirlo come una lista di lunghezza superiore a 1 */
						Iterator j = w.iterator();
						while(j.hasNext()) {
							JSONObject ObjWeather = (JSONObject) j.next();
							item.setWeather(ObjWeather.get("main").toString());							
						}
						
						/* Gli elelementi estratti dalla lista diventano una lista più facile da gestire
						   che successivamente utilizzerò */
						weather.add(item);
					}					

				}
				
				conn.disconnect();

			  } catch (MalformedURLException e) {

				e.printStackTrace();

			  } catch (IOException e) {

				e.printStackTrace();

			  } catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return weather;

	}		

}
