package model.workspace;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Observable;

import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

public class Workspace extends Observable implements MutableTreeNode{
	
	private String name = "Workspace";
	private ArrayList<Project> projekti = new ArrayList<Project>();
	
	public Workspace() {
		super();
	}
	
	public void openKompanija(Project project) {
		project.setParent(this);
		projekti.add(project);
		
	}
	
	public void addProject(Project project) {
		project.setParent(this);
		projekti.add(project);
		if (project.getName()==null) {
			project.setName("Project " + projekti.size());
		}
	}
	public void deleteProject(Project project) {
		projekti.remove(project);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public boolean getAllowsChildren() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public TreeNode getChildAt(int arg0) {
		// TODO Auto-generated method stub
		return projekti.get(arg0);
	}
	
	@Override
	public int getChildCount() {
		// TODO Auto-generated method stub
		return projekti.size();
	}
	@Override
	public int getIndex(TreeNode node) {
		// TODO Auto-generated method stub
		return projekti.indexOf(node);
	}
	@Override
	public TreeNode getParent() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setParent(MutableTreeNode newParent) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setUserObject(Object object) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insert(MutableTreeNode child, int index) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}@Override
	public Enumeration children() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void remove(MutableTreeNode node) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeFromParent() {
		// TODO Auto-generated method stub
		
	}

}
