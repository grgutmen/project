package actions;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

import model.workspace.Workspace;
import gui.GlavniFrame;
import gui.Tree;
import model.workspace.Parameter;
import model.workspace.Project;

public class DeleteNode extends AbstractGEDAction{
	
	public DeleteNode() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		putValue(SMALL_ICON, loadIcon("images/filenew.png"));
		putValue(NAME, "Delete");
		putValue(SHORT_DESCRIPTION, "Delete");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Tree tree = GlavniFrame.getInstance().getTree();
		Object selected = tree.getLastSelectedPathComponent();
		Object[]  path = tree.getSelectionPath().getPath();
		if (((selected instanceof Workspace)) || (selected == null)) {
			return;
		}
		if (selected instanceof Project) {
			Project project = (Project) selected;
			Workspace parent = (Workspace) project.getParent();
			parent.deleteProject(project);
			
		}
		if (selected instanceof Parameter) {
			Parameter parameter = (Parameter) selected;
			Project parent = (Project) parameter.getParent();
			parent.deleteProject(parameter);
			
		}
		
	}
}
