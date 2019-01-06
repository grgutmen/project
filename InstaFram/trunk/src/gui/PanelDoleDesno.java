package gui;

import java.awt.BorderLayout;
import java.util.Observable;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.workspace.Parameter;
import model.workspace.Project;
import observer.IObserver;

public class PanelDoleDesno extends JScrollPane implements IObserver{
	
	private JTextArea text = new JTextArea();
	private Project project;
	
	 public PanelDoleDesno() {
		
		setSize(150, 100);
		text.setEditable(false);
		text.setOpaque(false);
		add(text);
		setViewportView(text);
		
		
		
		
		
		
	}
	
	@Override
	public void update (Object o) {
		Project project = (Project) o;
		StringBuilder sb = new StringBuilder();	
		sb.append("Node: ");
		sb.append(project.toString());
		sb.append("\n");
		
		sb.append("Parent: ");
		sb.append(project.getParent());
		sb.append("\n");
		
		sb.append("Children: ");
		sb.append(project.getChildCount());
		
		text.setText(sb.toString());
		text.setVisible(true);
	}
	
	

}
