package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import modele.IdConnection;
import view.includes.Header;

public class Corps extends JPanel {
	private Color entry_font = new Color(238, 241, 246);
	private JTextField ndc_entry;
	private JPasswordField mdp_entry;
	private FenPrincipale FA;
	// Constructeur de la classe Corps
	public Corps(){
		init();
	}
	public Corps(FenPrincipale PFA){
		init();
		FA = PFA;
	}
	
	private void init(){
			//----------/ Zone de connexion
			JPanel connect = this;
			connect.setBounds(100,100,720,468);
			setLayout(new BorderLayout(0, 0));
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			flowLayout.setVgap(30);
			add(panel, BorderLayout.NORTH);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(Color.LIGHT_GRAY);
			FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
			flowLayout_1.setHgap(30);
			add(panel_1, BorderLayout.WEST);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(Color.LIGHT_GRAY);
			add(panel_2, BorderLayout.SOUTH);
			panel_2.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 30));
			
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(Color.LIGHT_GRAY);
			FlowLayout flowLayout_3 = (FlowLayout) panel_3.getLayout();
			flowLayout_3.setHgap(30);
			add(panel_3, BorderLayout.EAST);
			
			JPanel panel_4 = new JPanel();
			add(panel_4, BorderLayout.CENTER);
			panel_4.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Nom de Compte :");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel.setBounds(70, 42, 125, 14);
			panel_4.add(lblNewLabel);
			
			ndc_entry = new JTextField();
			ndc_entry.setBounds(70, 68, 125, 20);
			panel_4.add(ndc_entry);
			ndc_entry.setColumns(20);
			
			JLabel lblNewLabel_1 = new JLabel("Mot de Passe :");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_1.setBounds(70, 99, 114, 16);
			panel_4.add(lblNewLabel_1);
			
			mdp_entry = new JPasswordField();
			mdp_entry.setBounds(70, 126, 125, 20);
			panel_4.add(mdp_entry);
			
			JButton btnNewButton = new JButton("Se Connecter");
			btnNewButton.setBounds(70, 168, 125, 23);
			panel_4.add(btnNewButton);
			btnNewButton.addActionListener(new EcouteurBoutonConnection());
			connect.setBackground(Color.WHITE);
			
			
			
			}
			
			
		public class EcouteurBoutonConnection implements ActionListener{
			public void actionPerformed(ActionEvent clic){
				System.out.println("Ok");
				Medication_Win medication_body = new Medication_Win();
				Header menu_header = new Header("Menu Principal");
				FA.remove(FA.getCorps());
				FA.remove(FA.getHeader());
				FA.setCorps(medication_body);
				FA.setHeader(menu_header);
				FA.remake();
				Boolean toReturn = false;
				try {
					IdConnection IdC = new IdConnection();
					toReturn=IdC.idCheck(ndc_entry.getText(), mdp_entry.getText());
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(toReturn);
				
				
				
			
		}
			
	}
}
