package sectionSix;

public class ArraysAndLoops {

	public static void main(String[] args) {
		String[] kingdoms = {"Mercia", "Wessex", "Northumbria", "E A"};
		
		System.out.println("The number of elements is " + kingdoms.length);
		
		for(int i = 0; i < kingdoms.length; i++) {
			System.out.println("The element at index " + i + " is " + kingdoms[i]);
		}

	}

}
