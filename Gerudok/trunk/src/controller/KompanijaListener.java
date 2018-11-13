package controller;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

import model.workspace.Project;

public class KompanijaListener implements TreeSelectionListener{
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		// TODO Auto-generated method stub
		TreePath path = e.getPath();
		for (int i=0;i<path.getPathCount();i++) {
			if (path.getPathComponent(i) instanceof Project) {
				Project p = (Project) path.getPathComponent(i);
				System.out.println("Selected project: " + p );
				System.out.println("getPath: "+e.getPath());
				System.out.println("getPath: "+e.getNewLeadSelectionPath());
				break;
			}
		}
	}

}
