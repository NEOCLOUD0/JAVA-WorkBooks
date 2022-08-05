package cop2805;

public class Dynamic extends Thread {
	public void run() {
		try {
			long x = System.currentTimeMillis();
			System.out.print("Dynamic Thread found the solution: " + fibonacci(40));
			x = System.currentTimeMillis() - x;
			System.out.print(" in ms: " + x);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// Dynamic method
	public static int fibonacci(int n) {
		int v1 = 0;
		int v2 = 1;
		int v3 = 0;
		for (int i = 2; i <= n; i++) {
			v3 = v1 + v2;
			v1 = v2;
			v2 = v3;
		}
		return v3;
	}

}
