package actions;

import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

import javax.swing.JFileChooser;
import javax.swing.KeyStroke;


import gui.GlavniFrame;



public class OpenWorkspaceAction extends AbstractGEDAction{
	
	public OpenWorkspaceAction () {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/fileopen.png"));
		putValue(NAME, "Open workspace");
		putValue(SHORT_DESCRIPTION, "Open workspace");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(GlavniFrame.getInstance());
		
	}

}
