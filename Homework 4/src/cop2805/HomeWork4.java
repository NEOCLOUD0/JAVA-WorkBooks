package cop2805;

import java.io.*;
import java.util.*;

public class HomeWork4 {

	public static void main(String[] args) {
		List<Double> variable = HomeWork4.readFile("data.txt");
		System.out.println(readFile("data.txt"));
		Collections.sort(variable);
		HomeWork4.writeFile(variable,"data-sorted.txt");
		System.out.println(readFile("data-sorted.txt"));
	}

	/**
	 * 
	 * @param file
	 * @return numbers
	 */
	public static List<Double> readFile(String file) {
		List<Double> numbers = new ArrayList<Double>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String data = br.readLine();
			while (data != null) {
				numbers.add(Double.parseDouble(data));
				data = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("File not found");
		}
		return numbers;
	}

	
	/**
	 * 
	 * @param data
	 * @param file
	 */
	
	public static void writeFile(List<Double> data, String file) {
		try {
			PrintWriter pw = new PrintWriter(new File(file));
			for (Double numbers : data) {
				pw.println(numbers);
				pw.flush();
			}
		} catch (Exception e) {
			System.out.println("You have an error");
		}
	}

}