package model.workspace;


import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Enumeration;

import javax.swing.JTextArea;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;



import commands.CommandManager;
import gui.GlavniFrame;
import view.ParameterView;

public class Parameter extends java.util.Observable implements MutableTreeNode, Observer, Serializable, Transferable, ClipboardOwner{
	
	static public DataFlavor parameterFlavor;
	
	private DataFlavor[] supportedFlavors = { parameterFlavor };
	
	private Project parent = null;
	private String name;
	private File file;
	private boolean izmenjen;
	private ParameterView parameterView = null;
	transient private CommandManager commandManager;
	
	public Parameter () {
		super();
		this.commandManager = new CommandManager();
	}
	
	
	
	public void setFile(File file) {
		this.file = file;
	}
	public File getFile() {
		return file;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
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
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
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
	@Override
	public void insert(MutableTreeNode child, int index) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(MutableTreeNode node) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeFromParent() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setParent(MutableTreeNode newParent) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setUserObject(Object object) {
		// TODO Auto-generated method stub
		
	}
	public void setIzmenjen(boolean izmenjen) {
		this.izmenjen = izmenjen;
	}
	@Override
	public void update(Observable o, Object arg) {
		if (!this.izmenjen) {
			this.setIzmenjen(true);
		}
		
	}
	public CommandManager getCommandManager() {
		return commandManager;
	}
	@Override
	public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataFlavor[] getTransferDataFlavors() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isDataFlavorSupported(DataFlavor flavor) {
		// TODO Auto-generated method stub
		return (flavor.equals(parameterFlavor));
	}
	@Override
	public void lostOwnership(Clipboard clipboard, Transferable contents) {
		// TODO Auto-generated method stub
		
	}
	
	
}
