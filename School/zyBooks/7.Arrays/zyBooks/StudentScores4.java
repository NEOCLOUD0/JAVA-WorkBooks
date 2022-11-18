package zyBooks;

import java.util.Scanner;

public class StudentScores4 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int NUM_POINTS = 4;
		int[] dataPoints = new int[NUM_POINTS];
		int controlValue;
		int i;

		controlValue = scnr.nextInt();

		for (i = 0; i < dataPoints.length; ++i) {
			dataPoints[i] = scnr.nextInt();
		}

		/* Your solution goes here */
		for(i = 0; i < dataPoints.length; i++) {
			if(dataPoints[i] < controlValue){
				dataPoints[i] = dataPoints[i] * 2;
			}
		}

		for (i = 0; i < dataPoints.length; ++i) {
			System.out.print(dataPoints[i] + " ");
		}
		System.out.println();
	}
}