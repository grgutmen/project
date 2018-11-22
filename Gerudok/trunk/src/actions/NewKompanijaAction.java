package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;

import gui.GlavniFrame;
import model.workspace.Kompanija;
import model.workspace.Project;
import model.workspace.Workspace;

public class NewKompanijaAction extends AbstractGEDAction{
	public NewKompanijaAction() {
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/filenew.png"));
		putValue(NAME, "New kompanija");
		putValue(SHORT_DESCRIPTION, "New kompanija");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JTree tree = GlavniFrame.getInstance().getTree();
		TreePath path = tree.getSelectionPath();
		tree.expandPath(path);
		Kompanija kompanija = new Kompanija();
		((Workspace) tree.getModel().getRoot()).addKompanija(kompanija);
		SwingUtilities.updateComponentTreeUI(tree);
		
	}
	

}
