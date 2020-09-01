/**
 * 
 */
package models;

import enums.Antiquity;
import interfaces.APerson;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class Employee extends APerson{
	
	public Employee(String name, String firstLastName, String secondLastName, Antiquity antiquity , Deparment department) {
		this.name=name;
		this.firstLastName = firstLastName;
		this.secondLastName = secondLastName;
		this.antiquity = antiquity;
		this.deparment = department;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Antiquity getAntiquity() {
		return this.antiquity;
	}
	
	public Deparment getDepartment() {
		return this.deparment;
	}

	@Override
	public String toString() {
		return "Employee: { name: " + name + ", firstLastName: " + firstLastName + ", secondLastName: " + secondLastName
				+ ", deparment: " + deparment + ", antiquity: " + antiquity + "}";
	}
	
	
	
	
	

	
	
	
}
