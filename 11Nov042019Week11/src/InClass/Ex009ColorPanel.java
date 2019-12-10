package InClass;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Ex009ColorPanel extends JPanel {
	
	private int level;
	private Random gen;
	int invocations;
	public Ex009ColorPanel(Color backColor) {
		setBackground(backColor);
		level = 0;
		gen = new Random();
		
	}
	public void setLevel(int level) {
		invocations = 0;
		this.level = level;
		repaint();
	}
	public void paintComponent (Graphics g) {
		super.paintComponent(g); //maybe we can comment this line according to the teacher. this for the previous version for java
		mondrian(g, 0,0, getWidth(), getHeight(), level);
		
	}
	private void mondrian(Graphics g, int x1, int y1, int width, int height, int level) {
		System.out.println("Level " + level + " Invocations " + invocations++);
		
		if(level > 0) {
			g.setColor(randomColor());
			
			g.fillRect(x1, y1, width - x1, height - y1);
			g.setColor(randomColor());
			
			g.drawRect(x1, y1, width - x1, height - y1);
			
			int vertical = gen.nextInt(2); //decide whether to split vertically or horizontally. number between 0 and 1, 2 not included
			
			int biggerSide = gen.nextInt(2); //decide which side to make larger
			
			if(vertical == 0)
				if(biggerSide ==0) {
					//Split vertically with bigger side on right
					mondrian(g, x1, y1, (width-x1)/3 + x1, height, level -1);
					mondrian(g, (width - x1)/3 + x1, y1, width, height, level -1);
					
				}else {
					//Split vertically with bigger side on left
					mondrian(g, x1, y1, (width-x1) * 2 / 3 + x1, height, level -1);
					mondrian(g, (width - x1) * 2 / 3 + x1, y1, width, height, level -1);
				}
			else {
				if(biggerSide == 0) {
					//Split horizontally with bigger side on bottom
					mondrian(g, x1, y1, width, (height-y1)/3+y1, level-1);
					mondrian(g, x1, (height - y1 ) / 3 + y1, width, height, level-1);
				}else {
					//Split horizontally with bigger side on top
					mondrian(g, x1, y1, width, (height-y1) * 2 / 3 + y1, level-1);
					mondrian(g, x1, (height - y1 ) * 2 / 3 + y1, width, height, level-1);
				}
			}
		}//end level > 0
	}//end mondrain
	
	private Color randomColor() {
		return new Color(gen.nextInt(256),gen.nextInt(256),gen.nextInt(256) );
	}
}

