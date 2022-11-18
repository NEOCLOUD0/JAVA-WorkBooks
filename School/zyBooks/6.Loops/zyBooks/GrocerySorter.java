package zyBooks;

import java.util.Scanner;

public class GrocerySorter {
	public enum GroceryItem {
		GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER
	};

	public static void main(String[] args) {
		GroceryItem userItem;

		userItem = GroceryItem.GR_APPLES;

		/* Your solution goes here */
		if ((userItem == GroceryItem.GR_APPLES) || (userItem == GroceryItem.GR_BANANAS)) {
			System.out.println("Fruit");
		} else if ((userItem == GroceryItem.GR_JUICE) || (userItem == GroceryItem.GR_WATER)) {
			System.out.println("Drink");
		}

	}
}