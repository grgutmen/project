package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import javafx.scene.control.ComboBox;

public class ParameterView extends JFrame {
	
	private JComboBox<String> comboBox;
	private JButton btnOk;
	private JButton btnCancel;
	
	public ParameterView (){
		setTitle("Parameter");
		setSize(400, 400);
		JPanel panel = new JPanel();
		
		
		comboBox = new JComboBox<String>();
		comboBox.addItem("Ime");
		comboBox.addItem("Logo");
		comboBox.addItem("Opis");
		comboBox.setSize(100, 50);
		
		btnOk = new JButton("Ok");
		btnOk.setSize(20, 20);
		btnCancel = new JButton("Cancel");
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		panel.add(comboBox, BorderLayout.CENTER);
		panel.add(btnOk, BorderLayout.SOUTH);
		panel.add(btnCancel, BorderLayout.EAST);
		add(panel, BorderLayout.CENTER);
		
		
		
	}

}
