package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JTree;
import javax.swing.KeyStroke;

import gui.GlavniFrame;
import model.workspace.Kompanija;
import model.workspace.Project;

public class SaveAs extends AbstractGEDAction{
	
	public SaveAs() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F1, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/filesave.png"));
		putValue(NAME, "SaveAs");
		putValue(SHORT_DESCRIPTION, "Save as");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		File kompanijaFile = null;
		JTree tree = GlavniFrame.getInstance().getTree();
		Object selectedComponent = tree.getLastSelectedPathComponent();

		if (selectedComponent instanceof Kompanija) {
			Kompanija kompanija = (Kompanija) selectedComponent;

		
			int izbor = jfc.showSaveDialog(GlavniFrame.getInstance());
			if (izbor == JFileChooser.APPROVE_OPTION)
				kompanijaFile = jfc.getSelectedFile();
			else
				return;

			kompanija.setIzmenjen(false);
			kompanija.setFile(kompanijaFile);

			
			ObjectOutputStream os;
			try {

				os = new ObjectOutputStream(new FileOutputStream(kompanijaFile));
				os.writeObject(kompanija);

			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
			}
			
			
			
		

		
	}


