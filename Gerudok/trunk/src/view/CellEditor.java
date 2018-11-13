package view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.EventObject;

import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;

public class CellEditor extends DefaultTreeCellEditor implements ActionListener{
	
	public CellEditor(JTree arg0, DefaultTreeCellRenderer arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	private Object stavka = null;
	private JTextField edit = null;
	
	
	@Override
	public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded,
			boolean leaf, int row) {
		stavka=value;
		
		edit=new JTextField(value.toString());
		edit.addActionListener(this);
		return edit;
	}
	@Override
	public boolean isCellEditable(EventObject event) {
		if (event instanceof MouseEvent)
			if (((MouseEvent)event).getClickCount()==3){
				return true;
			}
				return false;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (stavka instanceof model.workspace.Project){
			((model.workspace.Kompanija)stavka).setName(e.getActionCommand());	
		}else{
			((model.workspace.Project)stavka).setName(e.getActionCommand());
		}
	}

}
