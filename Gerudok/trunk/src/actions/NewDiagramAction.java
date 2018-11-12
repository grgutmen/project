package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class NewDiagramAction extends AbstractGEDAction{
	
	public NewDiagramAction() {
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/filenew.png"));
		putValue(NAME, "New diagram");
		putValue(SHORT_DESCRIPTION, "New diagram");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
