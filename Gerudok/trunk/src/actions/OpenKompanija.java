package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import gui.GlavniFrame;
import model.workspace.Kompanija;

public class OpenKompanija extends AbstractGEDAction{
	public OpenKompanija() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O , ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/fileopen.png"));
		putValue(NAME, "Open company");
		putValue(SHORT_DESCRIPTION, "Open company");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		jfc.showOpenDialog(GlavniFrame.getInstance());
		
		int izbor = jfc.showOpenDialog(GlavniFrame.getInstance());
		if (izbor != JFileChooser.APPROVE_OPTION) {
			return;
		}
		
		File folderKompanija = jfc.getSelectedFile();
		File fileKompanija = null;
		
		for (File file:folderKompanija.listFiles()) {
			if (file.getName().endsWith(".ifrm")) {
				fileKompanija = file;
				break;
			}
		}
		if (fileKompanija == null) {
			JOptionPane.showMessageDialog(GlavniFrame.getInstance(), "Pogresan tip fajla", "Greska pri otvaranju", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		Kompanija kompanija = new Kompanija();
		
		
		
	}

}
