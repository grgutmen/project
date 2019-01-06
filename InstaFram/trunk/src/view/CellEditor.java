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

import gui.GlavniFrame;
import model.workspace.Project;
import model.workspace.Parameter;

public class CellEditor extends DefaultTreeCellEditor implements ActionListener{
	private Object stavka = null;
	private JTextField edit = null;
	
	public CellEditor(JTree arg0, DefaultTreeCellRenderer arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	
	
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
			}else if(((MouseEvent)event).getClickCount()==2 ) {
				if (GlavniFrame.getInstance().getTree().getLastSelectedPathComponent() instanceof Parameter) {
					Parameter p = (Parameter) GlavniFrame.getInstance().getTree().getLastSelectedPathComponent();
					if (p.getParameterView() == null) {
						p.getParameterView().setVisible(true);
					}else {
						ParameterView view = new ParameterView();
						p.setParameterView(view);
						p.getParameterView().setVisible(true);
					}
				}
				ParameterView view = new ParameterView();
				view.setVisible(true);
			}
				return false;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String newName = e.getActionCommand();
		if(stavka instanceof Parameter) {
			Parameter parameter = (Parameter) stavka;
			parameter.setName(newName);
		}else if(stavka instanceof Project) {
			Project project = (Project) stavka;
			project.setName(newName);
		}
	}

}
