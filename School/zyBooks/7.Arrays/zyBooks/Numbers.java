package zyBooks;

import java.util.*;

public class Numbers {
   
   // calcAverage() takes in an int array and returns the average value of elements in the array as a double.
   public double calcAverage(int[] nums) {
      /* Type your code here. */      
	   double sum = 0;
	   for (int i = 0; i < nums.length; i++) {
		   sum = sum + nums[i];
	   }
	double average = sum / nums.length;
	return average;
   }
   
   public static void main(String[] args) {
      Numbers numObject = new Numbers();
      int [] nums = {1,2,3,4,5};
      System.out.println(numObject.calcAverage(nums)); 
   }
}