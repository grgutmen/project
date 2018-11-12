package gui;

public class MyApp {
	
	public MyApp() {
		super();
	}

	public static void main(String[] args) {
		try {
		GlavniFrame mainFrame = GlavniFrame.getInstance();
		mainFrame.setVisible(true);
		}catch(Exception e) {
			System.err.println("Greska u pokretanju aplikacije!");
			e.printStackTrace();
			System.exit(1);
		}

	}

}
