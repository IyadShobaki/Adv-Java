import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

	public static int qoutient(int numerator, int denominator)
	throws ArithmeticException
	{
		return numerator / denominator;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true;
		
		do {
			try {
				System.out.print("Please enter an integer numerator: ");
				int numerator = scanner.nextInt();
				System.out.print("Please enter an integer denominator: ");
				int denominator = scanner.nextInt();
				
				int result = qoutient(numerator, denominator);
				System.out.printf("%nResult: %d / %d = %d%n", numerator,denominator, result);
				continueLoop = false;
			}
			catch(InputMismatchException inputMismatchException)
			{
				System.err.printf("%nException: %s%n", inputMismatchException);
				scanner.nextLine();
				System.out.printf("You must enter integers. Please tyr again. %n%n");
			}
			catch (ArithmeticException arithmeticException)
			{
				System.err.printf("%nException: %s%n", arithmeticException);
				System.out.printf("Zero is an invalid denominator. Please try again. %n%n");
			}
		}while(continueLoop);
		
		scanner.close();
	}

}
