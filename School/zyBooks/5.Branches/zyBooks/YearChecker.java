
/*
 * Write an if-else statement with multiple branches. If givenYear is 2101 or greater, print "Distant future" (without quotes). 
 * Else, if givenYear is 2001 or greater (2001-2100), print "21st century". Else, if givenYear is 1901 or greater (1901-2000), 
 * print "20th century". Else (1900 or earlier), print "Long ago". End with a newline. Remember to use println instead of print to output a newline.
 */
import java.util.Scanner;

public class YearChecker {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int givenYear;

		givenYear = scnr.nextInt();

		/* Your solution goes here */
		if (givenYear >= 2101) {
			System.out.println("Distant future");
		} else if (givenYear >= 2001) {
			System.out.println("21st century");
		} else if (givenYear >= 1901) {
			System.out.println("20th century");
		} else {
			System.out.println("Long ago");
		}

	}
}