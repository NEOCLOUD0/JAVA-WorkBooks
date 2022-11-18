/*
 * Given sphereRadius, compute the volume of a sphere and assign sphereVolume with the result. 
 * Use (4.0 / 3.0) to perform floating-point division, instead of (4 / 3) which performs integer division.
 */
package zyBooks;

import java.util.Scanner;

public class SphereVolumeCalculator {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double sphereVolume;
		double sphereRadius;

		sphereRadius = scnr.nextDouble();

		/* Your solution goes here */
		sphereVolume = (4.0 / 3.0) * Math.PI * (sphereRadius * sphereRadius * sphereRadius);

		System.out.printf("%.2f\n", sphereVolume);
	}
}