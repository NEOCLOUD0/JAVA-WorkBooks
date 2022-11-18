/*
 * Print a message telling a user to press the letterToQuit key numPresses times to quit. End with newline. 
 * Ex: If letterToQuit = 'q' and numPresses = 2, print:
 */
package zyBooks;

import java.util.Scanner;

public class QuitScreen {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char letterToQuit;
		int numPresses;

		letterToQuit = scnr.next().charAt(0);
		numPresses = scnr.nextInt();

		/* Your solution goes here */
		System.out.println("Press the " + letterToQuit + " key " + numPresses + " times to quit.");

	}
}