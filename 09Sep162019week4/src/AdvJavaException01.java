import java.util.Scanner;
public class AdvJavaException01 {

	public static void main(String[] args) {
			
		
		Scanner myScanner = new Scanner(System.in);
		
		String[] vowelsStrings = {"a","e","i","o","u"};
		System.out.println("Please enter an integer < 5");
		int nbr01 = myScanner.nextInt();
		System.out.println("Your vowel is " + vowelsStrings[nbr01]);
		
		myScanner.close();
	}

}
