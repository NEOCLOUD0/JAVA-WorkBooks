/*
 * Write a program using integers userNum and divNum as input, and output userNum divided by divNum three times. Note: End with a newline.
 */
package zyBooks;

import java.util.Scanner;

public class DivideInputIntegers {

	public static void main(String[] args) {
		/* Type your code here. */
		Scanner scnr = new Scanner(System.in);
		int userNum = scnr.nextInt();
		int divNum = scnr.nextInt();

		System.out.print(userNum / (divNum) + " ");
		System.out.print(userNum / (divNum * divNum) + " ");
		System.out.println(userNum / (divNum * divNum * divNum));
	}
}
