package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import gui.GlavniFrame;
import model.workspace.Parameter;

public class CopyAction extends AbstractGEDAction{
	
	public CopyAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
		        KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		putValue(MNEMONIC_KEY, KeyEvent.VK_C);
		putValue(SMALL_ICON, loadIcon("images/editcopy.png"));
		putValue(NAME, "Copy");
		putValue(SHORT_DESCRIPTION, "Copy");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (GlavniFrame.getInstance().getTree().getLastSelectedPathComponent() != null && GlavniFrame.getInstance().getTree().getLastSelectedPathComponent() instanceof Parameter) {
			Parameter content = (Parameter) GlavniFrame.getInstance().getTree().getLastSelectedPathComponent();
			GlavniFrame.getInstance().getClipboard().setContents(content, GlavniFrame.getInstance());
		}
		
	}

}
