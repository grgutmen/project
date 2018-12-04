package gui;

import java.awt.BorderLayout;
import java.util.Observable;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.workspace.Project;

public class PanelDoleDesno extends JPanel {
	
	private JTextArea text = new JTextArea();
	private Project project;
	
	 public PanelDoleDesno(Project project) {
		
		setSize(150, 100);
		text.setEditable(false);
		text.setOpaque(false);
		text.setText("");
		this.add(text, BorderLayout.CENTER);
		
		
		
		
		
	}
	
	public void update(Object o) {
		StringBuilder sb = new StringBuilder();
		Project node = (Project) o;
		
		sb.append("Node: ");
		sb.append(node.toString());
		sb.append("\n");
		
		sb.append("Parent: ");
		sb.append(node.getParent());
		sb.append("\n");
		
		sb.append("Children: ");
		sb.append(node.getChildCount());
		sb.append("\n");
		
		text.setText(sb.toString());
		
		
	}

}
