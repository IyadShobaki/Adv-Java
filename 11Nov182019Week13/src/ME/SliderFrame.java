package ME;
//I Shobaki
//Using JSliders to size an oval.

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class SliderFrame extends JFrame{
	
	private final JSlider diameterJSlider; //slider to select diameter
	private final OvalPanel myPanel; //panel to draw circle
	private JTextArea textArea; // display the statistics
	private JPopupMenu menu;//pop-up menu
	
	
	//no-argument constructor
	public SliderFrame() {
		super("Shapes Statistics");
		myPanel = new OvalPanel();//create panel to draw circle
		myPanel.setBackground(Color.gray);
		
		//set up JSlider to control diameter value
		diameterJSlider = new JSlider(SwingConstants.HORIZONTAL, 0,400,10);
		diameterJSlider.setMajorTickSpacing(10);//create tick every 10
		diameterJSlider.setPaintTicks(true); //paint ticks on slider

	
		textArea = new JTextArea();
		textArea.setFont(new Font("Serif", Font.PLAIN, 17));
		textArea.setText(String.format("%s: %.1f %s: %.1f %s: %.5f %s: %.5f",
				"Diameter", (double)myPanel.getDiameter(), 
				"Radius", (double) myPanel.getDiameter() * .5,
				"Circumference", (double) Math.PI * myPanel.getDiameter(),
				"Area",(double) Math.PI * (myPanel.getDiameter()*.5) * (myPanel.getDiameter()*.5)));
		
		menu = new JPopupMenu();
		JMenuItem circleMenuItem = new JMenuItem("Draw Circle");
		menu.add(circleMenuItem);
		circleMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.setShape(1);
				textArea.setText(String.format("%s: %.1f %s: %.1f %s: %.5f %s: %.5f",
						"Diameter", (double)myPanel.getDiameter(), 
						"Radius", (double) myPanel.getDiameter() * .5,
						"Circumference", (double) Math.PI * myPanel.getDiameter(),
						"Area",(double) Math.PI * (myPanel.getDiameter()*.5) * (myPanel.getDiameter()*.5)));
			}
		});
		JMenuItem squareMenuItem = new JMenuItem("Draw Square");
		squareMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.setShape(2);
				textArea.setText(String.format("%s: %.1f %s: %.1f %s: %.1f",
						"Width", (double)myPanel.getDiameter(), 
						"Height", (double) myPanel.getDiameter(),
						"Area",(double) myPanel.getDiameter() * myPanel.getDiameter()));
			}
		});
		menu.add(squareMenuItem);
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON3) {
					menu.show(e.getComponent(),e.getX(),e.getY());
				}
			}
		});
	
		//register JSlider event listener 
		diameterJSlider.addChangeListener(
				new ChangeListener() { //anonymous inner class
					
					//handle change in slider value
					@Override
					public void stateChanged(ChangeEvent e) {
						myPanel.setDiameter(diameterJSlider.getValue());
						if(myPanel.getShape() == 1) {
							textArea.setText(String.format("%s: %.1f %s: %.1f %s: %.5f %s: %.5f",
									"Diameter", (double)myPanel.getDiameter(), 
									"Radius", (double) myPanel.getDiameter() * .5,
									"Circumference", (double) Math.PI * myPanel.getDiameter(),
									"Area",(double) Math.PI * (myPanel.getDiameter()*.5) * (myPanel.getDiameter()*.5)));
						}else if(myPanel.getShape() == 2) {
							textArea.setText(String.format("%s: %.1f %s: %.1f %s: %.1f",
									"Width", (double)myPanel.getDiameter(), 
									"Height", (double) myPanel.getDiameter(),
									"Area",(double) myPanel.getDiameter() * myPanel.getDiameter()));
						}
						
						//myPanel.setCircleColor(diameterJSlider.getValue(), diameterJSlider.getValue(), diameterJSlider.getValue());
						myPanel.setCircleColor();
					}
				}
			);
		
		
		add(diameterJSlider, BorderLayout.SOUTH);
		add(myPanel,BorderLayout.CENTER);
		add(textArea, BorderLayout.NORTH);
		
	}
	
}//end class SliderFrame
