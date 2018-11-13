package model.workspace;

import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.tree.TreeNode;

public class Kompanija implements TreeNode{
	
	private ArrayList<Project> projekti = new ArrayList<Project>();
	private String name;
	
	public Kompanija() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Kompanija";
	}
	
	
	@Override
	public boolean getAllowsChildren() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public TreeNode getChildAt(int childIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getChildCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public TreeNode getParent() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getIndex(TreeNode node) {
		// TODO Auto-generated method stub
		return 0;
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
		projekti.add(project);
		project.setName("Workspace");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Project> getProjekti() {
		return projekti;
	}
	
	

}
