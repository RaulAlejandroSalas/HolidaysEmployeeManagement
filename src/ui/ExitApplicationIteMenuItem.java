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
public class ExitApplicationIteMenuItem extends JMenuItem implements ICommand {

	private static final long serialVersionUID = 1L;

	@Override
	public void execute() {
		System.out.println("[INFO][ExitApplicationIteMenuItem] has been Execute Method invoked");
		System.exit(0);
		
	}
	
	public ExitApplicationIteMenuItem(String name) {
		super(name);
	}
	
}
