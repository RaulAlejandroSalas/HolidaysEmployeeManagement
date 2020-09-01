/**
 * 
 */
package models;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class ApplicationModel {
	private String employeeName;

	
	public ApplicationModel() {
		this.employeeName = new String();
	}

	@Override
	public String toString() {
		return "ApplicationModel [employeeName=" + employeeName + "]";
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	

}
