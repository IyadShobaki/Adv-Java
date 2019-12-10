package ME;
//I Shobaki
//Lab13 GUI4 Sliders
//Nov 21, 2019
import javax.swing.JFrame;

//Testing SliderFrame

public class SliderDemo {

	public static void main(String[] args) {
		System.out.println("Iyad Shobaki");
		System.out.println("Lab13 GUI4 Sliders");
		System.out.println("Nov 21, 2019");
		System.out.println();
		
		
		SliderFrame sliderFrame = new SliderFrame();
		sliderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sliderFrame.setSize(600, 600);
		sliderFrame.setVisible(true);
		sliderFrame.setLocationRelativeTo(null);
	}

}
