package controller;


import view.Corps;
import view.FenPrincipale;
import view.includes.Footer;
import view.includes.Header;

public class Controller {
		/** Notre controller qui nous permet de generer le contenu des fenetre*/
	public static void main(String[] args) {
		try{
			//Creation de notre objet fenetre
			FenPrincipale FA = new FenPrincipale();
			
			// New header
			FA.setHeader(new Header("Authentification"));
			FA.header_content();
			
			//New footer
			FA.setFooter(new Footer());
			FA.footer_content();
			
			//New corps
			FA.setCorps(new Corps(FA));
			FA.corps();
			
			//Parametre de notre fenetre
			FA.setTitle("GSB - Authentification");
			FA.setVisible(true);
			}
		catch (Exception e) {
		 	e.printStackTrace();
		}

	}

}
