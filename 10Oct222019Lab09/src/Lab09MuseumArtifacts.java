//I Shobaki
//Lab09 Museum Artifacts Text Files
//Oct 23, 2019


import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;





public class Lab09MuseumArtifacts {
	
	private static Scanner input;
	
	private static Formatter outputError;
	
	private static Formatter outputMaster;
	
	public static void main(String[] args) {
		System.out.println("Iyad Shobaki");
		System.out.println("Lab09 Museum Artifacts Text Files");
		System.out.println("Oct 23, 2019");
		System.out.println();
		
		openFile();
		readRecords();
		closeFile();
	}//end of main
	
	
	//open file - ArtifactData.txt
		public static void openFile() {
			try {
				input = new Scanner(Paths.get("ArtifactData.txt")); //open the file
			
			} catch (IOException ioException) {
				System.out.println("Error opening file. Terminating.");
				System.exit(1); //terminate the program
			}
		
		}
		
		//read records from file ArtifactData.txt
		
		public static void readRecords()
		{	
			
			int countError = 0;
			int countMaster =0;
			openErrorFile();
			openMasterFile();
		try {
			
			while(input.hasNext())	{ // while there is more to read
				
				//Create Artifact objects (records)
				Artifact record = new Artifact(input.next(),
											   input.nextInt(),
											   input.nextInt(),
											   input.nextInt(),
											   input.nextDouble());
				
				// if the record has error add it to Errors file
				
				if(record.getErrors()) {
		
					addRecordsToErrorFile(record);
					System.out.printf("%n%s%n%n%s%n",record.toString(),"The previous record error/s:");
					record.printErrors();
					countError++;
				} 
				//if the record is good add it to Master file
				else if(!record.getErrors()) {
					
					addRecordsToMasterFile(record);
					System.out.printf("%n%s%n%n%s%n",record.toString(),"The previous record has no error/s.");
					countMaster++;
				}
				
 				
			}
			
			
			//print the total of records
			
			System.out.println();
			System.out.printf("Number of good records: %d%n", countMaster );
			System.out.printf("Number of records had errors: %d", countError );
			
			
		} catch (NoSuchElementException elementException) {
			System.err.println("File improperly formed. Terminating.");
		}
		catch (IllegalStateException stateException) {
			System.err.println("Error reading from file. Terminating.");
		}
		
		closeErrorFile();
		closeMasterFile();
	}//end method readRecords
		
		
		
		//close file -  ArtifactData.txt
		public static void closeFile() {
			if (input != null)
				input.close();
		}
		
		
		//open Error file - ArtifactError.txt
		public static void openErrorFile() {
			try {
				outputError = new Formatter("ArtifactError.txt"); //open the file
				
			} catch (SecurityException securityException) {
				System.out.println("Write permission denied. Terminating.");
				System.exit(1); //terminate the program
			}
			catch (FileNotFoundException fileNotFoundException) {
				System.out.println("Error opening file. Terminating.");
				System.exit(1); //terminate the program
				
			}
		}
		
		//add records to Error file - ArtifactError.txt
		public static void addRecordsToErrorFile(Artifact record)
		{
				try {
					//output new record to file; assumes valid input
					outputError.format("%s%s %s%d %s%d %s%d %s%.2f%n%s%n%s%n", "Name: ",record.getName(),
																			   "\nArtifact ID: ",record.getArtifactID(),
																			   "\nArtifact Year: ",record.getArtifactYear(), 
																			   "\nAcquired Year: ", record.getAcquiredYear(),
																			   "\nValue: " ,record.getValue(),
																			   "\nThe previous record error/s:",record.getErr());

					
				} catch (FormatterClosedException formatterClosedException) {
					System.err.println("Error writing to file. Terminating.");
				}
				catch (NoSuchElementException elementException) {
					System.err.println("Invalid input. Please try again.");
					
				}
				
		}//end method addRecords
		
		//close Eror file - ArtifactError.txt
		
		public static void closeErrorFile() {
			if (outputError != null)
				outputError.close();
		}
		
		//open MAster file - ArtifactMaster.txt
		public static void openMasterFile() {
			try {
				outputMaster = new Formatter("ArtifactMaster.txt"); //open the file
				
			} catch (SecurityException securityException) {
				System.out.println("Write permission denied. Terminating.");
				System.exit(1); //terminate the program
			}
			catch (FileNotFoundException fileNotFoundException) {
				System.out.println("Error opening file. Terminating.");
				System.exit(1); //terminate the program
				
			}
		}
		
		//add records to Master file - ArtifactMaster.txt
		
		public static void addRecordsToMasterFile(Artifact record)
		{
				try {
					//output new record to file; assumes valid input
					outputMaster.format("%s%s %s%d %s%d %s%d %s%.2f%n%n", "Name: ",record.getName(),
																		  "\nArtifact ID: ",record.getArtifactID(), 
																		  "\nArtifact Year: ",record.getArtifactYear(),
																		  "\nAcquired Year: ", record.getAcquiredYear(),
																		  "\nValue: " ,record.getValue());
					
				} catch (FormatterClosedException formatterClosedException) {
					System.err.println("Error writing to file. Terminating.");
				}
				catch (NoSuchElementException elementException) {
					System.err.println("Invalid input. Please try again.");
					
				}
				
		}//end method addRecords
		
		//close Master file - ArtifactMaster.txt
		public static void closeMasterFile() {
			if (outputMaster != null)
				outputMaster.close();
		}
}//end of Lab09MuseumArtifacts
