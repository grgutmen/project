package actions;

public class ActionManager {
	
	private OpenProjectAction openProjectAction;
	
	
	private SaveProjectAction saveProjectAction;

	private NewProjectAction newProjectAction;
	
	
	
	private AboutAction aboutAction;
	
	
	
	public ActionManager()	 {
		initialise();
		
	}
	private void initialise() {
		
		openProjectAction = new OpenProjectAction();
		
		saveProjectAction =  new SaveProjectAction();
		
		newProjectAction = new NewProjectAction();
		
		
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
	
	
	

}
