package it.univaq.disim.sose.project.loadbalancer.model;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Context {

	final static String PathContext = "/Users/marcodinatale/eclipse-workspace/Project-SOSE/loadbalancer/src/main/resources/context.txt";
	private Gson gson = new Gson();
	private Path filePath = Paths.get(PathContext);
	
	
	public Context(List<ServerObject> object) {
				
		if (!Files.exists(filePath)) {
			String jsonInString = gson.toJson(object);		
		
			try {
				Files.write(filePath, jsonInString.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public List<ServerObject> getServers() {
		
		List<ServerObject> object = new ArrayList<ServerObject>();
		
		String fileData;
		
		try {
			fileData = new String(Files.readAllBytes(filePath));
			// parse json string to object
			Type listType = new TypeToken<List<ServerObject>>(){}.getType();
			return gson.fromJson(fileData, listType);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		
		return object; 
	}
	
	public void Update(List<ServerObject> object) {
		
		String jsonInString = gson.toJson(object);		
		
		
		try {
			Files.write(filePath, jsonInString.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		
	}

	
	
}
