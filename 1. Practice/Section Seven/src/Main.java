
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//creating object 
		Car[] cars = new Car[] {
			new Car("Nissan S15", 20_000, 2002, "silver", new String[] {"Tires", "Keys"}),
			new Car("Lexus LFA", 2_000_000, 2012, "yellow", new String[] {"Tires", "Keys"}),
			new Car("Nissan S15", 20_000, 2000, "blue", new String[] {"Tires", "Filter"}),
			new Car("Honda NSX", 80_000, 2005, "red", new String[] {"Tires", "Filter", "Transmission"}),
			new Car("Lamborghini Huracan", 240_000, 2015, "blue", new String[] {"Tires", "Filter"})

		};
		
		
		
		Dealership dealership = new Dealership(cars);
		System.out.println(dealership);
		
		
		
	}

}
