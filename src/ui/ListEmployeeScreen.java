/**
 * 
 */
package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.Employee;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class ListEmployeeScreen extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JLabel blTitle;
	private JTable employeesListTable;
	private JButton btnExport;
	
	/**
	 * @return the btnExport
	 */
	public JButton getBtnExport() {
		return btnExport;
	}



	/**
	 * @param btnExport the btnExport to set
	 */
	public void setBtnExport(JButton btnExport) {
		this.btnExport = btnExport;
	}



	private JScrollPane jScrollPane;
	public ListEmployeeScreen() {
		setTitle("List of Employees");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255,0,0));
		getContentPane().add(panel,BorderLayout.NORTH);
		
		//Instance Visual Components
		blTitle = new JLabel("List of Employees");
		panel.add(blTitle);
		
		
		blTitle.setFont(new Font("Andele Mono",1,18));
		blTitle.setBackground(new Color(255,255,255));
		
		employeesListTable = new JTable();
		jScrollPane = new JScrollPane(employeesListTable);		
		
		getContentPane().add(jScrollPane, BorderLayout.CENTER);
		btnExport = new JButton("Export");
		btnExport.setBackground(new Color(255,255,255));
		btnExport.setFont(new Font("Andele Mono",1,14));
		btnExport.setForeground(new Color(255,0,0));
		getContentPane().add(btnExport, BorderLayout.SOUTH);
		
		
		
		
	}
	
	
	
	public void insertDataTable(List<Employee> employees) {
		DefaultTableModel tableModel = (DefaultTableModel)this.employeesListTable.getModel();
		tableModel.addColumn("EmployeeName");
		tableModel.addColumn("EmployeeLastName");
		tableModel.addColumn("Department");
		tableModel.addColumn("Antiquity");
         for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			Object o[]= {employee.getName(),employee.getLastName(), employee.getDepartment().getName(), employee.getAntiquity()};
			System.out.println("[INFO] insert " + employee + "to table");
			tableModel.addRow(o);
		}
		

	}
	
}
