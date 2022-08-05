package newPackage;

public class CalculateAverage {
	
	// accepting an array of int's
	public double calculation(int[] array) {
		double sum = 0;
		for (int number : array) {
			sum = sum + number;
		}
		return sum / array.length;
	}
	
	// accepting an array of doubles
	public double calculation(double[] array) {
		double sum = 0;
		for(double number : array) {
			sum = sum + number;
		}
		return sum / array.length;
	}

} // END
