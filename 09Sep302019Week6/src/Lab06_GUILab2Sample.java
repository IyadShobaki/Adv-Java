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


//create and show GUI

public class Lab06_GUILab2Sample extends JFrame implements ActionListener{
	JPanel infoPanel;
	private JLabel lengthLabel;
	private JLabel widthLabel;
	private JLabel errLabel;
	
	private JTextField widthField;
	private JTextField lengthField;
	
	private JButton processButton;
	private JRadioButton rectangleButton, circleButton;
	
	static private int width;
	static private int length;
	private boolean dimensionError;
	
	JPanel widthPanel, lengthPanel;
	
	public JPanel createContentPane() {
		Font titleFont = new Font("Verdana", Font.BOLD, 26);
		
		JLabel myTitleLabel = new JLabel();
		myTitleLabel.setSize(350,100);
		myTitleLabel.setText("The Figure Center");
		myTitleLabel.setFont(titleFont);
		myTitleLabel.setLocation(100,0);
		
		infoPanel = new JPanel();
		infoPanel.setLayout(null);
		
		processButton = new JButton("Process");
		processButton.setSize(100,30);
		processButton.setLocation(300,190);
		processButton.addActionListener(this);
		
		widthLabel = new JLabel("Enter Width");
		widthLabel.setSize(100,15);
		widthLabel.setLocation(5,0);
		widthField = new JTextField();
		widthField.setSize(70,20);
		widthField.setText("");
		widthField.setLocation(5,20);
		widthPanel = new JPanel();
		//JPanel widthPanel = new JPanel(); makes it local
		widthPanel.setLayout(null);
		widthPanel.setSize(125,40);
		widthPanel.setLocation(150,70);
		widthPanel.add(widthLabel);
		widthPanel.add(widthField);
		widthPanel.setVisible(false);
		
		lengthLabel = new JLabel("Enter Length");
		lengthLabel.setSize(100,15);
		lengthLabel.setLocation(5,0);
		lengthField = new JTextField();
		lengthField.setSize(70,20);
		lengthField.setText("");
		lengthField.setLocation(5,20);
		lengthPanel = new JPanel();
		lengthPanel.setLayout(null);
		lengthPanel.setSize(125,40);
		lengthPanel.setLocation(300,70);
		lengthPanel.add(lengthLabel);
		lengthPanel.add(lengthField);
		lengthPanel.setVisible(false);
		
		errLabel = new JLabel("DIMENSION ERROR>>>CAN NOT RENDER DRAWING");
		errLabel.setSize(300,30);
		errLabel.setLocation(15,0);
		errLabel.setOpaque(true);
		errLabel.setBackground(Color.RED);
		errLabel.setVisible(false);
		
		rectangleButton = new JRadioButton("Rectangle");
		rectangleButton.setSize(90,20);
		rectangleButton.setLocation(100,200);
		rectangleButton.addActionListener(this);
		
		circleButton = new JRadioButton("Circle");
		circleButton.setSize(90,20);
		circleButton.setLocation(200,200);
		circleButton.addActionListener(this);
		
		ButtonGroup figureGroup = new ButtonGroup();
		figureGroup.add(circleButton);
		figureGroup.add(rectangleButton);
		
		infoPanel.add(errLabel);
		infoPanel.add(widthPanel);
		infoPanel.add(lengthPanel);
		infoPanel.add(myTitleLabel);
		
		infoPanel.add(rectangleButton);
		infoPanel.add(circleButton);
		infoPanel.add(processButton);
		return infoPanel;
	}
	
	public static void createAndShowGUI() {
		JFrame frame = new JFrame("Lab 07 GUI 02"); // Create a frame with nothing in it but the title
		
		Lab06_GUILab2Sample demo = new Lab06_GUILab2Sample(); //call the default constructor for this class
		frame.setContentPane(demo.createContentPane());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}//end createAndShowGUI
	
	public void actionPerformed(ActionEvent e) {
		dimensionError = true;
		errLabel.setVisible(false);
		
		if(rectangleButton.isSelected()) {
			System.out.println("IN AP");
			lengthPanel.setVisible(true);
			widthPanel.setVisible(true);
			
		}
		if(e.getSource() == processButton) {
			//System.out.println("IN AP");
			if(rectangleButton.isSelected()) {
				dimensionError = false;
				try {
					width = Integer.parseInt(widthField.getText());
					lessThanOrEqualToZeroException(" Width " , width);
				} catch (LessThanOrEqualToZeroException ex) {
					widthField.setBackground(Color.YELLOW);
					dimensionError = true;
				} catch(InputMismatchException ex) {
					widthField.setBackground(Color.RED);
					dimensionError = true;
				}catch (NumberFormatException ex) {
					widthField.setBackground(Color.RED);
					dimensionError = true;
				}
				try {
					length = Integer.parseInt(lengthField.getText());
					lessThanOrEqualToZeroException(" Length " , length);
				} catch (LessThanOrEqualToZeroException ex) {
					lengthField.setBackground(Color.YELLOW);
					dimensionError = true;
				}catch (InputMismatchException ex) {
					lengthField.setBackground(Color.RED);
					dimensionError= true;
				}catch (NumberFormatException ex) {
					dimensionError =true;
					lengthField.setBackground(Color.RED);
				}
			}// end rectangleButton
			
			if(circleButton.isSelected()) {
				//your code goes here
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
		
		Rectangle2 demo2 = new Rectangle2(100,200, width, length);
		frame2.setContentPane(demo2.drawFigure());
		
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
			if (myNumber <= 0)
				throw new LessThanZeroException(myField);
	}
	public static void main(String[] args) {
		createAndShowGUI();
	}
					
}//end of class GUILab2Solution
