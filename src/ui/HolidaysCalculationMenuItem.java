/**
 * 
 */
package ui;

import javax.swing.JMenuItem;

import interfaces.ICommand;
import models.ApplicationModel;
import models.Employee;
import receivers.HolidaysCalculationReceiver;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class HolidaysCalculationMenuItem extends JMenuItem implements ICommand {

	private static final long serialVersionUID = 1L;

	private HolidaysCalculationReceiver calculationReceiver;
	
	@Override
	public void execute() {
		calculationReceiver.calculate(ApplicationModel.getEmployeeData());
	}
	
	public HolidaysCalculationMenuItem(String name) {
		super(name);
	}
	
}
