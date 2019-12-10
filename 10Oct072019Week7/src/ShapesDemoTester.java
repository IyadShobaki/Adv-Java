import javax.swing.JFrame;

public class ShapesDemoTester {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("A Drawing Primer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ShapesDemo myDemoJPanel = new ShapesDemo();
		
		frame.add(myDemoJPanel);
		frame.setSize(800, 630);
		frame.setLocation(120,17);
		//frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
/*
int i =0;
	while(i < 10) {
		Point locationPoint = MouseInfo.getPointerInfo().getLocation();
		double x = locationPoint.getX();
		double y = locationPoint.getY();
		
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		try {
			Thread.sleep(1000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
*/

/*
Shape I liked it
g.setColor(Color.black);
g.drawOval(200, 150, 400, 400);
g.drawArc(350, 300, 100, 100, 0, -180);

QuadCurve2D quadCurve2D = new QuadCurve2D.Float(450,350,350,400,350,350);
((Graphics2D)g).draw(quadCurve2D); 
*/