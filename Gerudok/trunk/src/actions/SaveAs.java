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
		

		File workspaceFolder = null;
		JTree tree = GlavniFrame.getInstance().getTree();
		Object selectedComponent = tree.getLastSelectedPathComponent();

		if (selectedComponent instanceof Kompanija) {
			
			jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

			Kompanija kompanija = (Kompanija) selectedComponent;

			
			int izbor = jfc.showSaveDialog(GlavniFrame.getInstance());
			if (izbor != JFileChooser.APPROVE_OPTION) {
				return;
			}
			workspaceFolder = jfc.getSelectedFile();
			File kompanijaFolder = new File(workspaceFolder.getAbsolutePath() + "\\" + kompanija.getName());
			kompanijaFolder.mkdir();
			File kompanijaFile = new File(kompanijaFolder + "\\" + ".PROJECT.ikomp");

			kompanija.setIzmenjen(false);

			
			for (Project project : kompanija.getProjects()) {
				ObjectOutputStream os;
				try {
					File projectFile = new File(kompanijaFolder + "\\" + project.getName() + ".iproj");
					project.setFile(projectFile);
					os = new ObjectOutputStream(new FileOutputStream(projectFile));
					os.writeObject(project);

					os.close();

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}

			
			
			
			kompanija.setFile(kompanijaFile);
		}
			}
			
			
			
		

		
	}


