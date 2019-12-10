package ME;
//I Shobaki
//A customized JPanel class
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;


public class OvalPanel extends JPanel{
	private int diameter = 10; //default diameter 
	private int circleColorRed =0;
	private int circleColorGreen = 255;
	private int circleColorBlue =0;
	private int shape =1;
	Random rand = new Random();
	//draw an oval of the specified diameter
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(circleColorRed, circleColorGreen, circleColorBlue));
		if(shape == 1) {
			g.fillOval(10, 10, diameter, diameter);
		}else if(shape == 2){
			g.fillRect(10, 10, diameter, diameter);
		}
		
	}
	
	//validate and set diameter, then repaint
	public void setDiameter(int newDiameter) {
		//if diameter invalid, default to 10
		diameter = (newDiameter >=0 ? newDiameter : 10);
		repaint(); // repaint panel
	}
	public int getDiameter() {
		return diameter;
	}
	public void setCircleColor() {
		circleColorRed = rand.nextInt(255);
		circleColorGreen = rand.nextInt(255);
		circleColorBlue = rand.nextInt(255);
	}
	public  void setShape(int shapeValue) {
		shape = shapeValue;
		repaint();
	}
	public int getShape() {
		return shape;
	}

}
