/*
 * Write a method so that the main() code below can be replaced by simpler code that calls method calcMilesTraveled(). Original main()
 */

package zyBooks;

import java.util.Scanner;

public class CalcMiles {

	/* Your solution goes here */
	double calcMilesTraveled(double milesPerHour, double minutesTraveled) {
		double hoursTraveled = minutesTraveled / 60.0;
		double milesTraveled = hoursTraveled * milesPerHour;
		return milesTraveled;
	}

	public static void main(String[] args) {
		double milesPerHour = 70.0;
		double minsTraveled = 100.0;
		CalcMiles tripOdometer = new CalcMiles();

		System.out.println("Miles: " + tripOdometer.calcMilesTraveled(milesPerHour, minsTraveled));
	}
}