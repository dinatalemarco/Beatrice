package it.univaq.disim.sose.project.travelmanager.model;

public class Geometry {
	
	private String type = "Point";
	private float coordinates[];
	
	public Geometry() {
		this.coordinates = new float[2];
	}	
	
	public String getType() {
		return type;
	}
	public void setType(String t) {
		this.type = t;
	}	
	
	public float[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(float[] x) {
		this.coordinates = x;
	}		

}
