package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Search_Visiteur_Win extends JPanel {
	private JTable result_table;
	
	String columnName[] = {"Matricule","Nom","Prenom","Ville","Departement"}; 
	Object[][] data = {
			{"1","Diaby","Balamini","Paris","75016"},
			{"2","Moua","Paul","Marseille","13001"},
			{"3","Siarri","Nicolas","Gagny","93220"},
			{"4","Boudiaf","Ryan","Monaco","10000"},
			
	};

	public Search_Visiteur_Win() {
		setBounds(100,100,720,423);
		this.setLayout(new BorderLayout(0, 0));
		
		// Zone de recherche d'utilisateur (Upper)
		
		JPanel search_zone = new JPanel();
		search_zone.setLayout(new FlowLayout(FlowLayout.LEADING, 30, 30));
		search_zone.setBackground(Color.LIGHT_GRAY);
		add(search_zone, BorderLayout.NORTH);
		
		
		JTextField search_field = new JTextField();
		search_field.setHorizontalAlignment(SwingConstants.LEFT);
		search_field.setColumns(20);
		search_zone.add(search_field);
		
		
		JButton search_button = new JButton("Rechercher");
		search_zone.add(search_button);
		
		JButton add_button = new JButton("Ajouter un Utilisateur");
		add_button.setHorizontalAlignment(SwingConstants.RIGHT);
		search_zone.add(add_button);
		
		// Marge Gauche
		
		JPanel left_border_zone = new JPanel();
		FlowLayout fl_left_border_zone = (FlowLayout) left_border_zone.getLayout();
		fl_left_border_zone.setHgap(15);
		left_border_zone.setBackground(Color.LIGHT_GRAY);
		add(left_border_zone, BorderLayout.WEST);
		
		// Marge Droite
		
		JPanel right_border_zone = new JPanel();
		FlowLayout fl_right_border_zone = (FlowLayout) right_border_zone.getLayout();
		fl_right_border_zone.setHgap(15);
		right_border_zone.setBackground(Color.LIGHT_GRAY);
		add(right_border_zone, BorderLayout.EAST);
		
		// Zone d'actions sur les visiteurs
		
		JPanel actions_zone = new JPanel();
		actions_zone.setLayout(new FlowLayout(FlowLayout.TRAILING, 30, 15));
		actions_zone.setBackground(Color.LIGHT_GRAY);
		add(actions_zone, BorderLayout.SOUTH);
		
		JButton edit_button = new JButton("Editer");
		actions_zone.add(edit_button);
		
		JButton del_button = new JButton("Supprimer");
		actions_zone.add(del_button);
		
		
		JButton exit_button = new JButton("Quitter");
		actions_zone.add(exit_button);
		
		// Zone de resultats de la recherche
		
		JScrollPane result_zone = new JScrollPane();
		result_zone.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		result_zone.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(result_zone, BorderLayout.CENTER);
		
		result_table = new JTable(data,columnName);
		result_table.setCellSelectionEnabled(true);
		result_zone.setViewportView(result_table);

	}

}
