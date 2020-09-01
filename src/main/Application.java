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
	}

}
