package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;

import gui.GlavniFrame;
import model.workspace.Project;
import model.workspace.Parameter;
import model.workspace.Workspace;

public class NewProjectAction extends AbstractGEDAction{
	public NewProjectAction() {
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/filenew.png"));
		putValue(NAME, "New project");
		putValue(SHORT_DESCRIPTION, "New project");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JTree tree = GlavniFrame.getInstance().getTree();
		TreePath path = tree.getSelectionPath();
		tree.expandPath(path);
		Project project = new Project();
		((Workspace) tree.getModel().getRoot()).addProject(project);
		SwingUtilities.updateComponentTreeUI(tree);
		
	}
	

}
