package s5;

public class WhileLoops {

	public static void main(String[] args) {
		double choice = 0.01;
		double guess = 0.99;
		
		while (guess > choice) {
			guess = Math.random();
			System.out.println(guess);
		}

	}

}
