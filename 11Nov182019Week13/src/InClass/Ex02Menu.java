package InClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Ex02Menu extends JPanel{

	public Ex02Menu() {
		super();
		JFrame frame = new JFrame();
		JMenuBar menuBar = new JMenuBar();
		ImageIcon icon = new ImageIcon(getClass().getResource("exit.png"));
		
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		
		JMenuItem eMenuItem = new JMenuItem("Exit", icon);
		eMenuItem.setMnemonic(KeyEvent.VK_E);
		eMenuItem.setToolTipText("Exit application");
		
		eMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		file.add(eMenuItem);
		
		menuBar.add(file);
		
		frame.setJMenuBar(menuBar);
		frame.setTitle("Simple menu");
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}//end constructor
	public static void main(String[] args) {
		Ex02Menu ex = new Ex02Menu();
		ex.setVisible(true);
		
	}

}
