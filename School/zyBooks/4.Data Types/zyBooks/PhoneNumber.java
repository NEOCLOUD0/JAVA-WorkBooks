/*
 * Given a long integer representing a 10-digit phone number, output the area code, prefix, and line number using the format (800) 555-1212.
 */
package zyBooks;

import java.util.Scanner;

public class PhoneNumber {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		long phoneNumber;
		long areacode;
		long prefix;
		long linenumber;
		// Add more variables as needed

		phoneNumber = scnr.nextLong();

		/* Type your code here. */
		areacode = phoneNumber / 10000000;
		prefix = (phoneNumber / 10000) % 1000;
		linenumber = phoneNumber % 10000;

		System.out.println("(" + areacode + ")" + " " + prefix + "-" + linenumber);

	}
}
