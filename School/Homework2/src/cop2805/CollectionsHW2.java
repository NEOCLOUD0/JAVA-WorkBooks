package cop2805;

import java.util.*;

public class CollectionsHW2 {

	public static void main(String[] args) {
		
		//outputting the initial list
		Character[] initials = {'N', 'C', 'D'};
		List<Character> list1 = new ArrayList<Character>();
		for(Character x : initials) {
			list1.add(x);
		}
		System.out.println("Initial List: ");
		output(list1);
		
		
		//outputting the list in reverse
		System.out.println("\nReveresed List: ");
		Collections.reverse(list1);
		output(list1);
		
		//copying the list 
		System.out.println("\nCopied List: ");
		List<Character> list2 = Arrays.asList(initials);
		Collections.copy(list1, list2);
		output(list2);
		
		//filling the list
		System.out.println("\nR Filled List: ");
		Collections.fill(list1, 'R');
		output(list1);
		
	}

	
	/**
	 * 
	 * @param myList
	 */
	public static void output(List<Character> myList) {

		for (Character x : myList) {
			System.out.printf("%s ", x);
		}

	}

}//END
