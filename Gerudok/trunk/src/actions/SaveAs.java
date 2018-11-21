package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class SaveAs extends AbstractGEDAction{
	
	public SaveAs() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F1, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/filesave.png"));
		putValue(NAME, "SaveAs");
		putValue(SHORT_DESCRIPTION, "Save as");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
