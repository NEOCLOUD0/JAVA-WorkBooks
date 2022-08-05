package cop2805;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Recursion());
		Thread t2 = new Thread(new Dynamic());
		
		t1.start();
		t2.start();
	}
	

}
