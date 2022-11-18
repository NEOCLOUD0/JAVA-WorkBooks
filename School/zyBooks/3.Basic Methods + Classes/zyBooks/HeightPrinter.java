/*
 * Define a method printFeetInchShort, with int parameters numFeet and numInches, that prints using ' and " shorthand.
 *  Ex: myPrinter.printFeetInchShort(5, 8) prints
 */

package zyBooks;

import java.util.Scanner;

public class HeightPrinter {

	/* Your solution goes here */
	public static void printFeetInchShort(int numFeet, int numInches) {
		System.out.print(numFeet + "' " + numInches + "\"");
	}

	public static void main(String[] args) {
		HeightPrinter myPrinter = new HeightPrinter();

		// Will be run with (5, 8), then (4, 11)
		myPrinter.printFeetInchShort(5, 8);
		System.out.println("");
	}
}