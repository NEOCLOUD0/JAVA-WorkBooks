package zyBooks;

import java.util.Scanner;

public class SwappingVariables {
	public static int[] swapValues(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		temp = arr[2];
		arr[2] = arr[3];
		arr[3] = temp;

		return arr;

	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] intArray = new int[4];
		for (int i = 0; i < 4; i++) {
			intArray[i] = scnr.nextInt();
		}
		intArray = swapValues(intArray);
		for (int i = 0; i <= 4; i++) {
			System.out.print(intArray[i] + " ");
		}
		
	}

}
