//Demonstrating GridBagLayout constants
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;

public class GridBagFrame2 extends JFrame{
	private final GridBagLayout layout; //layout of this frame
	private final GridBagConstraints constraints; //layout's constraints
	
	//set up GUI
	public GridBagFrame2()
	{
		super("GridBagFrame");
		layout = new GridBagLayout();
		setLayout(layout); //set frame layout
		constraints = new GridBagConstraints(); //instantiate constraints
		
		//create GUI components
		String[] metals = {"Copper", "Aluminum", "Silver"};
		JComboBox comboBox = new JComboBox(metals);
		
		JTextField textField = new JTextField("TextField");
		
		String[] fonts = {"Serif", "Monospaced"};
		JList list = new JList(fonts);
		
		String[] names = {"zero", "one","two", "three","four"};
		JButton[] buttons = new JButton[names.length];
		
		for(int count = 0; count < buttons.length; count++) {
			buttons[count] = new JButton(names[count]);
		}
		
		//define GUI component constraints for textField
		constraints.weightx = 1;
		constraints.weighty =1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(textField);
		
		//button[0] -- weightx and weighty are 1: fill is BOTH
		constraints.gridwidth = 1;
		addComponent(buttons[0]);
		
		//button[1] -- weightx and weighty are 1: fill is BOTH
		constraints.gridwidth = GridBagConstraints.RELATIVE;
		addComponent(buttons[1]);
		
		//button[2] -- weightx and weighty are 1: fill is BOTH
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(buttons[2]);
		
		//comboBox -- weightx is 1: fill is BOTH
		constraints.weighty = 0;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(comboBox);
		
		//button[3] -- weightx is 1: fill is BOTH
		constraints.weighty =1;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(buttons[3]);
		
		//button[4] -- weightx and weighty are 1: fill is BOTH	
		constraints.gridwidth = GridBagConstraints.RELATIVE;
		addComponent(buttons[4]);
				
		//list -- weightx and weighty are 1: fill is BOTH	
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(list);
							
 	}//end GridBagFrame2 constructor
	
	//add a component to the container
	private void addComponent(Component component)
	{
		layout.setConstraints(component, constraints);
		add(component); //add component
	}
}//end class GridBagFrame2
