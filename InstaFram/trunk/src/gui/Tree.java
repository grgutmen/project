package gui;

import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;

import model.workspace.Project;
import model.workspace.Workspace;
import view.CellEditor;
import view.CellRenderer;

public class Tree extends JTree implements TreeSelectionListener{
	
	public Tree () {
		addTreeSelectionListener(this);
		setCellEditor(new CellEditor(this, new DefaultTreeCellRenderer()));
		setCellRenderer(new CellRenderer());
		setEditable(true);
		
		
	}
	
	public void addProject(Project project){
		((Workspace)getModel()).addProject(project);
		SwingUtilities.updateComponentTreeUI(this);
	}
	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public Project getCurrentProject () {
		TreePath path = getSelectionPath();
		for(int i=0; i<path.getPathCount(); i++){
			if(path.getPathComponent(i) instanceof Project){
				return (Project)path.getPathComponent(i);
			}
		}
		return null;
	}

}
