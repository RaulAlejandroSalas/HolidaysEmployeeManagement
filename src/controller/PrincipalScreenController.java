/**
 * 
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import interfaces.ICommand;
import models.ApplicationModel;
import ui.PrincipalScreen;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class PrincipalScreenController implements ActionListener {

	private PrincipalScreen principalScreen;
	
	public PrincipalScreenController(PrincipalScreen principalScreen) {
		this.principalScreen = principalScreen;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Setting in the Application Model the Employee Data for the UI Components
		String employeeName = this.principalScreen.getTxtEmployeeName().getText().trim();
		String employeeFirstName = this.principalScreen.getTxtEmployeeFirstLastName().getText().trim();
		String employeeSecondName = this.principalScreen.getTxtEmployeeFirstLastName().getText().trim();
		if(employeeName.equals("")|| employeeFirstName.equals("") || employeeSecondName.equals("")) {
			JOptionPane.showMessageDialog(null, "The Input data Cannot Empty");
		}else {
			//Command Invoker(Caller)
			ICommand command = (ICommand)e.getSource();
			command.execute();
		}
	}

	public static String getAppModelState() {
		return ApplicationModel.getEmployeeName();
	}
}
