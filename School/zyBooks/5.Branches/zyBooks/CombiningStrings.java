/*
 * Assign secretID with firstName, a space, and lastName. Ex: If firstName is Barry and lastName is Allen, then output is
 */
package zyBooks;

import java.util.Scanner;

public class CombiningStrings {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String secretID;
		String firstName;
		String lastName;

		firstName = scnr.next();
		lastName = scnr.next();

		/* Your solution goes here */
		secretID = firstName;

		char spaceChar = ' ';

		secretID = secretID + spaceChar;

		secretID = secretID.concat(lastName);

		System.out.println(secretID);
	}
}