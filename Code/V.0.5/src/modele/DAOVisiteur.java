package modele;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import metiers.Visiteur;

public class DAOVisiteur extends DAO<Visiteur> {
	
	public DAOVisiteur(Connection conn) {
		super(conn);
	}


	public Visiteur check(String pnom, String ppass) throws SQLException {
		Visiteur toReturn=null;
		Statement st=connect.createStatement();
		String sql ="SELECT * FROM visiteur WHERE VIS_NOM='" +pnom+"' AND VIS_DATEEMBAUCHE='"+ppass+"'";
		ResultSet rs=st.executeQuery(sql);
		if(rs.next()){
			toReturn= new Visiteur (rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5),
					rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			System.out.println(toReturn.getNom());
			System.out.println(toReturn.getPrenom());
		}
		return toReturn;
	}

	@Override
	public ArrayList<Visiteur> findV(String name) throws SQLException {
		ArrayList<Visiteur>listeTable=new ArrayList<Visiteur>(); 
		ResultSet result=null;
		String req = "SELECT * FROM visiteur WHERE VIS_NOM LIKE '" +name+"%' ORDER BY VIS_NOM";
		Statement stmt = connect.createStatement();
		result = stmt.executeQuery(req);
		
		while(result.next()){
			listeTable.add(new Visiteur(result.getString(1),result.getString(2),result.getString(3),result.getString(4), result.getString(5),
					result.getString(6),result.getString(7),result.getString(8),result.getString(9)));
		}
		return listeTable;
	}
	
	public ArrayList<Visiteur> visiteur(String id) throws SQLException {
		ArrayList<Visiteur>listeTable=new ArrayList<Visiteur>(); 
		ResultSet result=null;
		String req = "SELECT * FROM visiteur WHERE VIS_MATRICULE = '"+id+"'";
		Statement stmt = connect.createStatement();
		result = stmt.executeQuery(req);
		
		while(result.next()){
			listeTable.add(new Visiteur(result.getString(1),result.getString(2),result.getString(3),result.getString(4), result.getString(5),
					result.getString(6),result.getString(7),result.getString(8),result.getString(9)));
		}
		return listeTable;
	}
	
	public ArrayList<Visiteur> ficheVisiteur() throws SQLException {
		ArrayList<Visiteur>listeTable=new ArrayList<Visiteur>(); 
		ResultSet result=null;
		String req = "SELECT * FROM visiteur";
		Statement stmt = connect.createStatement();
		result = stmt.executeQuery(req);
		
		while(result.next()){
			listeTable.add(new Visiteur(result.getString(1),result.getString(2),result.getString(3),result.getString(4), result.getString(5),
					result.getString(6),result.getString(7),result.getString(8),result.getString(9)));
		}
		return listeTable;
	}
	

}
