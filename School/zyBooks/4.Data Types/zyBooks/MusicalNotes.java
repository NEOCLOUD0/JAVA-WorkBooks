/*
 * On a piano, a key has a frequency, say f0. Each higher key (black or white) has a frequency of f0 * rn, 
 * where n is the distance (number of keys) from that key, and r is 2(1/12). Given an initial key frequency, output that frequency 
 * and the next 4 higher key frequencies.
 */
package zyBooks;

import java.util.Scanner;

public class MusicalNotes {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		/* Type your code here. */
		double f;
		f = scnr.nextDouble();

		double r;
		r = Math.pow(2, 1.0 / 12);

		System.out.printf("%.2f %.2f %.2f %.2f %.2f\n", f, f * Math.pow(r, 1), f * Math.pow(r, 2), f * Math.pow(r, 3),
				f * Math.pow(r, 4));

	}
}
