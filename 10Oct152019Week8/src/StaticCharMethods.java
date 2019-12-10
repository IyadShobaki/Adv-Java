import java.util.Scanner;

public class StaticCharMethods {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character and press Enter");
		String inputString = scanner.next();
		char c = inputString.charAt(0); //get input character 
		
		//display character info
		
		System.out.printf("is defined: %b%n", Character.isDefined(c));
		System.out.printf("is digit: %b%n", Character.isDigit(c));
		System.out.printf("is first character in a java identifier: %b%n", Character.isJavaIdentifierStart(c));
		System.out.printf("is part of a Java identifier: %b%n", Character.isJavaIdentifierPart(c));
		System.out.printf("is letter: %b%n", Character.isLetter(c));
		System.out.printf("is letter or digit: %b%n", Character.isLetterOrDigit(c));
		System.out.printf("is lower case: %b%n", Character.isLowerCase(c));
		System.out.printf("is upper case: %b%n", Character.isUpperCase(c));
		System.out.printf("to upper case: %s%n", Character.toUpperCase(c));
		System.out.printf("to lower case: %s%n", Character.toLowerCase(c));
		
		// Static Method 2
		//get radix (The base of a number is also known as its radix.)
		//The radix (second argument) must be between 2 and 36, inclusive.
		//Common number systems: decimal (base 10), octal (base 8),
		//hexadecimal (base 16) and binary (base 2). 

		System.out.println("Please enter a radix:");
		int radix = scanner.nextInt();
		
		//get user choice 
		System.out.printf("Please choose one:%n1 -- %s%n2 -- %s%n",
				"Convert digit to character", "Convert character to digit");
		int choice = scanner.nextInt();
		
		switch (choice) {
		case 1: //convert digit to character
			System.out.println("Enter a digit:");
			int digit = scanner.nextInt();
			System.out.printf("Convert digit to character: %s%n",
					Character.forDigit(digit, radix));
			break;
		case 2: //convert character to digit
			System.out.println("Enter a character:");
			char character = scanner.next().charAt(0);
			System.out.printf("Convert character to digit: %s%n",
					Character.digit(character, radix));
			break;
			
		}
		
		Character c1 = 'A';
		Character c2 = 'a';
		
		System.out.printf("c1 = %s%nc2 = %s%n%n", c1.charValue(), c2.toString());
		
		if(c1.equals(c2))
			System.out.println("c1 and c2 are equal\n");
		else {
			System.out.println("c1 and c2 are not equal\n");
		}
	}

}
