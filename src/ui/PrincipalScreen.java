/**
 * 
 */
package ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.PrincipalScreenController;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class PrincipalScreen extends JFrame {

	private static final long serialVersionUID = 1L;

	private JMenuBar menuBar;
	// Menus
	private JMenu optionsMenu, calculateMenu, aboutUsMenu;
	// ItemsMenu
	private JMenuItem  mIAboutUs, exitApplicationIteMenuItem, holidaysCalculationMenuItem, newCalulationMenuItem;
	 
	
	// Labels
	private JLabel lBLogo, lBWelcome, lBTitle, lBEmployeeName, lBEmployeeFirstLastName, lBEmployeeSecondLastName,
			lBDeparment, lBAntiquity, lBResult, lBFooter;
	// TextFields
	private JTextField txtEmployeeName, txtEmployeeFirstLastName, txtEmployeeSecondLastName;
	// ScrollPane
	private JScrollPane scrollPane;
	// TextArea
	private JTextArea textArea;
	//ComboBox
	private JComboBox<String> cBDepartmentOptions,cBAntiquity;
	
	

	

	public PrincipalScreen() {
		setLayout(null);
		setTitle("Principal Screen");
		getContentPane().setBackground(new Color(255, 0, 0));
		this.initComponents();
	}

	private void initComponents() {
		this.initNavBarComponents();
		this.initPositionTopComponents();
		this.initPositionCenterComponents();
		this.initFooterComponents();
	}
	
	

	private void initNavBarComponents() {
		// Setting MenuBar
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 0, 0));
		setJMenuBar(menuBar);

		// Adding Options inside of the MenuBar
		optionsMenu = new JMenu("Options");
		optionsMenu.setBackground(new Color(255, 0, 0)); // Background color Red
		optionsMenu.setFont(new Font("Andale Mono", 1, 14)); // bold font and size 14
		optionsMenu.setForeground(new Color(255, 255, 255)); // foreground color White
		menuBar.add(optionsMenu);

		// Adding MenuItems to OptionsMenu
		newCalulationMenuItem = new NewCalulationMenuItem("New");
		newCalulationMenuItem.setFont(new Font("Andale Mono", 1, 14)); // bold font and size 14
		newCalulationMenuItem.setForeground(new Color(255, 0, 0)); // foreground color White
		optionsMenu.add(newCalulationMenuItem);
		newCalulationMenuItem.addActionListener(new PrincipalScreenController(this));

		exitApplicationIteMenuItem = new ExitApplicationIteMenuItem("Exit");
		exitApplicationIteMenuItem.setFont(new Font("Andale Mono", 1, 14)); // bold font and size 14
		exitApplicationIteMenuItem.setForeground(new Color(255, 0, 0)); // foreground color White
		optionsMenu.add(exitApplicationIteMenuItem);
		exitApplicationIteMenuItem.addActionListener(new PrincipalScreenController(this));

		calculateMenu = new JMenu("Calculate");
		calculateMenu.setBackground(new Color(255, 0, 0)); // Background color Red
		calculateMenu.setFont(new Font("Andale Mono", 1, 14)); // bold font and size 14
		calculateMenu.setForeground(new Color(255, 255, 255)); // foreground color White
		menuBar.add(calculateMenu);

		// Adding Menus Items
		holidaysCalculationMenuItem = new HolidaysCalculationMenuItem("Holidays");
		holidaysCalculationMenuItem.setFont(new Font("Andale Mono", 1, 14)); // bold font and size 14
		holidaysCalculationMenuItem.setForeground(new Color(255, 0, 0)); // foreground color White
		calculateMenu.add(holidaysCalculationMenuItem);
		
		holidaysCalculationMenuItem.addActionListener(new PrincipalScreenController(this));

		aboutUsMenu = new JMenu("About Us...");
		aboutUsMenu.setBackground(new Color(255, 0, 0)); // Background color Red
		aboutUsMenu.setFont(new Font("Andale Mono", 1, 14)); // bold font and size 14
		aboutUsMenu.setForeground(new Color(255, 255, 255)); // foreground color White
		menuBar.add(aboutUsMenu);

		mIAboutUs = new JMenuItem("The Creator");
		mIAboutUs.setFont(new Font("Andale Mono", 1, 14)); // bold font and size 14
		mIAboutUs.setForeground(new Color(255, 0, 0)); // foreground color White
		mIAboutUs.addActionListener(listener-> JOptionPane.showMessageDialog(null, "This project has beed develop by Lic.Raul Alejandro Salas Texido"));
		aboutUsMenu.add(mIAboutUs);
	}

	private void initPositionTopComponents() {
		// Setting Labels and Text Components Principal Screen Top Position
		ImageIcon logoImage = new ImageIcon("images/logo-coca.png");
		lBLogo = new JLabel(logoImage);
		lBLogo.setBounds(5, 5, 250, 100);
		add(lBLogo);

		lBWelcome = new JLabel("Welcome " + PrincipalScreenController.getAppModelState());
		lBWelcome.setBounds(280, 30, 300, 50);
		lBWelcome.setFont(new Font("Andale Mono", 1, 30));
		lBWelcome.setForeground(new Color(255, 255, 255));
		add(lBWelcome);

		lBTitle = new JLabel("Employee Data for Calculate Holidays Time");
		lBTitle.setBounds(45, 140, 900, 25);
		lBTitle.setFont(new Font("Andale Mono", 0, 24));
		lBTitle.setForeground(new Color(255, 255, 255));
		add(lBTitle);

	}

	private void initPositionCenterComponents() {
		// Setting Labels and Text Components Principal Screen Center Position
		lBEmployeeName = new JLabel("Employee Name:");
		lBEmployeeName.setBounds(25, 188, 180, 25);
		lBEmployeeName.setFont(new Font("Andele Mono",1,12));
		lBEmployeeName.setForeground(new Color(255,255,255));
		add(lBEmployeeName);
		
		txtEmployeeName = new JTextField();
		txtEmployeeName.setBounds(25,213,150,25);
		txtEmployeeName.setBackground(new Color(224,224,224));
		txtEmployeeName.setForeground(new Color(255,0,0));
		add(txtEmployeeName);
		
		//FistLastName
		lBEmployeeFirstLastName = new JLabel("Employee First Last Name:");
		lBEmployeeFirstLastName.setBounds(25, 248, 180, 25);
		lBEmployeeFirstLastName.setFont(new Font("Andele Mono",1,12));
		lBEmployeeFirstLastName.setForeground(new Color(255,255,255));
		add(lBEmployeeFirstLastName);
		
		txtEmployeeFirstLastName = new JTextField();
		txtEmployeeFirstLastName.setBounds(25,273,150,25);
		txtEmployeeFirstLastName.setBackground(new Color(224,224,224));
		txtEmployeeFirstLastName.setForeground(new Color(255,0,0));
		add(txtEmployeeFirstLastName);
		
		//SecondLastName
		lBEmployeeSecondLastName = new JLabel("Employee Second Last Name:");
		lBEmployeeSecondLastName.setBounds(25, 308, 180, 25);
		lBEmployeeSecondLastName.setFont(new Font("Andele Mono",1,12));
		lBEmployeeSecondLastName.setForeground(new Color(255,255,255));
		add(lBEmployeeSecondLastName);
		
		txtEmployeeSecondLastName = new JTextField();
		txtEmployeeSecondLastName.setBounds(25,334,150,25);
		txtEmployeeSecondLastName.setBackground(new Color(224,224,224));
		txtEmployeeSecondLastName.setForeground(new Color(255,0,0));
		add(txtEmployeeSecondLastName);
		
		/**
		 * 
		 * Setting Section Department
		 * 
		 * **/
		lBDeparment = new JLabel("Select Department:");
		lBDeparment.setBounds(220, 188, 180, 25);
		lBDeparment.setFont(new Font("Andele Mono",1,12));
		lBDeparment.setForeground(new Color(255,255,255));
		add(lBDeparment);
		
			//ComboBox Departments Data
			cBDepartmentOptions = new JComboBox<String>();
			cBDepartmentOptions.setBounds(220, 213, 220, 25);
			cBDepartmentOptions.setBackground(new Color(224,224,224));
			cBDepartmentOptions.setFont(new Font("Andele Mono", 1, 12));
			cBDepartmentOptions.setForeground(new Color(255,0,0));
			/*
			 * TODO here I must to improve the implementation 
			 * */
			cBDepartmentOptions.addItem("");
			cBDepartmentOptions.addItem("Customer service");
			cBDepartmentOptions.addItem("Logistics department");
			cBDepartmentOptions.addItem("Management department");
			add(cBDepartmentOptions);
		
		/**
		 * Setting Section Antiquity
		 * **/
		lBAntiquity = new JLabel("Select Antiquity:");
		lBAntiquity.setBounds(220,248, 180, 25);
		lBAntiquity.setFont(new Font("Andele Mono", 1, 12));
		lBAntiquity.setForeground(new Color(255,255,255));
		add(lBAntiquity);
			//ComboBox Antiquity Data
			cBAntiquity = new JComboBox<String>();
			cBAntiquity.setBounds(220, 273, 220, 25);
			cBAntiquity.setBackground(new Color(224,224,224));
			cBAntiquity.setFont(new Font("Andele Mono", 1, 12));
			cBAntiquity.setForeground(new Color(255,0,0));
			cBAntiquity.addItem("");
			cBAntiquity.addItem("1 year of service");
			cBAntiquity.addItem("2 to 6 years of service");
			cBAntiquity.addItem("7 years or more of service");
			add(cBAntiquity);
			
		/**
		 * Setting Section Result
		 * */
		lBResult = new JLabel("Calculation Result:");
		lBResult.setBounds(220, 307,180, 25);
		lBResult.setFont(new Font("Andele Mono",1,12));
		lBResult.setForeground(new Color(255,255,255));
		add(lBResult);
		
			textArea =  new JTextArea();
			textArea.setEditable(false);
			textArea.setBackground(new Color(224,224,224));
			textArea.setFont(new Font("Andale Mono",1,11));
			textArea.setForeground(new Color(255,0,0));
			textArea.setText("\n  Here the result of the vacation calculation will appear");
			scrollPane = new JScrollPane(textArea);
			scrollPane.setBounds(220, 333, 385, 90);
			add(scrollPane);
		
	}
	
	


	/**
	 * @return the txtEmployeeName
	 */
	public JTextField getTxtEmployeeName() {
		return txtEmployeeName;
	}

	/**
	 * @param txtEmployeeName the txtEmployeeName to set
	 */
	public void setTxtEmployeeName(JTextField txtEmployeeName) {
		this.txtEmployeeName = txtEmployeeName;
	}

	/**
	 * @return the txtEmployeeFirstLastName
	 */
	public JTextField getTxtEmployeeFirstLastName() {
		return txtEmployeeFirstLastName;
	}

	/**
	 * @param txtEmployeeFirstLastName the txtEmployeeFirstLastName to set
	 */
	public void setTxtEmployeeFirstLastName(JTextField txtEmployeeFirstLastName) {
		this.txtEmployeeFirstLastName = txtEmployeeFirstLastName;
	}

	/**
	 * @return the txtEmployeeSecondLastName
	 */
	public JTextField getTxtEmployeeSecondLastName() {
		return txtEmployeeSecondLastName;
	}

	/**
	 * @param txtEmployeeSecondLastName the txtEmployeeSecondLastName to set
	 */
	public void setTxtEmployeeSecondLastName(JTextField txtEmployeeSecondLastName) {
		this.txtEmployeeSecondLastName = txtEmployeeSecondLastName;
	}

	/**
	 * @return the textArea
	 */
	public JTextArea getTextArea() {
		return textArea;
	}

	/**
	 * @param textArea the textArea to set
	 */
	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	/**
	 * @return the cBDepartmentOptions
	 */
	public JComboBox<String> getcBDepartmentOptions() {
		return cBDepartmentOptions;
	}

	/**
	 * @param cBDepartmentOptions the cBDepartmentOptions to set
	 */
	public void setcBDepartmentOptions(JComboBox<String> cBDepartmentOptions) {
		this.cBDepartmentOptions = cBDepartmentOptions;
	}

	/**
	 * @return the cBAntiquity
	 */
	public JComboBox<String> getcBAntiquity() {
		return cBAntiquity;
	}

	/**
	 * @param cBAntiquity the cBAntiquity to set
	 */
	public void setcBAntiquity(JComboBox<String> cBAntiquity) {
		this.cBAntiquity = cBAntiquity;
	}

	/**
	 * 
	 */
	private void initFooterComponents() {
		lBFooter = new JLabel("© 2020 The Coca-Cola Company | All rights reserved");
		lBFooter.setBounds(135, 445, 500, 30);
		lBFooter.setFont(new Font("Andele Mono",1,12));
		lBFooter.setForeground(new Color(255,255,255));
		add(lBFooter);
	}

}
