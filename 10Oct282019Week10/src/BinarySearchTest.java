import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Collection method binarySearch

public class BinarySearchTest {

	public static void main(String[] args) {
		//create an ArrayList<STring> from the contents of colors array
		String[] colors = {"red","white","blue","black","yellow","purple","tan","pink"};
		List<String> list = new ArrayList<>(Arrays.asList(colors));
		
		Collections.sort(list); //sort the ArrayList
		System.out.printf("Sorted ArrayList: %s%n", list);

		//search list for various values
		printSearchResults(list, "black");//first item
		printSearchResults(list, "red");//middle item
		printSearchResults(list, "pink");//last item
		printSearchResults(list, "aqua");//below lowest
		printSearchResults(list, "gray");//does not exist
		printSearchResults(list, "teal");//does not exist
		
	}
	
	//perform search and display result
	private static void printSearchResults(List<String> list, String key ) {
		
		int result  =0;
		System.out.printf("%nSearching for: %s%n", key);
		result = Collections.binarySearch(list, key);
		
		if(result >=0)
			System.out.printf("Found at index %d%n", result);
		else {
			System.out.printf("Not Found (%d)%n", result);
		}
		
	}

}//end class BinarySearchTest
