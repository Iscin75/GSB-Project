package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.includes.Footer;
import view.includes.Header;

public class test_Reporting_Win extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test_Reporting_Win frame = new test_Reporting_Win();
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
	public test_Reporting_Win() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 468);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Header medication_header =new Header("Creer un nouveau rapport");
		getContentPane().add(medication_header,BorderLayout.NORTH);
		
		Footer medication_footer = new Footer();
		getContentPane().add(medication_footer,BorderLayout.SOUTH);
		
		Reporting_Win reporting_body = new Reporting_Win();
		getContentPane().add(reporting_body, BorderLayout.CENTER);
	
	}

}
