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
		
		Project project = GlavniFrame.getInstance().getTree().getCurrentProject();
		File projectFile = project.getFile();
		
		
		if (project.getFile() == null) {
			if (jfc.showSaveDialog(GlavniFrame.getInstance()) == JFileChooser.APPROVE_OPTION) {
				projectFile = jfc.getSelectedFile();
			}else {
				return;
			}
		}
		
		ObjectOutputStream os;
		
		try {
			os = new ObjectOutputStream(new FileOutputStream(projectFile));
			os.writeObject(project);
			project.setFile(projectFile);
			project.setIzmenjen(false);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
			
		

		
	}

}
