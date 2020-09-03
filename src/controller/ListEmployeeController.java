/**
 * 
 */
package controller;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;

import interfaces.IObserver;
import models.ApplicationModel;
import models.Employee;
import ui.ListEmployeeScreen;
import utils.PDFDocument;
import utils.PDFGenerator;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class ListEmployeeController implements IObserver{
	private ListEmployeeScreen listEmployeeScreen;
	private ApplicationModel appModel;
	
	public ListEmployeeController(ListEmployeeScreen listEmployeeScreen, ApplicationModel applicationModel) {
		this.listEmployeeScreen = listEmployeeScreen;
		this.appModel = applicationModel;
		this.appModel.registerObserver(this);
		this.initView();
	}
	
	private void initView() {
		listEmployeeScreen.setBounds(0,0,600,535);	
		listEmployeeScreen.setVisible(true);
		listEmployeeScreen.setResizable(false);
		listEmployeeScreen.setLocationRelativeTo(null);
	}
	
	
	public void initController() {
		this.listEmployeeScreen.getBtnExport().addActionListener(l->{
			try {
				exportBtnHandle();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

	private void exportBtnHandle() throws IOException {
		new PDFGenerator().generatePdf(PDFDocument.createContent(this.appModel.getEmployees()));
	}

	@Override
	public void update(String event) {
		System.out.println("[INFO][LISTEMPLOYEECONTROLLER] Received a Notification");
		System.out.println(event);
		this.listEmployeeScreen.insertDataTable(this.appModel.getEmployees());
		
	}
}
