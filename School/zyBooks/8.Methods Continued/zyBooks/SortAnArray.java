package zyBooks;

import java.util.Scanner;

public class SortAnArray {
	   public static void sortArray(int[] myArr, int arrSize) { // myArr = the values stored in indexes,
		   														// arrSize = the array size (in elements)
		      int tempValue;
			      for (int i = 0; i < arrSize; ++i) { // Iterates based on the number of elements that the user has inputed.
			         for (int j = 0; j < arrSize - 1; ++j) { // Also iterates based on the number of elements the user inputed - 1.
			            if (myArr[j] < myArr[j + 1]) { // This code puts numbers from least to greatest.
			               tempValue = myArr[j];
			               myArr[j] = myArr[j + 1];
			               myArr[j + 1] = tempValue;
			            }
			         }
			      }
		   }

		   public static void main(String[] args) { // This is the main method so the program will begin reading here.
		      Scanner scnr = new Scanner(System.in);
			      int[] userVals = new int[scnr.nextInt()]; // The user will input the number of elements and saved into userVals.
				      for (int i = 0; i < userVals.length; ++i) { // Iterates based on the number of user elements inputed.
				    	  /*
				    	   * array.length : length is a final variable applicable for arrays. With the help of length variable, 
				    	     we can obtain the size of the array (number). 
						   * string.length() : length() method is a final variable which is applicable for string objects. 
						     length() method returns the number of characters presents in the string (string length). 
				    	   */
				         userVals[i] = scnr.nextInt(); // Then the user will be required to input an integer for each index i.
				         /* Example: 5(5 is userVals elements) 10 4 39 12 2
				             userVals[0] = 10
				             userVals[1] = 4
				             userVals[2] = 39
				             userVals[3] = 12
				             userVals[4] = 2
				         */
				      }
				      
				      sortArray(userVals, userVals.length); // The information above is passed in as a parameter to sortArray and then
				      // passes the values to the method sortArray above.
				      // Once the calculations above are finished performing, this function calls the method back.
				      
				      for (int i = 0; i < userVals.length; i++) {
				         System.out.print(userVals[i] + ",");
			      }
		      System.out.println();
		      
		      scnr.close();
		   }
}
