/*
 * Complete the method definition to output the hours given minutes. 
 */
package zyBooks;

public class MinToHourConv {
	public void outputMinutesAsHours(double origMinutes) {

		/* Your solution goes here */
		System.out.print(origMinutes / 60);

	}

	public static void main(String[] args) {
		MinToHourConv timeConv = new MinToHourConv();

		// Will be run with 210.0, 3600.0, and 0.0.
		timeConv.outputMinutesAsHours(210.0);
		System.out.println("");
	}
}