/**
 * 
 */
package controller;

import javax.swing.JOptionPane;

import models.ApplicationModel;
import ui.NewEmployeeScreen;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class NewEmployeeController {
	
	private NewEmployeeScreen newEmployeeScreen;
	private ApplicationModel applicationModel;
	
	
	public NewEmployeeController(NewEmployeeScreen newEmployeeScreen, ApplicationModel applicationModel) {
		this.newEmployeeScreen = newEmployeeScreen;
		this.applicationModel = applicationModel;
		this.initView();
	}


	private void initView() {
		newEmployeeScreen.setBounds(0,0,350,470);
		newEmployeeScreen.setVisible(true);
		newEmployeeScreen.setLocationRelativeTo(null);
	}
	
	public void initController() {
		newEmployeeScreen.getBtnEnter().addActionListener(e->createNewEmployee());
		
	}


	private void createNewEmployee() {
		//Check if the data of the form are Empty
		System.out.println(newEmployeeScreen.getcBDepartmentOptions().getSelectedIndex());
		String obj = "";
		if(newEmployeeScreen.getTextEmployeeName().equals(obj) || 
		   newEmployeeScreen.getTxtEmployeeLastFirstName().equals(obj) || 
		   newEmployeeScreen.getTxtEmployeeLastSecondName().equals(obj) || 
		   newEmployeeScreen.getcBAntiquity().getSelectedIndex()==0 || 
		   newEmployeeScreen.getcBDepartmentOptions().getSelectedIndex()==0) {
			JOptionPane.showMessageDialog(null, "Sorry,The data cannnot be empty...");
		}else {
			System.out.println("OKOKOK");
		}
	}
	
	
	
	
}
