package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Corps extends JPanel {
	
	private JTextField mdp_entry;
	private JTextField ndc_entry;
	private Color entry_font = new Color(238, 241, 246);
	
	// Constructeur de la classe Corps
	public Corps(){
		init();
	}
	
	private void init(){
			//----------/ Zone de connexion
			JPanel connect = this;
			connect.setBackground(Color.WHITE);
			connect.setBounds(57, 95, 284, 184);
			connect.setLayout(null);
			
			//----------/ Zone de saisie du nom de compte
			ndc_entry = new JTextField();
			ndc_entry.setBackground(entry_font);
			ndc_entry.setFont(new Font("Tahoma", Font.BOLD, 14));
			ndc_entry.setBounds(26, 50, 224, 30);
			connect.add(ndc_entry);
			ndc_entry.setColumns(20);
			
			//----------/ Zone de saisie du mot de passe
			mdp_entry = new JPasswordField(10);
			mdp_entry.setBackground(entry_font);
			mdp_entry.setFont(new Font("Tahoma", Font.BOLD, 14));
			mdp_entry.setBounds(26, 106, 224, 30);
			connect.add(mdp_entry);
			mdp_entry.setColumns(10);
			
			//----------/ Texte Indication Nom de compte
			JLabel NomDeCompte = new JLabel("Nom de Compte :");
			NomDeCompte.setFont(new Font("Tahoma", Font.BOLD, 11));
			NomDeCompte.setForeground(new Color(179, 184, 191));
			NomDeCompte.setBounds(26, 25, 96, 34);
			connect.add(NomDeCompte);
			
			//----------/ Texte Indication Mot de Passe
			JLabel MotDePasse = new JLabel("Mot de Passe :");
			MotDePasse.setFont(new Font("Tahoma", Font.BOLD, 11));
			MotDePasse.setForeground(new Color(179, 184, 191));
			MotDePasse.setBounds(26, 81, 116, 34);
			connect.add(MotDePasse);
			
			//----------/ Bouton de connexion
			JButton btnConnexion = new JButton("Connexion");
			btnConnexion.setBackground(new Color(66, 76, 88));
			btnConnexion.setForeground(Color.WHITE);
			btnConnexion.setBounds(147, 150, 102, 23);
			btnConnexion.setOpaque(true);
			connect.add(btnConnexion);
	}
}
