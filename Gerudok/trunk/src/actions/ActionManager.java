package actions;

public class ActionManager {
	
	private OpenProjectAction openProjectAction;
	
	private SaveAs saveAs;
	private SaveProjectAction saveProjectAction;

	private NewProjectAction newProjectAction;
	private NewKompanijaAction newKompanijaAction;
	
	
	private AboutAction aboutAction;
	
	
	
	public ActionManager()	 {
		initialise();
		
	}
	private void initialise() {
		
		openProjectAction = new OpenProjectAction();
		
		saveProjectAction =  new SaveProjectAction();
		saveAs = new SaveAs();
		newProjectAction = new NewProjectAction();
		newKompanijaAction = new NewKompanijaAction();
		
		aboutAction = new AboutAction();
		
		
	}
	
	public AboutAction getAboutAction() {
		return aboutAction;
	}
	
	
	public NewProjectAction getNewProjectAction() {
		return newProjectAction;
	}
	public OpenProjectAction getOpenProjectAction() {
		return openProjectAction;
	}
	
	public NewKompanijaAction getNewKompanijaAction() {
		return newKompanijaAction;
	}
	public SaveProjectAction getSaveProjectAction() {
		return saveProjectAction;
	}
	
	public void setAboutAction(AboutAction aboutAction) {
		this.aboutAction = aboutAction;
	}
	
	public void setNewProjectAction(NewProjectAction newProjectAction) {
		this.newProjectAction = newProjectAction;
	}
	
	public void setOpenProjectAction(OpenProjectAction openProjectAction) {
		this.openProjectAction = openProjectAction;
	}
	
	
	public void setSaveProjectAction(SaveProjectAction saveProjectAction) {
		this.saveProjectAction = saveProjectAction;
	}
	public SaveAs getSaveAs() {
		return saveAs;
	}
	
	
	

}
