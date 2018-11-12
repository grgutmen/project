package gui;

import javax.swing.tree.DefaultTreeCellRenderer;

import controller.WorkspaceTreeController;
import model.workspace.Project;
import model.workspace.WorkspaceModel;
import view.WorkspaceTreeCellRendered;
import view.WorkspaceTreeEditor;

import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreePath;

public class WorkSpaceTree extends JTree{
	
	public WorkSpaceTree() {
		addTreeSelectionListener(new WorkspaceTreeController());
	    setCellEditor(new WorkspaceTreeEditor(this,new DefaultTreeCellRenderer()));
	    setCellRenderer(new WorkspaceTreeCellRendered());
	    setEditable(true);
	}
	
	public void addProject(Project project){
		((WorkspaceModel)getModel()).addProject(project);
		SwingUtilities.updateComponentTreeUI(this);
	}

}
