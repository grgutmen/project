package controller;

import java.util.Observable;
import java.util.Observer;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import com.sun.javafx.collections.ImmutableObservableList;

import gui.GlavniFrame;
import gui.Tree;


public class TreeController extends Observable implements TreeSelectionListener{
	
	public TreeController() {
		
	}
	@Override
	public void valueChanged(TreeSelectionEvent arg0) {
		Tree tree = GlavniFrame.getInstance().getTree();
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
		if (node == null) {
			return;
		}
		Object nodeInfo = node.getUserObject();
		GlavniFrame g = GlavniFrame.getInstance();
		g.getDoleDesno().update();
		
	}
		
		
		
}


