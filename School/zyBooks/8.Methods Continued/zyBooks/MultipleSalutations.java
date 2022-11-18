package zyBooks;

import java.util.Scanner;

public class MultipleSalutations {
	public void printSalutation(String personName) {
		System.out.println("Hello, " + personName);
	}

	/* Your solution goes here */
	public static void printSalutation(String personName, String customSalutation) {
		System.out.println(customSalutation + ", " + personName);
	}

	public static void main(String[] args) {
		MultipleSalutations nameTag = new MultipleSalutations();

		nameTag.printSalutation("Sanjiv");
		nameTag.printSalutation("Holly", "Welcome");
	}
}