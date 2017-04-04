package view;



import javax.swing.JPanel;


import java.awt.Color;


import javax.swing.JLabel;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;


import com.toedter.calendar.JDateChooser;

import controller.Controller;
import modele.DAOMedicament;
import modele.DAOPraticien;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;


public class CreerRapport extends JPanel {
	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField num_content = new JTextField();
	JDateChooser date_content = new JDateChooser();
	JTextField motif_content = new JTextField();
	JTextArea bilan_content = new JTextArea();

	
	private TableModel model;
	
	public CreerRapport(FenPrincipale menu) {
	
		win_param();
		report_number_zone();
		praticien_zone();
		date_zone();
		bilan_zone();
		motif_zone();
		echantillon_zone();
		action_zone();
	}
	
	public void win_param() {
		
		setBackground(Color.LIGHT_GRAY);
		setBounds(100,100,720,423);
		setLayout(null);
		
	}
	
	
	public void report_number_zone(){
		
		JLabel lbl_num = new JLabel("Num\u00E9ro du Rapport :");
		lbl_num.setBounds(40, 10, 129, 16);
		add(lbl_num);
		
		JTextField num_content = new JTextField();
		num_content.setHorizontalAlignment(SwingConstants.RIGHT);
		num_content.setEditable(false);
		num_content.setBounds(200, 7, 116, 22);
		num_content.setColumns(10);
		add(num_content);
		
	
		
		
	}
	
	public void praticien_zone(){
		
		JLabel lbl_Praticien = new JLabel("Praticien :");
		lbl_Praticien.setBounds(40, 50, 119, 16);
		add(lbl_Praticien);
		
		JButton btn_detail = new JButton("D\u00E9tails");
		btn_detail.setBounds(412, 50, 97, 25);
		add(btn_detail);
		
		// COMBO Box DATA Praticien
				String[] position = null;
				try {
					position = DAOPraticien.findname();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						JComboBox<String> comboBox = new JComboBox<String>(position);
						comboBox.setSelectedIndex(-1);
						comboBox.setBounds(200, 50, 200, 22);
						add(comboBox);
	}

	public void date_zone(){
		
		JLabel lbl_date = new JLabel("Date du Rapport :");
		lbl_date.setBounds(40, 90, 119, 16);
		add(lbl_date);
		
		JDateChooser date_content = new JDateChooser();
		date_content.setBounds(200, 90, 125, 22);
		add(date_content);
		date_content.addPropertyChangeListener("date",new PropertyChangeListener() { 
			public void propertyChange(PropertyChangeEvent e){
		     JDateChooser chooser=(JDateChooser)e.getSource();
		      SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		    

		 }
		 });

	
	}
	
	
	public void motif_zone(){
		
		JLabel lbl_Motif = new JLabel("Motif du Rapport :");
		lbl_Motif.setBounds(40, 130, 119, 16);
		add(lbl_Motif);
		
		motif_content = new JTextField();
		motif_content.setBounds(200, 130, 200, 22);
		add(motif_content);
		
		
			
	}

	
	public void bilan_zone() {
		
		JLabel lbl_Bilan = new JLabel("BILAN :");
		lbl_Bilan.setBounds(40, 170, 119, 16);
		add(lbl_Bilan);
		
		bilan_content = new JTextArea();
		bilan_content.setBounds(100, 170, 200, 150);
		add(bilan_content);
		
	
	}

	public void echantillon_zone(){
		
		JLabel lbl_Echantillon = new JLabel("Offre d'\u00E9chantillons :");
		lbl_Echantillon.setBounds(325, 170, 119, 16);
		add(lbl_Echantillon);
		
		// MODEL
				final DefaultTableModel model = new DefaultTableModel();
				final DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
				rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
				
				// TABLE DATA
				model.setDataVector(new Object[][]
												{null}
												,
												new Object[]{"Médicament","Qté"});
									
				
				// TABLE
				JTable result_table = new JTable(model);
				result_table.setBounds(475, 170, 200, 150);
				result_table.getColumnModel().getColumn(1).setMaxWidth(40);
				result_table.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
				add(result_table);
				
				
				
				// COMBO Box DATA Medicament
				String[] positions = null;
				try {
					positions = DAOMedicament.findname();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JComboBox<String> combo = new JComboBox<String>(positions);
			
				// COMBO COLUMN
				TableColumn col = result_table.getColumnModel().getColumn(0);
				col.setCellEditor(new DefaultCellEditor(combo));
				
				
				// SCROLLPANE
				JScrollPane apne= new JScrollPane(result_table);
				apne.setBounds(475, 170, 200, 150);
				add(apne);
				
				
				JButton AddRow = new JButton("Ajouter");
				AddRow.setFont(new Font("Tahoma", Font.PLAIN, 11));
				AddRow.setBounds(388, 295, 77, 25);
				add(AddRow);
				
				AddRow.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                model.addRow(new Object[] {});
		            }
		        });
				
	}
	
	
	
	public void action_zone(){
		
		JButton btnNew = new JButton("Nouveau");
		btnNew.setBounds(578, 360, 97, 25);
		add(btnNew);
		
		JButton btnSave = new JButton("Sauvegarder");
		btnSave.setBounds(458,360,117,25);
		add(btnSave);
	
		
		JButton btnRapportPrecedent = new JButton("Pr\u00E9c\u00E9dent");
		btnRapportPrecedent.setBounds(60, 360, 97, 25);
		add(btnRapportPrecedent);
		
		JButton btnSuivant = new JButton("Suivant");
		btnSuivant.setBounds(160, 360, 97, 25);
		add(btnSuivant);
		
		JButton btnClose = new JButton("Fermer");
		btnClose.setBounds(260, 360, 97, 25);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.setAnDrawNewView("Menu");
			}
		});
		add(btnClose);
		
	}
}

