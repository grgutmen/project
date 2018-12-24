package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import gui.GlavniFrame;
import model.workspace.Parameter;

public class DescriptionListener implements MouseListener{
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() instanceof Parameter) {
			GlavniFrame g = GlavniFrame.getInstance();
			g.getDoleDesno().update();
		}
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
