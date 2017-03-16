package view;

import java.awt.Color;

import javax.swing.JPanel;

import view.includes.Footer;
import view.includes.Header;

public class test extends JPanel {

	/**
	 * Create the panel.
	 */
	public test() {
		setLayout(null);
		this.setBounds(100, 100, 394, 359);
		
		Header panel1 =new Header(new Color(66, 76, 88), "Authentification");
		panel1.setBounds(0, 0, 400, 30);
		add(panel1);
		Footer panel2 = new Footer(new Color(66, 76, 88));
		panel2.setBounds(0, 344, 394, 15);
		add(panel2);
		Corps panel3 = new Corps();
		panel3.setBounds(61, 85, 284, 184);
		add(panel3);

	}

}
