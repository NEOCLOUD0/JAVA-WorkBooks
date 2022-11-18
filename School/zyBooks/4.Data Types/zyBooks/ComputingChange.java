/*
 * A cashier distributes change using the maximum number of five dollar bills, followed by one dollar bills.
 *  For example, 19 yields 3 fives and 4 ones. Write a single statement that assigns the number of one dollar bills to variable numOnes,
 *   given amountToChange. Hint: Use the % operator.
 */
package zyBooks;

import java.util.Scanner;

public class ComputingChange {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int amountToChange;
		int numFives;
		int numOnes;

		amountToChange = scnr.nextInt();
		numFives = amountToChange / 5;

		/* Your solution goes here */
		numOnes = amountToChange % 5;

		System.out.print("numFives: ");
		System.out.println(numFives);
		System.out.print("numOnes: ");
		System.out.println(numOnes);
	}
}