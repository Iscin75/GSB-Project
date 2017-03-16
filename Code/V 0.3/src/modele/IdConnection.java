package modele;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IdConnection {

	public IdConnection() throws ClassNotFoundException, SQLException {
		idCheck("Andre","1991-08-26");
	}
	public boolean idCheck(String pnom, String ppass) throws ClassNotFoundException, SQLException{
		boolean toReturn=false;
		
		String url ="jdbc:mysql://localhost:8080/gsb";
		String login ="root";
		String passwd="";
		java.sql.Connection cn =null;
		java.sql.Statement st=null;
		ResultSet rs=null;

		Class.forName("com.mysql.jdbc.Driver");
		cn=DriverManager.getConnection(url,login,passwd);
		st=cn.createStatement();
		String sql ="SELECT VIS_NOM, VIS_DATEEMBAUCHE FROM visiteur WHERE VIS_NOM='" +pnom+"' AND VIS_DATEEMBAUCHE='"+ppass+"'";
		rs=st.executeQuery(sql);
		if(rs.next()){
			toReturn=true;
			System.out.println(rs.getString("VIS_NOM"));
			System.out.println(rs.getString("VIS_DATEEMBAUCHE"));
		}
		cn.close();
		st.close();
		
		
		
		return toReturn;
	}
}
