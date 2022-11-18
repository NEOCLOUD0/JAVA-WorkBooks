package zyBooks;
import java.util.Scanner;
import java.util.Random;

public class FlipACoin {
	
	/* Define your method here */
	public static String coinFlip(Random rand) {
		if (rand.nextInt(2) == 0) {
			return "Tails";
		}else {
			return "Heads";
		}
		
	}

	public static void main(String[] args) {
		 Scanner scnr = new Scanner(System.in);
	      Random rand = new Random(2); // Seed used in develop mode
	      // Add more variables as needed
	      int n = scnr.nextInt();
	      /* Type your code here. */
	      for(int i = 0; i < n; i++) {
	    	  System.out.println(coinFlip(rand));
	      }

	}

}
