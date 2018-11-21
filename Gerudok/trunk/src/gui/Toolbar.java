package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar{
	public Toolbar () {
		super(JToolBar.HORIZONTAL);
		setFloatable(false);
		
		JButton btnNew = new JButton();
		btnNew.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Klik");
				
			}
		});
		btnNew.setActionCommand("New");
		btnNew.setIcon(new ImageIcon("src//images/fileopen.png"));
		
		btnNew.setToolTipText("New");
		add(btnNew);
		
	}

}
