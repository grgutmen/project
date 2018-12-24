package gui;

import java.awt.BorderLayout;
import java.util.Observable;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.workspace.Parameter;
import observer.IObserver;

public class PanelDoleDesno extends JScrollPane implements IObserver{
	
	private JTextArea text = new JTextArea();
	private Parameter parameter;
	
	 public PanelDoleDesno(Parameter parameter) {
		
		setSize(150, 100);
		text.setEditable(false);
		text.setOpaque(false);
		add(text);
		setViewportView(text);
		
		
		
		
		
		
	}
	
	@Override
	public void update() {
		StringBuilder sb = new StringBuilder();
		if (parameter == null) {
			return;
		}
		
		sb.append("Node: ");
		sb.append(parameter.toString());
		sb.append("\n");
		
		sb.append("Parent: ");
		sb.append(parameter.getParent());
		sb.append("\n");
		
		sb.append("Children: ");
		sb.append(parameter.getChildCount());
		
		text.setText(sb.toString());
	}
	
	

}
