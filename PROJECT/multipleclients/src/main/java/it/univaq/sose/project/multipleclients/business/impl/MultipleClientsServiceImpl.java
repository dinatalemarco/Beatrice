package it.univaq.sose.project.multipleclients.business.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import it.univaq.sose.project.multipleclients.business.BusinessException;
import it.univaq.sose.project.multipleclients.business.MultipleClientsService;
import it.univaq.sose.project.multipleclients.model.ResultRequest;


@Service
public class MultipleClientsServiceImpl implements MultipleClientsService {
	
	@Override
	public List<ResultRequest> startRequest(int number) throws BusinessException {
		
		List<ResultRequest> x = new ArrayList<ResultRequest>();

		  try {
			  
			  	  /* Voglio lanciare un numero di richieste consecutive al prosumer */
				  for(int i=0; i < number; i++) {
					   
					    ResultRequest obj = new ResultRequest();
					    obj.setStartTime(); // Setto l'ora di arrivo della richiesta
					    obj.setRequestNumer(i+1); // Setto il numero di richiesta presa in esame
					    
						/* Preparo l'url per la chiamata rest al fornitore di servizio meteo api.openweathermap.org */
						URL url = new URL("http://localhost:8080/travelmanager/api/city-activities/Aquila");
						
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
						
						
						conn.disconnect();
						obj.setEndTime(); // Setto l'ora di risposta della richietsa
						x.add(obj);
				  }

			  } catch (MalformedURLException e) {

				e.printStackTrace();

			  } catch (IOException e) {

				e.printStackTrace();

			  } catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return x;
		
	}	

	
	
}
