package gui;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

public class MyApp {
	
	public MyApp() {
		super();
	}

	public static void main(String[] args) {
		try {
		SwingUtilities.invokeAndWait(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				GlavniFrame mainFrame = GlavniFrame.getInstance();
				mainFrame.setVisible(true);
			}
		});
		}catch(InterruptedException e) {
			e.printStackTrace();
		}catch(InvocationTargetException c) {
			c.printStackTrace();
		}
		

	}

}
