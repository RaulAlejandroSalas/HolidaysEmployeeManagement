/**
 * 
 */
package controller;

import java.awt.Color;
import java.util.List;

import interfaces.IObserver;
import models.ApplicationModel;
import models.Employee;
import ui.ListEmployeeScreen;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class ListEmployeeController implements IObserver{
	private ListEmployeeScreen listEmployeeScreen;
	private ApplicationModel appModel;
	
	public ListEmployeeController(ListEmployeeScreen listEmployeeScreen, ApplicationModel applicationModel) {
		this.listEmployeeScreen = listEmployeeScreen;
		this.appModel = applicationModel;
		this.appModel.registerObserver(this);
		this.initView();
	}
	
	private void initView() {
		listEmployeeScreen.setBounds(0,0,600,535);
		listEmployeeScreen.setVisible(true);
		listEmployeeScreen.setResizable(false);
		listEmployeeScreen.setLocationRelativeTo(null);
	}
	
	
	public void initController() {
		
	}

	@Override
	public void update(String event, List<Employee> employees) {
		System.out.println("[INFO][LISTEMPLOYEECONTROLLER] Received a Notification");
		System.out.println(event);
		System.out.println(employees);
	
		
	}
}
