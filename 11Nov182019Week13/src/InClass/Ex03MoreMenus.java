package InClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ex03MoreMenus extends JFrame{
	
	public Ex03MoreMenus() {
		initUI();
	}
	public final void initUI() {
		JMenuBar menuBar = new JMenuBar();
		ImageIcon iconNew =  new ImageIcon(getClass().getResource("new.png"));
		ImageIcon iconOpen =  new ImageIcon(getClass().getResource("open.png"));
		ImageIcon iconSave =  new ImageIcon(getClass().getResource("save.png"));
		ImageIcon iconExit =  new ImageIcon(getClass().getResource("exit.png"));
		
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		
		JMenu imp = new JMenu("Import");
		imp.setMnemonic(KeyEvent.VK_M);
		
		JMenuItem newsf = new JMenuItem("Import newsfeed list...");
		JMenuItem bookm = new JMenuItem("Import bookmarks...");
		JMenuItem mail = new JMenuItem("Import mail...");
		
		imp.add(newsf);
		imp.add(bookm);
		imp.add(mail);
		
		JMenuItem fileNew = new JMenuItem("New" , iconNew);
		fileNew.setMnemonic(KeyEvent.VK_N);
		
		JMenuItem fileOpen = new JMenuItem("Open" , iconOpen);
		fileOpen.setMnemonic(KeyEvent.VK_O);
		
		JMenuItem fileSave = new JMenuItem("Save" , iconSave);
		fileSave.setMnemonic(KeyEvent.VK_S);
		
		JMenuItem fileExit = new JMenuItem("Exit" , iconExit);
		fileExit.setMnemonic(KeyEvent.VK_C);
		fileExit.setToolTipText("Exit application");
		
		fileExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		file.add(fileNew);
		file.add(fileOpen);
		file.add(fileSave);
		file.addSeparator();
		file.add(imp);
		file.addSeparator();
		file.add(fileExit);
		
		menuBar.add(file);
		
		setJMenuBar(menuBar);
		setTitle("Submenu");
		setSize(360,250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

 	}
	public static void main(String[] args) {
		
		Ex03MoreMenus ex = new Ex03MoreMenus();
		ex.setVisible(true);

	}

}
