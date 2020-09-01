/**
 * 
 */
package main;

import javax.swing.SwingUtilities;

import ui.PrincipalScreen;
import ui.TermsAndUseScreen;
import ui.WelcomeScreen;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
				try {
					WelcomeScreen welcomeScreen = new WelcomeScreen();
					welcomeScreen.setBounds(0,0,350,450);
					welcomeScreen.setResizable(false);
					welcomeScreen.setVisible(true);
					welcomeScreen.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
//		TermsAndUseScreen termsAndUseScreen = new TermsAndUseScreen();
//		termsAndUseScreen.setBounds(0,0,600,360);
//		termsAndUseScreen.setResizable(false);
//		termsAndUseScreen.setVisible(true);
//		termsAndUseScreen.setLocationRelativeTo(null);
		
//		PrincipalScreen principalScreen = new PrincipalScreen();
//		principalScreen.setBounds(0,0,640,535);
//		principalScreen.setVisible(true);
//		principalScreen.setResizable(false);
//		principalScreen.setLocationRelativeTo(null);

		
	}

}
