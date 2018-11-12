package model.workspace;

import javax.swing.tree.DefaultTreeModel;

public class KompanijaModel extends DefaultTreeModel{
	
	public KompanijaModel () {
		super(new Kompanija());
	}
	
	public void addWorkspace(Workspace workspace) {
		((Kompanija)getRoot()).addWorkspace(workspace);
	}

}
