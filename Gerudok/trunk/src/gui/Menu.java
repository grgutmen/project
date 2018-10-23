package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar{
	private JFrame parent = null;
	
	public Menu (final JFrame parent) {
		this.parent = parent;
		
		JMenu menuFile = new JMenu ("File");
		menuFile.setMnemonic(KeyEvent.VK_F);
		
		JMenuItem menuNew = new JMenuItem("New");
		menuFile.add(menuNew);
		menuNew.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Klik");
				System.out.println("Source:" + e.getSource() + "," + e.getActionCommand());
				
			}
		});
		
		add(menuFile);
	}

}
