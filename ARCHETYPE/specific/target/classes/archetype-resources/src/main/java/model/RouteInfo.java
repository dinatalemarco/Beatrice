package ${package}.model;


public class RouteInfo  {
	
	private String means;
	private String duration;
	private String distance;

	public String getMeans() {
		return means;
	}
	public void setMeans(String m) {
		this.means = m;
	}	
	public String getDuration() {
		return duration;
	}
	public void setDuration(String d) {
		float result = Float.parseFloat(d)/60;
		this.duration = Float.toString(result);
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String d) {
		float result = Float.parseFloat(d)/1000;
		this.distance = Float.toString(result);		
	}



}


