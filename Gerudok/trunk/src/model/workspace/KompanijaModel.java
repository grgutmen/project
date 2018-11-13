package model.workspace;

import javax.swing.tree.DefaultTreeModel;

public class KompanijaModel extends DefaultTreeModel{
	
	public KompanijaModel() {
		super(new Kompanija());
		
	}
	
	public void dodajCvor(Project project) {
		
		((Kompanija)getRoot()).addProject(project);
	}

}
