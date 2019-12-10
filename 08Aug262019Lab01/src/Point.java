//I Shobaki
//Class Point

public class Point {
	//Instant Variables
	private int xCoordinate;
	private int yCoordinate;
	
	//Default constructor
	public Point() {
		this(0,0);
	}
	//Constructor with two arg
	public Point(int xCoordinate, int yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	
	//Set x coordinate method
	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	//Get x coordinate method
	public int getxCoordinate() {
		return xCoordinate;
	}
	
	//Set y coordinate method
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	//Get y coordinate method
	public int getyCoordinate() {
		return yCoordinate;
	}
	//Return the values for x and y as labeled strings 
	public String toString() {
		return "x = " + xCoordinate + "   y = " + yCoordinate;
	}
	
}// End class Point
