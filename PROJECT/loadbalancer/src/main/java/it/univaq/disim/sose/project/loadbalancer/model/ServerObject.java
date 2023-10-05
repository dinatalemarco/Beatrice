package it.univaq.disim.sose.project.loadbalancer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServerObject {
	
	private String url;
	private int maxConnections;
	private int unitUnitsOfTime;
	private List<Date> connectionIn;
	
	public ServerObject(String url, int maxConnections, int unitUnitsOfTime) {
		this.url = url;
		this.maxConnections = maxConnections;
		this.unitUnitsOfTime = unitUnitsOfTime;
		this.connectionIn = new ArrayList<Date>();
	}
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public int getMaxConnections() {
		return maxConnections;
	}
	public void setMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
	}
	
	public int getUnitUnitsOfTime() {
		return unitUnitsOfTime;
	}
	public void setUnitUnitsOfTime(int t) {
		this.unitUnitsOfTime = t;
	}
	
	public List<Date> getConnectionIn() {
		return connectionIn;
	}
	public void setConnectionIn(Date x) {
		this.connectionIn.add(x);
	}	
	public void removeConnectionIn(int x) {
		this.connectionIn.remove(x);
	}	
	
	public int getContConnections() {
		return connectionIn.size();
	}
	
	public int getRequestsOverTime() {
		
		if(this.connectionIn.size() > 0) {
		
			Date start = this.connectionIn.get(0);
			Date currentTime = new Date();
			
			long millisDiff = currentTime.getTime() - start.getTime();
					
			return (int) (millisDiff / 1000 % 60);
		
		}else {
			return 0;
		}
	}	

}