/**
 * 
 */
package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author Lic. Raul Alejandro Salas Texido
 *
 */
public class TermsAndUseScreen extends JFrame implements ActionListener,ChangeListener  {

	
	private static final long serialVersionUID = 1L;
	/**
	 * Attributes
	 * */
	private JLabel lbUpText,lbLogo;
	private JCheckBox chAccept;
	private JButton btnAccept, btnCancel;
	private JScrollPane scrollPane;
	private JTextArea tADescription;
	
	
	public TermsAndUseScreen() {
		setLayout(null);
		setTitle("License and Use");
		//image icon left side
		this.initComponents();
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	private void initComponents() {
		lbUpText = new JLabel("TERMS AND CONDITIONS");
		lbUpText.setBounds(215,5,200,30);
		lbUpText.setFont(new Font("Andale Mono", 1, 14)); //bold font and size 14
		lbUpText.setForeground(new Color(0,0,0));
		add(lbUpText);
		
		//Setting Section TexArea
		tADescription = new JTextArea();
		tADescription.setEditable(false);
		tADescription.setFont(new Font("Andale Mono",0,11));
		tADescription.setText("\n\n    TÉRMINOS Y CONDICIONES "
				+ "\n\n     A. FORBIDDEN ITS SALE OR DISTRIBUTION WITHOUT AUTHORIZATION OF RAUL ALEAJANDRO SALAS TEXIDO."
				+ "\n     B. FORBIDDEN THE ALTERATION OF THE SOURCE CODE OR DESIGN OF THE GRAPHIC INTERFACES."
				+ "\n     C. RAUL ALEJANDRO SALAS TEXIDO IS NOT RESPONSIBLE FOR THE MISUSE OF THIS SOFTWARE."
				+ "\n\n    THE LEGAL AGREEMENTS SET FORTH BELOW GOVERN YOUR USE OF THIS SOFTWARE\n"
				+ "\n     PLEASE USE THIS SOFTWARE AND ITS SERVICES. TO ACCEPT THESE TERMS CLICK ON (I ACCEPT) " + 
				" \n     IF YOU DO NOT AGREE TO THESE TERMS, CLICK ON (I DO NOT AGREE) AND DO NOT USE THIS SOFTWARE.");
		scrollPane = new JScrollPane(tADescription);
		scrollPane.setBounds(10, 40, 575, 200);
		add(scrollPane);
		
		//Setting Section CheckBox
		chAccept = new JCheckBox("I Accept");
		chAccept.setBounds(10, 250, 300, 30);
		add(chAccept);
		
		//Setting Section Buttons
		btnAccept = new JButton("Continue");
		btnAccept.setBounds(10, 290, 100, 30);
		btnAccept.setEnabled(false);
		add(btnAccept);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(120, 290, 100, 30);
		add(btnCancel);
		
		
		//Setting Logo Right Side
		ImageIcon image = new ImageIcon("images/coca-cola.png");
		lbLogo = new JLabel(image);
		lbLogo.setBounds(315, 135, 300, 300);
		add(lbLogo);
		
		
		
		
		
	}
}
