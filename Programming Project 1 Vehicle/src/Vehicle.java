// Read over the provided code. Reflect on the purpose of each block.
// Do not change or delete any provided code.
// Create a new class in the same project to hold your main() method.
// Interact with this class from your main() method.

public class Vehicle {

// private fields / internal data  
	private int year;  				// year the vehicle was manufactured
	private int miles;				// miles on the total odometer
	private double mpg; 			// miles per gallon the vehicle gets
	
	
// public methods / operations
	// constructor - used to create an object from the class
	public Vehicle() { 
		// this one is empty; we'll see constructors with code soon!
	}
	
	// setters (mutators) and getters (accessors)
	public int getYear() {
		return year;			// return THIS object's year value
	}

	public void setYear(int year) {
		this.year = year;		// set THIS object's year to argument (year) value
	}

	public int getMiles() {
		return miles;			// return THIS object's miles value
	}

	public void setMiles(int miles) {
		this.miles = miles;		// set THIS object's miles to argument (miles) value
	}

	public double getMpg() {
		return mpg;				// return THIS object's mpg value
	}

	public void setMpg(double mpg) {
		this.mpg = mpg;			// set THIS object's mpg to argument (mpg) value
	}
		
	// instance methods
	public void drive(int miles) {
		this.miles += miles;	// add argument miles value to THIS object's miles
	}
}
