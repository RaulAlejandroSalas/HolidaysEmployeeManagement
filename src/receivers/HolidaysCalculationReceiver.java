/**
 * 
 */
package receivers;

import interfaces.APerson;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class HolidaysCalculationReceiver {
	
	public int calculate(APerson person) {
		if(person.equals(null)) {
			System.out.println("[INFO][Execute][HolidaysCalculationReceiver] calulate");
		}
		System.out.println("[INFO][Execute][HolidaysCalculationReceiver] calulate");
		return 1;
	}
	
}
