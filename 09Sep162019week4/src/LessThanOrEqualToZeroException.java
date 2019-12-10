
@SuppressWarnings("serial")
public class LessThanOrEqualToZeroException extends RuntimeException{
	public LessThanOrEqualToZeroException() {
		super(" must be an integer greater than or equal to zero");
	}
	public LessThanOrEqualToZeroException(String messageString) {
		super("\n***** " + messageString + " was not greater or equal to zero");
	}
}
