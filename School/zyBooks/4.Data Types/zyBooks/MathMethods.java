/*
 * Given three floating-point numbers x, y, and z, output x to the power of z, x to the power of (y to the power of z), 
 * the absolute value of y, and the square root of (xy to the power of z).
 */
package zyBooks;

import java.util.Scanner;

public class MathMethods {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double x;
		double y;
		double z;
		/* Type your code here. */
		x = scnr.nextDouble();
		y = scnr.nextDouble();
		z = scnr.nextDouble();

		System.out.print(Math.pow(x, z) + " " + Math.pow(x, Math.pow(y, z)) + " " + Math.abs(y) + " "
				+ Math.sqrt(Math.pow(x * y, z)));
		System.out.println("");
	}
}
