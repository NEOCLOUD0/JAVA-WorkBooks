/*
 * Write a statement that assigns numCoins with numNickels + numDimes. Ex: 5 nickels and 6 dimes results in 11 coins.
 */
package zyBooks;

import java.util.Scanner;

public class AssigningSum {
	public static void main(String[] args) {
		int numCoins;
		int numNickels;
		int numDimes;

		numNickels = 5;
		numDimes = 6;

		/* Your solution goes here */
		numCoins = numNickels + numDimes;

		System.out.print("There are ");
		System.out.print(numCoins);
		System.out.println(" coins");
	}
}
