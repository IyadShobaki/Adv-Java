//I Shobaki
//Rectangle class
public class Rectangle extends PointABS{
	
	private int width; //instance variable to store
	private int length; //instance variable to store
	
	//constructor
	public Rectangle() {
		super(); //call to parent constructor
		width = 15;//default constructor width =15
		length = 15;//default constructor length =15
	}
	public Rectangle(int newWidth, int newLength) {
		super();
		width = newWidth;
		length = newLength;
	}
	public Rectangle(int newX, int newY, int newWidth, int newLength) {
		super();
		width =newWidth;
		length = newLength;
	}
	//set methods
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
	//other methods
	public double calcArea() {
		return width * length;
	}
	public DrawFigure drawFigure() {
		DrawFigure demo = new DrawFigure(1,width,length,0); // args: type, width, length, height
		
		return demo;
	}
	public String toString() {
		return "width = " + width + " length = " + length + " at location "+ super.toString();
	}
}
