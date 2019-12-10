//This program reads a text file 
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
	
	private static Scanner input;
	
	public static void main(String[] args) {

		openFile();
		readRecords();
		closeFile();

	}
	//open file clients.txt
		public static void openFile() {
			try {
				input = new Scanner(Paths.get("clients.txt")); //open the file
				
			} catch (IOException ioException) {
				System.out.println("Error opening file. Terminating.");
				System.exit(1); //terminate the program
			}
		
		}
		
		//read records to file
		public static void readRecords()
		{
			System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");
			
		try {
			while (input.hasNext()) { // while there is more to read
				//display record contents
				System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
						input.next(), input.next(), input.nextDouble());
				
			}
			
		} catch (NoSuchElementException elementException) {
			System.err.println("File improperly formed. Terminating.");
		}
		catch (IllegalStateException stateException) {
			System.err.println("Error reading from file. Terminating.");
		}
		}//end method readRecords
		
		//close file
		public static void closeFile() {
			if (input != null)
				input.close();
		}
}
