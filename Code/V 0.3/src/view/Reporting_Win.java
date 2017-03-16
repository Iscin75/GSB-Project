package view;



import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JList;

public class Reporting_Win extends JPanel {
	private JTextField textField;

	
	public Reporting_Win() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(100,100,720,423);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Num\u00E9ro du Rapport :");
		lblNewLabel.setBounds(40, 10, 129, 16);
		add(lblNewLabel);
		
		JLabel lblPraticien = new JLabel("Praticien :");
		lblPraticien.setBounds(40, 50, 119, 16);
		add(lblPraticien);
		
		JLabel lblDateDuRapport = new JLabel("Date du Rapport :");
		lblDateDuRapport.setBounds(40, 90, 119, 16);
		add(lblDateDuRapport);
		
		JLabel lblMotifDuRapport = new JLabel("Motif du Rapport :");
		lblMotifDuRapport.setBounds(40, 130, 119, 16);
		add(lblMotifDuRapport);
		
		JLabel lblBilan = new JLabel("BILAN :");
		lblBilan.setBounds(40, 170, 119, 16);
		add(lblBilan);
		
		JButton btnNewButton = new JButton("D\u00E9tails");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(412, 50, 97, 25);
		add(btnNewButton);
		
		JEditorPane dtrpnRas = new JEditorPane();
		dtrpnRas.setText("R.A.S. ");
		dtrpnRas.setBounds(100, 170, 200, 150);
		add(dtrpnRas);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(200, 50, 200, 22);
		add(comboBox);
		
		JTextPane txtpnPrsentationMdicament = new JTextPane();
		txtpnPrsentationMdicament.setText("Pr\u00E9sentation M\u00E9dicament");
		txtpnPrsentationMdicament.setBounds(200, 130, 200, 22);
		add(txtpnPrsentationMdicament);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(200, 90, 125, 22);
		add(dateChooser);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("1");
		textField.setEditable(false);
		textField.setBounds(200, 7, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblOffreDchantillons = new JLabel("Offre d'\u00E9chantillons :");
		lblOffreDchantillons.setBounds(325, 170, 119, 16);
		add(lblOffreDchantillons);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setBounds(600, 360, 97, 25);
		add(btnQuitter);
		
		JButton btnRapportPrcdent = new JButton("Pr\u00E9c\u00E9dent");
		btnRapportPrcdent.setBounds(60, 360, 97, 25);
		add(btnRapportPrcdent);
		
		JButton btnSuivant = new JButton("Suivant");
		btnSuivant.setBounds(160, 360, 97, 25);
		add(btnSuivant);
		
		JButton btnNouveau = new JButton("Nouveau");
		btnNouveau.setBounds(260, 360, 97, 25);
		add(btnNouveau);
		
		
	}
}
