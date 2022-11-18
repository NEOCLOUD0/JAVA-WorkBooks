/*
 * Given 4 integers, output their product and their average, using integer arithmetic.
 */
package zyBooks;

import java.util.Scanner;

public class SimpleStatistics {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int num4;

		/* Type your code here. */

		num1 = scnr.nextInt();
		num2 = scnr.nextInt();
		num3 = scnr.nextInt();
		num4 = scnr.nextInt();

		int Product = num1 * num2 * num3 * num4;
		int Average = (num1 + num2 + num3 + num4) / 4;

		double pro = ((double) num1 * (double) num2 * (double) num3 * (double) num4);
		double avg = ((double) num1 + (double) num2 + (double) num3 + (double) num4) / 4.0;

		System.out.println(Product + " " + Average);

		System.out.printf("%.3f %.3f\n", pro, avg);
	}
}
