package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import model.workspace.Project;
import model.workspace.Workspace;

public class NewWorkspaceAction extends AbstractGEDAction{
	
	public NewWorkspaceAction () {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/filenew.png"));
		putValue(NAME, "New workspace");
		putValue(SHORT_DESCRIPTION, "New workspace");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Workspace w = new Workspace();
		Project p = new Project(" ");
		w.addProject(p);
		
		
	}

}
