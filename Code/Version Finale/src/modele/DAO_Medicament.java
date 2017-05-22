package modele;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

import metiers.Medicament;

public class DAO_Medicament extends DAO<Medicament> {
	
	public DAO_Medicament(Connection conn) {
		super(conn);
	}

	//** Récupère tous les noms des médicaments (ComboBox dans la JTable pour la création de rapport) **/
	public static String[] findname() throws SQLException {
		ArrayList<String> toReturn = new ArrayList<String>();
		Statement st=connect.createStatement();
		String sql ="SELECT MED_DEPOTLEGAL FROM medicament";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			toReturn.add(rs.getString("MED_DEPOTLEGAL"));
		}
		String[] toReturnFormatted = new String[toReturn.size()];
		toReturnFormatted = toReturn.toArray(toReturnFormatted);
	
		return toReturnFormatted;
	}
	
	//** Récupère toutes les informations des médicaments (Vue Consulter Médicament) **//
	public Vector<String[]> getAllMedicaments() throws SQLException{
		
		Hashtable table =((DAO_Famille)(DAO_Factory.getDAOFamille())).getAllFamille();
		Vector<String[]> toReturn=new Vector<String[]>();
		Statement st=connect.createStatement();
		String sql ="SELECT * FROM medicament";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			
			toReturn.addElement(new String []{rs.getString("MED_DEPOTLEGAL"), rs.getString("MED_NOMCOMMERCIAL") ,(String) table.get(rs.getString("FAM_CODE")) ,rs.getString("MED_COMPOSITION") ,rs.getString("MED_EFFETS") ,rs.getString("MED_CONTREINDIC")});
			System.out.println(toReturn.get(toReturn.size()-1)[2]);

		}
		
		return toReturn;
	}

}