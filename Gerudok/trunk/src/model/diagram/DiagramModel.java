package model.diagram;

import java.util.ArrayList;

import javax.swing.event.EventListenerList;

public class DiagramModel {
	private static int count = 0;
	private String name;
	
	protected ArrayList diagramElements = new ArrayList<>();
	EventListenerList listenerList = new EventListenerList();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public static int getCount() {
		return count;
	}
	public ArrayList getDiagramElements() {
		return diagramElements;
	}
	public EventListenerList getListenerList() {
		return listenerList;
	}
	public String getName() {
		return name;
	}
	public static void setCount(int count) {
		DiagramModel.count = count;
	}
	public void setDiagramElements(ArrayList diagramElements) {
		this.diagramElements = diagramElements;
	}
	public void setListenerList(EventListenerList listenerList) {
		this.listenerList = listenerList;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
