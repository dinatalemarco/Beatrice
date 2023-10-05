package it.univaq.sose.project.multipleclients.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ResultRequest {
	
	private String start_time_request;
	private String end_time_request;
	private int request_number;
	
	public void setStartTime() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		this.start_time_request = dateFormat.format(date);
	}
	
	public String getStartTime() {
		return this.start_time_request;
	}
	
	public void setEndTime() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		this.end_time_request = dateFormat.format(date);
	}
	
	public String getEndTime() {
		return this.end_time_request;
	}	
	
	public void setRequestNumer(int x) {
		this.request_number = x;
	}
	
	public int getRequestNumber() {
		return this.request_number;
	}
		

}
