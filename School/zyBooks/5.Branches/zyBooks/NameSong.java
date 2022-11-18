/*
 * Modify songVerse to play "The Name Game" (OxfordDictionaries.com), by replacing "(Name)" with userName but without the first letter.
 */
package zyBooks;

import java.util.Scanner;

public class NameSong {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userName;
		String songVerse;

		userName = scnr.nextLine();
		userName = userName.substring(1); // Remove first character

		songVerse = scnr.nextLine();

		// Modify songVerse to replace (Name) with userName without first character

		/* Your solution goes here */
		userName = userName.substring(0);
		songVerse = songVerse.replace("(Name)", userName);

		System.out.println(songVerse);
	}
}