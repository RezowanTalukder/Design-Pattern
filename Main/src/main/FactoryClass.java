package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FactoryClass {
	ArrayList<ICommand> command=new ArrayList<>();
	ArrayList<ICommand> undo=new ArrayList<>();
	
	public FactoryClass() {
		
	}
	
	public void addCommand(ICommand com) {
		
		com.execute();
		command.add(com);
	}
	
	public void undo() {
		
		command.get(command.size()-1).undo();
		undo.add(command.get(command.size()-1));
		command.remove(command.size()-1);
                if(command.size()==0){
                    JOptionPane.showMessageDialog(null, "NO more undo possible");
                }
	}
	
	public void redo() {
		
		if(undo.size()>0) {
			undo.get(undo.size()-1).redo();
			command.add(undo.get(undo.size()-1));
			undo.remove(undo.size()-1);
		}
	}

}
