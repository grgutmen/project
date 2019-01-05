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
	
	public Menu () {
		this.parent = parent;
		
		JMenu menuFile = new JMenu ("File");
		menuFile.setMnemonic(KeyEvent.VK_F);
		
		
		menuFile.add(GlavniFrame.getInstance().getActionManager().getOpenProjectAction());
		
		menuFile.addSeparator();
		
		menuFile.add(GlavniFrame.getInstance().getActionManager().getNewKompanijaAction());
		menuFile.add(GlavniFrame.getInstance().getActionManager().getNewProjectAction());
		
		menuFile.addSeparator();
		
		menuFile.add(GlavniFrame.getInstance().getActionManager().getSaveProjectAction());
		
		
		add(menuFile);
		
		JMenu window = new JMenu("Window");
		add(window);
		
		JMenu helpMenu = new JMenu("Help");
		
		helpMenu.add(GlavniFrame.getInstance().getActionManager().getAboutAction());
		add(helpMenu);
		
		
		
	}

}
