//I Shobaki
//Limo class

public class Limo extends Car{
	private int length;
	
	//Constructors
	
	public Limo() {
		super();
		length = 210;
	}
	public Limo(String newManufacturer, int newNumberOfDoors, int newLength) {
		super(newManufacturer, newNumberOfDoors);
		setLength(newLength);
	}
	public Limo(int newLength) {
		super();
		setLength(newLength);
	}
	
	//Set Methods
	public void setLength(int newLength) {
		if(newLength < 210 || newLength > 400)
			length = 210;
		else 
			length = newLength;
		
	}
	//get methods
	public int getLength() {
		return length;
	}
	//other methods
	public String toString() {
		return super.toString() + " .\n The Limo's lenght is " + length + " inches.";
	}
}//end class
