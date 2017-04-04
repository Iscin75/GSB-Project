package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import modele.DAOFactory;
import modele.DAOVisiteur;
import metiers.Visiteur;
import controller.Controller;
import javax.swing.border.LineBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Authentification extends JPanel {
	private static final long serialVersionUID = -7305664800426191162L;
	private JTextField ndc_entry;
	private JPasswordField mdp_entry;
	private FenPrincipale FA;
	// Constructeur de la classe Corps
	public Authentification(){
		init();
	}
	public Authentification(FenPrincipale PFA){
		init();
		FA = PFA;
	}
	
	private void init(){
			//----------/ Zone de connexion
			JPanel connect = this;
			connect.setBounds(100,100,720,468);
			setLayout(new BorderLayout(0, 0));
			
			JPanel panel_4 = new JPanel();
			panel_4.setBackground(new Color(255, 255, 255));
			add(panel_4, BorderLayout.CENTER);
			panel_4.setLayout(null);
			connect.setBackground(Color.WHITE);
			
			JPanel Connexion = new JPanel();
			Connexion.setBorder(new LineBorder(new Color(150, 150, 150)));
			Connexion.setBackground(new Color(231,231,231));
			Connexion.setBounds(161, 89, 414, 257);
			panel_4.add(Connexion);
			Connexion.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Nom :");
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setBounds(58, 28, 160, 32);
			Connexion.add(lblNewLabel);
			lblNewLabel.setIcon(new ImageIcon(Authentification.class.getResource("/view/img/icons/auth/user.png")));
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
			JLabel lblNewLabel_1 = new JLabel(" Mot de passe :");
			lblNewLabel_1.setForeground(Color.BLACK);
			lblNewLabel_1.setBounds(58, 96, 286, 32);
			Connexion.add(lblNewLabel_1);
			lblNewLabel_1.setIcon(new ImageIcon(Authentification.class.getResource("/view/img/icons/auth/password.png")));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
			mdp_entry = new JPasswordField();
			mdp_entry.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(java.awt.event.KeyEvent evt) {
					if(evt.getKeyCode() == KeyEvent.VK_ENTER){
						logged();
					}
				}
			});
		
	
			mdp_entry.setBounds(98, 139, 231, 20);
			Connexion.add(mdp_entry);
			
			JButton btnNewButton = new JButton("Connexion");
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBorder(new LineBorder(new Color(101,125,155)));
			btnNewButton.setBackground(new Color(101,125,155));
			btnNewButton.setBounds(98, 208, 231, 23);
			Connexion.add(btnNewButton);
			
			ndc_entry = new JTextField();
			ndc_entry.setBounds(97, 59, 232, 20);
			Connexion.add(ndc_entry);
			ndc_entry.setColumns(20);
			
			JLabel label = new JLabel();
			label.setBounds(328, -17, 100, 85);
			Connexion.add(label);
			label.setFont(new Font("Tahoma", Font.PLAIN, 5));
			label.setBackground(Color.DARK_GRAY);
			label.setIcon(new ImageIcon(Authentification.class.getResource("/view/img/logo2.png")));
			
			btnNewButton.addActionListener(new EcouteurBoutonConnection());
			}
			
		public class EcouteurBoutonConnection implements ActionListener{
			public void actionPerformed(ActionEvent clic){
				logged();
		}
			
	}
		
		private void logged(){
			Visiteur toReturn = null;
			DAOVisiteur tVisiteur = (DAOVisiteur) DAOFactory.getDAOVisiteur();
			try {
				toReturn = tVisiteur.check(ndc_entry.getText(), String.valueOf(mdp_entry.getPassword()));
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			if (toReturn!=null){
				Controller.setAnDrawNewView("Menu");
				
			}else{
				JOptionPane.showMessageDialog(FA,"Nom de compte ou mot de passe incorrect");
			}
		}
}
