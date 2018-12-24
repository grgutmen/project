package model.workspace;

import javax.swing.tree.DefaultTreeModel;

import model.workspace.Project;
import model.workspace.Workspace;

public class WorkSpaceModel extends DefaultTreeModel{
	public WorkSpaceModel() {
		super(new Workspace());
	}
	
	public void addProject(Project project){
		((Workspace)getRoot()).addProject(project);
	}

}
