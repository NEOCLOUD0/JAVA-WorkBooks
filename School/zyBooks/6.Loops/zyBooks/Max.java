package zyBooks;

import java.util.Scanner;

public class Max {

	public int findMax() {
		/* Type your code here. */
		int max = 0;
		Scanner scnr = new Scanner(System.in);
		while (true) {
			int num = scnr.nextInt();
			if (num >= 0) {
				if (num > max) {
					max = num;
				}

			} else {
				break;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Max test = new Max();
		System.out.println(test.findMax());
	}
}