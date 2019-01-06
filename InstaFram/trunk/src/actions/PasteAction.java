package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import gui.GlavniFrame;
import model.workspace.Project;

public class PasteAction extends AbstractGEDAction{
	
	public PasteAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
		        KeyEvent.VK_V, ActionEvent.CTRL_MASK));
		putValue(MNEMONIC_KEY, KeyEvent.VK_P);
		putValue(SMALL_ICON, loadIcon("images/editpaste.png"));
		putValue(NAME, "Paste");
		putValue(SHORT_DESCRIPTION, "Paste");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (GlavniFrame.getInstance().getTree().getLastSelectedPathComponent() instanceof Project) {
			Project p = (Project) GlavniFrame.getInstance().getTree().getLastSelectedPathComponent();
			p.paste();
		}
		
	}

}
