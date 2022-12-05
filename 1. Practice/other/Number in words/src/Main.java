import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int r;
        String str = "";

        while (n != 0){
            r = n % 10;
            n = n / 10;
            str = str + r;
        }

        char c;
        for (int i = str.length() - 1; i >= 0; i--){
            c = str.charAt(i);

            //enhanced switch statement (basically the same thing as normal)
            switch (c) {
                case '0' -> System.out.print(" zero ");
                case '1' -> System.out.print(" one ");
                case '2' -> System.out.print(" two ");
                case '3' -> System.out.print(" three ");
                case '4' -> System.out.print(" four ");
                case '5' -> System.out.print(" five ");
                case '6' -> System.out.print(" six ");
                case '7' -> System.out.print(" seven ");
                case '8' -> System.out.print(" eight ");
                case '9' -> System.out.print(" nine ");
            }

        }



    }
}