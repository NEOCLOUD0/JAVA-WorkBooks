/*
 * Write a method, findMax(), that takes in two integers and returns the largest value.
 */

import java.util.Scanner;

public class MaxOfTwo {
   
   /* Type your code here. */
   public int findMax(int num1, int num2){

      if(num1 > num2){
           return num1;
      }
      else {
          return num2;
      }
}


   
   public static void main(String args[]) {
      MaxOfTwo maxObject = new MaxOfTwo();
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int max;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      max = maxObject.findMax(num1, num2);
      System.out.println("Max: " + max);
   }
}
