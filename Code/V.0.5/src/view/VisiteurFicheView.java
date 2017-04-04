package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controller.Controller;
import modele.DAOFactory;
import modele.DAOVisiteur;
import metiers.Visiteur;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;


public class VisiteurFicheView extends JPanel {
	private static final long serialVersionUID = -7343515360325589254L;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField;
	
	public VisiteurFicheView(FenPrincipale menu, String id) {
		DAOVisiteur visiteur = (DAOVisiteur) DAOFactory.getDAOVisiteur();
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(132, 50, 530, 235);
		add(panel);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
			try {
				ArrayList<Visiteur> result = visiteur.visiteur(id);
				ArrayList<Visiteur> fiche = visiteur.ficheVisiteur();
				
				setBounds(100,100,720,423);
				setLayout(null);

				JButton btnQuitter = new JButton("Retour");
				btnQuitter.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Controller.setAnDrawNewView("Gestion des visiteurs");
					}
				});
				btnQuitter.setBounds(600, 360, 97, 25);
				add(btnQuitter);
				
				JButton btnPrcdent = new JButton("Précédent");
				btnPrcdent.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent p) {
						if(Controller.row > 0){
							Controller.id = fiche.get(Controller.row-1).getMat();
							Controller.setAnDrawNewView("Fiche visiteur");	
							Controller.row --;

						}else{
							btnPrcdent.setEnabled(false);
							JOptionPane.showMessageDialog(panel,"Aucun autre résultat. ");
						}
					}
				});
				btnPrcdent.setBounds(300, 360, 97, 25);
				add(btnPrcdent);
				
				JButton btnSuivant = new JButton("Suivant");
				btnSuivant.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent s) {
						if(Controller.row+1 < fiche.size()){
							Controller.id = fiche.get(Controller.row+1).getMat();
							Controller.setAnDrawNewView("Fiche visiteur");	
							Controller.row ++;
						}else{
							btnSuivant.setEnabled(false);
							JOptionPane.showMessageDialog(panel,"Aucun autre résultat. ");
						}
					}
				});
				btnSuivant.setBounds(405, 360, 97, 25);
				add(btnSuivant);
	
				
				// Menu gauche
				JPanel mGauche = new JPanel();
				mGauche.setBounds(23, 0, 93, 235);
				mGauche.setBackground(new Color(66, 76, 88));
				panel.add(mGauche);
				mGauche.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Ville :");
				lblNewLabel.setBounds(13, 145, 46, 14);
				mGauche.add(lblNewLabel);
				lblNewLabel.setForeground(Color.WHITE);
				
				JLabel lblAdresse = new JLabel("Adresse : ");
				lblAdresse.setBounds(13, 101, 64, 14);
				mGauche.add(lblAdresse);
				lblAdresse.setForeground(Color.WHITE);
				
				JLabel lblNom = new JLabel("Nom :");
				lblNom.setBounds(13, 60, 46, 14);
				mGauche.add(lblNom);
				lblNom.setForeground(Color.WHITE);
				
				JLabel lblNum = new JLabel("Matricule : ");
				lblNum.setBounds(13, 23, 64, 14);
				mGauche.add(lblNum);
				lblNum.setForeground(Color.WHITE);
				
				JLabel lblCoefNotoriet = new JLabel("Sec code :");
				lblCoefNotoriet.setForeground(Color.WHITE);
				lblCoefNotoriet.setBounds(13, 181, 70, 14);
				mGauche.add(lblCoefNotoriet);
				
				JLabel lblCode = new JLabel("Lab code :");
				lblCode.setForeground(Color.WHITE);
				lblCode.setBounds(13, 210, 64, 14);
				mGauche.add(lblCode);
			
				textField_1 = new JTextField(result.get(0).getNom());
				textField_1.setBounds(126, 58, 111, 20);
				panel.add(textField_1);
				textField_1.setEditable(false);
				textField_1.setColumns(10);
				
				textField = new JTextField(result.get(0).getMat());
				textField.setEditable(false);
				textField.setColumns(10);
				textField.setBounds(126, 20, 40, 20);
				panel.add(textField);
				
				textField_3 = new JTextField(result.get(0).getAddrs());
				textField_3.setBounds(126, 100, 199, 20);
				panel.add(textField_3);
				textField_3.setEditable(false);
				textField_3.setColumns(10);
				
				textField_4 = new JTextField(result.get(0).getCP());
				textField_4.setBounds(126, 143, 53, 20);
				panel.add(textField_4);
				textField_4.setEditable(false);
				textField_4.setColumns(10);
				
				
				textField_5 = new JTextField(result.get(0).getVille());
				textField_5.setBounds(191, 143, 134, 20);
				panel.add(textField_5);
				textField_5.setEditable(false);
				textField_5.setColumns(10);
				
				JLabel lblPrnom = new JLabel("Prénom :");
				lblPrnom.setBounds(261, 61, 64, 14);
				panel.add(lblPrnom);
				
				textField_2 = new JTextField(result.get(0).getPrenom());
				textField_2.setBounds(335, 58, 111, 20);
				panel.add(textField_2);
				textField_2.setEditable(false);
				textField_2.setColumns(10);
				
				textField_6 = new JTextField(result.get(0).getLabCode());
				textField_6.setBounds(126, 178, 46, 20);
				panel.add(textField_6);
				textField_6.setEditable(false);
				textField_6.setColumns(10);
				
				textField_7 = new JTextField(result.get(0).getSecCode());
				textField_7.setBounds(126, 209, 46, 20);
				panel.add(textField_7);
				textField_7.setEditable(false);
				textField_7.setColumns(10);
				
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}		
	}
}
