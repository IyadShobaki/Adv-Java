import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.security.Policy;
import java.util.Random;

import javax.swing.JPanel;

public class ShapesDemo extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Random random = new Random();
		
		//this.setBackground(new Color(244,255,255));
		//this.setBackground(new Color(0,0,0));
		this.setBackground(new Color(255,255,255));
		
		//Draw the grid, vertical lines
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		g.drawLine(200, 0, 200, 800);
		g.drawLine(400, 0, 400, 800);
		g.drawLine(600, 0, 600, 800);
		g.drawLine(800, 0, 800, 800);
		
		//Draw the grid, horizontal lines
		
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		g.drawLine(0, 150, 800, 150);
		g.drawLine(0, 300, 800, 300);
		g.drawLine(0, 450, 800, 450);
		
		//Row 1
		
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		g.drawString("Filled Rounded Rectangle", 10, 25);
		g.fillRoundRect(50, 50, 50, 75, 10, 10);
		
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		g.drawString("Empty Rounded Rectangle", 210, 25);
		g.drawRoundRect(250, 50, 50, 75, 10, 10);
		
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		g.drawString("Filled Square", 410, 25);
		g.fillRect(450, 50, 75, 75);
		
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		g.drawString("Empty Square", 610, 25);
		g.drawRect(650, 50, 75, 75);
	
		//Row 2
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		g.drawString("Filled Oval", 10, 175);
		g.fillOval(50, 200, 50, 75);
		
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		g.drawString("Empty Oval", 210, 175);
		g.drawOval(250, 200, 50, 75);
		
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		g.drawString("Filled Circle", 410, 175);
		g.fillOval(450, 200, 75, 75);
		
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		g.drawString("Empty Circle", 610, 175);
		g.drawOval(650, 200, 75, 75);
		
		//Row 3
		
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		g.drawString("Filled Arc", 10, 325);
		g.fillArc(50, 350, 75, 75, 0, 180);
		
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		g.drawString("An Empty Upside Down Arc", 210, 325);
		g.drawArc(250, 325, 75, 75, 0, -180);
		
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		g.drawString("A Half and Half Arc", 410, 325);
		g.fillArc(450, 350, 75, 75, 90, 180);
		g.drawArc(450, 350, 75, 75, 270, 180);
		
		
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		g.drawString("A 3/4 Arc", 610, 325);
		g.fillArc(650, 350, 75, 75, 0, 270);
		
		//Row 4, column 1
		
			//Build the triangle ... 3 Points
		g.drawString("A Triangle", 10, 475);
		Graphics2D graph2D = (Graphics2D) g;
		int[] xTrigPoints = {50, 150, 50};
		int[] yTrigPoints = {575, 575, 500};
		GeneralPath triangle = new GeneralPath();
		triangle.moveTo(xTrigPoints[0], yTrigPoints[0]);
		//we'll give the roof a random color
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		for (int index = 1; index < xTrigPoints.length; index++)
			triangle.lineTo(xTrigPoints[index], yTrigPoints[index]);
		triangle.closePath();
		graph2D.fill(triangle);
			
		//Row 4, column 2
		
		g.drawString("A Yellow Sun", 250, 475);
		//g.setColor(new Color(255,50,50));
		//g.fillOval(265, 500, 50, 50);
		int[] xPoints = {10,50,30};
		int[] yPoints = {10,10,30};
		
		GeneralPath sun = new GeneralPath();
		sun.moveTo(xPoints[0], yPoints[0]);
		for(int index = 1; index < xPoints.length; index++)
			sun.lineTo(xPoints[index], yPoints[index]);
		sun.closePath();
		graph2D.translate(290, 525);
		
		for (int index = 1; index <=20; index++) {
			graph2D.rotate(Math.PI /10.);
			graph2D.setColor(new Color(255,255,0));
			graph2D.fill(sun);
		}
		graph2D.translate(-290, -525);
		g.setColor(new Color(255,50,50));
		g.fillOval(265, 500, 50, 50);
		
		// Row 4, column 3
		g.setColor(Color.black);
		g.drawString("A Rainbow sun with no center", 410, 474);
		int[] x2Points = {10,50,30};
		int[] y2Points = {10,10,30};
		
		GeneralPath rainbowSun = new GeneralPath();
		rainbowSun.moveTo(x2Points[0], y2Points[0]);
		
		for (int index = 1; index < x2Points.length; index++)
			rainbowSun.lineTo(x2Points[index], y2Points[index]);
		rainbowSun.closePath();
		
		Graphics2D graph2d2 = (Graphics2D)g;
		graph2d2.translate(500, 525);
		
		for (int index = 1; index <= 20; index++) {
			graph2d2.rotate(Math.PI/10.);
			graph2d2.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
			graph2d2.fill(rainbowSun);
		}
		
		//Row 4, column 4
		
		graph2d2.translate(-500, -525);
		g.setColor(Color.black);
		g.drawString("A Polygon", 700, 475);
		
		Graphics2D graph2d3 = (Graphics2D) g;
		int[] xPolyPoints = {620,700,700,675};
		int[] yPolyPoints = {550,500,575,450};
		GeneralPath polygon = new GeneralPath();
		polygon.moveTo(xPolyPoints[0], yPolyPoints[0]);
		g.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
		
		for(int index = 1; index <xPolyPoints.length; index++)
			polygon.lineTo(xPolyPoints[index], yPolyPoints[index]);
		
		polygon.closePath();
		graph2d3.fill(polygon);
		
	}
}
