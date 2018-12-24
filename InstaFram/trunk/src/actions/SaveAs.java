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
import model.workspace.Project;
import model.workspace.Parameter;

public class SaveAs extends AbstractGEDAction{
	
	public SaveAs() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F1, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/filesave.png"));
		putValue(NAME, "Save company As");
		putValue(SHORT_DESCRIPTION, "Save company as");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser jfc = new JFileChooser();
		

		File workspaceFolder = null;
		JTree tree = GlavniFrame.getInstance().getTree();
		Object selectedComponent = tree.getLastSelectedPathComponent();

		if (selectedComponent instanceof Project) {
			
			jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

			Project project = (Project) selectedComponent;

			
			int izbor = jfc.showSaveDialog(GlavniFrame.getInstance());
			if (izbor != JFileChooser.APPROVE_OPTION) {
				return;
			}
			workspaceFolder = jfc.getSelectedFile();
			File kompanijaFolder = new File(workspaceFolder.getAbsolutePath() + "\\" + project.getName());
			kompanijaFolder.mkdir();
			File kompanijaFile = new File(kompanijaFolder + "\\" + ".PROJECT.iproj");

			project.setIzmenjen(false);

			
			for (Parameter parameter : project.getProjects()) {
				ObjectOutputStream os;
				try {
					File projectFile = new File(kompanijaFolder + "\\" + parameter.getName() + ".ipar");
					parameter.setFile(projectFile);
					os = new ObjectOutputStream(new FileOutputStream(projectFile));
					os.writeObject(parameter);

					os.close();

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}

			
			
			
			project.setFile(kompanijaFile);
		}
			}
			
			
			
		

		
	}


