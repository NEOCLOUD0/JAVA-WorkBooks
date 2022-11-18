package variables;

public class Bus {

	public static void main(String[] args) {
		String sentence = "Number of passengers: ";
		
		int passangers = 0;
		
		passangers += 9;
		System.out.println(sentence + passangers);
		
		passangers -= 5;
		System.out.println(sentence + passangers);
		
		passangers -= 4;
		System.out.println(sentence + passangers);

		System.out.println("end of shift");

	}

}
