//I Shobaki
// Definition of class LessThanOrEqualToZeroException
//Used to throw an exception when a user
//inputs an integer less than or equal to 0


@SuppressWarnings("serial")
public class LessThanOrEqualToZeroException extends RuntimeException{
	//no-argument constructor specifies default message
	public LessThanOrEqualToZeroException() {
		super(" must be an integer greater than zero");
	}
	//constructor to allow customized error message
	public LessThanOrEqualToZeroException(String messageString) {
		super("\n***** " + messageString + " was not greater than zero");
	}
}//end class LessThanOrEqualToZeroException
