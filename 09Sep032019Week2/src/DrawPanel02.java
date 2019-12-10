import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import java.util.Scanner;

@SuppressWarnings("serial")
public class DrawPanel02 extends JPanel {
	private Random randomNumbers = new Random();
	Scanner myScanner = new Scanner(System.in);
	
	private MyLine[] lines; // array of lines
	
	//constructor, creates a panel with random shapes
	public DrawPanel02() {
		setBackground(Color.white);
		
		System.out.println("Please enter the number of lines you want to draw.\n");
		try {
			int nbrOfLines = myScanner.nextInt();
			lines = new MyLine[nbrOfLines];
		}
		catch (Exception ex) {
			System.out.println("Sorry...you did not enter an integer..." + ex);
			System.exit(-1);
		}
		//create lines
		for (int count = 0; count < lines.length; count++) {
			//generate random coordinates
			int x1 = randomNumbers.nextInt(480);
			int y1 = randomNumbers.nextInt(480);
			int x2 = randomNumbers.nextInt(480);
			int y2 = randomNumbers.nextInt(480);
			
			//generate a random color
			Color color = new Color(randomNumbers.nextInt(256),
					randomNumbers.nextInt(256), randomNumbers.nextInt(256));
			
			//add the line to the array of lines to be displayed
			lines[count] = new MyLine(x1,y2,x2,y1, color);
		}//end for
	}//end DrawPanel constructor
	
	//for each shape array, draw the individual shapes
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//draw the lines
		for (MyLine line : lines)
			line.draw(g);
	}//end method paintComponent
	
}//end class DrawPanel
