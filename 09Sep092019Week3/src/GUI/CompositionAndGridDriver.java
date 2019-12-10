package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CompositionAndGridDriver {
	public static void main(String[] args) {
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("++                            ++");
		System.out.println("++       Drawing Sample       ++");
		System.out.println("++                            ++");
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("\nGrid Layout");
		
		
		//create the JFrame 
		JFrame applicationFrame = new JFrame("Class Composition and Grid Layout");
		applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		applicationFrame.setSize(600,600);
		applicationFrame.setLocationRelativeTo(null);
		
		
		//this will create the 'center' of the layout, add it to JFrame
		JPanel contentPanel  = new JPanel();
		contentPanel.setLayout(new GridLayout(2,2));
		
		DrawPanelA panelA = new DrawPanelA();
		DrawPanelC panelC = new DrawPanelC();
		
		contentPanel.add(panelA);
		contentPanel.add(panelC);
		
		contentPanel.add(new JTextField("I can have data entered. try it!"));
		contentPanel.add(new JLabel("I am a label ... no data entry here"));
		
		applicationFrame.add(contentPanel, BorderLayout.CENTER);
		
		//this will create the 'borders' of the layout North, South, East, West, add it to JFrame
		applicationFrame.add(new JLabel("NORTH", JLabel.CENTER), BorderLayout.NORTH);
		applicationFrame.add(new JLabel(new ImageIcon("meWorry80.jpg")), BorderLayout.SOUTH);
		applicationFrame.add(new JButton(new ImageIcon("fingerLeft.png")), BorderLayout.WEST);
		applicationFrame.add(new JButton(new ImageIcon("fingerRight.png")), BorderLayout.EAST);
		
		applicationFrame.setVisible(true);
		
		
	}
}
