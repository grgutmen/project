package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;


import gui.GlavniFrame;
import model.workspace.Kompanija;
import model.workspace.Project;
import model.workspace.Workspace;

public class OpenKompanija extends AbstractGEDAction {
	public OpenKompanija() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/fileopen.png"));
		putValue(NAME, "Open company");
		putValue(SHORT_DESCRIPTION, "Open company");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

		int izbor = jfc.showOpenDialog(GlavniFrame.getInstance());
		if (izbor != JFileChooser.APPROVE_OPTION) {
			return;
		}

		File kompanijaFolder = jfc.getSelectedFile();

		File kompanijaFile = null;
		for (File file : kompanijaFolder.listFiles()) {
			if (file.getName().endsWith(".ikomp")) {
				kompanijaFile = file;
				break;
			}
		}
		if (kompanijaFile == null) {
			JOptionPane.showMessageDialog(GlavniFrame.getInstance(), "Izabran folder nije tipa kompanija",
					"Greska pri otvaranju foldera", JOptionPane.ERROR_MESSAGE);
			return;
		}

		
		kompanijaFile.toString();
		Kompanija kompanija  = new Kompanija();
		kompanija.setName(kompanijaFile.getName());
		kompanija.setFile(kompanijaFile);
		for (File file : kompanijaFolder.listFiles()) {
			if (file.getName().endsWith(".iproj")) {
				Project project = new Project();
				project.setName(file.getName());
				project.setParent(kompanija);
				kompanija.addProject(project);
				
			}
		}

		JTree tree = GlavniFrame.getInstance().getTree();
		TreePath path = tree.getSelectionPath();
		tree.expandPath(path);

		((Workspace) tree.getModel().getRoot()).openKompanija(kompanija);
		SwingUtilities.updateComponentTreeUI(tree);
	}

}
