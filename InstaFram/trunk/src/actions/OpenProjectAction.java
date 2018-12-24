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
import model.workspace.Project;
import model.workspace.Parameter;
import model.workspace.Workspace;

public class OpenProjectAction extends AbstractGEDAction {
	public OpenProjectAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/fileopen.png"));
		putValue(NAME, "Open company");
		putValue(SHORT_DESCRIPTION, "Open company");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser jfc = new JFileChooser();
		jfc.setFileFilter(new ParameterFIleFIlter());
		
		if(jfc.showOpenDialog(GlavniFrame.getInstance())==JFileChooser.APPROVE_OPTION){
			try {
				ObjectInputStream os = new ObjectInputStream(new FileInputStream(jfc.getSelectedFile()));
				  
				Project p=null;
				try {
					p = (Project) os.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    
			    
			      GlavniFrame.getInstance().getTree().addProject(p);
				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} 
			
		
		
	}

}
}
