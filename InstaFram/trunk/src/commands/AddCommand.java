package commands;

import model.workspace.Parameter;
import model.workspace.Project;

public class AddCommand extends Command{
	private Project project;
	private Parameter parameter = null;
	
	public AddCommand(Project project, Parameter parameter) {
		this.project = project;
		this.parameter = parameter;
	}
	@Override
	public void doCommand() {
		project.addParameter(parameter);
		
	}
	@Override
	public void undoCommand() {
		project.deleteProject(parameter);
		
	}

}
