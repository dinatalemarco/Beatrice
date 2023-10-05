package ${package}.business.impl;

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

import ${package}.business.BusinessException;
import ${package}.business.MapBoxService;
import ${package}.model.InfoPointToPoint;
import ${package}.model.Route;
import ${package}.model.RouteInfo;

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

		return info;

	}	
	
	
	
	@Override
	public Route getCoordinatesDestinationMap(String means,String startLon,String startLat,String endLon,String endLat) throws BusinessException {
		
		Route c = new Route();

		return c;
		
	}		
	
	
}
