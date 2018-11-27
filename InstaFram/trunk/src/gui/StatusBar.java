package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class StatusBar extends JPanel{
	JLabel status1;
	JLabel status2;
	JLabel status3;
	
	public StatusBar() {
		super(new BorderLayout());
		setPreferredSize(new Dimension(200, 20));
		
		status1 = new JLabel("Message1");
		status2 = new JLabel("Message2", SwingConstants.CENTER);
		status3 = new JLabel("Message3");
		
		JSeparator sep = new JSeparator(JSeparator.HORIZONTAL);
		
		add(sep, BorderLayout.SOUTH);
		add(status1, BorderLayout.EAST);
		add(status2, BorderLayout.CENTER);
		add(status3, BorderLayout.WEST);
		add(sep, BorderLayout.NORTH);
	}

}
