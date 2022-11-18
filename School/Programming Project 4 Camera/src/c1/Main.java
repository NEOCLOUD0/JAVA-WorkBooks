package c1;

public class Main {

	public static void main(String[] args) {
		// Override for COMPACT CAMERA
		Compact cptCompact = new Compact();
		cptCompact.setName("Canon PowerShot G1 X Mark 3");
		cptCompact.setLens(24);
		cptCompact.setMemory(16);
		cptCompact.setWeight(1.5);
		cptCompact.setZoom(75);
		
		System.out.println(cptCompact.getPrintCameraName() + " " + cptCompact.getPrintCameraNumbers());
		// Polymorphism
		cptCompact.click();
		
		// Override for DSLR CAMERA
		Dslr dsDslr = new Dslr();
		dsDslr.setName("Fujifilm X-T4");
		dsDslr.setLens(16);
		dsDslr.setMemory(64);
		dsDslr.setWeight2(2.0);
		dsDslr.setZoom2(85);
		
		System.out.println(dsDslr.getPrintCameraName2() + " " + dsDslr.getPrintCameraNumbers2());
		// Polymorphism
		dsDslr.click();

	}

}
