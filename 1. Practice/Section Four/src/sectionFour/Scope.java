package sectionFour;

public class Scope {
	
	static int dogs = 5;
	
	public static void main(String[] args) {
		System.out.println(dogs);
		someFunction();

	}
	
	public static void someFunction() {
		System.out.println(dogs);

	}
	
}
