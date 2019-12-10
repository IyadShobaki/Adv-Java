
@SuppressWarnings("serial")
public class IntegerNotGreaterThan10Exception extends RuntimeException{
	public IntegerNotGreaterThan10Exception() {
		super("Input must be an integer greater than 10");
	}
	public IntegerNotGreaterThan10Exception(String messageString) {
		super("\n***** " + messageString + " was not greater than 10");
	}
}
