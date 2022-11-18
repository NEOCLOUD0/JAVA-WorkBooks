/*
 * Build the Student class with the following specifications:

Private fields
	String name - Initialized in default constructor to "Louie"
	double gpa - Initialized in default constructor to 1.0
Default constructor
Public member methods
	setName() & getName()
	setGPA() & getGPA()
 */

package zyBooks;

public class Student {
	// TODO: Build Student class with private fields and methods listed above

	// TODO: Define two private member fields
	private String name = "Louie";
	private double gpa = 1.0;

	public Student() {
		// TODO: Define default constructor
		this.name = name;
		this.gpa = gpa;
	}

	public void setName(String n) {
		// TODO: Assign parameter to instance field
		this.name = n;
	}

	// TODO: Add three more methods
	public String getName() {
		return name;
	}

	public void setGPA(double gpa) {
		this.gpa = gpa;
	}

	public double getGPA() {
		return gpa;
	}

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.getName() + "/" + student.getGPA());

		student.setName("Felix");
		student.setGPA(3.7);
		System.out.println(student.getName() + "/" + student.getGPA());
	}
}