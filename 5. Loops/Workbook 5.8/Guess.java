import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       /* Task 1 
            1. Store a "secret" number between 1 and 5. 
            2. Then, prompt the user to enter a guess.
       */
       int secret = 3;
    	
       System.out.print("I chose a number between 1 and 10. Try to guess it: \n");
        
       Scanner scan = new Scanner(System.in);
       int number = scan.nextInt();
	/* Task 2 
            1. Set up a loop that keeps running while the user is incorrect
               Every time they get it wrong, write 'Guess again: '

            2. Once they guess it, print: You got it!
        */        
       while(number != secret) {
    	   System.out.print("Guess again: ");
    	   number = scan.nextInt();
    	   
       }
       System.out.println("You got it!");
       
        scan.close();
    }

}
