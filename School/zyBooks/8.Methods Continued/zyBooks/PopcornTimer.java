package zyBooks;

import java.util.Scanner;

public class PopcornTimer {
	public void printPopcornTime(int bagOunces) {
		/* Your solution goes here */
		if (bagOunces < 3) {
			System.out.println("Too small");
		} else if (bagOunces > 10) {
			System.out.println("Too large");
		} else {
			System.out.println(6 * bagOunces + " seconds");
		}
	}

	public static void main(String[] args) {
		PopcornTimer popcornBag = new PopcornTimer();
		popcornBag.printPopcornTime(7);
	}
}