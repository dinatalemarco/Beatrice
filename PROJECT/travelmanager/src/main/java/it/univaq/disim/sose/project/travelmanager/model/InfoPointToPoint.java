package it.univaq.disim.sose.project.travelmanager.model;

import java.util.ArrayList;

public class InfoPointToPoint {
	
	private String source;
	private String destination;
	private ArrayList<RouteInfo> list;
	
	
	public InfoPointToPoint() {
		this.list = new ArrayList<RouteInfo>();
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public ArrayList<RouteInfo> getDistance() {
		return list;
	}
	public void setDistance(RouteInfo o) {
		this.list.add(o);
	}	

}



/*
public class InfoPointToPoint {
	
	private String source;
	private String destination;
	private ArrayList<RouteInfo> list;
	
	
	public InfoPointToPoint() {
		this.list = new ArrayList<RouteInfo>();
	}
	public String getSource() {
		return source;
	}
	public void setSource(JSONObject jsonObject) {
		this.source = jsonObject.get("source").toString();
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(JSONObject jsonObject) {
		this.destination = jsonObject.get("destination").toString();;
	}
	public ArrayList<RouteInfo> getDistance() {
		return list;
	}
	public void setDistance(JSONObject jsonObject) {
		
		JSONArray value = (JSONArray) jsonObject.get("distance");
		Iterator i = value.iterator();
		
		while (i.hasNext()) {
			
			RouteInfo x = new RouteInfo();
			JSONObject item = (JSONObject) i.next();
			x.setMeans(item.get("means").toString());
			x.setDuration(item.get("duration").toString());
			x.setDistance(item.get("distance").toString());
			
			this.list.add(x);

		}			
		
	}	

}
*/
