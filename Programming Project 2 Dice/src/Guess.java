import java.util.Scanner;

public class Guess {
	public static void main(String args[]) {
		final int MAX_TRIES = 3;

		// Creating the die
		Die dieOne = new Die();
		Die dieTwo = new Die();

		System.out.println("Choose a number between 2 and 12");

		// input for players guess
		Scanner scnr = new Scanner(System.in);
		int guess = scnr.nextInt();
		scnr.close();

		for (int i = 0; i < MAX_TRIES; i++) {
			dieOne.roll();
			dieTwo.roll();
			int diceRollTotal = dieOne.getNumber() + dieTwo.getNumber();
			if (guess == diceRollTotal) {
				System.out.println("Rolled " + dieOne.getNumber() + " & " + dieTwo.getNumber());
				System.out.println(guess);
				System.out.println("You Win!");
				return;
			} else {
				int diceSum = dieOne.getNumber() + dieTwo.getNumber();
				System.out.println("Rolled " + dieOne.getNumber() + " & " + dieTwo.getNumber());
				System.out.println(diceSum);
			}

		}
		System.out.println("Computer Wins!");

	}
}
