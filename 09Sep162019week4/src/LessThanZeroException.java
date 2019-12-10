
@SuppressWarnings("serial")
public class LessThanZeroException extends RuntimeException{
	public LessThanZeroException() {
		super(" must be an integer greater than zero");
	}
	public LessThanZeroException(String messageString) {
		super("\n***** " + messageString + " was not greater than zero");
	}
}
