package cop2805;

public class SalesAndCommissions {

	public static void main(String[] args) {

		System.out.println("Sales\t\t\t Income");

		// Using a for loop because we know how many time we want to run
		for (double i = 1000; i <= 20_000; i += 1000) {
			// calling the function
			System.out.println("$" + String.format("%.2f", i) + ("\t\t $" + String.format("%.2f", computeIncome(i))));
		}

	}

	
	/**
	 * 
	 * @param salesAmount
	 * @return commission + baseSalary
	 * 
	 * Performing the calculation based on the tiers
	 */

	public static double computeIncome(double salesAmount) {
		double baseSalary = 5000;
		double commission = 0;

		if (salesAmount > 10_000) {
			commission = (salesAmount - 10_000) * 0.12 + (5000 * 0.1) + (5000 * 0.08);

		} else if (salesAmount > 5000) {
			commission = (salesAmount - 5000) * 0.1 + (5000 * 0.08);

		} else if (salesAmount > 0) {
			commission = salesAmount * 0.08;

		}
		return commission + baseSalary;

	}

} // END OF CLASS
