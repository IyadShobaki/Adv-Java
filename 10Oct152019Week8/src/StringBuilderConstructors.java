
public class StringBuilderConstructors {

	public static void main(String[] args) {
		
		StringBuilder buffer1 = new StringBuilder();
		StringBuilder buffer2 = new StringBuilder(10);
		StringBuilder buffer3 = new StringBuilder("hello");
		
		System.out.printf("buffer1 = \"%s\"%n", buffer1);
		System.out.printf("buffer2 = \"%s\"%n", buffer2);
		System.out.printf("buffer3 = \"%s\"%n", buffer3);

		
		//CapLen methods
		
		StringBuilder buffer = new StringBuilder("Hello, how are you?");
		
		System.out.printf("buffer = %s%nlength = %d%ncapacity = %d%n%n", buffer.toString(), buffer.length(), buffer.capacity());
		
		buffer.ensureCapacity(75);
		System.out.printf("New capacity = %d%n%n", buffer.capacity());
		
		buffer.setLength(10);
		System.out.printf("New length = %d%nbuffer = %s%n", buffer.length(), buffer.toString());
		
		
		// StringBuilder chars
		StringBuilder buffer4 = new StringBuilder("hello there");
		
		System.out.printf("buffer4 = %s%n", buffer4.toString());
		System.out.printf("Character at 0: %s%nCharacter at 4: %s%n%n", buffer4.charAt(0), buffer4.charAt(4));
		
		char[] charArray = new char[buffer4.length()];
		buffer4.getChars(0, buffer4.length(), charArray, 0);
		System.out.print("The characters are: ");
		
		for(char character : charArray )
			System.out.print(character);
		
		buffer4.setCharAt(0, 'H');
		buffer4.setCharAt(6, 'T');
		System.out.printf("%n%nbuffer4 = %s", buffer4.toString());
		
		buffer4.reverse();
		System.out.printf("%n%nbuffer4 = %s%n", buffer4.toString());
		
		
		//StringBuilder Append method
		
		String string = "goodbye";
		char[] charArray1 = {'a','b','c','d','e','f'};
		boolean booleanValue = true;
		char characterValue = 'Z';
		int integerValue = 7;
		long longValue = 10000000000L; //L suffix indicates long
		float floatValue = 2.5f; //f indicates that 2.5 is a float
		double doubleValue = 33.333; // no suffix, double is default
		Object objectValue = "hello"; // assign string to an Object reference
		
		StringBuilder lastBuffer = new StringBuilder("last buffer");
		StringBuilder buffer5 = new StringBuilder();
		
		buffer5.append(objectValue)
		.append(System.getProperty("line.separator")).append(string).append("\n") //%n does not work
		.append(charArray1).append("\n").append(charArray1,0,3)
		.append("\n").append(booleanValue).append("\n")
		.append(characterValue).append("\n").append(integerValue)
		.append("\n").append(longValue).append("\n")
		.append(floatValue).append("\n").append(doubleValue)
		.append("\n").append(lastBuffer);
		
	
		System.out.printf("buffer5 contain%n%s%n", buffer5.toString());
		
		//StringBuilder insert, delete and deleteCharAt
		StringBuilder buffer6 = new StringBuilder();
		buffer6.insert(0,objectValue)
		.insert(0," ").insert(0,string).insert(0," ") 
		.insert(0,charArray1).insert(0," ").insert(0,charArray1,0,3)
		.insert(0," ").insert(0,booleanValue).insert(0," ")
		.insert(0,characterValue).insert(0," ").insert(0,integerValue)
		.insert(0," ").insert(0,longValue).insert(0," ")
		.insert(0,floatValue).insert(0," ").insert(0,doubleValue);
		
		System.out.printf("buffer6 after inserts:%n%s%n%n", buffer6.toString());
		
		buffer6.deleteCharAt(10); 
		buffer6.delete(2, 6);
		System.out.printf("buffer6 after deletes:%n%s%n%n", buffer6.toString());
		
	}

}
