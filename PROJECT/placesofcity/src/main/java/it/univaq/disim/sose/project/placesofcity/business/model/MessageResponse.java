package it.univaq.disim.sose.project.placesofcity.business.model;

public class MessageResponse {
	
	private boolean value;
	private String message;
	
	public void setResultValue(boolean x){
		this.value = x;
	}
	
	public void setMessage(String x) {
		this.message = x;
	}
	
	public boolean getResultValue() {
		return this.value;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	

}
