import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Using a Comparator object with method sort

public class Sort2 {

	public static void main(String[] args) {

		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		//Create and display a list containing the suits array elements
		List<String> list = Arrays.asList(suits); //create List
		System.out.printf("Unsorted array elements: %s%n", list);
		
		//sort in descending order using a comparator 
		Collections.sort(list, Collections.reverseOrder());
		System.out.printf("Sorted list elements: %s%n", list);

	}

}//end class Sort2
