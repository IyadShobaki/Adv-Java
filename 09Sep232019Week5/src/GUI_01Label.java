import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI_01Label {
	JLabel titleLabel;
	JButton loginButton;
	JPanel totalGUI;
	
	public JPanel createContentPane() {
		totalGUI = new JPanel();
		
		totalGUI.setLayout(null);
		
//		loginButton = new JButton("Next");
//
//
//		loginButton.setBackground(Color.red);
//		loginButton.setForeground(Color.YELLOW);
//		loginButton.setLocation(100,20);
//		loginButton.setSize(100,30);
//		loginButton.setOpaque(true);
//		totalGUI.add(loginButton);
		
		titleLabel = new JLabel("Hello..I am a proud label!");
		titleLabel.setBackground(Color.BLUE);
		
		titleLabel.setForeground(Color.white);
		titleLabel.setLocation(100,50);
		
		titleLabel.setSize(150,30);
		titleLabel.setOpaque(true);
		
		
		totalGUI.add(titleLabel);
		totalGUI.setOpaque(true);
		
		return totalGUI;
	}
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("JFrame with JLabel JButton");
		GUI_01Label myDemo = new GUI_01Label();
		frame.setContentPane(myDemo.createContentPane());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setSize(400,200);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("++                       ++");
		System.out.println("++   Chapter 14 Example  ++");
		System.out.println("++       A label         ++");
		System.out.println("+++++++++++++++++++++++++++");
		
		createAndShowGUI();
	}

}
