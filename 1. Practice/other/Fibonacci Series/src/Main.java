import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        System.out.println("Enter number of Terms");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int a = 0;
        int b = 1;
        int c;

        System.out.print(a + ", " + b + ", ");
        for (int i = 0; i < n-2; i++) {
            c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }
    }
}