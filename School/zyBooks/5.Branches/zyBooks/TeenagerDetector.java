/*
 * Assign isTeenager with true if kidAge is 13 to 19 inclusive. Otherwise, assign isTeenager with false.
 */
package zyBooks;

import java.util.Scanner;

public class TeenagerDetector {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean isTeenager;
		int kidAge;

		kidAge = scnr.nextInt();

		/* Your solution goes here */
		if ((kidAge >= 13) && (kidAge <= 19)) {
			isTeenager = true;
		} else {
			isTeenager = false;
		}

		if (isTeenager) {
			System.out.println("Teen");
		} else {
			System.out.println("Not teen");
		}
	}
}