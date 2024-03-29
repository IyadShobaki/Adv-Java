//Demonstrating menus



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

public class MenuFrame extends JFrame {
	
	private final Color[] colorValues = {Color.black, Color.blue, Color.red,Color.green};
	private final JRadioButtonMenuItem[] colorItems; //color menu items
	private final JRadioButtonMenuItem[] fonts; //font menu item
	private final JCheckBoxMenuItem[] styleItems; //font style menu items
	private final JLabel displayJLabel; //displays sample text
	private final ButtonGroup fontButtonGroup; //manages font menu items
	private final ButtonGroup colorButtonGroup; //manages color menu items
	private int style; //used to create style for font
	
	//no-argument constructor 
	public MenuFrame() {
		super("Using JMenu");
		
		JMenu fileMenu = new JMenu("File");//create file menu
		fileMenu.setMnemonic('F');//set mnemonic to F
		
		JMenuItem aboutItem = new JMenuItem("About...");//create About... menu item
		aboutItem.setMnemonic('A');//set mnemonic to A
		fileMenu.add(aboutItem); //add about item to file menu
		aboutItem.addActionListener(
				new ActionListener() { //anonymous inner class
					
					//display message dialog when user selects About...
					@Override
					public void actionPerformed(ActionEvent event) {
						JOptionPane.showMessageDialog(MenuFrame.this, "This is an example\nof using menus","About", JOptionPane.PLAIN_MESSAGE);
						
					}
				}
			);
		
		JMenuItem exitItem = new JMenuItem("Exit");//create exit menu item
		exitItem.setMnemonic('x');//set mnemonic to x
		fileMenu.add(exitItem); //add exit item to file menu
		exitItem.addActionListener(
				new ActionListener() { //anonymous inner class
					
					//terminate application when user clicks exitItem
					@Override
					public void actionPerformed(ActionEvent event) {
						System.exit(0); //exit application
					}
				}
			);
		
		JMenuBar bar = new JMenuBar(); //create menu bar
		setJMenuBar(bar); //add menu bar to application
		bar.add(fileMenu); //add file menu to menu bar
		
		JMenu formatMenu = new JMenu("Format");//create format menu
		formatMenu.setMnemonic('r');//set mnemonic to r
		
		//array listing string colors
		String[] colors = {"Black", "Blue", "Red" , "Green"};
		
		JMenu colorMenu = new JMenu("Color");//create color menu
		colorMenu.setMnemonic('C');//set mnemonic to C
		
		//create radio button menu items for colors
		colorItems = new JRadioButtonMenuItem[colors.length];
		colorButtonGroup = new ButtonGroup(); //manages colors
		ItemHandler itemHandler = new ItemHandler(); //handler the colors
		
		//create color radio button menu items
		for(int count = 0; count < colors.length; count++) {
			colorItems[count] = new JRadioButtonMenuItem(colors[count]); //create item
			colorMenu.add(colorItems[count]); //add item to color menu
			colorButtonGroup.add(colorItems[count]); //add to group
			colorItems[count].addActionListener(itemHandler);
		}
		
		colorItems[0].setSelected(true); // select first color item
		
		formatMenu.add(colorMenu); //add color menu to format menu
		formatMenu.addSeparator();//add separator in menu
		
		//array listing font menu
		String[] fontNames = {"Serif", "Mononspaced","SansSerif"};
		JMenu fontMenu = new JMenu("Font");//create font menu
		fontMenu.setMnemonic('n'); //set mnemonic to n
		
		//create radio button menu items for font names
		fonts = new JRadioButtonMenuItem[fontNames.length];
		fontButtonGroup  = new ButtonGroup(); //manages font names
		
		//create Font radio button menu items
		for(int count = 0; count < fonts.length; count++) {
			fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
			fontMenu.add(fonts[count]); //add font to font menu
			fontButtonGroup.add(fonts[count]); //add to button group
			fonts[count].addActionListener(itemHandler);//add handler
			
			
		}
		fonts[0].setSelected(true);//select first Font menu item
		fontMenu.addSeparator();//add separtor bar to font menu
		
		String[] styleNames = {"Bold", "Italic"};//names of styles
		styleItems = new JCheckBoxMenuItem[styleNames.length];
		StyleHandler styleHandler = new StyleHandler();//style handler
		
		//create style checkbox menu items
		for(int count =0; count < styleNames.length; count++) {
			styleItems[count] = new JCheckBoxMenuItem(styleNames[count]);//for style
			fontMenu.add(styleItems[count]);//add to font menu
			styleItems[count].addItemListener(styleHandler);
			
		}
		
		formatMenu.add(fontMenu);//add Font menu to format menu
		bar.add(formatMenu);//add format menu to menu bar
		
		//set up label to display text
		displayJLabel = new JLabel("Sample Text", SwingConstants.CENTER);
		displayJLabel.setForeground(colorValues[0]);
		displayJLabel.setFont(new Font("Serif", Font.PLAIN, 72));
		
		getContentPane().setBackground(Color.CYAN);//set background
		add(displayJLabel, BorderLayout.CENTER);//add displayJLabel
	}//end MenuFrame constructor
	
	//inner class to handle action events from menu items
	private class ItemHandler implements ActionListener
	{
		//process color and font selections
		@Override
		public void actionPerformed(ActionEvent event) {
			//process color selection
			for (int count =0; count < colorItems.length; count++) {
				if(colorItems[count].isSelected()) {
					displayJLabel.setForeground(colorValues[count]);
					break;
				}
			}
			
			//process font selection
			for (int count =0; count < fonts.length; count++) {
				if(event.getSource() == fonts[count]) {
					displayJLabel.setFont(new Font(fonts[count].getText(), style, 72));
				}
			}
			
			repaint(); //redraw application
		}
	}//end class ItemHandler
	
	//inner class to handle item events from checkbox menu items
		private class StyleHandler implements ItemListener
		{
			//process font style selections
			@Override
			public void itemStateChanged(ItemEvent e) {
				String name = displayJLabel.getFont().getName(); //current Font
				Font font;// new font based on user selection
				
				//determine which items are checked and create Font
				if(styleItems[0].isSelected() && styleItems[1].isSelected())
					font = new Font(name, Font.BOLD + Font.ITALIC, 72);
				else if(styleItems[0].isSelected())
					font = new Font(name, Font.BOLD, 72);
				else if(styleItems[1].isSelected())
					font = new Font(name, Font.ITALIC, 72);
				else
					font = new Font(name, Font.PLAIN, 72);
				
				
				displayJLabel.setFont(font);
				repaint(); //redraw application
			}
		}//end class StyleHandler
}//end class MenuFrame
