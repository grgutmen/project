package actions;

public class ActionManager {
	
	private OpenWorkspaceAction openWorkspaceAction;
	
	private SaveAs saveAs;
	private SaveProjectAction saveProjectAction;
	private CommandRedoAction commandRedoAction;
	private NewParameterAction newParameterAction;
	private NewProjectAction newProjectAction;
	private DeleteNode deleteNode;
	
	private AboutAction aboutAction;
	
	
	
	public ActionManager()	 {
		initialise();
		
	}
	private void initialise() {
		
		openWorkspaceAction = new OpenWorkspaceAction();
		commandRedoAction = new CommandRedoAction();
		saveProjectAction =  new SaveProjectAction();
		saveAs = new SaveAs();
		newParameterAction = new NewParameterAction();
		newProjectAction = new NewProjectAction();
		aboutAction = new AboutAction();
		deleteNode = new DeleteNode();
		
	}
	
	public AboutAction getAboutAction() {
		return aboutAction;
	}
	
	
	public NewParameterAction getNewProjectAction() {
		return newParameterAction;
	}
	public OpenWorkspaceAction getOpenProjectAction() {
		return openWorkspaceAction;
	}
	
	public NewProjectAction getNewKompanijaAction() {
		return newProjectAction;
	}
	public SaveProjectAction getSaveProjectAction() {
		return saveProjectAction;
	}
	
	public void setAboutAction(AboutAction aboutAction) {
		this.aboutAction = aboutAction;
	}
	
	public void setNewProjectAction(NewParameterAction newParameterAction) {
		this.newParameterAction = newParameterAction;
	}
	
	public void setOpenProjectAction(OpenWorkspaceAction openWorkspaceAction) {
		this.openWorkspaceAction = openWorkspaceAction;
	}
	
	
	public void setSaveProjectAction(SaveProjectAction saveProjectAction) {
		this.saveProjectAction = saveProjectAction;
	}
	public SaveAs getSaveAs() {
		return saveAs;
	}
	public CommandRedoAction getCommandRedoAction() {
		return commandRedoAction;
	}
	public NewParameterAction getNewParameterAction() {
		return newParameterAction;
	}
	public OpenWorkspaceAction getOpenWorkspaceAction() {
		return openWorkspaceAction;
	}
	public DeleteNode getDeleteNode() {
		return deleteNode;
	}
	

}
