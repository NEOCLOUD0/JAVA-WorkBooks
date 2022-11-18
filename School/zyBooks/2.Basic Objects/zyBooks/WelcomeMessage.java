/*
 * Write a program that takes a first name as the input, and outputs a welcome message to that name
 */

package zyBooks;

import java.util.Scanner;

public class WelcomeMessage {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userName;

		userName = scnr.next();

		/* Type your code here. */
		System.out.println("Hello " + userName + ", and welcome to CS Online!");
	}
}
