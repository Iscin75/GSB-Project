package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.includes.Footer;
import view.includes.Header;

public class test_Medication_Win extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test_Medication_Win frame = new test_Medication_Win();
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
	public test_Medication_Win() {
		setResizable(false);
		setTitle("GSB - Recherche de Visiteur");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 468);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Header medication_header =new Header("Consulter un Médicament");
		getContentPane().add(medication_header,BorderLayout.NORTH);
		
		Footer medication_footer = new Footer();
		getContentPane().add(medication_footer,BorderLayout.SOUTH);
		
		Medication_Win medication_body = new Medication_Win();
		getContentPane().add(medication_body, BorderLayout.CENTER);
	}

}
