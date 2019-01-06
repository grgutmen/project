package model.workspace;

import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Observable;

import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

import commands.CommandManager;
import gui.GlavniFrame;

public class Project extends Observable implements MutableTreeNode, Serializable{
	private ArrayList<Parameter> parameters = new ArrayList<Parameter>();
	private Workspace parent = null;
	private CommandManager commandManager;
	private File file;
	private String name;
	private boolean izmenjen;
	
	public Project () {
		super();
		this.commandManager = new CommandManager();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public void openProject(Parameter parameter) {
		parameter.setParent(this);
		parameters.add(parameter);
		
	}
	
	public void addParameter(Parameter parameter) {
		parameter.setParent(this);
		parameters.add(parameter);
		if (parameter.getName() == null) {
			parameter.setName("Parameter - " + parameters.size());
		}
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	
	public void deleteProject(Parameter parameter) {
		parameters.remove(parameter);
	}
	
	@Override
	public boolean getAllowsChildren() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public TreeNode getChildAt(int childIndex) {
		// TODO Auto-generated method stub
		return parameters.get(childIndex);
	}
	@Override
	public int getChildCount() {
		// TODO Auto-generated method stub
		return parameters.size();
	}
	@Override
	public int getIndex(TreeNode node) {
		// TODO Auto-generated method stub
		return parameters.indexOf(node);
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
	
	public ArrayList<Parameter> getParameters() {
		return parameters;
	}
	public Parameter getParameter(int index) {
		return parameters.get(index);
	}
	public CommandManager getCommandManager() {
		if (commandManager == null) {
			commandManager = new CommandManager();
		}
		return commandManager;
	}
	public void paste() {
		Transferable content = GlavniFrame.getInstance().getClipboard().getContents(GlavniFrame.getInstance());
		if ((content != null) && content.isDataFlavorSupported(Parameter.parameterFlavor)) {
			try {
				Project project = null;
				ArrayList<Parameter> parameters = (ArrayList<Parameter>) content.getTransferData(Parameter.parameterFlavor);
				for(int i=0;i<parameters.size();i++) {
					project = (Project) GlavniFrame.getInstance().getTree().getLastSelectedPathComponent();
					project.addParameter(parameters.get(i));
					parameters.get(i).setParent(project);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
