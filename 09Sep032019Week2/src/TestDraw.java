import javax.swing.JFrame;

public class TestDraw {

	public static void main(String[] args) {
		
		JFrame application = new JFrame("Modern Art");
		
		DrawPanel02 panel = new DrawPanel02();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(500,500);
		application.setLocationRelativeTo(null);
		application.setVisible(true);

	}

}
