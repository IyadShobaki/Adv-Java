import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class CreateTextFileClassMultipleStudentsEdit {
	
	private Formatter output; //object used to output text to file
	
	//enable user to open file
	public void openFile() {
		//System.out.println("In openFile");
		try {
			output = new Formatter("studentInfoOutputDebt.txt"); //open the file
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
		
		//the following is the data that will populate our file
		//all arrays must have the same length
		//Note: In practice most data is not hard-coded into a program  but would be read from a file,
		//      database, or user-interaction, however, it is not unheard of to have data in a program
		
		int[] IDArray = {0, 50, 63, 25, 18, 65, 62, 56, 19};
		String[] nameArray = {"", "Abe", "Bruce","Catton", "Doubleday","Ernest","Ford","George",""};
		int[] ageArray = {0, 19, 13,51,19,24,33,20,33};
		double[] debtArray = {0,1100.10, 2100.00, -1300.30, 4100.00, 5100.50,1600.00,1700.70,18.01};
		
		Student[] record = new Student[IDArray.length];
		
		for(int index =0; index < IDArray.length; index++) {
			record[index] = new Student();
			//set data to be output
			record[index].setIdNumber(IDArray[index]);
			record[index].setName(nameArray[index]);
			record[index].setAge(ageArray[index]);
			record[index].setDebt(debtArray[index]);
			
			//write new record
			if(record[index].getIdNumber() > 0)
				if(record[index].getName().length() > 0)
					if(record[index].getDebt() > 0)
						output.format("%d %s %d %.2f %n", record[index].getIdNumber(),
														  record[index].getName(),
														  record[index].getAge(),
														  record[index].getDebt());
					else {
						System.out.println(" *** ERROR DEBT <= 0");
					}
				else {
					System.out.println(" *** ERROR NAME Cannot be blank");
				}
			else {
				System.out.println(" *** ERROR ID <= 0");
			}//end outer most if
			
			System.out.println(record[index].toString());
  		}//end for loop
	
		
	}// end addRecords
	
	//close file
	public void closeFile() {
		//System.out.println("In closeFile");
		if(output != null)
			output.close();
	}
	
}
