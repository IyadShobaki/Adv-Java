package GUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawPanelA extends JPanel {
	private ALine[] lines = new ALine[3];
	
	public DrawPanelA() {
		setBackground(Color.white);
		lines[0] = new ALine(new Point(100,200), new Point(125,125), Color.BLUE);
		lines[1] = new ALine(new Point(125,125), new Point(150,200), Color.RED);
		lines[2] = new ALine(new Point(113,164), new Point(138,164), Color.ORANGE);
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (ALine line : lines) {
			line.draw(g);
		}
	}
}
