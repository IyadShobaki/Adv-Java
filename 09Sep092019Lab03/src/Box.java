//I Shobaki
//Box class

public class Box extends Rectangle{
	private int height;
	

	//Default constructor
	public Box() {
		super();
		height = 15;
	}
	
	//Constructor with 1 arg
	public Box(int newHeight) {
		super();
		setHeight(newHeight);
	
	}
	
	
	// set methods
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	
	//get methods
	public int getHeight() {
		return height;
	}
	
	// Calculate area method
	// change the name to match PiontABS method
	//public int area() {
	public double calcArea() {
		return getWidth() * getLength() * 2 + getWidth() * height * 2 + getLength() * height * 2;
	}
	// Calculate volume method
	public int volume() {
		return getWidth() * getLength() * height;
	}
	//other methods
	public String toString() {
			return  " height = " + height + " " +  super.toString();
				
		}
}//end class
