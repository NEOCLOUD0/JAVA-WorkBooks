import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        int length, width, height, totalArea, volume;


        System.out.println("Enter length: ");
        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();
        System.out.println("Enter width: ");
        width = scan.nextInt();
        System.out.println("Enter height: ");
        height = scan.nextInt();


        totalArea = 2 * (length * width + length * height + width * height);
        System.out.println("The total area is: " + totalArea);

        volume = length * width * height;
        System.out.println("The total volume is: " + volume);
    }
}