/*
 * Given main(), define the Product class that will manage product inventory. Product class has three private member fields: a product code (String), the product's price (double), and the number count of product in inventory (int).

Implement the following Constructor and member methods as listed below:

public Product(String code, double price, int count) - set the member fields using the three parameters
public void setCode(String code) - set the product code (i.e. SKU234) to parameter code
public String getCode() - return the product code
public void setPrice(double p) - set the price to parameter p
public double getPrice() - return the price
public void setCount(int num) - set the number of items in inventory to parameter num
public int getCount() - return the count
public void addInventory(int amt) - increase inventory by parameter amt
public void sellInventory(int amt) - decrease inventory by parameter amt
 */
package zyBooks;

import java.util.Scanner;

public class Product {
	// TODO: Build Product class with private fields and methods listed above

	/* Type your code here. */
	private String code;
	private double price;
	private int count;

	// String
	public Product(String code, double price, int count) {
		this.code = code;
		this.price = price;
		this.count = count;
	}

	// followign instruction above
	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setPrice(double p) {
		this.price = p;
	}

	public double getPrice() {
		return price;
	}

	public void setCount(int num) {
		this.count = num;
	}

	public int getCount() {
		return count;
	}

	public void addInventory(int amt) {
		this.count = this.count + amt;
	}

	public void sellInventory(int amt) {
		this.count = this.count - amt;
	}

	// main
	public static void main(String args[]) {
		String name = "Apple";
		double price = 0.40;
		int num = 3;
		Product prod = new Product(name, price, num);

		// Test 1 - Are instance variables set/returned properly?
		System.out.println("Name: " + prod.getCode());
		System.out.printf("Price: %.2f\n", prod.getPrice());
		System.out.println("Count: " + prod.getCount());
		System.out.println();

		// Test 2 - Are instance variables set/returned properly after adding and
		// selling?
		num = 10;
		prod.addInventory(num);
		num = 5;
		prod.sellInventory(num);
		System.out.println("Name: " + prod.getCode());
		System.out.printf("Price: %.2f\n", prod.getPrice());
		System.out.println("Count: " + prod.getCount());
		System.out.println();

		// Test 3 - Do setters work properly?
		name = "Golden Delicious";
		prod.setCode(name);
		price = 0.55;
		prod.setPrice(price);
		num = 4;
		prod.setCount(num);
		System.out.println("Name: " + prod.getCode());
		System.out.printf("Price: %.2f\n", prod.getPrice());
		System.out.println("Count: " + prod.getCount());
	}
}