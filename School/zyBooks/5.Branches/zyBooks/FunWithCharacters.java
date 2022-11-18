package zyBooks;

import java.util.Scanner;

public class FunWithCharacters {

   /* Type your code here */
	public String checkCharacter(String word, int index) {

		if (Character.isDigit(word.charAt(index))) {
			return "Character '" + word.charAt(index) + "' is a digit";
		} 
		else if (Character.isLetter(word.charAt(index))) {
			return "Character '" + word.charAt(index) + "' is a letter";
		} 
		else if (word.charAt(index) == ' ') {
			return "Character '" + word.charAt(index) + "' is a white space";
		} 
		else {
			return "Character '" + word.charAt(index) +"' is unknown";
		}

	}
   
   public static void main(String[] args) {
      
      FunWithCharacters labObject = new FunWithCharacters();
      String word = "happy birthday"; // Set string
      int index = 2; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));
      
      index = 5; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));
      
      word = "happy birthday 2 you"; 
      index = 15; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));
      
      word = "happy birthday!"; 
      index = 14; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));
   }
}
