/**
 * 
 */
package interfaces;

import java.util.List;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public interface IObserver {
	void update(String event, List<APerson> employees );
}

