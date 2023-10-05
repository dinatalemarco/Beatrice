package it.univaq.disim.sose.project.travelmanager.model;

import java.util.ArrayList;



public class ActivityCollectionResult {
	
	private String type = "FeatureCollection";
	private ArrayList<Features> features;
	
	
	public ActivityCollectionResult() {
		this.features = new ArrayList<Features>();
	}	
	
	public String getType() {
		return type;
	}
	public void setType(String t) {
		this.type = t;
	}	
	
	public ArrayList<Features> getFeatures() {
		return features;
	}
	public void setFeatures(Features x) {
		this.features.add(x);
	}	

}
