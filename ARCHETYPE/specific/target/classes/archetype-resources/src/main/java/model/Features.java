package ${package}.model;

public class Features {
	
	private String type = "Feature";
	private Geometry geometry;
	private Properties properties;
	
	public String getType() {
		return type;
	}
	public void setType(String t) {
		this.type = t;
	}	
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry x) {
		this.geometry = x;
	}	
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties p) {
		this.properties = p;
	}
	
}
