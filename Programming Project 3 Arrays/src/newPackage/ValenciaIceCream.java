package newPackage;

import java.util.Scanner;

public class ValenciaIceCream {

	public static void main(String[] args) {

		// listing variables
		int bonus;
		int weeksWorked = 0;
		int reviewsRecieved = 0;
		int totalBonus = 0;
		char employee = 'A';

		// scanner to get input form user
		Scanner scnr = new Scanner(System.in);

		// bonus array
		int[][] table = { { 25, 45, 80, 110, 150 }, { 50, 75, 90, 120, 180 }, { 100, 125, 160, 210, 265 },
				{ 160, 190, 225, 275, 340 }, { 235, 265, 325, 385, 450 }, { 300, 360, 420, 480, 600 },
				{ 425, 500, 585, 725, 875 } };
		
		// I could not get it to make the user just enter -1 once
		System.out.println("Please enter (-1 to exit) for both prompts.");

		while (true) {
			System.out.println("Please enter the number of weeks this employee has worked: ");
			weeksWorked = scnr.nextInt();

			System.out.println("Please enter the number of positive reviews recieved: ");
			reviewsRecieved = scnr.nextInt();
			
			
			if((weeksWorked == -1) && (reviewsRecieved == -1)) {
				break;
			}else {

				if (weeksWorked >= 6) {
					weeksWorked = 6;
				}
				if (reviewsRecieved >= 4) {
					reviewsRecieved = 4;
				}

				bonus = table[weeksWorked][reviewsRecieved];
				
				System.out.println("Employee " + employee + " worked " + weeksWorked + " weeks and got "
						+ reviewsRecieved + " positive reviews; bonus: $" + bonus);
				totalBonus += bonus;
				
				employee += 1;
			}
		}
		System.out.println("Total bonuses paid: $" + totalBonus);
		scnr.close();
	}

} // END
