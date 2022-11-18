/*
 * Write a switch statement that checks nextChoice. If 0, print "Rock". If 1, print "Paper". 
 * If 2, print "Scissors". For any other value, print "Unknown". End with newline.
 */
package zyBooks;

import java.util.Scanner;

public class Roshambo {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int nextChoice;

		nextChoice = scnr.nextInt();

		/* Your solution goes here */
		switch (nextChoice) {
		case 0:
			System.out.println("Rock");
			break;
		case 1:
			System.out.println("Paper");
			break;
		case 2:
			System.out.println("Scissors");
			break;
		default:
			System.out.println("Unknown");
			break;
		}

	}
}