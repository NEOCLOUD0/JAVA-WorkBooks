/*
 * Print "Censored" if userInput contains the word "darn", else print userInput. 
 * End with newline. Ex: If userInput is "That darn cat.", then output is:
 */
package zyBooks;

import java.util.Scanner;

public class CensoredWords {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput;

		userInput = scnr.nextLine();

		/* Your solution goes here */
		if (userInput.contains("darn")) {
			System.out.println("Censored");
		} else {
			System.out.println(userInput);
		}

	}
}
