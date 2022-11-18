/*
 * A drink costs 2 dollars. A taco costs 3 dollars. Given the number of each, compute total cost and assign totalCost with the result.
 */
package zyBooks;

import java.util.Scanner;

public class ComputingTotalCost {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int numDrinks;
		int numTacos;
		int totalCost;

		numDrinks = scnr.nextInt();
		numTacos = scnr.nextInt();

		/* Your solution goes here */
		totalCost = (numTacos * 3) + (numDrinks * 2);

		System.out.print("Total cost: ");
		System.out.println(totalCost);
	}
}
