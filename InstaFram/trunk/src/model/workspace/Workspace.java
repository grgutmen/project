package model.workspace;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Observable;

import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

public class Workspace extends Observable implements MutableTreeNode{
	
	private String name = "Workspace";
	private ArrayList<Kompanija> kompanije = new ArrayList<Kompanija>();
	
	public Workspace() {
		super();
	}
	
	public void openKompanija(Kompanija kompanija) {
		kompanija.setParent(this);
		kompanije.add(kompanija);
		
	}
	
	public void addKompanija(Kompanija kompanija) {
		kompanija.setParent(this);
		kompanije.add(kompanija);
		if (kompanija.getName()==null) {
			kompanija.setName("Kompanija " + kompanije.size());
		}
	}
	public void deleteProject(Kompanija kompanija) {
		kompanije.remove(kompanija);
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
		return kompanije.get(arg0);
	}
	
	@Override
	public int getChildCount() {
		// TODO Auto-generated method stub
		return kompanije.size();
	}
	@Override
	public int getIndex(TreeNode node) {
		// TODO Auto-generated method stub
		return kompanije.indexOf(node);
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
