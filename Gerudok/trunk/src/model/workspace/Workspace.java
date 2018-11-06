package model.workspace;

import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class Workspace implements TreeNode{
	
	private ArrayList<Project> projects = new ArrayList<Project>();
	
	public Workspace() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Workspace";
	}
	
	public ArrayList<Project> getProjects() {
		return projects;
	}
	@Override
	public TreeNode getChildAt(int childIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean getAllowsChildren() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int getChildCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getIndex(TreeNode node) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public TreeNode getParent() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}
	
}
