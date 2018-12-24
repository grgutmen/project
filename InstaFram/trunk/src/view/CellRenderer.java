package view;


import java.awt.Component;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

import model.workspace.Project;
import model.workspace.Parameter;
import model.workspace.Workspace;

public class CellRenderer extends DefaultTreeCellRenderer{
	
	public CellRenderer() {
		
	}
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf,
			int row, boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
		if (value instanceof Workspace) {
			Icon icon = new ImageIcon("images/treeworkspace.png");
			if (icon!=null) {
				setIcon(icon);
			}
			
			
		}else if (value instanceof Parameter) {
            Icon icon = new ImageIcon("images/treeproj.png");
            if (icon!=null) {
            	setIcon(icon);
            }
		}else if (value instanceof Project) {
			Icon icon = new ImageIcon("images/treeproj.png");
			if (icon!=null) {
				setIcon(icon);
			}
		}
		return this;
		
	}
	}


