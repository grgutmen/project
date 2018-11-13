package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;

import actions.ActionManager;
import model.workspace.KompanijaModel;







public class GlavniFrame extends JFrame{
	private static GlavniFrame instance = null;
	private ActionManager actionManager;
	
	private KompanijaTree kompanijaTree;
	private model.workspace.KompanijaModel KompanijaModel;
	
	private JDesktopPane desktop;
	
	private void initialise() {
		actionManager=new ActionManager();
		
		
		initialiseWorkSpaceTree();
		initialiseFrame();
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void initialiseFrame () {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		setSize(800, 600);
		setTitle ("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				JFrame frame= (JFrame) e.getComponent();
				int code=JOptionPane.showConfirmDialog(frame, "Da li ste sigurni da želite da zatvorite aplikaciju?","Zatvaranje aplikacije?",JOptionPane.YES_NO_OPTION);
				if (code!=JOptionPane.YES_OPTION){
				
					frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
				}
				else{
					frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				}
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		gui.Menu menu = new gui.Menu();
		setJMenuBar(menu);
		Toolbar toolbar = new Toolbar();
		
		desktop = new JDesktopPane();
		
		
		JScrollPane scroll=new JScrollPane(kompanijaTree);
		scroll.setMinimumSize(new Dimension(200,150));
		JSplitPane split=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,scroll,desktop);
		split.setDividerLocation(150);
		setLocationRelativeTo(null);
		
		
		add(split,BorderLayout.CENTER);
		add(toolbar, BorderLayout.NORTH);
		
		
		
		
		
		

	}
	
	
	
	public static GlavniFrame getInstance () {
		if (instance == null) {
			instance = new GlavniFrame();
			instance.initialise();
			
		}
		return instance;
	}
	
	private void initialiseWorkSpaceTree() {
		kompanijaTree = new KompanijaTree();
		KompanijaModel = new KompanijaModel();
		kompanijaTree.setModel(KompanijaModel);
	}
	
	public ActionManager getActionManager() {
		return actionManager;
	}
	public KompanijaTree getKompanijaTree() {
		return kompanijaTree;
	}
	public model.workspace.KompanijaModel getKompanijaModel() {
		return KompanijaModel;
	}
}
