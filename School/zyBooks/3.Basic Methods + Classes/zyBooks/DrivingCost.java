/*
 * Write a method drivingCost() with input parameters milesPerGallon, dollarsPerGallon, and milesDriven that returns the dollar cost to drive
 *  those miles. All items are of type double. The method called with arguments (20.0, 3.1599, 50.0) returns 7.89975.

Define that method in a program whose inputs are the car's miles per gallon and the price of gas in dollars per gallon (both doubles). 
Output the gas cost for 10 miles, 50 miles, and 400 miles, by calling your drivingCost() method three times.
 */

package zyBooks;

import java.util.Scanner;

public class DrivingCost {

	/* Define your method here */
	public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
		double totalCost = (dollarsPerGallon * milesDriven / milesPerGallon);
		return totalCost;
	}

	public static void main(String[] args) {
		/* Type your code here. */
		LabProgram tripCost = new LabProgram();

		Scanner scnr = new Scanner(System.in);
		double milesPerGallon = scnr.nextDouble();
		double dollarsPerGallon = scnr.nextDouble();
		System.out.printf("%.2f", tripCost.drivingCost(milesPerGallon, dollarsPerGallon, 10));
		System.out.printf(" %.2f", tripCost.drivingCost(milesPerGallon, dollarsPerGallon, 50));
		System.out.printf(" %.2f\n", tripCost.drivingCost(milesPerGallon, dollarsPerGallon, 400));
	}
}
