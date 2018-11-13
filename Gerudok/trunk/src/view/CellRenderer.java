package view;


import java.awt.Component;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

import model.workspace.Kompanija;
import model.workspace.Project;

public class CellRenderer extends DefaultTreeCellRenderer{
	
	public CellRenderer() {
		
	}
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf,
			int row, boolean hasFocus) {
		if (value instanceof Kompanija) {
			URL imageUrl = getClass().getResource("images/fileopen.png");
			Icon icon = null;
			if (imageUrl != null) 
				icon = new ImageIcon(imageUrl);
			setIcon(icon);
			
		}else if (value instanceof Project) {
			URL imageURL = getClass().getResource("images/tproject.gif");
            Icon icon = null;
            if (imageURL != null)                       
                icon = new ImageIcon(imageURL);
            setIcon(icon);
		}
		return this;
		
	}
	}


