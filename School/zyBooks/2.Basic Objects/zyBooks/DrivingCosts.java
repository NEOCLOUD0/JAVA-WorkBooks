/*
 * Driving is expensive. Write a program with a car's miles/gallon and gas dollars/gallon (both doubles) as input, 
 * and output the gas cost for 20 miles, 75 miles, and 500 miles.
 */

package zyBooks;

import java.util.Scanner;

public class DrivingCosts {
	public static double drivingCost(double driveMiles, double milesPerGallon, double dollarsPerGallon) {
		double totalCost = (driveMiles / milesPerGallon) * dollarsPerGallon;
		return totalCost;
	}

	public static void main(String[] args) {
		/* Type your code here. */
		Scanner scnr = new Scanner(System.in);
		double milesPerGallon;
		double dollarsPerGallon;

		milesPerGallon = scnr.nextDouble();
		dollarsPerGallon = scnr.nextDouble();

		System.out.printf("%.2f ", drivingCost(20, milesPerGallon, dollarsPerGallon));
		System.out.printf("%.2f ", drivingCost(75, milesPerGallon, dollarsPerGallon));
		System.out.printf("%.2f", drivingCost(500, milesPerGallon, dollarsPerGallon));
		System.out.println("");
	}
}
