package InClass;

import javax.swing.JFrame;

public class Ex009PatternApp {

	public static void main(String[] args) {
		Ex009GUIWindow theGUI = new Ex009GUIWindow();
		
		theGUI.setTitle("Recursive Patterns");
		theGUI.setSize(600,400);
		theGUI.setLocationRelativeTo(null);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theGUI.setVisible(true); //Make the window visible

	}

}
