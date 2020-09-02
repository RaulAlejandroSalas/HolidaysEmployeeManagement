/**
 * 
 */
package ui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class ListEmployeeScreen extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTable employeesListTable;
	private JScrollPane jScrollPane;
	
	public ListEmployeeScreen() {
		setLayout(null);
		setTitle("List of Employees");
		getContentPane().setBackground(new Color(255, 0, 0));
		this.initComponents();
	}
	
	private void initComponents() {
		
	}
	
	
}
