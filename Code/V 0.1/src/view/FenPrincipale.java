package view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenPrincipale extends JFrame{
	private JFrame auth_window;
	private JPanel header;
	private JPanel footer;
	private JPanel corps;
	
	public FenPrincipale(){
		initialize();
	}
	/**
	 * Initialise la fenêtre principale.
	 */
	private void initialize() {
		
		this.setBounds(100, 100, 400, 388);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setResizable(false);
		this.setTitle("GSB - Authentification");
	}
	
	public void header_content(){	
		this.getContentPane().add(header);
	}
	public void corps(){	
		this.getContentPane().add(corps);
	}
	public JFrame getAuth_window() {
		return auth_window;
	}
	public void setAuth_window(JFrame auth_window) {
		this.auth_window = auth_window;
	}
	public JPanel getHeader() {
		return header;
	}
	public void setHeader(JPanel header) {
		this.header = header;
	}	
	
	//Footer 
	public void footer_content(){	
		this.getContentPane().add(footer);
	}
	public JPanel getFooter() {
		return footer;
	}
	public void setFooter(JPanel footer) {
		this.footer = footer;
	}
	public JPanel getCorps() {
		return corps;
	}
	public void setCorps(JPanel c) {
		this.corps = c;
	}
}
