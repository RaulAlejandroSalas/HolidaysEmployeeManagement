/**
 * 
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfaces.ICommand;
import models.ApplicationModel;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class PrincipalScreenController implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//Command Invoker(Caller)
		ICommand command = (ICommand)e.getSource();
		command.execute();
	}

	public static String getAppModelState() {
		return ApplicationModel.getEmployeeName();
	}
}
