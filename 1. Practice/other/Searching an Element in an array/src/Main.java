public class Main {
    public static void main(String[] args) {
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 7) {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("Number not found");
    }
}