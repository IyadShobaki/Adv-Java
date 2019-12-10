//I Shobaki
//Lab05 GUI 1 Build a non-functional GUI
//Sep 23, 2019


//imports colors, fonts, labels, buttons, etc
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class GUI_Lab1 {
	//instance objects of our type: GUI_Lab1
	JLabel titleLabel, radioLabel, widthLabel, heightLabel, radiusLabel,lengthLabel;
	JRadioButton rectangleRadioButton, boxRadioButton, circleRadioButton, cylinderRadioButton;
	JTextField widthTextField, lengthTextField, heightTextField,radiusTextField;
	JPanel  totalGUI, radioButtonPanel, widthPanel, lengthPanel, heightPanel, radiusPanel;
	JButton processButton;
	
	public JPanel createContentPane() {
		// create a bottom JPanel to place the other panels, and a button on it
		
		Font font = new Font("Verdana",40,24);
		totalGUI = new JPanel();
		totalGUI.setBackground(Color.CYAN);
		
		//create a label for the title and place it on totalGUI panel 
		Font titleFont = new Font("Verdana",Font.BOLD, 38);
		titleLabel = new JLabel("The Figure Center");
		titleLabel.setLocation(200,20);
		titleLabel.setSize(450,50);
		titleLabel.setFont(titleFont);
		totalGUI.add(titleLabel);
		
		
		// create and set the location of a radio panel inside the main
		//panel (totalGUI) to place all the radio buttons and a label
		radioButtonPanel = new JPanel();
		radioButtonPanel.setLocation(10,80);
		radioButtonPanel.setSize(200,300);
		radioButtonPanel.setBackground(Color.CYAN);
		radioButtonPanel.setLayout(null);
		
		
		//create the radio buttons and place them on radioButtonPanel
		rectangleRadioButton = new JRadioButton("Rectangle");
		rectangleRadioButton.setBackground(Color.CYAN);
		rectangleRadioButton.setLocation(10, 60);
		rectangleRadioButton.setSize(150,50);
		rectangleRadioButton.setFont(font);
		
		boxRadioButton = new JRadioButton("Box");
		boxRadioButton.setBackground(Color.CYAN);
		boxRadioButton.setLocation(10, 100);
		boxRadioButton.setSize(150,50);
		boxRadioButton.setFont(font);
		
		circleRadioButton = new JRadioButton("Circle");
		circleRadioButton.setBackground(Color.CYAN);
		circleRadioButton.setLocation(10, 140);
		circleRadioButton.setSize(150,50);
		circleRadioButton.setFont(font);
		
		cylinderRadioButton= new JRadioButton("Cylinder");
		cylinderRadioButton.setBackground(Color.CYAN);
		cylinderRadioButton.setLocation(10, 180);
		cylinderRadioButton.setSize(150,50);
		cylinderRadioButton.setFont(font);
		
		//the buttons need a group
		ButtonGroup group = new ButtonGroup();
		group.add(rectangleRadioButton);
		group.add(boxRadioButton);
		group.add(circleRadioButton);
		group.add(cylinderRadioButton);
		
		//add the buttons to the radioButtonPanel
		radioButtonPanel.add(rectangleRadioButton);
		radioButtonPanel.add(boxRadioButton);
		radioButtonPanel.add(circleRadioButton);
		radioButtonPanel.add(cylinderRadioButton);
		
		//create a label and add it to the radioButtonPanel
		radioLabel = new JLabel("Select a figure.");
		radioLabel.setLocation(10,0);
		radioLabel.setSize(250,50);
		radioLabel.setFont(font);
		radioButtonPanel.add(radioLabel);
		
		
		
		
		// create and set the location of a width panel inside the main
		//panel (totalGUI) to place a label and text field
		widthPanel = new JPanel();
		widthPanel.setLocation(230,80);
		widthPanel.setSize(200,120);
		widthPanel.setBackground(Color.CYAN);
		widthPanel.setLayout(null);
		
		//create a label and add it to widthPanel
		widthLabel = new JLabel("Enter Width");
		widthLabel.setLocation(10,0);
		widthLabel.setSize(250,50);
		widthLabel.setFont(font);
		widthPanel.add(widthLabel);
		
		//create a text field and add it to widthPanel
		widthTextField = new JTextField();
		widthTextField.setLocation(10,50);
		widthTextField.setSize(150,50);
		widthTextField.setFont(font);
		widthPanel.add(widthTextField);
		
		// create and set the location of a radius panel inside the main
		//panel (totalGUI) to place a label and text field
		radiusPanel = new JPanel();
		radiusPanel.setLocation(230,220);
		radiusPanel.setSize(200,120);
		radiusPanel.setBackground(Color.CYAN);
		radiusPanel.setLayout(null);
		
		//create a label and add it to radiusPanel
		radiusLabel = new JLabel("Enter Radius");
		radiusLabel.setLocation(10,0);
		radiusLabel.setSize(250,50);
		radiusLabel.setFont(font);
		radiusPanel.add(radiusLabel);
		
		//create a text field and add it to radiusPanel
		radiusTextField = new JTextField();
		radiusTextField.setLocation(10,50);
		radiusTextField.setSize(150,50);
		radiusTextField.setFont(font);
		radiusPanel.add(radiusTextField);
		
		// create and set the location of a length panel inside the main
		//panel (totalGUI) to place a label and text field
		lengthPanel = new JPanel();
		lengthPanel.setLocation(450,80);
		lengthPanel.setSize(200,120);
		lengthPanel.setBackground(Color.CYAN);
		lengthPanel.setLayout(null);
		
		//create a label and add it to lengthLabel
		lengthLabel = new JLabel("Enter Length");
		lengthLabel.setLocation(10,0);
		lengthLabel.setSize(250,50);
		lengthLabel.setFont(font);
		lengthPanel.add(lengthLabel);
		
		//create a text field and add it to lengthLabel
		lengthTextField = new JTextField();
		lengthTextField.setLocation(10,50);
		lengthTextField.setSize(150,50);
		lengthTextField.setFont(font);
		lengthPanel.add(lengthTextField);
		
		
		// create and set the location of a height panel inside the main
		//panel (totalGUI) to place a label and text field
		heightPanel = new JPanel();
		heightPanel.setLocation(450,220);
		heightPanel.setSize(200,120);
		heightPanel.setBackground(Color.CYAN);
		heightPanel.setLayout(null);
		
		//create a label and add it to heightLabel
		heightLabel = new JLabel("Enter Height");
		heightLabel.setLocation(10,0);
		heightLabel.setSize(250,50);
		heightLabel.setFont(font);
		heightPanel.add(heightLabel);

		//create a text field and add it to heightLabel
		heightTextField = new JTextField();
		heightTextField.setLocation(10,50);
		heightTextField.setSize(150,50);
		heightTextField.setFont(font);
		heightPanel.add(heightTextField);
		
		
		//create a button and add to the main panel totalGUI
		processButton = new JButton(" Click to Process");
		processButton.setLocation(250,350);
		processButton.setSize(350,70);
		processButton.setFont(font);
		//processButton.setBackground(Color.BLUE);
		//processButton.setForeground(Color.yellow);
		
		totalGUI.add(processButton);
		totalGUI.add(heightPanel);
		totalGUI.add(radiusPanel);
		totalGUI.add(lengthPanel);
		totalGUI.add(widthPanel);
		totalGUI.add(radioButtonPanel);
		
		
		return totalGUI;
	}//end createContentPane
	
	//create the GUI and show it
	private static void createAndShowGUI() {
		//create a frame and set its location and size
		JFrame frame = new JFrame("GUI_LAB1"); 
		GUI_Lab1 myDemo = new GUI_Lab1();
		frame.setContentPane(myDemo.createContentPane());
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setLocation(450,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,500);
		frame.setVisible(true);
		
		
	}//end createAndShowGUI
	public static void main(String[] args) {
		createAndShowGUI();

	}

}//end of class GUI_Lab1
