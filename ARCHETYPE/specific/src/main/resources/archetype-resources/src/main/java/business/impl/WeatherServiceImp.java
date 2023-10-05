package ${package}.business.impl;

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

import ${package}.business.BusinessException;
import ${package}.business.WeatherService;
import ${package}.model.Weather;


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
		
		return weather;

	}		

}
