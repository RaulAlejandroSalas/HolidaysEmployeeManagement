/**
 * 
 */
package ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;


/**
 * @author Lic. Raul Alejandro Salas Texido
 *
 */
public class ProgressMonitorComponent extends JFrame{

	private static final long serialVersionUID = 1L;
	private JProgressBar progressBar;
	private String filePath;
	public ProgressMonitorComponent(String filePath) {
		this.filePath = filePath;
		this.initView();
	}
	
	private void initView() {
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
		fill();
	}
	
	 // function to increase progress 
    public  void fill() 
    { 
        int i = 0; 
        try { 
            while (i <= 100) { 
                // fill the menu bar 
                this.progressBar.setValue(i + 10); 
  
                // delay the thread 
                Thread.sleep(1000); 
                i += 20; 
            } 
        } 
        catch (Exception e) { 
        } 
    } 
		
}
