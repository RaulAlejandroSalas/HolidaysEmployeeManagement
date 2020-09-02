/**
 * 
 */
package controller;

import java.awt.Color;

import models.ApplicationModel;
import ui.ListEmployeeScreen;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class ListEmployeeController {
	private ListEmployeeScreen listEmployeeScreen;
	private ApplicationModel appModel;
	
	public ListEmployeeController(ListEmployeeScreen listEmployeeScreen, ApplicationModel applicationModel) {
		this.listEmployeeScreen = listEmployeeScreen;
		this.appModel = applicationModel;
		this.initView();
	}
	
	private void initView() {
		listEmployeeScreen.setBounds(0,0,640,535);
		listEmployeeScreen.setVisible(true);
		listEmployeeScreen.setResizable(false);
		listEmployeeScreen.setLocationRelativeTo(null);
	}
	
	
	public void initController() {
		
	}
}
