import java.util.Scanner;

public class AdvJavaException02 {

	public static void main(String[] args) {
		
		
		Scanner myScanner = new Scanner(System.in);
		try {
			String[] vowelsStrings = {"a","e","i","o","u"};
			System.out.println("Please enter an integer < 5");
			int nbr01 = myScanner.nextInt();
			System.out.println("Your vowel is " + vowelsStrings[nbr01]);
		}
		
		catch(Exception ex){
			System.out.println("You did not enter an integer " + ex);
		}
		finally {
			myScanner.close();
		}
	}
}

