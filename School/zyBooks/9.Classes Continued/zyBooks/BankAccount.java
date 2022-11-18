package zyBooks;

public class BankAccount {
	// TODO: Build BankAccount class with methods listed above

	/* Type your code here. */
	private String customerName;

	private double savingsBalance;

	private double checkingsBalance;

	public BankAccount(String newName, double amt1, double amt2) {
		this.customerName = newName;
		this.checkingsBalance = amt1;
		this.savingsBalance = amt2;
	}

	public void setName(String newName) {
		this.customerName = customerName;
	}

	public String getName() {
		return customerName;
	}

	public void setChecking(double checkingsBalance) {
		this.checkingsBalance = checkingsBalance;
	}

	public double getChecking() {
		return checkingsBalance;
	}

	public void setSavings(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public double getSavings() {
		return savingsBalance;
	}

	public void depositChecking(double amt) {
		if (amt > 0) {
			this.checkingsBalance += amt;
		}
	}

	public void depositSavings(double amt) {
		if (amt > 0) {
			this.savingsBalance += amt;
		}
	}

	public void withdrawChecking(double amt) {
		if (amt > 0) {
			this.checkingsBalance -= amt;
		}
	}

	public void withdrawSavings(double amt) {
		if (amt > 0) {
			this.savingsBalance -= amt;
		}
	}

	public void transferToSavings(double amt) {
		if (amt > 0) {
			this.checkingsBalance -= amt;
			this.savingsBalance += amt;
		}
	}

	// main
	public static void main(String args[]) {
		BankAccount account = new BankAccount("Mickey", 500.00, 1000.00);
		account.setChecking(500);
		account.setSavings(500);
		account.withdrawSavings(100);
		account.withdrawChecking(100);
		account.transferToSavings(300);

		System.out.println(account.getName()); // Expected Mickey
		System.out.printf("$%.2f\n", account.getChecking()); // Expected 100.0
		System.out.printf("$%.2f\n", account.getSavings()); // Expected 700.0
	}
}