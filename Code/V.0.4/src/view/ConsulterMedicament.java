package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import controller.Controller;
import modele.DAOFactory;
import modele.DAOMedicament;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.event.ActionEvent;


public class ConsulterMedicament extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Vector<String[]> medicament;
	private int indice=0;
	private JButton btn_Suivant;
	private JButton btn_Precedent;
	
	public ConsulterMedicament(FenPrincipale menu){
		DAOMedicament temp = (DAOMedicament) (DAOFactory.getDAOMedicament());
		try {
			medicament= temp.getAllMedicaments();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		setBounds(100,100,720,423);
		setLayout(null);
		
		
		
		JTextArea code_field = new JTextArea();
		code_field.setLineWrap(true);
		code_field.setWrapStyleWord(true);
		code_field.setText(medicament.elementAt(indice)[0]);
		code_field.setBounds(175, 10, 100, 22);
		add(code_field);
		
		JTextArea name_field = new JTextArea();
		name_field.setLineWrap(true);
		name_field.setWrapStyleWord(true);
		name_field.setText(medicament.elementAt(indice)[1]);
		name_field.setBounds(175, 40, 100, 22);
		add(name_field);
		
		JTextArea composition_field = new JTextArea();
		composition_field.setWrapStyleWord(true);
		composition_field.setLineWrap(true);
		composition_field.setText(medicament.elementAt(indice)[3]);
		composition_field.setBounds(175, 120, 500, 22);
		add(composition_field);
		
		JTextArea effect_field = new JTextArea();
		effect_field.setEditable(false);
		effect_field.setLineWrap(true);
		effect_field.setWrapStyleWord(true);
		effect_field.setText(medicament.elementAt(indice)[4]);
		effect_field.setBounds(175, 160, 500, 75);
		add(effect_field);
		
		
		JScrollPane effect_scroll = new JScrollPane(effect_field);
		effect_scroll.setBounds(175, 160, 500, 75);
		add(effect_scroll);
		
		JTextArea indication_field = new JTextArea();
		indication_field.setEditable(false);
		indication_field.setWrapStyleWord(true);
		indication_field.setLineWrap(true);
		indication_field.setText(medicament.elementAt(indice)[5]);
		indication_field.setBounds(175, 250, 500, 75);
		
		
		JScrollPane indication_scroll = new JScrollPane(indication_field );
		indication_scroll.setBounds(175, 250, 500, 75);
		add(indication_scroll);
		
		JTextArea price_field = new JTextArea();
		price_field.setText("15$");
		price_field.setLineWrap(true);
		price_field.setWrapStyleWord(true);
		price_field.setBounds(175, 340, 100, 22);
		add(price_field);
		
		JTextArea family_field = new JTextArea();
		family_field.setBounds(175, 80, 350, 22);
		family_field.setText(medicament.elementAt(indice)[2]);
	
		add(family_field);
		
		JButton btn_Quitter = new JButton("Fermer");
		btn_Quitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.setAnDrawNewView("Menu");
			}
		});
		btn_Quitter.setBounds(600, 360, 97, 25);
		add(btn_Quitter);
		
		btn_Precedent = new JButton("Pr\u00E9c\u00E9dent");
		btn_Precedent.setEnabled(false);
		btn_Precedent.setBounds(300, 360, 97, 25);
		btn_Precedent.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (indice>0){
					indice-=1;
					code_field.setText(medicament.elementAt(indice)[0]);
					name_field.setText(medicament.elementAt(indice)[1]);
					composition_field.setText(medicament.elementAt(indice)[3]);
					family_field.setText(medicament.elementAt(indice)[2]);
					indication_field.setText(medicament.elementAt(indice)[5]);
					effect_field.setText(medicament.elementAt(indice)[4]);
					btn_Precedent.setEnabled(true);
					btn_Suivant.setEnabled(true);
					
				}
				if (indice==0){
					btn_Precedent.setEnabled(false);
				}
			}
			
			
		});
		add(btn_Precedent);
		
		btn_Suivant = new JButton("Suivant");
		btn_Suivant.setBounds(405, 360, 97, 25);
		btn_Suivant.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (indice<medicament.size()){
					indice+=1;
					code_field.setText(medicament.elementAt(indice)[0]);
					name_field.setText(medicament.elementAt(indice)[1]);
					composition_field.setText(medicament.elementAt(indice)[3]);
					family_field.setText(medicament.elementAt(indice)[2]);
					indication_field.setText(medicament.elementAt(indice)[5]);
					effect_field.setText(medicament.elementAt(indice)[4]);
					btn_Suivant.setEnabled(true);
					btn_Precedent.setEnabled(true);
				}
				if (indice==medicament.size()-1){
					btn_Suivant.setEnabled(false);
				}
			}
			
			
		});
		add(btn_Suivant);
		
		JLabel lbl_Code = new JLabel("Code :");
		lbl_Code.setBounds(40, 10, 56, 16);
		add(lbl_Code);
		
		JLabel lbl_name = new JLabel("Nom commercial :");
		lbl_name.setBounds(40, 40, 121, 16);
		add(lbl_name);
		
		JLabel lbl_Famille = new JLabel("Famille :");
		lbl_Famille.setBounds(40, 80, 121, 16);
		add(lbl_Famille);
		
		JLabel lbl_Composition = new JLabel("Composition :");
		lbl_Composition.setBounds(40, 120, 121, 16);
		add(lbl_Composition);
		
		JLabel lbl_EffetsIndsirables = new JLabel("Effets ind\u00E9sirables :");
		lbl_EffetsIndsirables.setBounds(40, 160, 121, 16);
		add(lbl_EffetsIndsirables);
		
		JLabel lbl_ContreIndications = new JLabel("Contre Indications :");
		lbl_ContreIndications.setBounds(40, 250, 121, 16);
		add(lbl_ContreIndications);
		
		JLabel lbl_PrixEchantillon = new JLabel("Prix Echantillon :");
		lbl_PrixEchantillon.setBounds(40, 340, 121, 16);
		add(lbl_PrixEchantillon);
	}
}
