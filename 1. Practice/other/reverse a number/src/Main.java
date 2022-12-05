import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int r;
        int reverse = 0;

        while (n != 0){
            // get last digit from n
            r = n % 10;

            reverse = reverse * 10 + r;

            // remove the last digit from n
            n = n / 10;

        }
        System.out.println("Reversed: " + reverse);

    }
}