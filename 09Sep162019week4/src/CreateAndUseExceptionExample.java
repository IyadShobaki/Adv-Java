import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateAndUseExceptionExample {

	public static void main(String[] args) {
		
		Scanner readerScanner = new Scanner(System.in);
		int myNumberGreaterThan10 = 0;
		do {
			try {
				System.out.println("\nPlease enter an integer greater than 10.\n");
				myNumberGreaterThan10 = readerScanner.nextInt();
				integerGreaterThan10(" Your Number: ", myNumberGreaterThan10);
				break;
			}
			catch(IntegerNotGreaterThan10Exception myException) {
				System.out.println("\n**** You must enter an integer that is greater than 10 \n" +
						"******** " + myException + "\n");
			}
			catch (InputMismatchException myException) {
				System.out.println("\n**** You must enter integres only. Inavalid Number Format \n" +
						"******** " + myException + "\n");
				readerScanner.nextLine();
			}
		}while(true);
		
		System.out.println("\nYour input of " + myNumberGreaterThan10 + " has been accepted.\n");
		System.out.println("Thank you for using this software");
		
		readerScanner.close();
	}
	
	public static void integerGreaterThan10(String myFieldString, int myNumber)
	throws IntegerNotGreaterThan10Exception{
		if (myNumber <= 10) {
			myFieldString = myFieldString + " " + myNumber;
			throw new IntegerNotGreaterThan10Exception(myFieldString);
			//throw new IntegerNotGreaterThan10Exception();
		}
	}
}
