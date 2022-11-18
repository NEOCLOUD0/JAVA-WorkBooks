/*
 * Write a statement that increases numPeople by 5. Ex: If numPeople is initially 10, the output is: There are 15 people.
 */
package zyBooks;

import java.util.Scanner;

public class AssigningNumberToVariable {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numPeople;

		numPeople = scnr.nextInt();

		/* Your solution goes here */
		numPeople = numPeople + 5;

		System.out.print("There are ");
		System.out.print(numPeople);
		System.out.println(" people.");
	}
}
