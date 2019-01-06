package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import gui.GlavniFrame;
import model.workspace.Parameter;
import model.workspace.Project;

public class CutAction extends AbstractGEDAction{
	
	public CutAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
		        KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		putValue(MNEMONIC_KEY, KeyEvent.VK_T);
		putValue(SMALL_ICON, loadIcon("images/editcut.png"));
		putValue(NAME, "Cut");
		putValue(SHORT_DESCRIPTION, "Cut");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (GlavniFrame.getInstance().getTree().getLastSelectedPathComponent() != null && GlavniFrame.getInstance().getTree().getLastSelectedPathComponent() instanceof Parameter) {
			Parameter content = (Parameter) GlavniFrame.getInstance().getTree().getLastSelectedPathComponent();
			GlavniFrame.getInstance().getClipboard().setContents(content, GlavniFrame.getInstance());
			Project p = (Project) content.getParent();
			p.deleteProject((Parameter) GlavniFrame.getInstance().getTree().getLastSelectedPathComponent());
		}
		
	}

}
