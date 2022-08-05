
/*
 * Name:Nicholas Dhannie
 * Date:2-10-2022
 * Subject:COP 2800C 
 */

import java.util.Scanner;

public class VehicleTest {

	public static void main(String[] args) {
		
		/*
	    Declare a Vehicle reference variable.
	    Instantiate a Vehicle object.
		Assign the Vehicle object to the Vehicle reference variable.
		*/
 
		Vehicle Lexus = new Vehicle();
		
		//Set the Vehicle object's year, miles, and mpg variables.
		
		Lexus.setYear(2017); 	//setting the YEAR of vehicle
		Lexus.setMiles(32265); 	//setting the MILES of vehicle
		Lexus.setMpg(22); 		//setting the MPG of vehicle
		
		//Output to the screen the Vehicle's year, miles, and mpg values.
		
		System.out.println("The year of the Lexus IS200T Fsport is : " + Lexus.getYear());
		System.out.println("The amount of miles the car currently has is: " + Lexus.getMiles());
		System.out.println("The miles per gallon of the vehicle is: " + Lexus.getMpg());
		
		//Prompt the user to input the number of miles they will be driving the Vehicle.
		
		Scanner scanner = new Scanner(System.in);	//first using a scanner to get input
		System.out.print("Please enter an average of how many miles will you will be driving: ");
		int drive = scanner.nextInt();	//it will get the number of miles entered by user
		
		
		//Drive the Vehicle object by calling the drive() method and moving it the number 
		//of miles that the user indicated. Output to the screen the Vehicle's new miles value.
		
		Lexus.drive(drive);														
		System.out.print("You will be driving " + drive + " miles. ");
		System.out.print("The odometer should read " + Lexus.getMiles() + " miles.\n");
		System.out.println("");
		
		
		
		//Complete the "Inside your main method" steps TWICE so that you are working with two separate Vehicle objects.
		
		/*
	    Declare a Vehicle reference variable.
	    Instantiate a Vehicle object.
		Assign the Vehicle object to the Vehicle reference variable.
		*/
 
		Vehicle Infiniti = new Vehicle();
		
		//Set the Vehicle object's year, miles, and mpg variables.
		
		Infiniti.setYear(2009); 	//setting the YEAR of vehicle
		Infiniti.setMiles(50000); 	//setting the MILES of vehicle
		Infiniti.setMpg(17); 		//setting the MPG of vehicle
		
		//Output to the screen the Vehicle's year, miles, and mpg values.
		
		System.out.println("The year of the Infiniti G37X is : " + Infiniti.getYear());
		System.out.println("The amount of miles the car currently has is: " + Infiniti.getMiles());
		System.out.println("The miles per gallon of the vehicle is: " + Infiniti.getMpg());
		
		//Prompt the user to input the number of miles they will be driving the Vehicle.
		
		Scanner scanner1 = new Scanner(System.in);	//first using a scanner to get input
		System.out.print("Please enter an average of how many miles will you will be driving: ");
		int drive1 = scanner1.nextInt();	//it will get the number of miles entered by user
		
		//Drive the Vehicle object by calling the drive() method and moving it the number 
		//of miles that the user indicated. Output to the screen the Vehicle's new miles value.
		
		Infiniti.drive(drive1);														
		System.out.print("You will be driving " + drive1 + " miles. ");
		System.out.print("The odometer should read " + Infiniti.getMiles() + " miles.");
		
		scanner.close();
		scanner1.close();

	}

}
