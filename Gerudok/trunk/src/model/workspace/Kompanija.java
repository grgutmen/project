package model.workspace;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Observable;

import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

public class Kompanija extends Observable implements MutableTreeNode, Serializable{
	private ArrayList<Project> projects = new ArrayList<Project>();
	private Workspace parent = null;
	private File file;
	private String name;
	private boolean izmenjen;
	
	public Kompanija () {
		super();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public void openProject(Project project) {
		project.setParent(this);
		projects.add(project);
		
	}
	
	public void addProject(Project project) {
		project.setParent(this);
		projects.add(project);
		if (project.getName() == null) {
			project.setName("Project - " + projects.size());
		}
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	
	public void deleteProject(Project project) {
		projects.remove(project);
	}
	
	@Override
	public boolean getAllowsChildren() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public TreeNode getChildAt(int childIndex) {
		// TODO Auto-generated method stub
		return projects.get(childIndex);
	}
	@Override
	public int getChildCount() {
		// TODO Auto-generated method stub
		return projects.size();
	}
	@Override
	public int getIndex(TreeNode node) {
		// TODO Auto-generated method stub
		return projects.indexOf(node);
	}
	@Override
	public TreeNode getParent() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void insert(MutableTreeNode child, int index) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setParent(MutableTreeNode newParent) {
		this.parent=parent;
		
	}
	@Override
	public Enumeration children() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void remove(MutableTreeNode node) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setUserObject(Object object) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeFromParent() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean isIzmenjen() {
		return izmenjen;
	}
	public void setIzmenjen(boolean izmenjen) {
		this.izmenjen = izmenjen;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Project> getProjects() {
		return projects;
	}
	

}
