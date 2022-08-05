package cop2805;

public class Recursion extends Thread {
	public void run() {
		try {
			long x = System.currentTimeMillis();
			System.out.print("\nRecursive Thread found the solution: " + fibonacci(40));
			x = System.currentTimeMillis() - x;
			System.out.print(" in ms: " + x);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

// Recursion method 
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
