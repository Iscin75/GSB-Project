package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;




public class Header extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Constructeur de l'entête.
	 * @param header_footer_font 
	 * @param ptitre
	 */
	
	private String titre;
	
	
	
	public Header(String ptitre){

		this.titre=ptitre;
	
		init();
	}
	
	private void init(){
		
		JPanel header = this;
		header.setBackground( new Color(66, 76, 88));
		setLayout(new BorderLayout(0, 0));
	
		
		//----------/ Texte de l'entete
		JLabel lbl_auth = new JLabel(titre);
		lbl_auth.setVerticalAlignment(SwingConstants.TOP);
		lbl_auth.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_auth.setFont(new Font("Tahoma", Font.BOLD, 17));
		lbl_auth.setForeground(Color.WHITE);
		lbl_auth.setBounds(249, 0, 185, 30);
		header.add(lbl_auth, BorderLayout.EAST);
		
	}
}
