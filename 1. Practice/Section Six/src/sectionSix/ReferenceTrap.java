package sectionSix;

import java.util.Arrays;

public class ReferenceTrap {

	public static void main(String[] args) {
		String [] staffLastYear = {"JIN", "SAKAI", "SAMA"};
		String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
		staffThisYear[1] = "WAS";
		
		System.out.println(Arrays.toString(staffLastYear));
		System.out.println(Arrays.toString(staffThisYear));

	}

}
