package InClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class Ex01PopupMenu extends JFrame{
	private JPopupMenu menu;
	private Toolkit toolkit;
	
	public Ex01PopupMenu(String title) {
		super("title");
		this.initUI();
	}
	private void initUI() {
		toolkit = this.getToolkit();
		
		menu = new JPopupMenu();
		JMenuItem menuItemBeep = new JMenuItem("Beep");
		
		menuItemBeep.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				toolkit.beep();
				
			}//end AP
		});//end Anonymous inner class
		
		menu.add(menuItemBeep);
		
		JMenuItem menuItemClose = new JMenuItem("Close");
		menuItemClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		menu.add(menuItemClose);
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON3) {
					menu.show(e.getComponent(), e.getX(),e.getY());
				}
			}
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(250,200);
		this.setLocationRelativeTo(null);
	}//end initUI
	
	public static void main(String[] args) {
		Ex01PopupMenu popup = new Ex01PopupMenu("JPopupMenu");
		popup.setVisible(true);
	}
}
