/*
 * Create a conditional expression that evaluates to string "negative" if userVal is less than 0, and "non-negative" otherwise. 
 * Ex: If userVal is -9, output is:
 */
package zyBooks;

import java.util.Scanner;

public class NegativeOrPositive {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String condStr;
		int userVal;

		userVal = scnr.nextInt();
		/* Your solution goes here */
		condStr = (userVal < 0) ? "negative" : "non-negative";

		System.out.println(userVal + " is " + condStr + ".");
	}
}