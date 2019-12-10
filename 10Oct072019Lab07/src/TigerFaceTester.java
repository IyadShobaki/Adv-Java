//I Shobaki
//Lab07 GUI 3, Simple Drawing
//Oct 07, 2019



import javax.swing.JFrame;



public class TigerFaceTester {
	
	//Exexcute frame
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("A Drawing Primer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TigerFace myDemoJPanel = new TigerFace();
		
		frame.add(myDemoJPanel);
		frame.setSize(800, 700);
		frame.setLocation(120,17);
		frame.setVisible(true);
		

	}
       
}

