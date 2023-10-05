package ${package}.model;

public class Route {
	
	private int cont;
	private float coordinates[][];
	
	public Route(){
		this.cont = 0;
	}
	
	public void setArraySize(int x) {
		this.coordinates = new float[x][2];
	}	
	
	public void setCoordinates(String x, String y) {
		float result[] = new float[2];
		result[0] = Float.parseFloat(x);
		result[1] = Float.parseFloat(y);
		this.coordinates[cont] = result;

		this.cont++;
	}
	
	public float[][] getCoordinates() {
		return this.coordinates;
	}

}
