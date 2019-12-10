//I Shobaki
// Definition of class LessThanZeroException
//Used to throw an exception when a user
//inputs an integer less than 0


public class LessThanZeroException extends RuntimeException{
	//no-argument constructor specifies default message
	public LessThanZeroException() {
		super(" must be an integer greater than 0");
	}
	//constructor to allow customized error message
	public LessThanZeroException(String message) {
		super(message);
	}
}//end class LessThanZeroException
