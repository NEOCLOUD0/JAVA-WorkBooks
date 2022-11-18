package zyBooks;

import java.util.Arrays;

public class Odd {

	public int[] removeEvens(int[] nums) {
		/* Type your code here. */
		for (int i = 0; i < input.size(); i++) {
			int even = input.get(i) % 2;
			if (even == 0) {
				input.remove(i);
			}
		}
	}

	public static void main(String[] args) {
		Odd labObject = new Odd();
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] result = labObject.removeEvens(input);

		// Helper method Arrays.toString() converts int[] to a String
		System.out.println(Arrays.toString(result)); // Should print [1, 3, 5, 7, 9]
	}
}
