import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if(age >= 14 && age <= 55){
            System.out.println("You are young");
        } else {
            System.out.println("You are not young");
        }
    }
}