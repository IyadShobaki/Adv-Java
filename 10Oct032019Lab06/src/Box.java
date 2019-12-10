//I Shobaki
//Box class

public class Box extends Rectangle{
	private int height;
	

	//Default constructor
	public Box() {
		super();
		height = 15;
	}
	public Box(int newWidth, int newLength, int newHeight) {
		super(newWidth,newLength);
		height = newHeight;
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
	public DrawFigure drawFigure() {
		DrawFigure demo = new DrawFigure(2,getWidth(),getLength(),height); // args: type, width, length, height
		
		return demo;
	}
	//other methods
	public String toString() {
			return  " height = " + height + " " +  super.toString();
				
	}
	
}//end class
