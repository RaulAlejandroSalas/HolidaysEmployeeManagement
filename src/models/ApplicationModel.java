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
	private Employee employee;
	
	public ApplicationModel() {
		this.employeeName = new String();
		
	}

	@Override
	public String toString() {
		return "ApplicationModel [employeeName=" + employeeName + "]";
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

	public static APerson getEmployeeData() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
