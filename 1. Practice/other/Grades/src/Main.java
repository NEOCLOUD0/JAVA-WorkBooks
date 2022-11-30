import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 3 grades");

        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        int grade2 = scan.nextInt();
        int grade3 = scan.nextInt();

        int total = grade + grade2 + grade3;
        int average = total / 3;
        System.out.println("The total is: " + total + "\nand average is: " + average);
        
        if(average >= 70){
            System.out.println("A");
        } else if (60 <= average && average < 70) {
            System.out.println("B");
        } else if (50 <= average && average < 50) {
            System.out.println("C");
        } else if (40 <= average && average < 50) {
            System.out.println("D");
        } else if (average < 40) {
            System.out.println("F");
        }
    }
}