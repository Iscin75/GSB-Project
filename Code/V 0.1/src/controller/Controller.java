package controller;

import java.awt.Color;
import javax.swing.JPanel;

import view.Corps;
import view.FenPrincipale;
import view.Footer;
import view.Header;

public class Controller {

	public static void main(String[] args) {
		FenPrincipale FA = new FenPrincipale();
		FA.setHeader((JPanel)new Header(new Color(66, 76, 88), "Authentification"));
		FA.header_content();
		FA.setFooter((JPanel)new Footer(new Color(66, 76, 88)));
		FA.footer_content();
		FA.setCorps((JPanel)new Corps());
		FA.corps();
		FA.setVisible(true);
	}

}
