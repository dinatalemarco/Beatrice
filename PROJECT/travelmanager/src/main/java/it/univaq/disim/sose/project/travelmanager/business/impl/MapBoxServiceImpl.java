package it.univaq.disim.sose.project.travelmanager.business.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import it.univaq.disim.sose.project.travelmanager.business.BusinessException;
import it.univaq.disim.sose.project.travelmanager.business.MapBoxService;
import it.univaq.disim.sose.project.travelmanager.model.InfoPointToPoint;
import it.univaq.disim.sose.project.travelmanager.model.Route;
import it.univaq.disim.sose.project.travelmanager.model.RouteInfo;

@Service
public class MapBoxServiceImpl implements MapBoxService<InfoPointToPoint,Route> {

	@Value("#{cfg.Provider_MapBoxMatrix}")
	String Provider_MapBoxMatrix; // MapBox Distance
	@Value("#{cfg.Provider_MapBoxRoute}")
	String Provider_MapBoxRoute; // MapBox Route	
	@Value("#{cfg.KeyMapboxProviderAPI}")
	String APIcodeMap; 
	@Value("#{cfg.MapBoxMeans}")
	String MeansType[];	
	
	@Override
	public InfoPointToPoint getInfoPointToPointMap(String startLon,String startLat,String endLon,String endLat) throws BusinessException {
		
		InfoPointToPoint info = new InfoPointToPoint();

		  try {
			  
				for(int y =0; y< MeansType.length; y++) {
					
					RouteInfo x = new RouteInfo(); 
					x.setMeans(MeansType[y]);
					
					/* Preparo l'url per la chiamata rest al fornitore di servizio */
					URL url = new URL(Provider_MapBoxMatrix+MeansType[y]+"/"+endLon+","+endLat+";"+startLon+","+startLat+"?sources=1&annotations=distance,duration&access_token="+APIcodeMap);
			
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setRequestMethod("GET");
					conn.setRequestProperty("Accept", "application/json");

					if (conn.getResponseCode() == 200) {
						BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
						
						JSONParser jsonParser = new JSONParser();
						JSONObject jsonObject = (JSONObject) jsonParser.parse(br);

						
						if(!jsonObject.isEmpty()) {			
							info.setDestination(this.getDestination(jsonObject));
							
							info.setSource(this.getSource(jsonObject));			
							
							x.setDistance(this.getDistance(jsonObject, "distances"));
							
							x.setDuration(this.getDistance(jsonObject, "durations"));
							
							
							info.setDistance(x);
						}
						
						conn.disconnect();
						
					}
						
					
				}		
				

			  } catch (MalformedURLException e) {

				e.printStackTrace();

			  } catch (IOException e) {

				e.printStackTrace();

			  } catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



		return info;

	}	
	
	
	
	@Override
	public Route getCoordinatesDestinationMap(String means,String startLon,String startLat,String endLon,String endLat) throws BusinessException {
		
		Route c = new Route();

		  try {
			  
					

				URL url = new URL(Provider_MapBoxRoute+means+"/"+endLon+","+endLat+";"+startLon+","+startLat+"?geometries=geojson&access_token="+APIcodeMap);				
						
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("Accept", "application/json");
	
					if (conn.getResponseCode() == 200) {
					BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
					
					JSONParser jsonParser = new JSONParser();
					JSONObject jsonObject = (JSONObject) jsonParser.parse(br);
					
					if(!jsonObject.isEmpty()) {	
						JSONArray routes = (JSONArray) jsonObject.get("routes");
						Iterator r = routes.iterator();				
						JSONObject routesPoint = (JSONObject) r.next();
						JSONObject geometry = (JSONObject) routesPoint.get("geometry");
						JSONArray coordinates = (JSONArray) geometry.get("coordinates");
						
						Iterator cor = coordinates.iterator();
						
						c.setArraySize(coordinates.size());
						
						while (cor.hasNext()) {
							
							JSONArray item = (JSONArray) cor.next();
							
							c.setCoordinates(item.get(0).toString(),item.get(1).toString());
						}
					}
		
					conn.disconnect();	
				}
					

			  } catch (MalformedURLException e) {

				e.printStackTrace();

			  } catch (IOException e) {

				e.printStackTrace();

			  } catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		
		return c;
		
	}	
	
	
	public String getSource(JSONObject jsonObject) throws BusinessException {
		
		JSONArray point = (JSONArray) jsonObject.get("sources");
		
		if(!point.isEmpty()) {
			Iterator u = point.iterator();
			JSONObject namePoint = (JSONObject) u.next();
			return namePoint.get("name").toString();	
		}else return null;
		
		
	}


	public String getDestination(JSONObject jsonObject) throws BusinessException {
		
		JSONArray point = (JSONArray) jsonObject.get("destinations");
		
		if(!point.isEmpty()) {
			Iterator u = point.iterator();
			JSONObject namePoint = (JSONObject) u.next();
				
			return namePoint.get("name").toString();
		}else return null;
		
	}	
	
	

	public String getDistance(JSONObject jsonObject, String param) throws BusinessException {
		
		JSONArray value = (JSONArray) jsonObject.get(param);

		if(!value.isEmpty()) {
			Iterator i = value.iterator();
			value = (JSONArray) i.next();
			Iterator j = value.iterator();
				
			return j.next().toString();	
		}else return null;
		
		
	}			
	
	
	
}
