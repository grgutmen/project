package gui;

import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultTreeCellRenderer;

import controller.KompanijaListener;
import model.workspace.KompanijaModel;
import model.workspace.Project;
import view.CellEditor;
import view.CellRenderer;

public class KompanijaTree extends JTree{
	
	public KompanijaTree() {
		addTreeSelectionListener(new KompanijaListener());
		setCellEditor(new CellEditor(this, new DefaultTreeCellRenderer()));
		setCellRenderer(new CellRenderer());
		setEditable(true);
	}
	
	public void addProject(Project project) {
		((KompanijaModel)getModel()).dodajCvor(project);
		SwingUtilities.updateComponentTreeUI(this);
	}

}
