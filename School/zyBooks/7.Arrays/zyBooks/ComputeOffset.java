package zyBooks;

import java.util.Scanner;

public class ComputeOffset {

   public static void main(String[] args) {
      final int NUM_VALS = 4;
      int[] origList = new int[NUM_VALS];
      int[] offsetAmount = new int[NUM_VALS];
      int i;
      Scanner input = new Scanner(System.in);

      origList[0] = input.nextInt();
      origList[1] = input.nextInt();
      origList[2] = input.nextInt();
      origList[3] = input.nextInt();

      offsetAmount[0] = input.nextInt();
      offsetAmount[1] = input.nextInt();
      offsetAmount[2] = input.nextInt();
      offsetAmount[3] = input.nextInt();

      /* Your code goes here */
      for (i = 0; i < NUM_VALS; ++i) {
          System.out.print(origList[i] - offsetAmount[i] + ",");
      }

      System.out.println();
  }
}