package commands;

import java.util.List;

import model.workspace.Parameter;
import model.workspace.Project;

public class DeleteCommands extends Command{
	
	private Project project;
	private List<Parameter> parameters;
	
	public DeleteCommands(Project project, List<Parameter> parameters) {
		this.project = project;
		this.parameters = parameters;
	}
	
	@Override
	public void doCommand() {
		for (Parameter p: parameters) {
			project.deleteProject(p);
		}
		
	}
	@Override
	public void undoCommand() {
		for (Parameter p: parameters) {
			project.addParameter(p);
		}
	}

}
