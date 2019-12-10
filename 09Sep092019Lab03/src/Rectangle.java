

//I Shobaki
//Rectangle class

public class Rectangle extends PointABS{
	//Instant Variables
	private  int width;
	private int length;

	
	//Default constructor
	public Rectangle() {
		super();
		width = 15;
		length = 15;
	}
	
	//Constructor with 2 arg
	public Rectangle( int newWidth, int newLength) {
		super();
		setWidth(newWidth);
		setLength(newLength);
	}
	
	
	// set methods
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public void setLength(int newLength) {
		length = newLength;
	}
	//get methods
	public int getWidth() {
		return width;
	}
	public int getLength() {
		return length;
	}
	// Calculate area method 
	//change the name to match PiontABS method
	//public int area() {
	public double calcArea() {
		return width * length;
	}
	//other methods
	public String toString() {
			return  " width = " + width +
					" length = " + length + 
					" at " + super.toString() ;
		}
	
}//end class
