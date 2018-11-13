package actions;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import gui.WorkSpaceTree;
import model.workspace.Diagram;
import model.workspace.Project;

public class NewProjectAction extends AbstractGEDAction{
	
	public NewProjectAction() {
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/filenew.png"));
		putValue(NAME, "New project");
		putValue(SHORT_DESCRIPTION, "New project");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame frame = new JFrame();
		frame.setTitle("New project");
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		panel2.setSize(10, 10);
		frame.setSize(30, 30);
		JTextField nameField = new JTextField();
		nameField.setText("Java project");
		
		JButton buttonOK = new JButton("Ok");
		JButton buttonCancel = new JButton("Cancel");
		
		panel2.add(buttonOK, BorderLayout.WEST);
		panel2.add(buttonCancel, BorderLayout.EAST);
		
		JLabel label = new JLabel("Enter project name");
		panel.add(label, BorderLayout.WEST);
		panel.add(nameField, BorderLayout.CENTER);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.add(panel2, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		
		
		
	
	}

}
