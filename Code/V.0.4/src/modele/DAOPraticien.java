package modele;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import metiers.Praticien;

public class DAOPraticien extends DAO<Praticien> {
	
	public DAOPraticien(Connection conn) {
		super(conn);
	}


	public static String[] findname() throws SQLException {
		ArrayList<String> toReturn = new ArrayList<String>();
		Statement st=connect.createStatement();
		String sql ="SELECT PRA_NOM, PRA_PRENOM FROM praticien";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			toReturn.add(rs.getString("PRA_NOM") + ' ' + rs.getString("PRA_PRENOM"));
		}
		String[] toReturnFormatted = new String[toReturn.size()];
		toReturnFormatted = toReturn.toArray(toReturnFormatted);
	
		
		return toReturnFormatted;
	}
	
	@Override
	public ArrayList<Praticien> findP(String name) throws SQLException {
		ArrayList<Praticien>listeTable=new ArrayList<Praticien>(); 
		ResultSet result=null;
		String req = "SELECT * FROM praticien WHERE PRA_NOM LIKE'" +name+"%' ORDER BY PRA_NOM";
		Statement stmt = connect.createStatement();
		result = stmt.executeQuery(req);
		
		while(result.next()){
			listeTable.add(new Praticien(result.getString(1),result.getString(2),result.getString(3),result.getString(4), result.getString(5),
					result.getString(6),result.getString(7),result.getString(8)));
		}
		return listeTable;
	}
	

}
