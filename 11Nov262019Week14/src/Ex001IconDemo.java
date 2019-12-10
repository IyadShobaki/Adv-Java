import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex001IconDemo extends JFrame implements ActionListener{
	public static final int WIDTH = 500;
	public static final int HEIGHT = 200;
	public static final int TEXT_FIELD_SIZE = 30;
	private JLabel dukeLabel;
	private ImageIcon duke;
	private JTextField message;
	public Ex001IconDemo() {
		super("Icon Demonstration");
		setSize(WIDTH,HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		
		dukeLabel = new JLabel("Mood check");
		duke = new ImageIcon("duke_standing.gif");
		dukeLabel.setIcon(duke);
		add(dukeLabel, BorderLayout.NORTH);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		
		JButton happyButton = new JButton("Happy");
		ImageIcon happyIcon = new ImageIcon("smiley.gif");
		happyButton.setIcon(happyIcon);
		buttonPanel.add(happyButton);
		
		JButton sadButton = new JButton("Sad");
		ImageIcon sadIcon = new ImageIcon("sad.gif");
		sadButton.setIcon(sadIcon);
		buttonPanel.add(sadButton);
		
		add(buttonPanel, BorderLayout.SOUTH);
		
		
		message = new JTextField(TEXT_FIELD_SIZE);
		message.addActionListener(this);
		add(message, BorderLayout.CENTER);
		
		happyButton.addActionListener(this);
		sadButton.addActionListener(this);
	}//end costructor
	
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		
		if(actionCommand.equals("Happy")) {
			duke = new ImageIcon("duke_thumbsup.gif");
			dukeLabel.setIcon(duke);
			message.setText("Smile and the world smiles with you!");
		}else if(actionCommand.equals("Sad")) {
			duke = new ImageIcon("duke_waving.gif");
			dukeLabel.setIcon(duke);
			message.setText("Cheer up. It can't be that bad.");
		}else {
			duke = new ImageIcon("duke_standing.gif");
			dukeLabel.setIcon(duke);
			message.setText("Unexpected Error.");
		}
	}//end AP
	
	public static void main(String[] args) {
		Ex001IconDemo iconGui = new Ex001IconDemo();
		iconGui.setVisible(true);
	}
	

}
