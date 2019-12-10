import java.util.InputMismatchException;
import java.util.Scanner;

public class AdvJavaException03 {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		try {
			String[] vowelsStrings = {"a","e","i","o","u"};
			System.out.println("Please enter an integer < 5");
			int nbr01 = myScanner.nextInt();
			System.out.println("Your vowel is " + vowelsStrings[nbr01]);
		}
		
		catch(InputMismatchException ex){
			System.out.println("You did not enter an integer \n" + ex);
			
		}
		catch(IndexOutOfBoundsException ex) {
			System.out.println("Your integer was too big \n" + ex);
		}
		finally {
			myScanner.close();
		}
	}
}

