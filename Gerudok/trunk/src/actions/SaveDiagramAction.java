package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFileChooser;
import javax.swing.KeyStroke;

import gui.GlavniFrame;



public class SaveDiagramAction extends AbstractGEDAction{
	
	
	public SaveDiagramAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
		        KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/filesave.png"));
		putValue(NAME, "Save diagram");
		putValue(SHORT_DESCRIPTION, "Save diagram");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(GlavniFrame.getInstance());
		
	}

}
