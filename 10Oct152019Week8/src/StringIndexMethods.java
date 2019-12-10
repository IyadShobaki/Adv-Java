
public class StringIndexMethods {

	public static void main(String[] args) {
		
		String letters = "abcdefghijklmabcdefghijklm";
		
		//test indexOf to locate a character in a string
		System.out.printf("'c' is located at index %d%n", letters.indexOf('c'));
		
		System.out.printf("'a' is located at index %d%n", letters.indexOf('a',1));
		
		System.out.printf("'$' is located at index %d%n%n", letters.indexOf('$'));
		
		//test lastIndexOf to find a character in a string
		System.out.printf("Last 'c' is located at index %d%n", letters.lastIndexOf('c'));
		
		System.out.printf("Last 'a' is located at index %d%n", letters.lastIndexOf('a',25));
		
		System.out.printf("Last '$' is located at index %d%n%n", letters.lastIndexOf('$'));
		
		//test indexOf to locate a substring in a string
		System.out.printf("\"def\" is located at index %d%n", letters.indexOf("def"));
				
		System.out.printf("\"def\" is located at index %d%n", letters.indexOf("def",7));
				
		System.out.printf("\"hello\" is located at index %d%n%n", letters.indexOf("hello"));
		
		//test lastIndexOf to find a substring in a string
		System.out.printf("Last \"def\" is located at index %d%n", letters.lastIndexOf("def"));
		
		System.out.printf("Last \"def\" is located at index %d%n", letters.lastIndexOf("def",25));
				
		System.out.printf("Last \"hello\" is located at index %d%n%n", letters.lastIndexOf("hello"));
		
		
		//test substring methods
		System.out.printf("Substring frim index 20 to end is \"%s\"%n", letters.substring(20));
		
		System.out.printf("Substring from index 3 up to, but not including 6 is", letters.substring(3, 6));
		
		//String concatenation
		
		String s1 = "Happy ";
		String s2 = "Birthday";
		
		System.out.printf("s1 = %s%ns2 = %s%n%n", s1,s2);
		System.out.printf("Result of s1.concat(s2) = %s%n", s1.concat(s2));
		System.out.printf("s1 after concatenation = %s%n", s1);
		
		String s3 = "hello";
		String s4 = "GOODBYE";
		String s5 = "    spaces    ";
		
		System.out.printf("s3 = %s%ns4 = %s%ns5 = %s%n%n", s3,s4,s5);
		
		//test method replace
		System.out.printf("Replace 'l' with 'L' in s3: %s%n%n", s3.replace('l', 'L'));
		
		//test toLowerCase and toUpperCase
		System.out.printf("s3.toUpperCase() = %s%n", s3.toUpperCase());
		System.out.printf("s4.toLowerCase() = %s%n%n", s4.toLowerCase());
		
		//test trim method
		System.out.printf("s5 after trim = \"%s\"%n%n", s5.trim());
		
		//test toCharArray method
		char[] charArray = s3.toCharArray();
		System.out.print("s3 as a character array = ");
		for (char character : charArray)
			System.out.print(character);
		
		
		System.out.println();
		
		//String valueOf method
		
		char[] charArray1 = {'a','b','c','d','e','f'};
		boolean booleanValue = true;
		char characterValue = 'Z';
		int integerValue = 7;
		long longValue = 10000000000L; //L suffix indicates long
		float floatValue = 2.5f; //f indicates that 2.5 is a float
		double doubleValue = 33.333; // no suffix, double is default
		Object objectValue = "hello"; // assign string to an Object reference
		
		
		System.out.printf("char array = %s%n", String.valueOf(charArray1));
		
		System.out.printf("part of char array = %s%n", String.valueOf(charArray1,3,3));
		
		System.out.printf("boolean = %s%n", String.valueOf(booleanValue));
		System.out.printf("char = %s%n", String.valueOf(characterValue));
		System.out.printf("int = %s%n", String.valueOf(integerValue));
		System.out.printf("long = %s%n", String.valueOf(longValue));
		System.out.printf("float = %s%n", String.valueOf(floatValue));
		System.out.printf("double = %s%n", String.valueOf(doubleValue));
		System.out.printf("Object = %s%n", String.valueOf(objectValue));
		
		
		
		
		
	}

}
