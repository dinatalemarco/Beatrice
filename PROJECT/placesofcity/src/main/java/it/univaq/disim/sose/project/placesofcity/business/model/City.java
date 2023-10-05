package it.univaq.disim.sose.project.placesofcity.business.model;

public class City  {

	private int id;
	private String name;
	private String longitude;
	private String latitude;	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String l) {
		this.longitude = l;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String l) {
		this.latitude = l;
	}		
	
}
