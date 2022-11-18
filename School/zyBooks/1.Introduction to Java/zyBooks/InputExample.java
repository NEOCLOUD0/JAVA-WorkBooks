/*
Write two scnr.nextInt statements to get input values into birthMonth and birthYear. 
Then write a statement to output the month, a slash, and the year. End with newline.
The program will be tested with inputs 1 2000 and then with inputs 5 1950.
Ex: If the input is 1 2000, the output is:
1/2000
Note: The input values come from user input, so be sure to use scnr.nextInt statements,
as in birthMonth = scnr.nextInt();, to get those input values (and don't assign values directly,
as in birthMonth = 1).
 */

package zyBooks;

import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int birthMonth;
		int birthYear;

		/* Your solution goes here */
		birthMonth = scnr.nextInt();
		birthYear = scnr.nextInt();
		System.out.println(+birthMonth + "/" + birthYear);

	}
}
