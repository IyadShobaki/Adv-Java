//I Shobaki
//Lab06 GUI 2 Add functionality to a GUI
//Oct 04, 2019


//imports colors, fonts, labels, buttons, etc
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class GUI_Lab2 implements ActionListener{
	//instance objects of our type: GUI_Lab2
	JLabel titleLabel, radioLabel, widthLabel, heightLabel, radiusLabel,lengthLabel, errLabel;
	JRadioButton rectangleRadioButton, boxRadioButton, circleRadioButton, cylinderRadioButton;
	JTextField widthTextField, lengthTextField, heightTextField,radiusTextField;
	JPanel  totalGUI, radioButtonPanel, widthPanel, lengthPanel, heightPanel, radiusPanel;
	JButton processButton;
	
	static  int width, length, height, radius;
	
	
	private boolean dimensionError;
	public static int shapeNumber ;
	
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
		rectangleRadioButton.addActionListener(this);
		
		boxRadioButton = new JRadioButton("Box");
		boxRadioButton.setBackground(Color.CYAN);
		boxRadioButton.setLocation(10, 100);
		boxRadioButton.setSize(150,50);
		boxRadioButton.setFont(font);
		boxRadioButton.addActionListener(this);
		
		circleRadioButton = new JRadioButton("Circle");
		circleRadioButton.setBackground(Color.CYAN);
		circleRadioButton.setLocation(10, 140);
		circleRadioButton.setSize(150,50);
		circleRadioButton.setFont(font);
		circleRadioButton.addActionListener(this);
		
		cylinderRadioButton= new JRadioButton("Cylinder");
		cylinderRadioButton.setBackground(Color.CYAN);
		cylinderRadioButton.setLocation(10, 180);
		cylinderRadioButton.setSize(150,50);
		cylinderRadioButton.setFont(font);
		cylinderRadioButton.addActionListener(this);
		
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
		widthPanel.setVisible(false);
		
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
		radiusPanel.setVisible(false);
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
		lengthPanel.setVisible(false);
		
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
		heightPanel.setVisible(false);
		
		//create a button and add to the main panel totalGUI
		processButton = new JButton(" Click to Process");
		processButton.setLocation(250,350);
		processButton.setSize(350,70);
		processButton.setFont(font);
		processButton.setVisible(false);
		processButton.addActionListener(this);
		//processButton.setBackground(Color.BLUE);
		//processButton.setForeground(Color.yellow);
		
		errLabel = new JLabel("DIMENSION ERROR>>>CAN NOT RENDER DRAWING");
		errLabel.setSize(300,30);
		errLabel.setLocation(15,0);
		errLabel.setOpaque(true);
		errLabel.setBackground(Color.RED);
		errLabel.setVisible(false);
		
		totalGUI.add(errLabel);
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
		JFrame frame = new JFrame("GUI_LAB2"); 
		GUI_Lab2 myDemo = new GUI_Lab2();
		frame.setContentPane(myDemo.createContentPane());
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setLocation(450,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,500);
		frame.setVisible(true);
		
		
	}//end createAndShowGUI
	
	public void actionPerformed(ActionEvent e) {
		dimensionError = true;
		errLabel.setVisible(false);
		
		if(rectangleRadioButton.isSelected()) {
			lengthPanel.setVisible(true);
			widthPanel.setVisible(true);
			heightPanel.setVisible(false);
			radiusPanel.setVisible(false);
			processButton.setVisible(true);
			
		}else if(boxRadioButton.isSelected()) {
			lengthPanel.setVisible(true);
			widthPanel.setVisible(true);
			heightPanel.setVisible(true);
			radiusPanel.setVisible(false);
			processButton.setVisible(true);
		}else if(circleRadioButton.isSelected()) {
			lengthPanel.setVisible(false);
			widthPanel.setVisible(false);
			heightPanel.setVisible(false);
			radiusPanel.setVisible(true);
			processButton.setVisible(true);
		}else if(cylinderRadioButton.isSelected()) {
			lengthPanel.setVisible(false);
			widthPanel.setVisible(false);
			heightPanel.setVisible(true);
			radiusPanel.setVisible(true);
			processButton.setVisible(true);
		}
		if(e.getSource() == processButton) {
			
			if(rectangleRadioButton.isSelected()) {
				dimensionError = false;
				shapeNumber = 1;
				try {
					width = Integer.parseInt(widthTextField.getText());
					lessThanOrEqualToZeroException(" Width " , width);
				} catch (LessThanOrEqualToZeroException ex) {
					widthTextField.setBackground(Color.YELLOW);
					dimensionError = true;
				} catch(InputMismatchException ex) {
					widthTextField.setBackground(Color.RED);
					dimensionError = true;
				}catch (NumberFormatException ex) {
					widthTextField.setBackground(Color.RED);
					dimensionError = true;
				}
				try {
					length = Integer.parseInt(lengthTextField.getText());
					lessThanOrEqualToZeroException(" Length " , length);
				} catch (LessThanOrEqualToZeroException ex) {
					lengthTextField.setBackground(Color.YELLOW);
					dimensionError = true;
				}catch (InputMismatchException ex) {
					lengthTextField.setBackground(Color.RED);
					dimensionError= true;
				}catch (NumberFormatException ex) {
					dimensionError =true;
					lengthTextField.setBackground(Color.RED);
				}
			}// end rectangleButton
			
			if(boxRadioButton.isSelected()) {
				shapeNumber =2;
				dimensionError = false;
				try {
					width = Integer.parseInt(widthTextField.getText());
					lessThanOrEqualToZeroException(" Width " , width);
				} catch (LessThanOrEqualToZeroException ex) {
					widthTextField.setBackground(Color.YELLOW);
					dimensionError = true;
				} catch(InputMismatchException ex) {
					widthTextField.setBackground(Color.RED);
					dimensionError = true;
				}catch (NumberFormatException ex) {
					widthTextField.setBackground(Color.RED);
					dimensionError = true;
				}
				try {
					length = Integer.parseInt(lengthTextField.getText());
					lessThanOrEqualToZeroException(" Length " , length);
				} catch (LessThanOrEqualToZeroException ex) {
					lengthTextField.setBackground(Color.YELLOW);
					dimensionError = true;
				}catch (InputMismatchException ex) {
					lengthTextField.setBackground(Color.RED);
					dimensionError= true;
				}catch (NumberFormatException ex) {
					dimensionError =true;
					lengthTextField.setBackground(Color.RED);
				}
				try {
					height = Integer.parseInt(heightTextField.getText());
					lessThanZeroException(" Height " , height);
				} catch (LessThanZeroException ex) {
					heightTextField.setBackground(Color.YELLOW);
					dimensionError = true;
				}catch (InputMismatchException ex) {
					heightTextField.setBackground(Color.RED);
					dimensionError= true;
				}catch (NumberFormatException ex) {
					dimensionError =true;
					heightTextField.setBackground(Color.RED);
				}
			}
			if(circleRadioButton.isSelected()) {
				shapeNumber =3;
				dimensionError = false;
				try {
					radius = Integer.parseInt(radiusTextField.getText());
					lessThanOrEqualToZeroException(" Radius " , radius);
				} catch (LessThanOrEqualToZeroException ex) {
					radiusTextField.setBackground(Color.YELLOW);
					dimensionError = true;
				} catch(InputMismatchException ex) {
					radiusTextField.setBackground(Color.RED);
					dimensionError = true;
				}catch (NumberFormatException ex) {
					radiusTextField.setBackground(Color.RED);
					dimensionError = true;
				}
				
			}
			if(cylinderRadioButton.isSelected()) {
				shapeNumber = 4;
				dimensionError = false;
				try {
					radius = Integer.parseInt(radiusTextField.getText());
					lessThanOrEqualToZeroException(" Radius " , radius);
				} catch (LessThanOrEqualToZeroException ex) {
					radiusTextField.setBackground(Color.YELLOW);
					dimensionError = true;
				} catch(InputMismatchException ex) {
					radiusTextField.setBackground(Color.RED);
					dimensionError = true;
				}catch (NumberFormatException ex) {
					radiusTextField.setBackground(Color.RED);
					dimensionError = true;
				}
				try {
					height = Integer.parseInt(heightTextField.getText());
					lessThanZeroException(" Height " , height);
				} catch (LessThanZeroException ex) {
					radiusTextField.setBackground(Color.YELLOW);
					dimensionError = true;
				} catch(InputMismatchException ex) {
					radiusTextField.setBackground(Color.RED);
					dimensionError = true;
				}catch (NumberFormatException ex) {
					radiusTextField.setBackground(Color.RED);
					dimensionError = true;
				}
				
			}
			if(!dimensionError) {
				createAndShowFigure();
			}else {
				errLabel.setVisible(true);
			}
			
		}//end processButton
	}//end actionPerformed
	private static void createAndShowFigure() {
		JFrame frame2 = new JFrame("Lab 06 GUI 02 Partial"); //Create a frame with nothing in it but the title
		
		if(shapeNumber == 1) {
			Rectangle demoRectangle = new Rectangle(width, length);
			frame2.setContentPane(demoRectangle.drawFigure());
		}else if(shapeNumber == 2) {
			Box demoBox = new Box(width,length,height);
			frame2.setContentPane(demoBox.drawFigure());
		}else if(shapeNumber == 3) {
			Circle demoCircle = new Circle(radius);
			frame2.setContentPane(demoCircle.drawFigure());
		}else if(shapeNumber == 4) {
			Cylinder demoCylinder = new Cylinder(radius,height);
			frame2.setContentPane(demoCylinder.drawFigure());
		}
		
		
		
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(700,700);
		frame2.setLocationRelativeTo(null);
		frame2.setVisible(true);
		}//end createAndShowFigure
	
	public static void lessThanOrEqualToZeroException(String myField, int myNumber)
			throws LessThanOrEqualToZeroException{
			if (myNumber <= 0)
				throw new LessThanOrEqualToZeroException(myField);
	}
	public static void lessThanZeroException(String myField, int myNumber)
			throws LessThanZeroException{
			if (myNumber < 0)
				throw new LessThanZeroException(myField);
	}

	public static void main(String[] args) {
		createAndShowGUI();
		
	
	}

}//end of class GUI_Lab1
