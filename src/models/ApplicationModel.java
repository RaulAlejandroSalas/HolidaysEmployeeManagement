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
	private static String userAuthenticateName;
	private Employee employee;
	
	
	public ApplicationModel() {
		this.userAuthenticateName = new String();
	}

	/**
	 * @return the userAuthenticateName
	 */
	public static String getUserAuthenticateName() {
		return userAuthenticateName;
	}

	/**
	 * @param userAuthenticateName the userAuthenticateName to set
	 */
	public void setUserAuthenticateName(String userAuthenticateName) {
		ApplicationModel.userAuthenticateName = userAuthenticateName;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
    

}
