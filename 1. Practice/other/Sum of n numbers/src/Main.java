import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;

        }
        System.out.println("SUM OF " + n + " NUMBERS IS " + sum);

    }
}