package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;

import javax.swing.JFileChooser;
import javax.swing.KeyStroke;


import gui.GlavniFrame;
import model.workspace.Parameter;
import model.workspace.Project;

public class SaveProjectAction extends AbstractGEDAction{
	
	public SaveProjectAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
		        KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/filesave.png"));
		putValue(NAME, "Save project");
		putValue(SHORT_DESCRIPTION, "Save project");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser jfc = new JFileChooser();
		jfc.setFileFilter(new ParameterFIleFIlter());
		
		Object selected = GlavniFrame.getInstance().getTree().getLastSelectedPathComponent();
		if (selected instanceof Project) {
			Project project = (Project) selected;
			File projectFile = project.getFile();

			
			if (projectFile == null) {
				GlavniFrame.getInstance().getActionManager().getSaveAs().actionPerformed(e);
				return;
			}
			if (!project.isIzmenjen())
				return;

			
			for (Parameter p : project.getParameters()) {
				File parameterFile = p.getFile();

				
				if (parameterFile == null) {
					parameterFile = new File(projectFile.getParent() + "\\" + p.getName() + ".ipar");
					p.setFile(parameterFile);
				}

				
				if (!parameterFile.getName().equals(p.getName() + ".ipar")) {
					try {
						Files.deleteIfExists(parameterFile.toPath());
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					p.setFile(new File(projectFile.getParent() + "\\" + p.getName() + ".ipar"));
				}

				
				ObjectOutputStream os;
				try {
					os = new ObjectOutputStream(new FileOutputStream(p.getFile()));
					os.writeObject(p);

					os.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

			

			project.setIzmenjen(false);
		}
		
		
	}

}
