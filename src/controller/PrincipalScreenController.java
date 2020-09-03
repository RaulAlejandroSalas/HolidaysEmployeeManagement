/**
 * 
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import com.opencsv.exceptions.CsvValidationException;

import interfaces.IObserver;
import models.ApplicationModel;
import models.Deparment;
import models.Employee;
import ui.NewEmployeeScreen;
import ui.PrincipalScreen;
import ui.ProgressMonitorComponent;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class PrincipalScreenController implements IObserver {

	/**
	 * Attributes
	 * **/
	
	private PrincipalScreen principalScreen;
	private ApplicationModel appModel;
	
	public PrincipalScreenController(PrincipalScreen principalScreen, ApplicationModel appModel) {
		this.principalScreen = principalScreen;
		this.appModel = appModel;
		this.appModel.registerObserver(this);
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
		this.principalScreen.getmINewEmployee().addActionListener(e->createNewEmployee());
		this.principalScreen.getmIListOfEmployee().addActionListener(e->{
			try {
				loadListOfEmployees();
			} catch (CsvValidationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		this.principalScreen.getmIExitApplication().addActionListener(e->System.exit(0));
		
	}
	
	
	
	private void createNewEmployee() {
		NewEmployeeScreen newEmployeeScreen = new NewEmployeeScreen();
		newEmployeeScreen.setBounds(0,0,350,470);
		newEmployeeScreen.setVisible(true);
		newEmployeeScreen.setLocationRelativeTo(null);
	}


	private void loadListOfEmployees() throws CsvValidationException, IOException, InterruptedException {
		
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
						new ProgressMonitorComponent(selectedFile.getAbsolutePath(),appModel);
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




	@Override
	public void update(String event) {
		System.out.println("[INFO] Received a Notification");
		System.out.println(event);
		
	}


	
	
}
