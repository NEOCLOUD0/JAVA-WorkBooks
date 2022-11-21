public class StringPractice {
    public static void main(String[] args) {
        String str1 = "Java Program";

        String str2 = new String("JAVA");

        char c [] = {'H', 'e', 'l', 'l', 'o'};

        byte b [] = {65, 66, 67, 68};

        String str4 = new String(b, 2, 2);

        System.out.println(str4);

        String new1 = "Hi";
        String new2 = "Hi";
        System.out.println(new1 == new2);
    }
}