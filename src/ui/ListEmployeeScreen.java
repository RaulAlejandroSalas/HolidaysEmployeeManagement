/**
 * 
 */
package ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
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
		getContentPane().setBackground(new Color(255,0,0));//adding background 
		GridBagLayout gridBagLayout = new GridBagLayout();
		setLayout(gridBagLayout);
		
		//Constrains 
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		
		employeesListTable = new JTable();
		employeesListTable.setBounds(180,40, 200,300);
		jScrollPane = new JScrollPane(employeesListTable);
		jScrollPane.setBounds(180,40, 200,300);
		add(jScrollPane);
		
		btnExport = new JButton("Export");
		add(btnExport);

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
