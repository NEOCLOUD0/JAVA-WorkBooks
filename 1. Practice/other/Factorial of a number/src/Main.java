import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;

        }
        System.out.println("FACTORIAL OF " + n + " IS " + factorial);

    }
}