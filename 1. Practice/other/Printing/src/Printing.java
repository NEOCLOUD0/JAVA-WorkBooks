public class Printing {
    public static void main(String[] args) {
        int x = 10, y = 20;
        float b = 12.55F;
        char c = 'A';
        String str = "hello";

        System.out.println("Sum of " + x + " and " + y + " is " + (x + y));
        System.out.println(x + y + "test");
        System.out.println("test" + x + y);

        System.out.printf("First number is %d and second number is %d", x, y);
    }
}