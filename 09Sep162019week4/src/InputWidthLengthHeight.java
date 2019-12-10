//I Shobaki
//Lab04 Try, Catch, Define and Use Exception
//Sep 22, 2019

import java.util.InputMismatchException;
import java.util.Scanner;

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
		do {
			try {
				System.out.println("\nPlease enter a width.\n");
				width = reader.nextInt();
				lessThanZeroException(" Width", width);
				break;
			}
			catch(LessThanZeroException myException) {
				System.out.println("\n**** You must enter an integer that is greater than 0 \n" +
						"******** " + myException + "\n");
			}
			catch (InputMismatchException myException) {
				System.out.println("\n**** You must enter integres only. Inavalid Number Format \n" +
						"******** " + myException + "\n");
				reader.nextLine();
			}
		}while(true);
		
		do {
			try {
				System.out.println("\nPlease enter a length.\n");
				length = reader.nextInt();
				lessThanZeroException("Length", length);
				break;
			}
			catch(LessThanZeroException myException) {
				System.out.println("\n**** You must enter an integer that is greater than 0 \n" +
						"******** " + myException + "\n");
			}
			catch (InputMismatchException myException) {
				System.out.println("\n**** You must enter integres only. Inavalid Number Format \n" +
						"******** " + myException + "\n");
				reader.nextLine();
			}
		}while(true);
		
		do {
			try {
				System.out.println("\nPlease enter a height.\n");
				height = reader.nextInt();
				lessThanOrEqualToZeroException("Height", height);
				break;
			}
			catch(LessThanOrEqualToZeroException myException) {
				System.out.println("\n**** You must enter an integer that is greater than or equal to 0 \n" +
						"******** " + myException + "\n");
			}
			catch (InputMismatchException myException) {
				System.out.println("\n**** You must enter integres only. Inavalid Number Format \n" +
						"******** " + myException + "\n");
				reader.nextLine();
			}
		}while(true);
		
		
		ratio = (double) width / length ;
		
		System.out.println("****** All values have been accepted. ******\n");
		System.out.printf("The width to length ratio is %.3f\n", ratio );
		
		reader.close();
	}
	
	public static void lessThanZeroException(String myFieldString, int myNumber)
	throws LessThanZeroException{
		if (myNumber <= 0) {
			myFieldString = myFieldString + " " + myNumber;
			throw new LessThanZeroException(myFieldString);
			
		}
	}
	public static void lessThanOrEqualToZeroException(String myFieldString, int myNumber)
	throws LessThanOrEqualToZeroException{
		if (myNumber < 0) {
			myFieldString = myFieldString + " " + myNumber;
			throw new LessThanOrEqualToZeroException(myFieldString);
			
		}
	}
}
