package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

import javax.swing.JFileChooser;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;


import gui.GlavniFrame;
import model.workspace.Project;
import model.workspace.Parameter;




public class SaveAs extends AbstractGEDAction {
	
	public SaveAs() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F1, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/filesave.png"));
		putValue(NAME, "Save Project As");
		putValue(SHORT_DESCRIPTION, "Save project as");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser jfc = new JFileChooser();
		jfc.setFileFilter(new ParameterFIleFIlter());
		
		File workspaceFolder = null;
		JTree tree = GlavniFrame.getInstance().getTree();
		Object selectedComponent = tree.getLastSelectedPathComponent();

		if (selectedComponent instanceof Project) {
			jfc.setDialogTitle("Select folder to save project");
			jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

			Project project = (Project) selectedComponent;

			
			int choice = jfc.showSaveDialog(GlavniFrame.getInstance());
			if (choice != JFileChooser.APPROVE_OPTION) {
				return;
			}
			workspaceFolder = jfc.getSelectedFile();
			File projectFolder = new File(workspaceFolder.getAbsolutePath() + "\\" + project.getName());
			projectFolder.mkdir();
			File projectFile = new File(projectFolder + "\\" + ".PROJECT.iproj");
			project.setFile(projectFile);
			project.setIzmenjen(false);
			
			for (Parameter p:project.getParameters()) {
				ObjectOutputStream os;
				try {
					File parameterFile = new File(projectFolder + "\\" + p.getName() + ".ipar");
					p.setFile(parameterFile);
					os = new ObjectOutputStream(new FileOutputStream(parameterFile));
					os.writeObject(p);
					os.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

			
			}

			
			
		}
	
	}


