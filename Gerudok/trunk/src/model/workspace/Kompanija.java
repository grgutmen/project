package model.workspace;

import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.tree.TreeNode;

public class Kompanija implements TreeNode{
	
	private ArrayList<Workspace> radniProstori = new ArrayList<Workspace>();
	
	public Kompanija() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Workspace> getRadniProstori() {
		return radniProstori;
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
	public void addWorkspace(Workspace workspace) {
		radniProstori.add(workspace);
		workspace.setName("Workspace");
	}
	
	

}
