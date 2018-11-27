package gui;

import java.awt.BorderLayout;
import java.util.Observable;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.workspace.Project;

public class PanelDoleDesno extends JPanel implements java.util.Observer{
	
	private JLabel text;
	private Project project;
	
	 public PanelDoleDesno(Project project) {
		
		setSize(150, 100);
		
		text = new JLabel();
		text.setText("");
		this.project = project;
		this.project.addObserver(this);
		
		this.add(text, BorderLayout.CENTER);
		
		
		
		
		
	}
	@Override
	public void update(Observable o, Object arg) {
		
		
	}

}
