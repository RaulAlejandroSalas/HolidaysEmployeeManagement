/**
 * 
 */
package main;

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
//		WelcomeScreen welcomeScreen = new WelcomeScreen();
//		welcomeScreen.setBounds(0,0,350,450);
//		welcomeScreen.setResizable(false);
//		welcomeScreen.setVisible(true);
//		welcomeScreen.setLocationRelativeTo(null);
		
		TermsAndUseScreen termsAndUseScreen = new TermsAndUseScreen();
		termsAndUseScreen.setBounds(0,0,600,360);
		termsAndUseScreen.setResizable(false);
		termsAndUseScreen.setVisible(true);
		termsAndUseScreen.setLocationRelativeTo(null);

	}

}
