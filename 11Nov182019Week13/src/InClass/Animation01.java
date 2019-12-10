package InClass;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Animation01 extends JPanel{
	private int x = 13;
	private int y = 13;
	

	public static void main(String[] args) {

		Animation01 gui = new Animation01();
		JFrame frame = new JFrame("I'm Falling!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(gui);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		gui.animate(gui);

	}
	
	public void animate(Animation01 myGui) {
		for(int i =0; i < 200; i++) {
			x++;
			y++;
			myGui.repaint();
			try {
				Thread.sleep(30);
			} catch (Exception ex) {
				System.out.println("ERROR: " + ex);
			}
		}//end loop
		
		//just for fun add code here to animate circle back to the top
		for(int i = 0; i < 200; i++) {
			x--;
			y--;
			myGui.repaint();
			try {
				Thread.sleep(30);
			} catch (Exception ex) {
				System.out.println("ERROR: " + ex);
			}
		}//end loop
		
		for(int i = 0; i < 200; i++) {
			//x--;
			y++;
			myGui.repaint();
			try {
				Thread.sleep(30);
			} catch (Exception ex) {
				System.out.println("ERROR: " + ex);
			}
		}//end loop
	}//end animate
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.green);
		g.fillOval(x, y, 40, 40);
		
	}// end paintComponent
}//end Animation01
