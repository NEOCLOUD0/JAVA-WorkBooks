package zyBooks;

import java.util.Scanner;

public class Movie {
	Scanner scnr = new Scanner(System.in);
    int numRows;
    int numColumns;
    int currentRow;
    int currentColumn;
    char currentColumnLetter;

    numRows = scnr.nextInt();
    numColumns = scnr.nextInt();

    /* Your solution goes here  */
    for (int i = 1; i <= numRows; i++) {
        currentColumnLetter = 'A';

        for (int z = 1; z <= numColumns; z++) {
           System.out.print(i);
           System.out.print(currentColumnLetter + " ");
           currentColumnLetter++;
        }

     }
    System.out.println("");
}

}
