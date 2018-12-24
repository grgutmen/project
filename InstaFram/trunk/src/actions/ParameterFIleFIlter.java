package actions;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class ParameterFIleFIlter extends FileFilter{
	
	@Override
	public boolean accept(File f) {
		// TODO Auto-generated method stub
		return (f.isDirectory() || f.getName().toLowerCase().endsWith(".iproj"));
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "InstaFram project (*.iproj)";
	}

}
