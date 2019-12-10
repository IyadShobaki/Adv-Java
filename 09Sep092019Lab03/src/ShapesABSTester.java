//I Shobaki
//Lab03 Rectangle Box Circle Cylinder
//Sep 09, 2019
public class ShapesABSTester {
	
	public static void main(String[] args) {
		System.out.println("Iyad Shobaki");
		System.out.println("Lab03 Rectangle Box Circle Cylinder");
		System.out.println("Sep 09,2019");
		System.out.println();
		
		//create an array of shapes
		PointABS[] myShapes = new PointABS[4];
		
		//populate array with objects
		
		myShapes[0] = new Rectangle(10,20);
		myShapes[1] = new Box(30);
		myShapes[2] = new Circle(40);
		myShapes[3] = new Cylinder(50);
		
		int i =0;
		
		//generically process each element in array myShapes
		for (PointABS currentShape : myShapes) {
			System.out.println("************************************************\n");
			//Check the object class and print its type.
			if (currentShape instanceof Box) {
				System.out.println("Object " + i + " is a Box");
			}else if (currentShape instanceof Rectangle) {
				System.out.println("Object " + i + " is a Rectangle");
			}
			else if (currentShape instanceof Cylinder) {
				System.out.println("Object " + i + " is a Cylinder");
			}else if (currentShape instanceof Circle) {
				System.out.println("Object " + i + " is a Circle");
			}
			System.out.println(currentShape);
			// call calcArea method and print the area of each shape
			System.out.println(" The area of the shape is: " + currentShape.calcArea());
			
			i++;
		}// end for loop
		
	}//end main

}//end class ShapesABSTester
