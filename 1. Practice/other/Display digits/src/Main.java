import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r;
        while (n > 0){
            r = n % 10;
            n = n / 10;
            System.out.println(r);
        }

    }
}