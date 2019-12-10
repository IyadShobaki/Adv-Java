package InClass;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex009GUIWindow extends JFrame{
	
	//create a slider with horizontal orientation, minimum value of 0,
	//maximum value of 10, and initially selected value of 0
	private JSlider slider = new JSlider(SwingConstants.HORIZONTAL, 0, 10,0);
	private Ex009ColorPanel panel = new Ex009ColorPanel(Color.white);
	//Track the current value of the slider for state changes
	private int level =0;
	public Ex009GUIWindow() {
		//Add ticks to the slider and show them
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		JPanel sliderPanel = new JPanel();
		sliderPanel.add(slider);
		Container container = getContentPane();
		container.add(panel, BorderLayout.CENTER);
		container.add(sliderPanel, BorderLayout.SOUTH);
		//Attach a listener to the slider
		slider.addChangeListener(new SliderListener());
	}
	//>>>>>> The controller <<<<<<<<
	private class SliderListener implements ChangeListener{
		public void stateChanged(ChangeEvent e) {
			int value = slider.getValue();//obtain slider's value
			if(value != level) { //check for change in value
				level = value; //reset level if changed
				panel.setLevel(level); //Draw a new panel
				
			}//end if
		}//end stateChanged
	}//end SliderListener
	
}//end class
