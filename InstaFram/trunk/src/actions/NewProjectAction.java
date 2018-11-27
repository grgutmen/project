package actions;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;


import gui.GlavniFrame;
import model.workspace.Kompanija;
import model.workspace.Project;

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
		Object selected = tree.getLastSelectedPathComponent();
		TreePath path = tree.getSelectionPath();
		if (selected instanceof Kompanija) {
			tree.expandPath(path);
			Kompanija kompanija = (Kompanija) selected;
			Project project = new Project();
			kompanija.addProject(project);
			kompanija.insert(project, kompanija.getProjects().size()+1);
			SwingUtilities.updateComponentTreeUI(tree);
			GlavniFrame.getInstance().getTextArea();
			
		}
		
		
		
	
	}

}
