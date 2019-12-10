//I Shobaki
//Lab04 Try, Catch, Define and Use Exception
//Sep 22, 2019

import java.util.Scanner;
import java.util.InputMismatchException; //used if non-numeric or non integer data is input


public class InputWidthLengthHeight {

	public static void main(String[] args) {
		System.out.println("Iyad Shobaki");
		System.out.println("Lab04 Try, Catch, Define and Use Exception");
		System.out.println("Sep 22,2019");
		System.out.println();
		
		
		
		Scanner reader = new Scanner(System.in);
		
		int width;
		int length;
		int height;
		double ratio;
		do { //loop until an integer greater than zero is entered
			try {
				System.out.println("\nPlease enter a width.\n");
				width = reader.nextInt();
				lessThanOrEqualToZeroException(" Width", width);   //method to check input
				break;
			}//end try
			//process improperly formated input
			catch(LessThanOrEqualToZeroException myException) {
				System.out.println("\n**** You must enter an integer that is greater than 0 \n" +
						"******** " + myException + "\n");
			}
			//process if non-numeric or non integer data is entered
			catch (InputMismatchException myException) {
				System.out.println("\n**** You must enter integres only. Inavalid Number Format \n" +
						"******** " + myException + "\n");
				reader.nextLine(); // clears input for next int attempt
			}
		}while(true);  //end of while loop when the input meet the criteria
		
		do {//loop until an integer greater than zero is entered
			try {
				System.out.println("\nPlease enter a length.\n");
				length = reader.nextInt();
				lessThanOrEqualToZeroException("Length", length);   //method to check input
				break;
			}//end try
			//process improperly formated input
			catch(LessThanOrEqualToZeroException myException) {
				System.out.println("\n**** You must enter an integer that is greater than 0 \n" +
						"******** " + myException + "\n");
			}
			//process if non-numeric or non integer data is entered
			catch (InputMismatchException myException) {
				System.out.println("\n**** You must enter integres only. Inavalid Number Format \n" +
						"******** " + myException + "\n");
				reader.nextLine(); // clears the input stream
			}
		}while(true);  //end of while loop when the input meet the criteria
		
		do {//loop until an integer greater than or equal to zero is entered
			try {
				System.out.println("\nPlease enter a height.\n");
				height = reader.nextInt();
				lessThanZeroException("Height", height);     //method to check input
				break;
			}//end try
			//process improperly formated input
			catch(LessThanZeroException myException) {
				System.out.println("\n**** You must enter an integer that is greater than or equal to 0 \n" +
						"******** " + myException + "\n");
			}
			//process if non-numeric or non integer data is entered
			catch (InputMismatchException myException) {
				System.out.println("\n**** You must enter integres only. Inavalid Number Format \n" +
						"******** " + myException + "\n");
				reader.nextLine();// clears the input stream
			}
		}while(true);    //end of while loop when the input meet the criteria
		
		
		ratio = (double) width / length ;
		
		System.out.println("****** All values have been accepted. ******\n");
		System.out.printf("The width to length ratio is %.3f\n", ratio );
		
		reader.close();
	} // end main method
	
	//method to test input
	//if input greater than 0 then
	//an exception will be thrown
	
	public static void lessThanZeroException(String myFieldString, int myNumber)
	throws LessThanZeroException{
		if (myNumber < 0) {
			myFieldString = myFieldString + " " + myNumber;
			throw new LessThanZeroException(myFieldString);
			
		}
	}
	//method to test input
	//if input greater than or equal to 0 then
	//an exception will be thrown
	
	public static void lessThanOrEqualToZeroException(String myFieldString, int myNumber)
	throws LessThanOrEqualToZeroException{
		if (myNumber <= 0) {
			myFieldString = myFieldString + " " + myNumber;
			throw new LessThanOrEqualToZeroException(myFieldString);
			
		}
	}
}// end class InputWidthLengthHeight
