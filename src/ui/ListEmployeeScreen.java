/**
 * 
 */
package ui;

import java.awt.Color;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import models.Employee;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class ListEmployeeScreen extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTable employeesListTable;
	private JScrollPane jScrollPane;
	private final static String[]  jTableColumns= {"EmployeeName","EmployeeLastName", "Department","Antiquity"};
	public ListEmployeeScreen() {
		setTitle("List of Employees");
		employeesListTable = new JTable();
		employeesListTable.setBounds(180,40, 200,300);
		jScrollPane = new JScrollPane(employeesListTable);
		jScrollPane.setBounds(180,40, 200,300);
		add(jScrollPane);

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
