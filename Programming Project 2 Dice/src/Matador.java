import java.util.Scanner;

public class Matador {
    public static void main(String[] args) {
        // create Scanner class object to read input from keyboard
        Scanner scnr = new Scanner(System.in);
        int computerScore = 0, playerScore = 0;
        int computerGuess, playerGuess;
        boolean playerTurn = true;

        // creating two Die objects
        Die d1 = new Die();
        Die d2 = new Die();

        // starting an infinite loop
        while (true) {
            if (playerTurn) {
                System.out.println("\nYour turn:Chose a number between 2 and 12: ");
                playerGuess = scnr.nextInt();

                // continue loop from here if user enters invalid value
                if (playerGuess < 2 || playerGuess > 12) {
                    System.out.println("Error: Invalid guess.");
                    continue;
                }

                // rolling both of the die
                d1.roll();
                d2.roll();

                // displaying die numbers
                System.out.println("Rolling dice... Die 1: " + d1.getNumber() + ", Die 2: " + d2.getNumber());

                // if both die values are 1
                if (d1.getNumber() == 1 && d2.getNumber() == 1) {
                    // subtract 25 from score and set computerTurn as true
                    playerScore = playerScore - 25;
                    playerTurn = false;
                }
                // if either of die values is 1
                else if (d1.getNumber() == 1 || d2.getNumber() == 1) {
                    // nothing is added to score and it becomes the computer turn
                    playerTurn = false;
                }
                // if both dice have different values
                else {
                    // adding sum of both dice to playerScore
                    playerScore += d1.getNumber() + d2.getNumber();

                    // player win if both dice value matches with user entered value
                    if (d1.getNumber() == playerGuess && d2.getNumber() == playerGuess) {
                        System.out.println("You win!");
                        break;
                    }
                    // player gets a chance to roll again if user entered value matches with anyone
                    // of the die
                    else if (d1.getNumber() == playerGuess || d2.getNumber() == playerGuess) {
                        System.out.println("Your entered value is matching with one of the die. Roll again!");
                    }
                    // if neither of the dice matches with user value then computer gets next chance
                    else {
                        playerTurn = false;
                    }
                }
                System.out.println("Your current score = " + playerScore);
            } else {
                // generating a random number between 2 to 12 for computerGuess
                computerGuess = (int) (Math.random() * 11 + 2);

                // rolling both dice
                d1.roll();
                d2.roll();

                System.out.println("\nComputer turn:");
                System.out.println("Computer chose: " + computerGuess);
                System.out.println("Rolling dice... Die 1: " + d1.getNumber() + ", Die 2: " + d2.getNumber());

                // if both die values are 1
                if (d1.getNumber() == 1 && d2.getNumber() == 1) {
                    // subtract 25 from score and set playerTurn as true
                    computerScore = computerScore - 25;
                    playerTurn = true;
                }
                // if either of die values is 1
                else if (d1.getNumber() == 1 || d2.getNumber() == 1) {
                    // nothing is added to score and it becomes the playerTurn
                    playerTurn = true;
                } else {
                    // adding sum of both dice to computerScore
                    computerScore += d1.getNumber() + d2.getNumber();
                    // computer win if both dice value matches with computer generated value
                    if (d1.getNumber() == computerGuess && d2.getNumber() == computerGuess) {
                        System.out.println("Computer win!");
                        break;
                    }
                    // computer gets a chance to roll again if computer generated value matches with
                    // anyone of the die
                    else if (d1.getNumber() == computerGuess || d2.getNumber() == computerGuess) {
                        System.out.println("Computer\'s guessed value is matching with one of the die. Rolling again!");
                    }
                    // if neither of the dice matches with user value then player gets next chance
                    else {
                        playerTurn = true;
                    }
                }
                System.out.println("Computer\' current score = " + computerScore);

            }
            // stop loop and display win message if playerScore is more than 99
            // otherwise computer wins
            if (playerScore >= 99) {
                System.out.println("You win!");
                break;
            } else if (computerScore >= 99) {
                System.out.println("Computer win!");
                break;
            }
        } // while close
    }
}