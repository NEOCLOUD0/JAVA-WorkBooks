/*
 * Output all combinations of character variables a, b, and c, in the order shown below. If a = 'x', b = 'y', and c = 'z', then the output is:
xyz xzy yxz yzx zxy zyx
Note: If outputting multiple character variables with one statement, the argument for System.out.print() should start with "" +

Your code will be tested in three different programs, with a, b, c assigned with 'x', 'y', 'z', then with '#', '$', '%', then with '1', '2', '3'.
 */
package zyBooks;

import java.util.Scanner;

public class OutputCombinations {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char a;
		char b;
		char c;

		a = scnr.next().charAt(0);
		b = scnr.next().charAt(0);
		c = scnr.next().charAt(0);

		/* Your solution goes here */

		System.out.println("");
	}
}