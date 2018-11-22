package controller;

import java.util.Observer;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

import gui.GlavniFrame;
import javafx.beans.Observable;

public class TreeController extends java.util.Observable implements TreeSelectionListener{
	
	public TreeController() {
		
	}
	@Override
	public void valueChanged(TreeSelectionEvent arg0) {
		TreePath path = arg0.getPath();
		
		
		
	}

}
