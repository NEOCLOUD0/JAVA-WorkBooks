package zyBooks;

import java.util.Scanner;

public class FibonacciSequence {

	public int fibonacci(int n) {
		/* Type your code here. */
		int termOne = 0, termTwo = 1, currentTerm;
		if (n < 0) {
			return -1;
		}
		for(int i = 0; i < n; i++) {
			currentTerm = termOne + termTwo;
			termOne = termTwo;
			termTwo = currentTerm;
		}
		return termOne;
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		FibonacciSequence program = new FibonacciSequence();
		int startNum;

		startNum = scnr.nextInt();
		System.out.println("fibonacci(" + startNum + ") is " + program.fibonacci(startNum));
	}
}
