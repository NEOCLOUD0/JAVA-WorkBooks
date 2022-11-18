/*
 * Assign to maxSum the max of (numA, numB) PLUS the max of (numY, numZ). Use just one statement. Hint: Call findMax() twice in an expression.
 */

package zyBooks;

import java.util.Scanner;

public class SumOfMax {
	public double findMax(double num1, double num2) {
		double maxVal;

		// Note: if-else statements need not be understood to
		// complete this activity
		if (num1 > num2) { // if num1 is greater than num2,
			maxVal = num1; // then num1 is the maxVal.
		} else { // Otherwise,
			maxVal = num2; // num2 is the maxVal.
		}
		return maxVal;
	}

	public static void main(String[] args) {
		double numA = 5.0;
		double numB = 10.0;
		double numY = 3.0;
		double numZ = 7.0;
		double maxSum = 0.0;

		// Use object maxFinder to call the method
		SumOfMax maxFinder = new SumOfMax();

		/* Your solution goes here */
		maxSum = maxFinder.findMax(numA, numB) + maxFinder.findMax(numY, numZ);

		System.out.print("maxSum is: " + maxSum);
	}
}