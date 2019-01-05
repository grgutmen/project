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
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;

import actions.ActionManager;
import controller.TreeController;
import model.workspace.Project;
import model.workspace.WorkSpaceModel;
import model.workspace.Parameter;
import model.workspace.Workspace;
import view.CellEditor;
import view.CellRenderer;







public class GlavniFrame extends JFrame{
	private static GlavniFrame instance = null;
	private ActionManager actionManager;
	private JScrollPane sp = null;
	private JPanel radniPanel = null;
	private PanelDoleDesno doleDesno = null;
	private Tree tree = null;
	private StatusBar statusBar = null;
	private JTextArea textArea = null;
	private Workspace workspace;
	private WorkSpaceModel workspaceModel;
	private TreeController treeCont;
	
	
	private void initialise() {
		actionManager=new ActionManager();
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
		setTitle ("InstaFram");
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
		
		
		PanelDoleDesno doledesno = new PanelDoleDesno();
		
		
		JTextArea textArea = new JTextArea();
		
		JPanel radniPanel = new JPanel();
		radniPanel.setLayout(new BorderLayout());
		JScrollPane sp2 = new JScrollPane(textArea);
		radniPanel.add(sp2, BorderLayout.CENTER);
		
		JSplitPane split2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, radniPanel, doledesno);
		split2.setDividerLocation(350);
		
		tree = initialiseTree();
		JScrollPane sp = new JScrollPane(tree);
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sp, split2);
		splitPane.setDividerLocation(150);
		
		statusBar = new StatusBar();
		
		add(splitPane,BorderLayout.CENTER);
		add(toolbar, BorderLayout.NORTH);
		add(statusBar, BorderLayout.SOUTH);
		
		setVisible(true);
		
		
		

	}
	
	
	private Tree initialiseTree() {
		tree = new Tree();
		ToolTipManager.sharedInstance().registerComponent(tree);
		workspaceModel = new WorkSpaceModel();
		tree.setModel(workspaceModel);
		treeCont = new TreeController();
		tree.addTreeSelectionListener(treeCont);
			
			
		return tree;
		
	}
	
	public static GlavniFrame getInstance () {
		if (instance == null) {
			instance = new GlavniFrame();
			instance.initialise();
			
		}
		return instance;
	}
	
	
	
	public ActionManager getActionManager() {
		return actionManager;
	}
	public Tree getTree() {
		return tree;
	}
	public JPanel getRadniPanel() {
		return radniPanel;
	}
	public PanelDoleDesno getDoleDesno() {
		return doleDesno;
	}
	public JTextArea getTextArea() {
		return textArea;
	}
	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}
	
}
