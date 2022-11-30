public class Main {
    public static void main(String[] args) {
        String str1 = "Mr. James Bond";
        System.out.println(str1.startsWith("James",4));
        System.out.println(str1.endsWith("Bond"));

        System.out.println(str1.charAt(4));

        String str2 = "www.udemy.com";
        System.out.println(str2.indexOf(".", 4));
    }
}