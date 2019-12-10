package GUI;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
@SuppressWarnings("serial")
public class DrawPanelC  extends JPanel{


	private ALine[] lines = new ALine[3];
	
	public DrawPanelC() {
		setBackground(Color.BLACK);
		lines[0] = new ALine(new Point(100,100), new Point(150,100), Color.BLUE);
		lines[1] = new ALine(new Point(100,100), new Point(100,200), Color.RED);
		lines[2] = new ALine(new Point(100,200), new Point(150,200), Color.ORANGE);
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (ALine line : lines) {
			line.draw(g);
		}
	}
}