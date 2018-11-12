package model.workspace;

import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.tree.TreeNode;

public class Workspace implements TreeNode{
	
	private String name;
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
	@Override
	public Enumeration children() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}
	public void addProject(Project project) {
		projects.add(project);
		project.setName("Project - Grafički editor "+projects.size());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}