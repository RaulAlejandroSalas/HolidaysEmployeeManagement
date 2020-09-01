/**
 * 
 */
package ui;

import javax.swing.JMenuItem;

import interfaces.ICommand;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class NewCalulationMenuItem  extends JMenuItem implements ICommand{

	private static final long serialVersionUID = 1L;

	@Override
	public void execute() {
		System.out.println("[INFO][NewCalulationMenuItem] has been method execute invoked");
		
	}
	
	
	public NewCalulationMenuItem(String name){
		super(name);
	}
	
}
