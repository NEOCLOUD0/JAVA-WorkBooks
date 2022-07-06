import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        
        /* Task 1: Create an array that stores each aisle:
             apples – bananas – candy – chocolate – coffee – tea

             Then, use a for loop to print each element in the array. 
        */
    	String[] aisle = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
    	
    	System.out.println("Do you seel coffee?");
    	for(int i = 0; i < aisle.length; i++) {
    		
    		if(aisle[i].equals("coffee")) {
    			System.out.println("We have that in aisle: " + i);
    			break;
    		}
    	}
 
        /* Task 2:
           1. System.out.println("\nDo you sell coffee?");

           2. Using the for loop from task 1:
            • check if Java Grocer sells coffee.
            • if so, break the loop and print: \nWe have that in aisle: <index>

        */
    
    }
}
