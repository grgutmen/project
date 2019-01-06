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
import model.workspace.Project;
import observer.IObservable;
import observer.IObserver;


public class TreeController  implements TreeSelectionListener, IObservable{
	
	public TreeController() {
		GlavniFrame g = GlavniFrame.getInstance();
		this.addObserver(g.getDoleDesno());
	}
	@Override
	public void valueChanged(TreeSelectionEvent arg0) {
		TreePath path = arg0.getPath();
		Object selected = path.getLastPathComponent();
		Project p = GlavniFrame.getInstance().getTree().getCurrentProject();
		GlavniFrame.getInstance().getDoleDesno().update(p);
		
		
	}
	
	@Override
	public void addObserver(IObserver o) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void notifyObservers() {
		this.notifyAll();
	}
	@Override
	public void removeObserver(IObserver o) {
		// TODO Auto-generated method stub
		
	}
		
		
		
}


