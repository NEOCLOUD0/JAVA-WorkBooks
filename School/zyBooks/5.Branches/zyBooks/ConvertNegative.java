/*
 * Re-type the code and fix any errors. The code should convert non-positive numbers to 1.
 */
package zyBooks;

import java.util.Scanner;

public class ConvertNegative {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum;

		userNum = scnr.nextInt();

		/* Your solution goes here */
		if (userNum > 0) {
			System.out.println("Positive.");
		} else {
			System.out.println("Non-positive, converting to 1.");
			userNum = 1;
		}

		System.out.println("Final: " + userNum);

	}
}