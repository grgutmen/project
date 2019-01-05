package commands;

import model.workspace.Parameter;
import model.workspace.Project;

public class DeleteCommand extends Command{
	private Project project;
	private Parameter parameter = null;
	
	public DeleteCommand(Project project, Parameter parameter) {
		this.project = project;
		this.parameter = parameter;
	}
	@Override
	public void doCommand() {
		project.deleteProject(parameter);
		
	}
	@Override
	public void undoCommand() {
		project.addParameter(parameter);
		
	}

}
