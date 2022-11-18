/*
 * Write a switch statement that checks origLetter. If 'a' or 'A', print "Alpha". 
 * If 'b' or 'B', print "Beta". For any other character, print "Unknown". Use fall-through as appropriate. End with newline.
 */
package zyBooks;

import java.util.Scanner;

public class ConvertToGreek {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char origLetter;

		origLetter = scnr.next().charAt(0);

		/* Your solution goes here */
		switch (origLetter) {
		case 'a':
		case 'A':
			System.out.println("Alpha");
			break;
		case 'b':
		case 'B':
			System.out.println("Beta");
			break;
		default:
			System.out.println("Unknown");
			break;
		}

	}
}