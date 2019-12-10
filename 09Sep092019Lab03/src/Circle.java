//I Shobaki
//Circle class extends Point class
public class Circle extends PointABS{
	// instant variables
	private int radius;
	
	//Default constructor
	public Circle() {
		super();
		radius =15;
	}
	//Constructor with 1 arg
	public Circle(int radius) {
		super();
		setRadius(radius);
	}
	//get method
	public int getRadius() {
		return radius;
	}
	// set method
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double calcArea() {
		return 3.14 * radius * radius;
	}
	
	
	//Override toString method in Point class
	@Override
	public String toString() {
			return  " radius = " + radius +
					" at " + super.toString() ;
			}
	
}
