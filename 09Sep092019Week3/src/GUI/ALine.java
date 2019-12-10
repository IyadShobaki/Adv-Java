package GUI;

import java.awt.Color;
import java.awt.Graphics;

public class ALine {

	private Point lineStartPoint ;
	private Point lineEndPoint;
	private Color lineColor;
	
	public ALine(Point lineStartPoint, Point lineEndPoint, Color lineColor ) {
		this.lineStartPoint =lineStartPoint;
		this.lineEndPoint = lineEndPoint;
		this.lineColor =lineColor;
	}
	public void draw(Graphics g) {
		g.setColor(lineColor);
		g.drawLine(lineStartPoint.getxCoordinate(), lineStartPoint.getyCoordinate()
				, lineEndPoint.getxCoordinate(), lineEndPoint.getyCoordinate());
	}
}
