/**
 * 
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.JOptionPane;

import models.ApplicationModel;
import ui.WelcomeScreen;

/**
 * @author Lic.Raul Alejandro Salas texido
 *
 */
public class WelcomeScreenController implements ActionListener {
	
	private WelcomeScreen welcomeScreen;
	private ApplicationModel appModel;
	
	public WelcomeScreenController(WelcomeScreen welcomeScreen) {
		this.welcomeScreen = welcomeScreen;
		this.appModel = new ApplicationModel();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("[INFO] Click button Enter...");
		appModel.setEmployeeName(welcomeScreen.getTextEmployeeName().getText().trim());
		if(isNotValidInput(appModel.getEmployeeName())) {
			System.out.println("[INFO] Text Empty");
			JOptionPane.setDefaultLocale(Locale.ENGLISH);
			JOptionPane.showMessageDialog(null, "You must enter the name");
		}else {
			//navigate next Screen
		}
	}
	
	private Boolean isNotValidInput(String input) {
		return input.equals("");
	}
	
}
