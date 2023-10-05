package it.univaq.disim.sose.project.placesofcity.business.model;


public class ActivityModel {

	private int id;
	private String name;
	private String phone;
	private String longitude;
	private String latitude;
	private String image;
	private String street;
	private String profile;
	private String weather;
	private String start_hour;
	private String end_hour;
	private int numberOfLikes;
	
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String p) {
		this.phone = p;
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
	public String getImage() {
		return image;
	}
	public void setImage(String i) {
		this.image = i;
	}	
	public String getStreet() {
		return street;
	}
	public void setStreet(String s) {
		this.street = s;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String p) {
		this.profile = p;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String w) {
		this.weather = w;
	}
	public String getStartHour() {
		return start_hour;
	}
	public void setStartHour(String h) {
		this.start_hour = h;
	}	
	public String getEndHour() {
		return end_hour;
	}
	public void setEndHour(String h) {
		this.end_hour = h;
	}
	public int getNumberOfLikes() {
		return numberOfLikes;
	}
	public void setNumberOfLikes(int x) {
		this.numberOfLikes = x;
	}	
	

}
