package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.Serializable;

import javax.swing.KeyStroke;

import gui.GlavniFrame;
import model.workspace.Parameter;
import model.workspace.Project;

public class CommandRedoAction extends AbstractGEDAction implements Serializable{
	
	private Project project;
	
	public CommandRedoAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/handc.png"));
		putValue(NAME, "Redo");
		putValue(SHORT_DESCRIPTION, "Redo");
	}
	
@Override
	public void actionPerformed(ActionEvent e) {
		if (project == null) {
			project = (Project) GlavniFrame.getInstance().getTree().getLastSelectedPathComponent();
		}
		project.getCommandManager().doCommand();
	}

}
