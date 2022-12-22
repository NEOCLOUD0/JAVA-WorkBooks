import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number you want to start at: ");
        int starting = scan.nextInt();
        System.out.println("Enter number you want to go by: ");
        int goBy = scan.nextInt();
        System.out.println("Enter amount of numbers you want to see displayed: ");
        int terms = scan.nextInt();

        for (int i = 0; i < terms ; i++) {
            System.out.print(starting + ", ");
            starting = starting + goBy;

        }

    }
}