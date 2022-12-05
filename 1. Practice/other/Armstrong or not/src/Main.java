import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int tempN= n;
        int r;
        int sum = 0;

        while(n > 0){
            r = n % 10;
            sum += Math.pow(r, 3);
            n = n / 10;

        }
        System.out.println(sum);
        if(sum == tempN){
            System.out.println(tempN + " is an armstrong number.");
        } else {
            System.out.println(tempN + " is not an armstrong number.");
        }
    }
}