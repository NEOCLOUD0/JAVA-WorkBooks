import java.util.Scanner;

public class calculateArea {
    public static void main(String[] args) {
        //Creating scanner to receive input from user
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the base of the triangle");
        int base = scan.nextInt();
        System.out.println("Enter the height of the triangle");
        int height = scan.nextInt();

        double area = (double)base * height / 2;
        System.out.println("The area is: " + area);

        //Calculating area of a triangle using 3 sides
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the 3 sides of a triangle:");
        int a = scan2.nextInt();
        int b = scan2.nextInt();
        int c = scan2.nextInt();
        double s = (double) (a + b + c) / 2;

        double area2 = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("The area of the triangle is: %.2f" , area2);

    }
}
