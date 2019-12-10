import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI_02LabelAndButton implements ActionListener {
	
	JLabel titleLabel;
	JButton myButton;
	JPanel totalGUI;
	
	public JPanel createContentPane() {
		totalGUI = new JPanel();
		
		titleLabel = new JLabel("  Test a Button  ");
		titleLabel.setLocation(100,50);
		titleLabel.setSize(290,30);
		totalGUI.add(titleLabel);
		
		myButton = new JButton(" A New Button ");
		myButton.setLocation(100,100);
		myButton.setSize(150,30);
		myButton.setBackground(Color.BLUE);
		myButton.setForeground(Color.yellow);
		totalGUI.add(myButton);
		
		myButton.addActionListener(this);
		
		//totalGUI.setOpaque(true);
		return totalGUI;
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == myButton) {
			if (myButton.getX() == 100) {
				myButton.setText(" I Changed ");
				myButton.setLocation(30,70);
				myButton.setSize(220,60);
				myButton.setBackground(Color.red);
				myButton.setForeground(Color.black);
				
			}
			else {
				myButton.setText(" I Changed Back");
				myButton.setLocation(100,100);
				myButton.setSize(150,30);
				myButton.setBackground(Color.blue);
				myButton.setForeground(Color.yellow);
			}
		}
	}
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("JFrame with JLabel JButton");
		
		GUI_02LabelAndButton myDemo = new GUI_02LabelAndButton();
		frame.setContentPane(myDemo.createContentPane());
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("++                       ++");
		System.out.println("++   Chapter 12 Example  ++");
		System.out.println("++                       ++");
		System.out.println("+++++++++++++++++++++++++++");
		
		createAndShowGUI();
	}

}
