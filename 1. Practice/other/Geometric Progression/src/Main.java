import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Geometric Progression");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int r = scan.nextInt();
        int n = scan.nextInt();
        int term = a;

        for (int i = 0; i < n; i++) {
            System.out.println(term + ",");
            term = term * r;
        }
    }
}