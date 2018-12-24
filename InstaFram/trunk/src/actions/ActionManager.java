package actions;

public class ActionManager {
	
	private OpenWorkspaceAction openWorkspaceAction;
	
	private SaveAs saveAs;
	private SaveProjectAction saveProjectAction;

	private NewParameterAction newParameterAction;
	private NewProjectAction newKompanijaAction;
	
	
	private AboutAction aboutAction;
	
	
	
	public ActionManager()	 {
		initialise();
		
	}
	private void initialise() {
		
		openWorkspaceAction = new OpenWorkspaceAction();
		
		saveProjectAction =  new SaveProjectAction();
		saveAs = new SaveAs();
		newParameterAction = new NewParameterAction();
		newKompanijaAction = new NewProjectAction();
		
		aboutAction = new AboutAction();
		
		
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
		return newKompanijaAction;
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
	
	
	

}
