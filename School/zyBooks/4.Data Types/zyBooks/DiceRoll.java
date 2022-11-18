/*
 * Type two statements using nextInt() to print two random integers between (and including) 0 and 9. 
 */
package zyBooks;

import java.util.Scanner;
import java.util.Random;

public class DiceRoll {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random randGen = new Random();
		int seedVal;

		seedVal = scnr.nextInt();
		randGen.setSeed(seedVal);

		/* Your solution goes here */
		int a = randGen.nextInt(10);
		int b = randGen.nextInt(10);
		System.out.println(a);
		System.out.println(b);

	}
}
