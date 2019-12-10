import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class CreateTextFileClass {
	
	private Formatter output; //object used tou output text to file
	
	//enable user to open file
	public void openFile() {
		//System.out.println("In openFile");
		try {
			output = new Formatter("studentInfoOutput.txt"); //open the file
			//System.out.println("File Has Been Opened");
		} catch (FileNotFoundException	fileNotFoundException) {
			System.err.println("Error opening or creating file.");
			System.exit(1); //terminate the program
			
		}catch (SecurityException securityException) {
			System.err.println("You do not have write access to this file.");
			System.exit(2);//terminate the program
			
		}
	}//end openFile
	
	//Add records  to file
	public void addRecords() {
		//System.out.println("In addRecords");
		Scanner myScan = new Scanner(System.in);
		Student[] record = new Student[100];
		
		record[0] = new Student();
		System.out.println("Please enter ID");
		record[0].setIdNumber(myScan.nextInt());
		
		myScan.nextLine(); //clears input of eol character
		
		System.out.println("Please enter name");
		record[0].setName(myScan.next());
		
		System.out.println("Please enter age");
		record[0].setAge(myScan.nextInt());
		
		System.out.println("Please enter Debt");
		record[0].setDebt(myScan.nextDouble());
		
		System.out.println(record[0].toString());
		output.format("%d %s %d %.2f %n", record[0].getIdNumber()
				, record[0].getName(), record[0].getAge(), record[0].getDebt());
		
	}// end addRecords
	
	//close file
	public void closeFile() {
		//System.out.println("In closeFile");
		if(output != null)
			output.close();
	}
	
}
