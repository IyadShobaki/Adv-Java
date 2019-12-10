
package InClass;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//create a Slider controlled Temperature Conversion Control
//uses the M(odel)-V(iew) - C(ontroller) Model (MVC)

public class TemperatureConversion02 extends JPanel implements ActionListener,ChangeListener{

	//>>>>>>> The model <<<<<<<<<<<
	private Thermometer thermo = new Thermometer();
	
	//>>>>>>> The view <<<<<<<
	private JLabel fahrLabel = new JLabel("Degrees Fahrenheit");
	private JLabel celsiusLabel = new JLabel("Degrees Celsius");
	private JTextField fahrField = new JTextField("32.0");
	private JTextField celsiusField = new JTextField("0.0");
	private JSlider slider = new JSlider(SwingConstants.HORIZONTAL, -400,400,32);
	
	public JPanel createContentPane() {
		JPanel dataPanel = new JPanel(new GridLayout(2,2,12,6));
		dataPanel.add(fahrLabel);
		dataPanel.add(celsiusLabel);
		dataPanel.add(fahrField);
		dataPanel.add(celsiusField);
		
		slider.setMajorTickSpacing(50);
		slider.setPaintTicks(true);
		
		JPanel sliderPanel = new JPanel();
		sliderPanel.add(slider);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(dataPanel,BorderLayout.CENTER);
		mainPanel.add(sliderPanel, BorderLayout.SOUTH);
		
		slider.addChangeListener(this);
		fahrField.addActionListener(this);
		celsiusField.addActionListener(this);
		return mainPanel;
	}//end createContentPane   end view
	
	//>>>>>>>> The controller <<<<<<<<
	
	public void stateChanged(ChangeEvent e) {
		int fahr = slider.getValue();                       //obtain slider's value
		fahrField.setText("" + fahr);                       //output Fahrenheit value
		thermo.setFahrenheit(fahr);                         //reset thermometer
		double celsius = thermo.getCelsius();               //obtain celsius value
		String str = String.format("%.2f", celsius);        //format to 2 places
		celsiusField.setText(str);
		
	}//end stateChanged
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == fahrField) {
			int fahr = Integer.parseInt(fahrField.getText());                     
			thermo.setFahrenheit(fahr);                         //reset thermometer
			double celsius = thermo.getCelsius();               //obtain celsius value
			String str = String.format("%.2f", celsius);        //format to 2 places
			celsiusField.setText(str);
			slider.setValue(fahr);
		}else if(e.getSource() == celsiusField) {
			//can you set this up?
		}
	}
	//>>>>>>>>>>>>The client <<<<<<<<<<
	public static void main(String[] args) {
		TemperatureConversion02 ConversionView = new TemperatureConversion02();
		JFrame application = new JFrame();
		application.setTitle("Fahrenheit to Celsius Converter");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setContentPane(ConversionView.createContentPane());
		application.setLocation(200, 50);
		application.pack(); //minimize the size of all components
		application.setVisible(true);
	}//end main
	
}//end TemperatureConversion01 class
