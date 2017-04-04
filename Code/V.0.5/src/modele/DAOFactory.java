package modele;
import java.sql.Connection;

public class DAOFactory {

			  protected static final Connection conn = BDDConnexion.getInstance();   
			   
			  /**
			  * Retourne un objet Classe interagissant avec la BDD
			  * @return DAO
			  */
			  public static DAO getDAOVisiteur(){
			    return new DAOVisiteur(conn);
			  }
			  
			  
			  public static DAO getDAOMedicament(){
				    return new DAOMedicament(conn);
				  }
			  public static DAO getDAOFamille(){
				    return new DAOFamille(conn);
				  }


			  public static DAO getDAOPraticien(){
				  return new DAOPraticien(conn);
			  }
			  
			  public static DAO getDAORapport(){
				  return new DAORapport(conn);
			  }
			}