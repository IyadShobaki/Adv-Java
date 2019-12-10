import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class FibonacciNumbers extends JFrame{
	
	//components for calculating the Fibonacci of a user-entered number
	private final JPanel workerJPanel = new JPanel(new GridLayout(2,2,5,5));
	private final JTextField numberJTextField = new JTextField();
	private final JButton goJButton = new JButton("Go");
	private final JLabel fibonacciJLabel = new JLabel();
	
	//components and variables for getting the next Fibonacci number
	private final JPanel eventThreadJPanel = new JPanel(new GridLayout(2,2,5,5));
	private long n1 = 0; //initializing with first Fibonacci number
	private long n2 = 1; //initializing with second Fibonacci number
	private int count = 1; //current Fibonacci number to display
	private final JLabel nJLabel = new JLabel("Fibonacci of 1: ");
	private final JLabel nFibonacciJLabel = new JLabel(String.valueOf(n2));
	private final JButton nextNumberJButton = new JButton("Next Number");
	
	public FibonacciNumbers() {
		super("Fibonacci Numbers");
		setLayout(new GridLayout(2,1,10,10));
		
		//add GUI components to the SwingWorker panel
		workerJPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "With SwingWorker"));
		workerJPanel.add(numberJTextField);
		goJButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int n;
				try {
					//retrieve user's input as an integer
					n = Integer.parseInt(numberJTextField.getText());
				} catch (NumberFormatException ex) {
					// TODO: handle exception
					//display an error message if the user did not 
					//enter an integer
					fibonacciJLabel.setText("Enter an integer.");
					return;
				}
				fibonacciJLabel.setText("Calculating...");
				
				//create a task to perform calculating in background
				BackgroundCalculator task = new BackgroundCalculator(n, fibonacciJLabel);
				task.execute(); // execute the task
			}
		}//end anonymous inner class
	);//end call to AddActionListener
		workerJPanel.add(goJButton);
		workerJPanel.add(fibonacciJLabel);
		
		//add GUI components to the event-dispatching thread panel
		eventThreadJPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Without SwingWorker"));
		eventThreadJPanel.add(nJLabel);
		eventThreadJPanel.add(nFibonacciJLabel);
		nextNumberJButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// calculate the Fibonacci number after n2
				long temp = n1 + n2;
				n1 = n2;
				n2 = temp;
				++count;
				
				//display the next Fibonacci number
				nJLabel.setText(String.valueOf(n2));
				
				
			}
		}//end anonymous inner class
	);//end call to AddActionListener
		eventThreadJPanel.add(nextNumberJButton);
		add(workerJPanel);
		add(eventThreadJPanel);
		setSize(275,200);
		setVisible(true);
 }//end constructor
	
	public static void main(String[] args) {
		
		FibonacciNumbers application = new FibonacciNumbers();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}//end class FibonacciNumbers
