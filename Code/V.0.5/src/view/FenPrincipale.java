package view;


import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class FenPrincipale extends JFrame{
	private static final long serialVersionUID = -70427993833584366L;
	private JFrame frame;
	private JPanel header;
	private JPanel footer;
	private JPanel corps;
	
	public FenPrincipale(){
		
		initialize();
	}
	
	/**
	 * Initialise la fenêtre principale.
	 **/
	private void initialize() {
		try{
			this.setIconImage(Toolkit.getDefaultToolkit().getImage(FenPrincipale.class.getResource("/view/img/logo.png")));
			this.setBounds(100, 100, 720, 520);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new BorderLayout(0, 0));
			this.setResizable(false);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public JFrame getFrame(){
		return frame;
	}
	public void setFrame(JFrame frame){
		this.frame = frame;
	}
	
	// Header
	public void header_content(){	
		this.getContentPane().add(header,BorderLayout.NORTH);
	}
	public JPanel getHeader(){
		return header;
	}
	public void setHeader(JPanel header){
		this.header = header;
	}	
	
	// Corps
	public void corps(){	
		this.getContentPane().add(corps,BorderLayout.CENTER);
		
	
	}
	public JPanel getCorps(){
		return corps;
		
	}
	public void setCorps(JPanel c){
		
		this.corps = c;
		
	}
	
	//Footer 
	public void footer_content(){	
		this.getContentPane().add(footer,BorderLayout.SOUTH);
	}
	public JPanel getFooter(){
		return footer;
	}
	public void setFooter(JPanel footer){
		this.footer = footer;
	}
	
	//Creation de couleur a la volé
	public Color couleur(int i, int j, int k) {
		return new Color(i, j, k);
	}
	
	public void remake(){
		corps();
		header_content();
		revalidate();
		repaint();
	}
}
