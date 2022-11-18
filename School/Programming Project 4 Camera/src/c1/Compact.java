package c1;

public class Compact extends Camera {
	private double weight;
	private int zoom;

	public void setWeight(Double newWeight) {
		weight = newWeight;
	}

	public double getWeight() {
		return weight;
	}
	
	public void setZoom(int newZoom) {
		zoom = newZoom;
	}

	public double getZoom() {
		return zoom;
	}
	
	@Override
	public String getPrintCameraName() {
		return ("\t" + name);
	}
	
	@Override
	public String getPrintCameraNumbers() {
		return("\nLens: " + lens + " \nStorage: " + memory + " \nWeight: " + weight + " \nZoom: " + zoom);
	}
	
	public void click() {
		System.out.println("\t*CLICK CLICK*");
	}


}