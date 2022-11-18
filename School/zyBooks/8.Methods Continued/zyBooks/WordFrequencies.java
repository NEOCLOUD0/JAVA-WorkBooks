package zyBooks;

import java.util.Scanner;

public class WordFrequencies {
	
	public static int getFrequencyOfWord(String[] wordsList, int listSize, String currWord) {
	      int num = 0;
	      
	      for (int i = 0; i < listSize; i++) {
	         if (wordsList[i].equalsIgnoreCase(currWord)) {
	            num++;
	         }
	      }
	      return num;
	   }

	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int numElements = scnr.nextInt();
	      
	      String[] array = new String[numElements];
	      
	      for (int i = 0; i < numElements; i++) {
	         array[i] = scnr.next();
	      }
	      
	      for (int i = 0; i < numElements; i++) {
	         System.out.println(array[i] + " " + getFrequencyOfWord(array, numElements, array[i]));
	      }
	   }
	}