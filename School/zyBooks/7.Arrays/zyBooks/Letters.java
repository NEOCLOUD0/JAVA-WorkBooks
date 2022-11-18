package zyBooks;

import java.util.*;

public class Letters {

	// This method reverses contents of input argument arr.
	public char[] reverse(char[] arr) {
		/* Type your code here. */
		for (int i = ch.length-1; i >= 0 ; i--){
		    System.out.print(ch[i]);
		}

	public static void main(String[] args) {
		Letters lettersObject = new Letters();
		char[] ch = { 'a', 'b', 'c' };
		System.out.println(lettersObject.reverse(ch)); // Should print cba
	}
}