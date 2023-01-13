import java.util.Scanner;

public class Cinema1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numOfRows = scan.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numOfSeats = scan.nextInt();

        int totalNumOfSeats = numOfRows * numOfSeats;
        int totalIncome;

        if(totalNumOfSeats <= 60){
            totalIncome = totalNumOfSeats * 10;
        } else {
            int frontHalfOfRows = numOfRows / 2;
            int backHalfOfRows = numOfRows - frontHalfOfRows;

            totalIncome = frontHalfOfRows * numOfSeats * 10
                    + backHalfOfRows * numOfSeats * 8;
        }

        System.out.println("Total income: ");
        System.out.println("$" + totalIncome);



    }
}
