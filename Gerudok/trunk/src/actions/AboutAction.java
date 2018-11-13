package actions;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import gui.GlavniFrame;

public class AboutAction extends AbstractGEDAction{
	
	public AboutAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
		        KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/?.png"));
		putValue(NAME, "About");
		putValue(SHORT_DESCRIPTION, "About");
	}
	
@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		
		
		frame.setSize(30, 30);
		
		ImageIcon image  = new ImageIcon("C:\\Users\\npantos17\\eclipse-workspace\\installer\\src\\IMAG0500.jpg");
		JLabel label = new JLabel(image);
		Image img = image.getImage();
		Image nova = img.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
		image = new ImageIcon(nova);
		
		JOptionPane about = new JOptionPane();
		about.showMessageDialog(frame, "Nikola Pantos\nRN-51\n", "About", JOptionPane.INFORMATION_MESSAGE, image);
		about.setSize(10, 10);
		
	}

}
