/*
 * Write a method, findLongest(), that takes two strings as parameters and returns the longest string.
 * If the strings are the same length then return the second string.
 */
package zyBooks;

import java.util.Scanner;

public class LongestString {
   
	/* Type your code here. */
	public String findLongest(String str1, String str2) {

		if (str1.compareTo(str2) > 0) {
			return(str1);
		}
		else if(str2.compareTo(str1) > 0) {
			return(str2);
		}
		else {
			return str2;
		}
	}

   public static void main(String[] args) {
      LongestString mainObject = new LongestString();
      Scanner scnr = new Scanner(System.in);
      
      String str1;
      String str2;
      String longest;
      
      str1 = scnr.next();
      str2 = scnr.next();
      
      longest = mainObject.findLongest(str1, str2);
      
      System.out.println(longest);
   }
}
