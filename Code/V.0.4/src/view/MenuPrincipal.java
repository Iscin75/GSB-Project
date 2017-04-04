package view;


import javax.swing.JPanel;

import controller.Controller;


import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JPanel{
	


	private static final long serialVersionUID = 1L;
	private String purl;
	
	
	/* Creation de l'image a la volée */
	private ImageIcon image(String img){
		purl = "/view/img/icons/";
		ImageIcon image = new ImageIcon(this.getClass().getResource(purl+img));
		return image;
	}
	
	public MenuPrincipal(FenPrincipale PFA){
		
		
		String[] listName = new String[5];
		listName[0] = "Compte-rendus";
		listName[1] = "Visiteurs";
		listName[2] = "Practitiens";
		listName[3] = "Médicaments";
		listName[4] = "Quitter";
		setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 150, 440);
		panel.setBackground(new Color(66, 76, 88));
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/view/img/logo2.png")));
		lblNewLabel.setBounds(21, 179, 106, 83);
		panel.add(lblNewLabel);
		
		/* LABEL NOM A COTER DES BUTTONS*/
		int pos = 15;
		for(int i = 0; i < 5; i++){
			String s = listName[i];
			JLabel t = new JLabel(s);
			t.setBounds(290, pos, 160, 75);
			t.setFont(new Font("Thoma", Font.BOLD, 18));
			pos += 85;
			add(t);
		}

		/*
		 * Bouton compte rendu qui renvoi la vue 
		 */
		JButton compteRendusBtn = new JButton(image("comtpe-rendu.png"));
		compteRendusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Clic) {
				Controller.setAnDrawNewView("Compte-rendus");
			}
		});
		compteRendusBtn.setBounds(200, 15, 70, 70);
		add(compteRendusBtn);
		compteRendusBtn.setFocusPainted(false);
		
		/*
		 * Bouton Visiteurs qui renvoi la vue 
		 */
		JButton visiteursBtn = new JButton(image("visiteurs.png"));
		visiteursBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.setAnDrawNewView("Gestion des visiteurs");
			}
		});
		visiteursBtn.setBounds(200, 100, 70, 70);
		add(visiteursBtn);
		visiteursBtn.setFocusPainted(false);
		
		/*
		 * Bouton Practiciens qui renvoi la vue 
		 */
		JButton practiciensBtn = new JButton(image("practiciens.png"));
		practiciensBtn.setBounds(200, 185, 70, 70);
		add(practiciensBtn);
		practiciensBtn.setFocusPainted(false);
		practiciensBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				Controller.setAnDrawNewView("Gestion des praticiens");
			}
		});
		
		
		/*
		 * Bouton Medicaments qui renvoi la vue 
		 */
		JButton medicamentsBtn = new JButton(image("medicaments.png"));
		medicamentsBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Controller.setAnDrawNewView("Gestion des medicaments");
			}
		});
		
		
		
		medicamentsBtn.setBounds(200, 270, 70, 70);
		add(medicamentsBtn);
		medicamentsBtn.setFocusPainted(false);
		
		
		
		/*
		 * Bouton Quitter qui quitte le programme
		 */
		JButton btnQuitter = new JButton(image("deco.png"));
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent quitter) {
				System.exit(0);
			}
		});
		btnQuitter.setBounds(200, 355, 70, 70);
		add(btnQuitter);
		btnQuitter.setFocusPainted(false);
		/* FIN DE BOUTON QUITTER */
		
	}
}
