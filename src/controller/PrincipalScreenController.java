/**
 * 
 */
package controller;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;


import models.ApplicationModel;
import models.Deparment;
import models.Employee;
import ui.PrincipalScreen;
import ui.ProgressMonitorComponent;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class PrincipalScreenController {

	private PrincipalScreen principalScreen;
	private ApplicationModel appModel;
	
	public PrincipalScreenController(PrincipalScreen principalScreen, ApplicationModel appModel) {
		this.principalScreen = principalScreen;
		this.appModel = appModel;
		this.initView();
	}
	
	
	private void initView() {
		principalScreen.setBounds(0,0,640,535);
        principalScreen.setVisible(true);
        principalScreen.setResizable(false);
        principalScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principalScreen.setLocationRelativeTo(null);
	}
	
	
	public void initController() {
		this.principalScreen.getmINewCalulation().addActionListener(e->resetViewComponents());
		this.principalScreen.getmIHolidaysCalculation().addActionListener(e->calculateHolidays());
		this.principalScreen.getmIListOfEmployee().addActionListener(e->loadListOfEmployees());
		this.principalScreen.getmIExitApplication().addActionListener(e->System.exit(0));
		
	}
	
	
	
	private void loadListOfEmployees() {
		
		System.out.println("[INFO] Loading List Of Employees from File...");
		int result = this.principalScreen.getFileChooser().showOpenDialog(principalScreen);
		if(result== JFileChooser.APPROVE_OPTION) {
			File selectedFile = this.principalScreen.getFileChooser().getSelectedFile();
			/**1-when button is pressed, start a new thread to read the file. 
			  2-a new Thread is needed because we need to free the GUI update Thread to paint the 
			progress monitor
			***/
			new Thread() {
				public void run() {
					try {
						 new ProgressMonitorComponent(selectedFile.getAbsolutePath());
					}catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			}.start();
		}
	}


	private void calculateHolidays() {
		String employeeName,employeeLastFirstName,employeeLastSecondName,department,antiquity;
		employeeName=this.principalScreen.getTxtEmployeeName().getText().trim();
		employeeLastFirstName = this.principalScreen.getTxtEmployeeFirstLastName().getText().trim();
		employeeLastSecondName= this.principalScreen.getTxtEmployeeSecondLastName().getText().trim();
		department = this.principalScreen.getcBDepartmentOptions().getSelectedItem().toString();
		antiquity = this.principalScreen.getcBAntiquity().getSelectedItem().toString();
		this.appModel.setEmployee(new Employee(employeeName,employeeLastFirstName,employeeLastSecondName, 
antiquity, new Deparment(department)));
		System.out.println(this.appModel.getEmployee());
	}


	private void resetViewComponents() {
		this.principalScreen.getTxtEmployeeName().setText("");
		this.principalScreen.getTxtEmployeeFirstLastName().setText("");
		this.principalScreen.getTxtEmployeeSecondLastName().setText("");
	}


	
	
}
