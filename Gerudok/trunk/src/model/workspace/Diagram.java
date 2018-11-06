package model.workspace;

import java.util.Enumeration;

import javax.swing.tree.TreeNode;

import model.diagram.DiagramModel;

public class Diagram implements TreeNode{
	
	private String name;
	private DiagramModel model = new DiagramModel();
	
	public Diagram (String diagram) {
		this.name = name;
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
	public int getIndex(TreeNode node) {
		// TODO Auto-generated method stub
		return -1;
	}
	@Override
	public TreeNode getParent() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Enumeration children() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return true;
	}
	public DiagramModel getModel() {
		return model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setModel(DiagramModel model) {
		this.model = model;
	}

}
