/*
 * Calories = ( (Age x 0.2757) + (Weight x 0.03295) + (Heart Rate x 1.0781) — 75.4991 ) x Time / 8.368

Write a program using inputs age (years), weight (pounds), heart rate (beats per minute), and time (minutes), respectively.
Output the average calories burned for a person.
 */

package zyBooks;

import java.util.Scanner;

public class ExpressionForCalories {

	public static void main(String[] args) {
		/* Type your code here. */
		Scanner scnr = new Scanner(System.in);

		double age = scnr.nextDouble();
		double weight = scnr.nextDouble();
		double heartRate = scnr.nextDouble();
		double time = scnr.nextDouble();

		double calories = ((age * 0.2757) + (weight * 0.03295) + (heartRate * 1.0781) - 75.4991) * time / 8.368;

		System.out.printf("Calories: %.2f calories", calories);
		System.out.println("");
	}
}
