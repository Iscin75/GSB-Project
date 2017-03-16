package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Footer extends JPanel { 
	private Color header_footer_font = new Color(66, 76, 88);
	
	public Footer(Color header_footer_font ){
		init();
	}
	
	private void init(){
		//----------/ Zone du bas de page
		JPanel footer = this;
		footer.setBackground(header_footer_font);
		footer.setBounds(0, 344, 394, 15);
		footer.setLayout(null);
		
		//----------/ Texte Gauche du bas de page
		JLabel lbl_team = new JLabel("Balamini/Boudiaf/Moua/Siarri");
		lbl_team.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_team.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_team.setForeground(Color.WHITE);
		lbl_team.setBounds(0, 0, 169, 14);
		footer.add(lbl_team);
		
		//----------/ Texte Droit du bas de page
		JLabel lbl_date = new JLabel("GSB 2016/2017");
		lbl_date.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_date.setForeground(Color.WHITE);
		lbl_date.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_date.setBounds(307, 0, 87, 14);
		footer.add(lbl_date);
	}

}
