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
	Random rand = new Random();
	//draw an oval of the specified diameter
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(new Color(circleColorRed, circleColorGreen, circleColorBlue));
		g.fillOval(10, 10, diameter, diameter);
		
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
	public void setCircleColor() {//int red, int green, int blue) {
//		if(red <= 0 || red > 255) {
//			circleColorRed = rand.nextInt(255);
//		}else {
//			circleColorRed = rand.nextInt(red);
//		}
//		if(green <= 0 || green > 255) {
//			circleColorGreen = rand.nextInt(255);
//		}else {
//			circleColorGreen = rand.nextInt(green);
//		}
//		if(blue <= 0 || blue > 255) {
//			circleColorBlue = rand.nextInt(255);
//		}else {
//			circleColorBlue = rand.nextInt(blue);
//		}
		circleColorRed = rand.nextInt(255);
		circleColorGreen = rand.nextInt(255);
		circleColorBlue = rand.nextInt(255);
	}

}
