package c1;

public class Camera {
	protected String name;
	protected int lens;
	protected int memory;

	public void setName(String newName) {
		name = newName;
	}

	public void setLens(int newLens) {
		lens = newLens;
	}

	public void setMemory(int newMemory) {
		memory = newMemory;
	}
	
	public void click() {
		System.out.println("\t*Shutter Sound*");
	}

	// For the COMPACT CAMERA
	public String getPrintCameraName() {
		return name;
	}
	
	public String getPrintCameraNumbers() {
		return(lens + " " + memory);
	}
	
	
	// For the DSLR CAMERA
	public String getPrintCameraName2() {
		return name;
	}
	
	public String getPrintCameraNumbers2() {
		return(lens + " " + memory);
	}

}
