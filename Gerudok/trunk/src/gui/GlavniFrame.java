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
import javax.swing.WindowConstants;
import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;

import javafx.scene.layout.Border;






public class GlavniFrame extends JFrame{
	private static GlavniFrame instance = null;
	public GlavniFrame () {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		setSize(screenHeight / 2, screenWidth / 2);
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
		
		gui.Menu menu = new gui.Menu(this);
		setJMenuBar(menu);
		Toolbar toolbar = new Toolbar();
		
		JDesktopPane desktop = new JDesktopPane();
		
		
		
		JTextArea textArea = new JTextArea("sample", 10, 10);
		JTextArea textArea2 = new JTextArea("Bla", 10, 10);
		JLabel lbl = new JLabel("Ovo je labela");
		JLabel lbl2 = new JLabel ("Ovo je isto labela");
		
		lbl2.setVerticalAlignment(SwingConstants.CENTER);
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setVerticalAlignment(SwingConstants.CENTER);
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		JTextField tf = new JTextField("textfield");
		
		JPanel panTop = new JPanel();
		panTop.setPreferredSize(new Dimension(100, 100));
		JTextArea area1= new JTextArea();
		panTop.add(new JScrollPane(area1));
		
		
		JPanel panCentar = new JPanel(new BorderLayout(20, 20));
		panCentar.setBackground(Color.LIGHT_GRAY);
		JPanel panTop2 = new JPanel();
		panTop2.setPreferredSize(new Dimension(100, 30));
		panTop2.add(tf);
		panCentar.add(panTop2, BorderLayout.NORTH);
		
		JScrollPane scrollPane2 = new JScrollPane(textArea2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panCentar.add(scrollPane2);
		JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		
		
		JPanel panLevi = new JPanel(new BorderLayout(20, 20));
		panLevi.setPreferredSize(new Dimension(100, 100));
		panLevi.add(scrollPane, BorderLayout.CENTER);
		
		JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panLevi, panCentar);
		
		sp.setOneTouchExpandable(true);
		sp.setDividerLocation(400);
		
		add(toolbar, BorderLayout.NORTH);
		add(sp, BorderLayout.CENTER);
		add(lbl, BorderLayout.SOUTH);
		add(desktop, BorderLayout.EAST);
		
		
		

	}
	
	public static GlavniFrame getInstance () {
		if (instance == null) {
			instance = new GlavniFrame();
			
		}
		return instance;
	}
}
