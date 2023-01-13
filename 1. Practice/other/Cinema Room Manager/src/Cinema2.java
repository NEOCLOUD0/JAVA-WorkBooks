import java.util.Scanner;

public class Cinema2 {

    private static char[][] cinemaHall;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        createCinema();
        int command;
        do {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy the ticket");
            System.out.println("0. Exit");

            command = scan.nextInt();

            switch (command) {
                case 1:
                    printCinemaHall();
                    break;
                case 2:
                    takeTicket();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Option is not listed");

            }
        } while (command != 0);


    }// END MAIN

    // Functions
    public static void createCinema() {
        System.out.println("Enter the number of rows:");
        int numOfRows = scan.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numOfSeats = scan.nextInt();

        cinemaHall = new char[numOfRows][numOfSeats];
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfSeats; j++) {
                cinemaHall[i][j] = 'S';
            }
        }
    }

    public static void printCinemaHall(){
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= cinemaHall[0].length; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < cinemaHall.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < cinemaHall[0].length; j++) {
                System.out.print(" " + cinemaHall[i][j]);
            }
            System.out.println();
        }
    }

    public static void takeTicket(){
        System.out.println("Enter a row number:");
        int seatRow = scan.nextInt();
        System.out.println("Enter a seat number in that row");
        int seatNumber = scan.nextInt();

        int totalNumOfSeats = cinemaHall.length * cinemaHall[0].length;

        int priceTicket;

        if(totalNumOfSeats <= 60){
            priceTicket = 10;
        } else {
            int frontHallOfRows = cinemaHall.length / 2;
            if (seatRow <= frontHallOfRows){
                priceTicket = 10;
            } else {
                priceTicket = 8;
            }
        }
        System.out.println("Ticket price: $" + priceTicket);
        cinemaHall[seatRow - 1][seatNumber - 1] = 'B';
    }


}// END CLASS
