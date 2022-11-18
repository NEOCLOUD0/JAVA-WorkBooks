package zyBooks;

import java.util.Scanner;

public class StepCounter {
	
	public static int feetToSteps(double userFeet) {
		return (int) (userFeet / 2.5);
	}



	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println(feetToSteps(in.nextDouble()));

	}

}
