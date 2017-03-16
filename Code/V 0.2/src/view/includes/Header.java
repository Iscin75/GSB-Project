package view.includes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Header extends JPanel {
	/**
	 * Constructeur de l'entête.
	 * @param header_footer_font 
	 * @param ptitre
	 */
	
	private String titre;
	private Color header_footer_font;
	
	public Header(Color pheader_footer_font, String ptitre){
		
		this.titre=ptitre;
		this.header_footer_font= pheader_footer_font;
		init();
	}
	
	private void init(){
		
		JPanel header = this;
		header.setBackground(header_footer_font);
		header.setBounds(0, 0, 394, 30);	
		header.setLayout(null);
		
		//----------/ Texte de l'entete
		JLabel lbl_auth = new JLabel(titre);
		lbl_auth.setFont(new Font("Tahoma", Font.BOLD, 17));
		lbl_auth.setForeground(Color.WHITE);
		lbl_auth.setBounds(249, 0, 185, 30);
		header.add(lbl_auth);
		
	}
}
