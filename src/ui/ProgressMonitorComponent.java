/**
 * 
 */
package ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.exceptions.CsvValidationException;

import models.Employee;


/**
 * @author Lic. Raul Alejandro Salas Texido
 *
 */
public class ProgressMonitorComponent extends JFrame{

	private static final long serialVersionUID = 1L;
	private JProgressBar progressBar;
	private String filePath;
	public ProgressMonitorComponent(String filePath) throws CsvValidationException, IOException, InterruptedException {
		this.filePath = filePath;
		this.initView();
	}
	
	private void initView() throws CsvValidationException, IOException, InterruptedException {
	    GridBagLayout layout = new GridBagLayout();
	    GridBagConstraints cons = new GridBagConstraints();
		setTitle("Please wait, Loading List of Employees...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0,350,90);
		setLocationRelativeTo(null);
		
		this.progressBar = new JProgressBar();
		this.progressBar.setValue(0);
		this.progressBar.setStringPainted(true);
		this.progressBar.setForeground(new Color(255,0,0));
		
	
		layout.addLayoutComponent(this.progressBar, cons);
		add(this.progressBar);
		setVisible(true);
		//fill();
		File file = new File(this.filePath);
		FileReader fileReader = new FileReader(file);
		CSVReader csvReader = new CSVReader(fileReader);

		long totalLengthFile = file.length();
		double lengthPercent = 100.0/ totalLengthFile;
		long readLength=0;
		
		String[] nextRecord;
		while ((nextRecord=csvReader.readNext()) !=null) {
			readLength += nextRecord.length;
			System.out.println("Id: " + nextRecord[0]);
			System.out.println("EmployeeName: " + nextRecord[1]);
			System.out.println("firstLastName: " + nextRecord[2]);
			System.out.println("secondLastName: " + nextRecord[3]);
			Thread.sleep(500);
		    System.out.println("==========================");	
		    this.progressBar.setValue((int)Math.round(lengthPercent*readLength));
		}
		this.progressBar.setValue(100);
		fileReader.close();
		csvReader.close();
	}
	
			
}
