//I Shobaki
//Cylinder class extends Circle class

public class Cylinder extends Circle{
	private int height;
	
	//Default constructor
		public Cylinder() {
			super();
			height =15;
		}
		//Constructor with 1 arg
		public Cylinder(int height) {
			super();
			setHeight(height);
		}
		//get method
		public int getHeight() {
			return height;
		}
		// set method
		public void setHeight(int height) {
			this.height = height;
		}
		// Override area method inherited from the Circle class
		
		public double calcArea() {
			return (2 * 3.14 * getRadius() * getRadius()) + (2 * 3.14 * getRadius() * height);
		}
		//calculate volume method
		public double volume() {
			return 3.14 * getRadius() * getRadius() * height;
		}
		
		//Override toString method in Circle class
		@Override
		public String toString() {
				return  " height = " + height +
						" at "  + super.toString() ;
				}
}
