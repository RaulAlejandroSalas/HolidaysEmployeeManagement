/**
 * 
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.JOptionPane;

import models.ApplicationModel;
import ui.TermsAndUseScreen;
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
			TermsAndUseScreen termsAndUseScreen = new TermsAndUseScreen();
			termsAndUseScreen.setBounds(0,0,600,360);
			termsAndUseScreen.setResizable(false);
			termsAndUseScreen.setVisible(true);
			termsAndUseScreen.setLocationRelativeTo(null);
			welcomeScreen.setVisible(false);
		}
	}
	
	private Boolean isNotValidInput(String input) {
		return input.equals("");
	}
	
}
