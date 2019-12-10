//DrawFigure will draw a rectangle, box, circle, or cylinder based on user selection
import java.awt.Color;
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
			//g.fillRect(50, 110,300,200);
			
		}else if (type == 2) { //draw box
			//g.fillRect(150, 110, width, height);
			//you will need to draw 6 lines to make your box	
		}else if (type == 3) {//draw circle
			//g.drawLine(100, 100,200, 200);
			// one draw command is needed here
		}else if (type == 4) { //draw cylinder
			//you will need to draw two ovals and 2 lines to make a cylinder
		}
	}//end method paintComponent
}//end class DrawFigure
