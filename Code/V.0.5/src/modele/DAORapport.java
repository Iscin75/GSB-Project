package modele;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Vector;


import metiers.Rapport;

public class DAORapport extends DAO<Rapport> {
	
	public DAORapport(Connection conn) {
		super(conn);
	}
	
	public Vector<String[]> getAllRapport() throws SQLException{
		
		
		Vector<String[]> toReturn=new Vector<String[]>();
		Statement st=connect.createStatement();
		String sql ="SELECT * FROM rapport_visite";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			
			toReturn.addElement(new String []{rs.getString("VIS_MATRICULE"), rs.getString("RAP_NUM") ,rs.getString("PRA_NUM"),rs.getString("RAP_DATE") ,rs.getString("RAP_BILAN") ,rs.getString("RAP_MOTIF") });
			System.out.println(toReturn.get(toReturn.size()-1)[2]);

		}
		
		return toReturn;
	}

	
}
