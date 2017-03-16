package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.includes.Footer;
import view.includes.Header;

public class test_search_User extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test_search_User frame = new test_search_User();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test_search_User() {
		setResizable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(test_search_User.class.getResource("/view/img/logo.png")));
		this.setTitle("GSB - Recherche de Visiteur");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 468);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Header search_header =new Header("Rechercher des Visiteurs");
		getContentPane().add(search_header,BorderLayout.NORTH);
		
		Footer search_footer = new Footer();
		getContentPane().add(search_footer,BorderLayout.SOUTH);
		
		Search_Visiteur_Win search_corps = new Search_Visiteur_Win();
		getContentPane().add(search_corps, BorderLayout.CENTER);
	}

}
