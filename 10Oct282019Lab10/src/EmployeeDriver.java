//I Shobaki
//Lab10 Generic Collections
//Oct 31, 2019


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class EmployeeDriver {
	

	private static Formatter output;
	public static void main(String[] args) {
		System.out.println("Iyad Shobaki");
		System.out.println("Lab10 Generic Collections");
		System.out.println("Oct 31, 2019");
		System.out.println();
		
		
		//create list of employees
		List<Employee> list = new ArrayList<>();

		list.add(new Employee(61,1926,"Davis"));
		list.add(new Employee(64,1904,"Miller"));
		list.add(new Employee(62,1917,"Rich"));
		list.add(new Employee(63,1922,"Mingus"));
		list.add(new Employee(64,1905,"Dorsey"));
		list.add(new Employee(65,1909,"Tatum"));
		list.add(new Employee(60,1910,"Shaw"));
		list.add(new Employee(65,1904,"Basie"));
		list.add(new Employee(65,1899,"Ellington"));
		list.add(new Employee(61,1901,"Armstrong"));
		list.add(new Employee(61,1903,"Beiderbecke"));
		list.add(new Employee(65,1890,"Morton"));
		list.add(new Employee(59,1954,"Vaughn"));
		list.add(new Employee(66,1925,"King"));
		list.add(new Employee(59,1977,"Sheppard"));
		
		System.out.println("The UN-Sorted List");
		System.out.println();
		printList(list);
		
		Collections.sort(list, new EmployeeGroupComparator());
		System.out.println();
		System.out.println("The Sorted List");
		System.out.println();
		printList(list);
		
		Collections.shuffle(list);
		System.out.println();
		System.out.println("The Shuffled List");
		System.out.println();
		printList(list);
		
		
		Collections.reverse(list);
		System.out.println();
		System.out.println("The Reversed Shuffled List");
		System.out.println();
		printList(list);
		
		
		Collections.sort(list,new EmployeeLastNameComparator());
		System.out.println();
		System.out.println("The ArrayList using Iterator");
		System.out.println();
		//printList(list);
		printUsingIterator(list);
		
		
		System.out.println();
		System.out.println("The Reversed ArrayList using Iterator");
		System.out.println();
		printReverseUsingIterator(list);
		
		
		printToFileUsingIterator(list);
		
	}
	
	//print list method
	private static void printList(List<Employee> list) {
		System.out.printf("%-4s%-20s%-20s%-20s%n", " " , "Group ID", "ID", "Last Name");
		System.out.println("------------------------------------------------------------");
		for(int i =0; i < list.size(); i++)
			System.out.printf("%-4s%s"," ", list.get(i));
	}

	
	//method to print the list using iterator
	private static void printUsingIterator(List<Employee> list) {
		
		ListIterator<Employee> iterator = list.listIterator();
		System.out.printf("%-4s%-20s%-20s%-20s%n", " " , "Group ID", "ID", "Last Name");
		System.out.println("------------------------------------------------------------");
		while(iterator.hasNext()) {
			System.out.printf("%-4s%s", " ", iterator.next());		
			
		}
		
	}
	
	//method to print the reverse list using iterator 
	private static void printReverseUsingIterator(List<Employee> list) {
		
		ListIterator<Employee> iterator = list.listIterator(list.size());
		System.out.printf("%-4s%-20s%-20s%-20s%n", " " , "Group ID", "ID", "Last Name");
		System.out.println("------------------------------------------------------------");
		
		
		while(iterator.hasPrevious()) {
			
			System.out.printf("%-4s%s", " ", iterator.previous());
		
		}
	
	}
	
	//method to iterate through the list and write the elements to the file
	private static void printToFileUsingIterator(List<Employee> list) {
		openFile();
		ListIterator<Employee> iterator = list.listIterator(list.size());
		
		int count =0;
		output.format("%-4s%-20s%-20s%-20s%n", " " , "Group ID", "ID", "Last Name");
		output.format("%s%n","------------------------------------------------------------");
		while(iterator.hasPrevious()) {
			
			addRecordsToFile(iterator.previous());	
			count++;
		}
		
		System.out.println();
		System.out.printf("%-4s%d %s%n"," ", count, " Records written to file reversedCollection.txt.");
		System.out.printf("%-4s%s"," ","Good-Bye");
		closeFile();
	}
	
	
	//open file reversedCollection.txt
		public static void openFile() {
			try {
				output = new Formatter("reversedCollection.txt"); //open the file
				
			} catch (SecurityException securityException) {
				System.out.println("Write permission denied. Terminating.");
				System.exit(1); //terminate the program
			}
			catch (FileNotFoundException fileNotFoundException) {
				System.out.println("Error opening file. Terminating.");
				System.exit(1); //terminate the program
				
			}
			
		}
		
		//add records to reversedCollection.txt
		
		public static void addRecordsToFile(Employee employee)
		{
			
				try {
				
					output.format("%-4s%-20s%-20s%-20s%n", " ",employee.getGroupID(), employee.getID(), employee.getLastName());
					
				} catch (FormatterClosedException formatterClosedException) {
					System.err.println("Error writing to file. Terminating.");
				}
				catch (NoSuchElementException elementException) {
					System.err.println("Invalid input. Please try again.");
					
				}
				
		}//end method addRecords
		
		//close reversedCollection.txt
		public static void closeFile() {
			if (output != null)
				output.close();
		}	

}
