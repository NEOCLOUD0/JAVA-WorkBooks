public class Main {
    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        int symbol = str.indexOf("@");
        String userName = str.substring(0, symbol);
        String domain = str.substring(symbol + 1, str.length());

        System.out.println(userName);
        System.out.println(domain);
        System.out.println(domain.startsWith("gmail"));
    }
}