// I Shobaki
//Lab01 Point
//Aug 26,2019


public class PointTest {

	public static void main(String[] args) {
		
		System.out.println("Iyad Shobaki");
		System.out.println("Lab01 Point");
		System.out.println("Aug 26,2019");
		System.out.println();
		// Create two objects
		Point point1 = new Point();
		Point point2 = new Point(11,24);
		
		//Display point1 and point2 coordinates
		System.out.printf("Point1 %s%n", point1.toString());
		System.out.printf("Point2 %s%n", point2.toString());
		
		//Set a new value for point1 (x value) then display the two point after the change
		point1.setxCoordinate(35);
		System.out.printf("Point1 %s%n", point1.toString());
		System.out.printf("Point2 %s%n", point2.toString());
		
		//Set a new value for point2 (y value) then display the two point after the change
		point2.setyCoordinate(13);
		System.out.printf("Point1 %s%n", point1.toString());
		System.out.printf("Point2 %s%n", point2.toString());
	}

}// End class PointTest
