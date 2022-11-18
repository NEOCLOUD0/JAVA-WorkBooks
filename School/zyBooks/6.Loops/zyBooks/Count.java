package zyBooks;

import java.util.Scanner;

public class Count {
	   

	public static int countMultiples(int low, int high, int x) {
		/* Type your code here. */
		int count = 0;
		if (x == 0) {
			return 0;
		}
		for (int i = low; i <= high; i++) {
			if (i % x == 0) {
				++count;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		/* Type your code here. */
		int low = scnr.nextInt();
		int high = scnr.nextInt();
		int n = scnr.nextInt();
		System.out.println(countMultiples(low, high, n));
	}
}
