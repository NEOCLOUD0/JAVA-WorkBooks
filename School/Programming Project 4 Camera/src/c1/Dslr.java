package c1;

public class Dslr extends Camera {
	private double weight2;
	private int zoom2;
	
	public void setWeight2(Double newWeight2) {
		weight2 = newWeight2;
	}

	public double getWeight2() {
		return weight2;
	}
	
	public void setZoom2(int newZoom2) {
		zoom2 = newZoom2;
	}

	public double getZoom2() {
		return zoom2;
	}
	
	@Override
	public String getPrintCameraName2() {
		return ("\n\t" + name);
	}
	
	@Override
	public String getPrintCameraNumbers2() {
		return("\nLens: " + lens + " \nStorage: " + memory + " \nWeight: " + weight2 + " \nZoom: " + zoom2);
	}
}
