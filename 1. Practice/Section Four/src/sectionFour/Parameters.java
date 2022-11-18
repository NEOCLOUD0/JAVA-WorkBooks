package sectionFour;

public class Parameters {

	public static void main(String[] args) {
		measueRectangle(4.3, 2.2);
		measueRectangle(3.2, 4.1);
		measueRectangle(3.5, 1.2);
		measueRectangle(1.6, 5.6);
		measueRectangle(10.1, 0.7);
		measueRectangle(20.2, 5.6);

	}
	
	public static void measueRectangle(double length, double width) {
		double area = length * width;
		System.out.println("The area of the rectangle with length: " + length + " and width: " + width + " is equal to: " + area + "\n");
	}

}
