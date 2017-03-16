package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;


public class Medication_Win extends JPanel {


	public Medication_Win() {
		setBounds(100,100,720,423);
		setLayout(null);
		
		
		
		JTextArea txtrmyc = new JTextArea();
		txtrmyc.setLineWrap(true);
		txtrmyc.setWrapStyleWord(true);
		txtrmyc.setText("3MYC7");
		txtrmyc.setBounds(175, 10, 100, 22);
		add(txtrmyc);
		
		JTextArea txtrTrimycine = new JTextArea();
		txtrTrimycine.setLineWrap(true);
		txtrTrimycine.setWrapStyleWord(true);
		txtrTrimycine.setText("TRIMYCINE");
		txtrTrimycine.setBounds(175, 40, 100, 22);
		add(txtrTrimycine);
		
		JTextArea txtrTriamcinoloneactonideNomycine = new JTextArea();
		txtrTriamcinoloneactonideNomycine.setWrapStyleWord(true);
		txtrTriamcinoloneactonideNomycine.setLineWrap(true);
		txtrTriamcinoloneactonideNomycine.setText("Triamcinolone(ac\u00E9tonide) + N\u00E9omycine + Nystatine");
		txtrTriamcinoloneactonideNomycine.setBounds(175, 120, 500, 22);
		add(txtrTriamcinoloneactonideNomycine);
		
		JTextArea txtrCeMdicamentEst = new JTextArea();
		txtrCeMdicamentEst.setEditable(false);
		txtrCeMdicamentEst.setLineWrap(true);
		txtrCeMdicamentEst.setWrapStyleWord(true);
		txtrCeMdicamentEst.setText("Ce m\u00E9dicament est un corticoide \u00E0 activit\u00E9 forte ou tr\u00E8s forte associ\u00E9 \u00E0 un antibiotique et un antifongique, utilis\u00E9 en application locale dans certaines atteintes cutan\u00E9ees surinfect\u00E9es.\r\n");
		txtrCeMdicamentEst.setBounds(175, 160, 500, 75);
		add(txtrCeMdicamentEst);
		
		
		JScrollPane scroll2 = new JScrollPane(txtrCeMdicamentEst);
		scroll2.setBounds(175, 160, 500, 75);
		add(scroll2);
		
		JTextArea txtrCeMdicamentEst_1 = new JTextArea();
		txtrCeMdicamentEst_1.setEditable(false);
		txtrCeMdicamentEst_1.setWrapStyleWord(true);
		txtrCeMdicamentEst_1.setLineWrap(true);
		txtrCeMdicamentEst_1.setText("Ce m\u00E9dicament est contre-indiqu\u00E9 en cas d'allergie \u00E0 l'un des constituants, d'infections de la peau, ou de parasitimes non trait\u00E9ss, d'acn\u00E9. Ne pas appliquer sur une plaie, ni sous un pansement occlusif.  ");
		txtrCeMdicamentEst_1.setBounds(175, 250, 500, 75);
		
		
		JScrollPane scroll = new JScrollPane(txtrCeMdicamentEst_1 );
		scroll.setBounds(175, 250, 500, 75);
		add(scroll);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setText("15$");
		textArea_5.setLineWrap(true);
		textArea_5.setWrapStyleWord(true);
		textArea_5.setBounds(175, 340, 100, 22);
		add(textArea_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(175, 80, 350, 22);
		comboBox.addItem("Corticoide, antibiotique et antifongique à usage local");
	
		add(comboBox);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setBounds(600, 360, 97, 25);
		add(btnQuitter);
		
		JButton btnPrcdent = new JButton("Pr\u00E9c\u00E9dent");
		btnPrcdent.setBounds(300, 360, 97, 25);
		add(btnPrcdent);
		
		JButton btnSuivant = new JButton("Suivant");
		btnSuivant.setBounds(405, 360, 97, 25);
		add(btnSuivant);
		
		JLabel lblCode = new JLabel("Code :");
		lblCode.setBounds(40, 10, 56, 16);
		add(lblCode);
		
		JLabel lblNomCommercial = new JLabel("Nom commercial :");
		lblNomCommercial.setBounds(40, 40, 121, 16);
		add(lblNomCommercial);
		
		JLabel lblFamille = new JLabel("Famille :");
		lblFamille.setBounds(40, 80, 121, 16);
		add(lblFamille);
		
		JLabel lblComposition = new JLabel("Composition :");
		lblComposition.setBounds(40, 120, 121, 16);
		add(lblComposition);
		
		JLabel lblEffetsIndsirables = new JLabel("Effets ind\u00E9sirables :");
		lblEffetsIndsirables.setBounds(40, 160, 121, 16);
		add(lblEffetsIndsirables);
		
		JLabel lblContreIndications = new JLabel("Contre Indications :");
		lblContreIndications.setBounds(40, 250, 121, 16);
		add(lblContreIndications);
		
		JLabel lblPrixEchantillon = new JLabel("Prix Echantillon :");
		lblPrixEchantillon.setBounds(40, 340, 121, 16);
		add(lblPrixEchantillon);
	}
}
