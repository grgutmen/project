package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import actions.ActionManager;

public class Toolbar extends JToolBar{
	public Toolbar () {
		super(JToolBar.HORIZONTAL);
		setFloatable(false);
		
		add(GlavniFrame.getInstance().getActionManager().getNewKompanijaAction());
		
		add(GlavniFrame.getInstance().getActionManager().getNewProjectAction());
		
		add(GlavniFrame.getInstance().getActionManager().getOpenProjectAction());
		
		add(GlavniFrame.getInstance().getActionManager().getSaveProjectAction());
		
		add(GlavniFrame.getInstance().getActionManager().getSaveAs());
		
		
	}

}
