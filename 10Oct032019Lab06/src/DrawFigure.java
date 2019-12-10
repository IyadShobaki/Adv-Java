//I Shobaki
//DrawFigure will draw a rectangle, box, circle, or cylinder based on user selection
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawFigure extends JPanel {
	int type;
	int length,width,height,radius;
	
	public DrawFigure() {
		super();
		type = 5;
	}
	
	public DrawFigure(int myType, int myWidth, int myLength, int myHeight) {
		super();
		type = myType;
		length = myLength;
		width = myWidth;
		height = myHeight;
	}
	
	public DrawFigure(int x, int y, int myType, int myWidth, int myLength, int myHeight) {
		super();
		type = myType;
		length = myLength;
		width = myWidth;
		height = myHeight;
	}
	public DrawFigure(int myType, int myRadius, int myHeight) {
		super();
		type = myType;
		radius = myRadius;
		height = myHeight;
	}
	public DrawFigure(int x, int y, int myType, int myRadius, int myHeight) {
		super();
		type = myType;
		radius = myRadius;
		height = myHeight;
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(type == 1) {//draw rect
			g.fillRect(50, 110, width, length);
		}else if (type == 2) { //draw box
			g.drawRect(50, 110, width, length);
			
			g.drawRect((50+height), (110+height), width, length);
			
			g.drawLine(50, 110, (50+height), (110+height));
			
			g.drawLine(50, (110+length), (50+height), (110+length+height));
			
			g.drawLine((50+width), 110, (50+width+height), (110+height));
			
			g.drawLine((50+width), (110+length), (50+width+height), (110+length+height));

			//you will need to draw 6 lines to make your box
			
		}else if (type == 3) {//draw circle
			g.fillOval(50, 110, radius, radius/2);
			
			// one draw command is needed here
		}else if (type == 4) { //draw cylinder
			g.drawOval(50, 110, radius, radius/2);
			g.drawLine(50, (110+radius/4), 50, (110+height+radius/4));
			g.drawOval(50, (110+height), radius, radius/2);
			g.drawLine((50 + radius), (110 + radius/4), (50 + radius), (110+height + radius/4));
			//you will need to draw two ovals and 2 lines to make a cylinder
		}
	}//end method paintComponent
}//end class DrawFigure
