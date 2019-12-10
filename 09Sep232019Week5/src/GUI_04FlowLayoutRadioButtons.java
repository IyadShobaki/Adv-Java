import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class GUI_04FlowLayoutRadioButtons extends JFrame {

	public GUI_04FlowLayoutRadioButtons() {
		setTitle("FlowLayout Example #1");
		setSize(360,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setSize(200,175);
		
		JRadioButton rb1 = new JRadioButton("Radio Button 1");
		rb1.setSize(70,20);
		
		JRadioButton rb2 = new JRadioButton("Radio Button 2");
		rb2.setSize(70,20);
		
		JRadioButton rb3 = new JRadioButton("Radio Button 3");
		rb3.setSize(70,20);
		
		JRadioButton rb4 = new JRadioButton("Radio Button 4");
		rb4.setSize(70,20);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rb1);
		group.add(rb2);
		group.add(rb3);
		group.add(rb4);
		
		panel.add(rb1);
		panel.add(rb2);
		panel.add(rb3);
		panel.add(rb4);
		
		JRadioButton radioArray[] = new JRadioButton[10];
		for (int index = 0; index < radioArray.length; index++) {
			radioArray[index] = new JRadioButton("x" + index);
			group.add(radioArray[index]);
		}
		for (JRadioButton rb : radioArray)
			panel.add(rb);
		
		add(panel);
		

	}
	public static void main(String[] args) {
		
		GUI_04FlowLayoutRadioButtons ex = new GUI_04FlowLayoutRadioButtons();
		ex.setVisible(true);

	}

}
