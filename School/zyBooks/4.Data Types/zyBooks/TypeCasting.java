/*
 * Compute the average kids per family. Note that the integers should be type cast to doubles.
 */
package zyBooks;

import java.util.Scanner;

public class TypeCasting {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numKidsA;
		int numKidsB;
		int numKidsC;
		int numFamilies;
		double avgKids;

		numKidsA = scnr.nextInt();
		numKidsB = scnr.nextInt();
		numKidsC = scnr.nextInt();
		numFamilies = scnr.nextInt();

		/* Your solution goes here */
		avgKids = (numKidsA + numKidsB + numKidsC) / (double) numFamilies;

		System.out.println(avgKids);
	}
}