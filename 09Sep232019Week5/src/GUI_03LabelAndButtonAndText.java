import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI_03LabelAndButtonAndText implements ActionListener {
	
	JLabel titleLabel, directionLabel, confirmLabel;
	JButton myButton;
	JTextField producTextField;
	JPanel totalGUI;
	
	public JPanel createContentPane() {
		totalGUI = new JPanel();
		totalGUI.setBackground(Color.yellow);
		totalGUI.setLayout(null);
		
		titleLabel = new JLabel("RE-ENACTOR EQUIPMENT");
		titleLabel.setLocation(95,25);
		titleLabel.setSize(250,30);
		totalGUI.add(titleLabel);
		
		
		directionLabel = new JLabel("<html>Please enter your product type: <br><br> Boots, Camp, Field, or Uniform</html>");
		directionLabel.setLocation(95,75);
		directionLabel.setSize(290,60);
		totalGUI.add(directionLabel);
		
		producTextField = new JTextField();
		producTextField.setLocation(95,150);
		producTextField.setSize(100,30);
		totalGUI.add(producTextField);
		
		confirmLabel = new JLabel();
		confirmLabel.setLocation(200,150);
		confirmLabel.setSize(190,30);
		confirmLabel.setBackground(Color.green);
		totalGUI.add(confirmLabel);
		
		
		myButton = new JButton(" Click to Process");
		myButton.setLocation(95,200);
		myButton.setSize(150,30);
		myButton.setBackground(Color.BLUE);
		myButton.setForeground(Color.yellow);
		totalGUI.add(myButton);
		
		myButton.addActionListener(this);
		producTextField.addActionListener(this);
		
		return totalGUI;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == myButton) {
			confirmLabel.setText("Button: your product " + producTextField.getText());
			confirmLabel.setOpaque(true);
		}
		else if(e.getSource() == producTextField) {
			confirmLabel.setText("EnterKey: your product " + producTextField.getText());
			confirmLabel.setOpaque(true);
		}
	}
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("JFrame JLabel JButton JTextField");
		
		GUI_03LabelAndButtonAndText myDemo = new GUI_03LabelAndButtonAndText();
		frame.setContentPane(myDemo.createContentPane());
		
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		//frame.setLocation(100,140); //put the frame in the upper left corner of the screen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,450);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("++                       ++");
		System.out.println("++  Chapter 12 Example 3 ++");
		System.out.println("++                       ++");
		System.out.println("+++++++++++++++++++++++++++");
		
		
		createAndShowGUI();
	}

}
