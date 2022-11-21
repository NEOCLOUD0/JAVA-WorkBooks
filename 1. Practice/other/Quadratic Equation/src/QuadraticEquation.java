import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        System.out.println("Enter values of a, b, c: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        double r1, r2;
        r1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
        r2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
        System.out.println("Roots are: " + r1 + ", " + r2);
    }
}