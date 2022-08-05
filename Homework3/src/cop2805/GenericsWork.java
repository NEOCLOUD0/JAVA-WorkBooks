package cop2805;

public class GenericsWork {

	public static void main(String[] args) {
		
		String[] colors = { "Red", "Green", "Blue" };
		Integer[] numbers = { 1, 2, 3 };
		Double[] circleRadius = { 3.0, 5.9, 2.9 };

		// outputting the max from the arrays above
		System.out.println("Colors: " + max(colors));
		System.out.println("Numbers: " + max(numbers));
		System.out.println("Circle Radius: " + max(circleRadius));

	}

	
	/**
	 * 
	 * @param <E>
	 * @param list
	 * @return maxElement
	 */
	public static <E extends Comparable<E>> E max(E[] list) {
		E maxElement = list[0];

		for (int i = 0; i < list.length; i++) {
			
			if (list[i].compareTo(maxElement) > 0) {
				maxElement = list[i];
			}
		}
		return maxElement;
		

	}

}
