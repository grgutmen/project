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
import model.workspace.Project;
import model.workspace.Parameter;

public class NewParameterAction extends AbstractGEDAction{
	
	public NewParameterAction() {
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
		if (selected instanceof Project) {
			tree.expandPath(path);
			Project project = (Project) selected;
			Parameter parameter = new Parameter();
			project.addParameter(parameter);
			project.insert(parameter, project.getProjects().size()+1);
			SwingUtilities.updateComponentTreeUI(tree);
			GlavniFrame.getInstance().getTextArea();
			
		}
		
		
		
	
	}

}
