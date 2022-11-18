package zyBooks;

import java.util.*;

public class Numbers2 {
	private int[] nums;

	public int findMax() {
		maxVal = userVal[0];
		/* Type your code here. */
		for (int i = 0; i < nums.length; ++i) {
			if (maxVal[i] > maxVal) {
				maxVal = userVals[i];
			}
		}
	}

	public void setNums(int[] nums) {
		this.nums = nums;
	}

	public int[] getNums() {
		return nums;
	}

	// Fill array nums with pseudo-random integers (0-999) with a seed value
	public void fillRandomly(int seed, int size) {
		Random rand = new Random(seed);
		nums = new int[size];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rand.nextInt(1000);
		}
	}

	public static void main(String[] args) {
		Numbers numObject = new Numbers();
		int[] nums = { 2, 4, 6, 8, 10, 7, 5, 3 };
		numObject.setNums(nums);
		System.out.println(Arrays.toString(numObject.getNums())); // Prints content of array
		System.out.println(numObject.findMax()); // findMax() should return 10

		numObject.fillRandomly(7, 10); // Fill nums with 10 pseudo-random nmubers using seed value 7
		System.out.println(Arrays.toString(numObject.getNums())); // Prints content of array: [236, 164, 485, 44, 380,
																	// 254, 968, 649, 850, 534]
		System.out.println(numObject.findMax()); // findMax() should return 968
	}
}