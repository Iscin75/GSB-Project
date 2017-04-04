package modele;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDDConnexion {
	String url ="jdbc:mysql://192.168.3.145:3306/gsb";
	String login ="root";
	String passwd="gsb";
	static Connection cn =null;
	public BDDConnexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			cn=DriverManager.getConnection(url,login,passwd);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static Connection getInstance(){
		if(cn==null){
			new BDDConnexion();
		}
		return cn;
	}

}
