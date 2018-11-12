package view;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;

import model.workspace.Diagram;

public class DiagramView extends JInternalFrame{
	
	static int openFrameCount = 0;
	static final int xOffset = 30, yOffset = 30;
	private Diagram diagram;
	private JPanel framework;
	
	public DiagramView() {
		super(" ", true, true, true, true);
		++openFrameCount;
		setLocation(xOffset, yOffset);
		setIconifiable(true);
		setClosable(true);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	public void setDiagram(Diagram diagram){
		this.diagram = diagram; 
		this.setName(diagram.getName());
		
		setTitle(diagram.getName());
	}
	public Diagram getDiagram() {
		return diagram;
	}

}
