//I Shobaki
//Definition of class LessThanOrEqualToZeroException
//Used to throw an exception when a
//user inputs an integer less than or equal to 0

public class LessThanOrEqualToZeroException extends RuntimeException {

	//no-argument constructor specifies default error message
	public LessThanOrEqualToZeroException() {
		super("Input must be a positive integer");
	}
	
	//constructor to allow customized error message
	public LessThanOrEqualToZeroException(String message) {
		super(message);
	}
}
