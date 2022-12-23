public class Main {
    public static void main(String[] args) {
        int A[] = new int[10];
        A[0] = 3;
        A[1] = 6;
        A[2] = 9;
        A[3] = 12;
        A[4] = 15;
        A[5] = 18;
        A[6] = 21;
        A[7] = 24;
        A[8] = 27;
        A[9] = 30;

        int n = 6;

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + ", ");
            System.out.println(" ");
        }

        int x = 20;
        int index = 2;

        for (int i = n; i > index; i--) {
            A[i] = A[i-1];
            A[index] = x;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
            System.out.println(" ");
        }
    }
}