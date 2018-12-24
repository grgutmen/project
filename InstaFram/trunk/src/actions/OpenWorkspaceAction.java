package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFileChooser;
import javax.swing.KeyStroke;

import gui.GlavniFrame;

public class OpenWorkspaceAction extends AbstractGEDAction{
	
	public OpenWorkspaceAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O , ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/fileopen.png"));
		putValue(NAME, "Open project");
		putValue(SHORT_DESCRIPTION, "Open project");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		jfc.showOpenDialog(GlavniFrame.getInstance());
		
	}

}
