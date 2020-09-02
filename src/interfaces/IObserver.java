/**
 * 
 */
package interfaces;

import java.util.List;

import models.Employee;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public interface IObserver {
	void update(String event, List<Employee> employees );
}

