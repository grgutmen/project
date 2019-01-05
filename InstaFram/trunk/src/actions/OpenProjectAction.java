package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;


import gui.GlavniFrame;
import gui.Tree;
import model.workspace.Project;
import model.workspace.Parameter;
import model.workspace.Workspace;

public class OpenProjectAction extends AbstractGEDAction {
	public OpenProjectAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/fileopen.png"));
		putValue(NAME, "Open project");
		putValue(SHORT_DESCRIPTION, "Open project");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser jfc = new JFileChooser();
		jfc.setFileFilter(new ParameterFIleFIlter());
		Tree tree = GlavniFrame.getInstance().getTree();
		
		if (jfc.showOpenDialog(GlavniFrame.getInstance()) == JFileChooser.APPROVE_OPTION) {
			try {
				ObjectInputStream os = new ObjectInputStream(new FileInputStream(jfc.getSelectedFile()));
				  
				Project p=null;
				try {
					p = (Project) os.readObject();
				} catch (Exception e2) {
					// TODO: handle exception
				}
				GlavniFrame.getInstance().getTree().addProject(p);
				SwingUtilities.updateComponentTreeUI(tree);
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			}
		}
	}


