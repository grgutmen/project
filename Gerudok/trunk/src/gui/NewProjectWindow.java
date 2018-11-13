package gui;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.workspace.Project;

public class NewProjectWindow extends JFrame{
	private JButton buttonOK;
	private JButton buttonCancel;
	public NewProjectWindow() {
		setTitle("New project");
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		panel2.setSize(10, 10);
		setSize(300, 100);
		JTextField nameField = new JTextField();
		nameField.setText("Java project");
		
		buttonOK = new JButton("Ok");
		buttonCancel = new JButton("Cancel");
		
		panel2.add(buttonOK, BorderLayout.WEST);
		panel2.add(buttonCancel, BorderLayout.EAST);
		
		JLabel label = new JLabel("Enter project name");
		panel.add(label, BorderLayout.WEST);
		panel.add(nameField, BorderLayout.CENTER);
		
		add(panel, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		
		buttonOK.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				Project p = new Project(nameField.getText());
				
				
			}
		});
		
		setVisible(true);
	}
	
	public JButton getButtonCancel() {
		return buttonCancel;
	}
	public JButton getButtonOK() {
		return buttonOK;
	}
	

}
