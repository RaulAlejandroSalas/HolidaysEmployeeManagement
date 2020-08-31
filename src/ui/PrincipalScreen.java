/**
 * 
 */
package ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class PrincipalScreen extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JMenuBar menuBar;
	//Menus
	private JMenu optionsMenu,calculateMenu, aboutUsMenu;
	//ItemsMenu
	private JMenuItem mICalculus,mIAboutUs,mIExit,mINew;
	//Labels
	private JLabel lBLogo,lBWelcome,lBTitle,lBEmployeeName,lBEmployeeFirstLastName,lBEmployeeSecondLastName,
				   lBDeparment,lBAntiquity,lBResult,lBFooter;
	//TextFields
	private JTextField txtEmployeeName,txtEmployeeFirstLastName,txtEmployeeSecondLastName;
	//ScrollPane
	private JScrollPane scrollPane;
	//TextArea
	private JTextArea textArea;
	
	
	public PrincipalScreen() {
		setLayout(null);
		setTitle("Principal Screen");
		getContentPane().setBackground(new Color(255,0,0));
		this.initComponents();
	}

	private void initComponents() {
		//Setting MenuBar 
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255,0,0));
		setJMenuBar(menuBar);
		
		//Adding Options inside of the MenuBar
		optionsMenu = new JMenu("Options");
		optionsMenu.setBackground(new Color(255,0,0)); //Background color Red
		optionsMenu.setFont(new Font("Andale Mono",1,14)); //bold font and size 14
		optionsMenu.setForeground(new Color(255,255,255)); //foreground color White
		menuBar.add(optionsMenu);
		
		//Adding MenuItems to OptionsMenu
		mINew = new JMenuItem("New");
		mINew.setFont(new Font("Andale Mono",1,14)); //bold font and size 14
		mINew.setForeground(new Color(255,0,0)); //foreground color White
		optionsMenu.add(mINew);
		
		mIExit = new JMenuItem("Exit");
		mIExit.setFont(new Font("Andale Mono",1,14)); //bold font and size 14
		mIExit.setForeground(new Color(255,0,0)); //foreground color White
		optionsMenu.add(mIExit);
		
		
		calculateMenu = new JMenu("Calculate");
		calculateMenu.setBackground(new Color(255,0,0)); //Background color Red
		calculateMenu.setFont(new Font("Andale Mono",1,14)); //bold font and size 14
		calculateMenu.setForeground(new Color(255,255,255)); //foreground color White
		menuBar.add(calculateMenu);
		
		//Adding Menus Items
		mICalculus = new JMenuItem("Holidays");
		mICalculus.setFont(new Font("Andale Mono",1,14)); //bold font and size 14
		mICalculus.setForeground(new Color(255,0,0)); //foreground color White
		calculateMenu.add(mICalculus);
		
		
		aboutUsMenu = new JMenu("About Us...");
		aboutUsMenu.setBackground(new Color(255,0,0)); //Background color Red
		aboutUsMenu.setFont(new Font("Andale Mono",1,14)); //bold font and size 14
		aboutUsMenu.setForeground(new Color(255,255,255)); //foreground color White
		menuBar.add(aboutUsMenu);
		
		
		mIAboutUs = new JMenuItem("The Creator");
		mIAboutUs.setFont(new Font("Andale Mono",1,14)); //bold font and size 14
		mIAboutUs.setForeground(new Color(255,0,0)); //foreground color White
		aboutUsMenu.add(mIAboutUs);
		
		
		
		
		
		
		
	}

}
