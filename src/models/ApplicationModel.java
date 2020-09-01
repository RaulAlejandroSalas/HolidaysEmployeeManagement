/**
 * 
 */
package models;
import interfaces.APerson;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class ApplicationModel {
	private static String employeeName;
	private static APerson employee;
	
	public ApplicationModel() {
		this.employeeName = new String();
	}
	
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public static String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeData(APerson person) {
		this.employee = person;
	}
	
	public static APerson getEmployeeData() {
		return employee;
	}
	

}
