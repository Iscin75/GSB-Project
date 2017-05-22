package modele;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;

import metiers.Visiteur;

public class DAO_Famille extends DAO<Visiteur> {
	
	public DAO_Famille(Connection conn) {
		super(conn);
	}

	/** R�cup�re toutes les familles et tous les codes associ�s des diff�rents m�dicaments (Vue Consulter M�dicament) **/
	public Hashtable getAllFamille() throws SQLException{
		
		Hashtable toReturn=new Hashtable();
		Statement st=connect.createStatement();
		String sql ="SELECT * FROM famille";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			toReturn.put(rs.getString("FAM_CODE"),rs.getString("FAM_LIBELLE"));
		}
		
		return toReturn;
	}



}
