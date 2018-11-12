package actions;

public class ActionManager {
	private OpenWorkspaceAction openWorkspaceAction;
	private OpenProjectAction openProjectAction;
	
	private SaveDiagramAction saveDiagramAction;
	private SaveProjectAction saveProjectAction;
	private SaveWorkspaceAction saveWorkspaceAction;
	
	private NewProjectAction newProjectAction;
	private NewWorkspaceAction newWorkspaceAction;
	private NewDiagramAction newDiagramAction;
	
	private AboutAction aboutAction;
	
	private CloseDiagramAction closeDiagramAction;
	
	public ActionManager()	 {
		initialise();
		
	}
	private void initialise() {
		openWorkspaceAction = new OpenWorkspaceAction();
		openProjectAction = new OpenProjectAction();
		saveDiagramAction = new SaveDiagramAction();
		saveProjectAction =  new SaveProjectAction();
		saveWorkspaceAction = new SaveWorkspaceAction();
		newProjectAction = new NewProjectAction();
		newWorkspaceAction = new NewWorkspaceAction();
		newDiagramAction = new NewDiagramAction();
		aboutAction = new AboutAction();
		closeDiagramAction = new CloseDiagramAction();
		
	}
	
	public AboutAction getAboutAction() {
		return aboutAction;
	}
	public NewDiagramAction getNewDiagramAction() {
		return newDiagramAction;
	}
	public NewWorkspaceAction getNewWorkspaceAction() {
		return newWorkspaceAction;
	}
	public NewProjectAction getNewProjectAction() {
		return newProjectAction;
	}
	public OpenProjectAction getOpenProjectAction() {
		return openProjectAction;
	}
	public OpenWorkspaceAction getOpenWorkspaceAction() {
		return openWorkspaceAction;
	}
	public SaveDiagramAction getSaveDiagramAction() {
		return saveDiagramAction;
	}
	public SaveProjectAction getSaveProjectAction() {
		return saveProjectAction;
	}
	public SaveWorkspaceAction getSaveWorkspaceAction() {
		return saveWorkspaceAction;
	}
	public void setAboutAction(AboutAction aboutAction) {
		this.aboutAction = aboutAction;
	}
	public void setNewDiagramAction(NewDiagramAction newDiagramAction) {
		this.newDiagramAction = newDiagramAction;
	}
	public void setNewProjectAction(NewProjectAction newProjectAction) {
		this.newProjectAction = newProjectAction;
	}
	public void setNewWorkspaceAction(NewWorkspaceAction newWorkspaceAction) {
		this.newWorkspaceAction = newWorkspaceAction;
	}
	public void setOpenProjectAction(OpenProjectAction openProjectAction) {
		this.openProjectAction = openProjectAction;
	}
	public void setOpenWorkspaceAction(OpenWorkspaceAction openWorkspaceAction) {
		this.openWorkspaceAction = openWorkspaceAction;
	}
	public void setSaveDiagramAction(SaveDiagramAction saveDiagramAction) {
		this.saveDiagramAction = saveDiagramAction;
	}
	public void setSaveProjectAction(SaveProjectAction saveProjectAction) {
		this.saveProjectAction = saveProjectAction;
	}
	public void setSaveWorkspaceAction(SaveWorkspaceAction saveWorkspaceAction) {
		this.saveWorkspaceAction = saveWorkspaceAction;
	}
	public CloseDiagramAction getCloseDiagramAction() {
		return closeDiagramAction;
	}
	

}
