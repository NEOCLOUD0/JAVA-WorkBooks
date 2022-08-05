package newPackage;

import java.util.Arrays;

public class Average {

	public static void main(String[] args) {
		
		// array for int's used random number generator
		int[] array1 = {89, 83, 4, 58, 57};
		int[] array2 = {18, 65, 77, 78, 4, 18};
		
		// array for doubles also used random number generator
		double[] array3 = {59.34, 74.21, 74.51, 41.28, 18.79, 22.28, 16.03};
		double[] array4 = {33.20, 2.85, 16.51, 38.78, 15.48, 26.71, 4.67, 75.50};
		
		
		CalculateAverage avg = new CalculateAverage();
		
		// outputting the average for each array 
		System.out.println("Average of: " + Arrays.toString(array1) + " is = " + String.format("%.2f", avg.calculation(array1)));
		System.out.println("Average of: " + Arrays.toString(array2) + " is = " + String.format("%.2f", avg.calculation(array2)));
		System.out.println("Average of: " + Arrays.toString(array3) + " is = " + String.format("%.2f", avg.calculation(array3)));
		System.out.println("Average of: " + Arrays.toString(array4) + " is = " + String.format("%.2f", avg.calculation(array4)));

	}

}// END
