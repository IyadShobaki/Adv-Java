//I Shobaki
//TigerFace class

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.QuadCurve2D;
import java.util.Random;

import javax.swing.JPanel;

public class TigerFace extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Random random = new Random();
		
		this.setBackground(Color.CYAN);
		
		// Create a circle with yellow
		g.setColor(Color.black);	
		g.drawOval(250, 90, 100, 100);
		g.drawOval(450, 90, 100, 100);
		
		g.setColor(Color.orange);
		g.fillOval(250, 90, 100, 100);
		g.fillOval(450, 90, 100, 100);
		
		g.setColor(Color.red);
		g.fillOval(280, 130, 50, 50);
		g.fillOval(470, 130, 50, 50);
		
		g.setColor(Color.black);
		g.drawOval(280, 130, 50, 50);
		g.drawOval(470, 130, 50, 50);
		g.setColor(Color.yellow);
		
		g.fillOval(200, 150, 400, 400);
		
		//Create a polygon with white color to cover part of the face(circle)
		Graphics2D graph2d2 = (Graphics2D) g;
		int[] xPolyPoints2 = {370,235,570,430};
		int[] yPolyPoints2 = {370,463,455,368};
		
		GeneralPath polygon2 = new GeneralPath();
		polygon2.moveTo(xPolyPoints2[0], yPolyPoints2[0]);
		g.setColor(Color.white);
		
		for(int index = 1; index <xPolyPoints2.length; index++)
			polygon2.lineTo(xPolyPoints2[index], yPolyPoints2[index]);
		
		polygon2.closePath();
		graph2d2.fill(polygon2);
		
		//Create line with a curve to cover more of the yellow space
		
		//g.setColor(Color.blue);
		QuadCurve2D quadCurve2DD = new QuadCurve2D.Float(236,463,420,640,570,455);
		((Graphics2D)g).fill(quadCurve2DD);
		
		
		
		//Create the nose 
		g.setColor(Color.black);
		g.drawOval(200, 150, 400, 400);
		g.fillArc(350, 300, 100, 100, 0, -180);
	
		
		QuadCurve2D quadCurve2D = new QuadCurve2D.Float(450,350,400,340,350,350);
		((Graphics2D)g).fill(quadCurve2D);
		
		
		g.drawLine(380, 152, 350, 350);
		g.drawLine(420, 152, 450, 350);
		
		
		//Change the color for the top of the nose by creating another polygon
		
		//g.setColor(Color.ORANGE);
		Graphics2D graph2d = (Graphics2D) g;
		int[] xPolyPoints = {380,350,450,420};
		int[] yPolyPoints = {152,350,350,152};
		
		GeneralPath polygon = new GeneralPath();
		polygon.moveTo(xPolyPoints[0], yPolyPoints[0]);
		g.setColor(Color.ORANGE);
		
		for(int index = 1; index <xPolyPoints.length; index++)
			polygon.lineTo(xPolyPoints[index], yPolyPoints[index]);
		
		polygon.closePath();
		graph2d.fill(polygon);
		
		//g.setColor(Color.blue);
		QuadCurve2D quadCurve2D1 = new QuadCurve2D.Float(380,152,400,150,420,152);
		((Graphics2D)g).fill(quadCurve2D1);
		
		
		//Create triangles (black strips) using method
		
		Graphics2D triangleGraphics2d = (Graphics2D) g;
		paintTriangle(triangleGraphics2d, 330, 162, 370,153, 350,190);
		paintTriangle(triangleGraphics2d, 290, 181, 320,165, 340,200);
		
		paintTriangle(triangleGraphics2d, 480, 167, 440,155, 440,190);
		paintTriangle(triangleGraphics2d, 520, 189, 490,171, 450,200);
		
		paintTriangle(triangleGraphics2d, 207, 295, 220,260, 290,270);
		paintTriangle(triangleGraphics2d, 200, 360, 205,310, 290,320);
		paintTriangle(triangleGraphics2d, 215, 430, 203,375, 280,370);
		
		paintTriangle(triangleGraphics2d, 592, 295, 580,260, 510,280);
		paintTriangle(triangleGraphics2d, 600, 360, 597,310, 510,320);
		paintTriangle(triangleGraphics2d, 585, 430, 600,375, 510,370);
		
		// Draw more lines and arcs 
		g.drawLine(370, 370,235,463);
		g.drawLine(430, 368,570,455);
		
		g.drawArc(300, 250, 30, 30, 0, -180);
		g.drawArc(450, 250, 30, 30, 0, -180);
		g.drawArc(360, 400, 80, 80, 0, -180);
		
		
		g.drawLine(340, 420,160,390);
		g.drawLine(340, 450,160,450);
		g.drawLine(340, 480,160,510);
		
		g.drawLine(470, 420,650,390);
		g.drawLine(470, 450,650,450);
		g.drawLine(470, 480,650,510);
	
	
	}
	// Method to create triangles (black strips)
	private void paintTriangle(Graphics2D g,int x1,int y1,int x2, int y2,int x3, int y3) {
		Graphics2D graph2D = (Graphics2D) g;
		int[] xTrigPoints = {x1, x2, x3};
		int[] yTrigPoints = {y1, y2, y3};
		GeneralPath triangle = new GeneralPath();
		triangle.moveTo(xTrigPoints[0], yTrigPoints[0]);
		g.setColor(Color.black);
		for (int index = 1; index < xTrigPoints.length; index++)
			triangle.lineTo(xTrigPoints[index], yTrigPoints[index]);
		triangle.closePath();
		graph2D.fill(triangle);
	}
}
