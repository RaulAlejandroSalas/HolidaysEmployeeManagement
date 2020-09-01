/**
 * 
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import models.ApplicationModel;
import ui.PrincipalScreen;
import ui.TermsAndUseScreen;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class TermAndUseController implements ActionListener, ChangeListener {
	private TermsAndUseScreen termsAndUseScreen;
	
	
	public TermAndUseController(TermsAndUseScreen termsAndUseScreen) {
		this.termsAndUseScreen = termsAndUseScreen;
	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		System.out.println("[INFO][TERM-USE-SCREEN] State has been Changed");
		if(this.termsAndUseScreen.getChAccept().isSelected()) {
			this.termsAndUseScreen.getBtnAccept().setEnabled(true);
			this.termsAndUseScreen.getBtnCancel().setEnabled(false);
		}else {
			this.termsAndUseScreen.getBtnAccept().setEnabled(false);
			this.termsAndUseScreen.getBtnCancel().setEnabled(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("[INFO][TERM-USE-SCREEN] Action has been Dispatched");
		if(e.getSource().equals(this.termsAndUseScreen.getBtnAccept())) {
			System.out.println("[INFO][TERM-USE-SCREEN] Action Accept has been Dispatched");	
			PrincipalScreen principalScreen = new PrincipalScreen();
			principalScreen.setBounds(0,0,640,535);
			principalScreen.setVisible(true);
			principalScreen.setResizable(false);
			principalScreen.setLocationRelativeTo(null);
			this.termsAndUseScreen.setVisible(false);
		}else {
			System.out.println("[INFO][TERM-USE-SCREEN] Action Cancel has been Dispatched");
		}
	}
	
	
	public static String getAppModelState() {
		return ApplicationModel.getEmployeeName();
	}
	
	
	
	

}
