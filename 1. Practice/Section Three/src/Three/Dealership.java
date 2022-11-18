package Three;

import java.util.Scanner;

public class Dealership {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the JAVA DEALERSHIP");
		System.out.println(" - Select option 'A' to buy a car");
		System.out.println(" - Selct option 'B' to sell a car");
		String option = scan.nextLine();
		
		switch(option.toUpperCase()) {
			case "A":
				System.out.println("What is your budget");
				int budget = scan.nextInt();
				if(budget >= 10_000) {
					System.out.println("Great! A Nissan Altima is available.");
					System.out.println("\nDo you have insurance? Type 'yes' or 'no'");
					scan.nextLine();
					String insurance = scan.nextLine();
					System.out.println("\nDo you have a drivers license? Type 'yes' or 'no'");
					String license = scan.nextLine();
					System.out.println("\nWhat is your credit score?");
					
					int creditScore = scan.nextInt();
					if(insurance.toLowerCase().equals("yes") && license.toLowerCase().equals("yes") && creditScore > 660) {
						System.out.println("SOLD! Pleasure doing businees with you!");
					} else {
						System.out.println("We are sorry you are not eligible.");
					}
				
				} else {
					System.out.println("Sorry, we do not sell cars under $10,000.");
				}
				break;
				
			case "B":
				System.out.println("\nWhat is your car valued at?");
				int value = scan.nextInt();
				System.out.println("\nWhat is your selling price?");
				int price = scan.nextInt();
				
				if(value > price && price < 30_000) {
					System.out.println("\nWe will buy your car. Pleasure doing business with you!");
				} else {
					System.out.println("\nSorry, we are not interested.");
				}
				break;
				
			default:
				System.out.println("Invalid option");
				break;
		
		}

		scan.close();
	}

}
