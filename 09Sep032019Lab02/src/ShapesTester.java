//I Shobaki
//Lab02 Rectangle and Box
//Sep 03, 2019

public class ShapesTester {

	public static void main(String[] args) {
		System.out.println("Iyad Shobaki");
		System.out.println("Lab02 Rectangle and Box");
		System.out.println("Sep 03,2019");
		System.out.println();
		// Create two Point objects
		Point point1 = new Point();
		Point point2 = new Point(5,19);
		
		// Create two Rectangle objects
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(24,30);
		
		// Create two  Box objects
		Box box1 = new Box();
		Box box2 = new Box(60);
		
		//Display the area of rectangle1 and rectangle2 
		System.out.printf("The area of rectangle1 = %,d square units%n", rectangle1.area());
		System.out.printf("The area of rectangle2 = %,d square units%n", rectangle2.area());
		System.out.printf("*************************************************\n");
		
		//Display the area and the volume of box1 and box2
		System.out.printf("The area of box1 = %,d square units%n", box1.area());
		System.out.printf("The volume of box1 = %,d square units%n", box1.volume());
		System.out.printf("*************************************************\n");
		
		System.out.printf("The area of box2 = %,d square units%n", box2.area());
		System.out.printf("The volume of box2 = %,d square units%n", box2.volume());
		System.out.printf("*************************************************\n");
		
		//set a new value for box2 width
		box2.setWidth(21);
		//Display the area and the volume of box2 after changing the width value
		System.out.printf("Changing box 2 width to %d%n", box2.getWidth());
		System.out.printf("The area of box2 = %,d square units%n", box2.area());
		System.out.printf("The volume of box2 = %,d square units%n", box2.volume());
		System.out.printf("*************************************************\n");
		
		
		//Display point1 and point2 coordinates
		System.out.printf("Point1 %s%n", point1.toString());
		System.out.printf("Point2 %s%n", point2.toString());
		
		//Display rectangle1 and rectangle2 information
		System.out.printf("Rectangle1 %s%n", rectangle1.toString());
		System.out.printf("Rectangle2 %s%n", rectangle2.toString());
		
		//Display Box1 and Box2 information
		System.out.printf("Box1 %s%n", box1.toString());
		System.out.printf("Box2 %s%n", box2.toString());
	}

}
