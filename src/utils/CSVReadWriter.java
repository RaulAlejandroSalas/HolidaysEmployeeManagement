/**
 * 
 */
package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class CSVReadWriter {
	
	public void writeData(String pathFile) {
		try {
			CSVWriter writer = new CSVWriter(new FileWriter(pathFile));
			List<String[]> data= new ArrayList<String[]>();
			data.add(new String[] {"1","Nila","Guest","1","1"});
			data.add(new String[] {"2","Elsa","Finn","2","1"});
			data.add(new String[] {"2","Gaylord","Penrose","1","1"});
			data.add(new String[] {"3","Guy","Noda","1","2"});
			data.add(new String[] {"4","Hildegard","Ranney","1","1"});
			data.add(new String[] {"5","Lona","Barnhouse","2","1"});
			data.add(new String[] {"6","Jorge","Hubner","3","1"});
			data.add(new String[] {"7","Tierra","Steidl","2","1"});
			data.add(new String[] {"8","Brock","Lovins","1","2"});
			data.add(new String[] {"9","Lizette","Duty","1","1"});
			data.add(new String[] {"10","Vicki","Alberty","3","1"});
			data.add(new String[] {"11","Willene","Thigpen","2","1"});
			data.add(new String[] {"12","Renee","Ballantyne","1","1"});
			data.add(new String[] {"13","Eunice","Drennon","1","3"});
			data.add(new String[] {"14","Ora","Kellum","2","2"});
			data.add(new String[] {"15","Kimi","Schoenberger","3","3"});
			data.add(new String[] {"16","Ewa","Batts","1","1"});
			data.add(new String[] {"17","Jennine","Paige","1","3"});
			data.add(new String[] {"18","Hassie","Burbach","1","1"});
			data.add(new String[] {"19","Jin","Wisner","2","1"});
			data.add(new String[] {"20","Kathaleen","Tichenor","1","1"});
			data.add(new String[] {"21","Ludivina","Baltes","1","1"});
			data.add(new String[] {"22","Launa","Cadden","1","4"});
			data.add(new String[] {"23","Idella","Sinha","2","1"});
			data.add(new String[] {"24","Johnathan","Haswell","3","1"});
			data.add(new String[] {"25","Theo","Grieb","2","2"});
			data.add(new String[] {"26","Margret","Fandel","1","2"});
			data.add(new String[] {"27","Doyle","Granier","1","1"});
			data.add(new String[] {"28","Ruthann","Cordero","3","3"});
			data.add(new String[] {"29","Sunday","Ledonne","2","3"});
			
			writer.writeAll(data);
		    System.out.println("CSV File written successfully All at a time");
		    writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
