package controller;


import view.Authentification;
import view.ChercherPraticien;
import view.FenPrincipale;
import view.Footer;
import view.Header;
import view.ConsulterMedicament;
import view.MenuPrincipal;
import view.VisiteurFicheView;
import view.CreerRapport;
import view.ChercherVisiteur;

public class Controller {
		/** Notre controller qui nous permet de generer le contenu des fenetre*/
	static String  toDraw=null;
	static FenPrincipale FA = new FenPrincipale();
	public static String id;
	public static int row;

	public static void main(String[] args) {
		try{
			drawNewView();

			}
		catch (Exception e) {
		 	e.printStackTrace();
		}

	}
	
	//TODO JAVADoc méthode permettant de repeindre la fenêtre 

	public static void setAnDrawNewView(String pToDraw){
		setToDraw(pToDraw);
		drawNewView();
		
	}
	public static void setToDraw(String pToDraw){
		toDraw = pToDraw;
	}
	public static void drawNewView(){
		if (toDraw==null){
			AuthentificationView();
		}else{
			switch (toDraw) {
				case "Menu":
					MenuView();
					break;
				case "Compte-rendus":
					CompteRView();
					break;
				case "Gestion des visiteurs":
					SearchVisiteurView();
					break;
				case "Gestion des praticiens":
					SearchPraticienView();
					break;
				case "Gestion des medicaments":
					SearchMedicamentsView();
					break;
					
				case "Fiche visiteur":
					VisiteurFiche(id);
					break;	
				
			}
				
		}
		
		
	}
	
	//TODO Javadoc pour les différentes fenetres. 
	//TODO Optimisation
	private static void AuthentificationView(){
		FA.setHeader(new Header("Authentification"));
		FA.header_content();
		
		//New footer
		FA.setFooter(new Footer());
		FA.footer_content();
		
		//New corps
		FA.setCorps(new Authentification(FA));
		FA.corps();
		
		//Parametre de notre fenetre
		FA.setTitle("GSB - Authentification");
		FA.setVisible(true);
		System.out.println("ConnexionView");
	}
	private static void MenuView(){
		MenuPrincipal menu = new MenuPrincipal(FA);
		Header menu_header = new Header("Menu Principal");
		FA.remove(FA.getCorps());
		FA.remove(FA.getHeader());
		FA.setCorps(menu);
		FA.setHeader(menu_header);
		FA.remake();
		System.out.println("MenuView");
	}
	private static void CompteRView(){
		CreerRapport reporting = new CreerRapport(FA);
		FA.remove(FA.getCorps());
		FA.remove(FA.getHeader());
		FA.setCorps(reporting);
		FA.setHeader(new Header("Compte-rendus"));
		FA.remake();
		System.out.println("CompteRView");
	}
	private static void SearchVisiteurView(){
		ChercherVisiteur visiteurs = new ChercherVisiteur(FA);
		FA.remove(FA.getCorps());
		FA.remove(FA.getHeader());
		FA.setCorps(visiteurs);
		FA.setHeader(new Header("Gestion des visiteurs"));
		FA.remake();
		System.out.println("SearchVisiteurView");
	}
	private static void SearchPraticienView(){
		ChercherPraticien practiciens = new ChercherPraticien(FA);
		FA.remove(FA.getCorps());
		FA.remove(FA.getHeader());
		FA.setCorps(practiciens);
		FA.setHeader(new Header("Gestion des practiciens"));
		FA.remake();
		System.out.println("SearchPraticienView");
	}
	private static void SearchMedicamentsView(){
		ConsulterMedicament medicaments = new ConsulterMedicament(FA);
		FA.remove(FA.getCorps());
		FA.remove(FA.getHeader());
		FA.setCorps(medicaments);
		FA.setHeader(new Header("Gestion des medicaments"));
		FA.remake();
		System.out.println("SearchMedicamentsView");
	}
	private static void VisiteurFiche(String id){
		VisiteurFicheView visiteurFiche = new VisiteurFicheView(FA,id);
		FA.remove(FA.getCorps());
		FA.remove(FA.getHeader());
		FA.setCorps(visiteurFiche);
		FA.setHeader(new Header("Fiche du visiteur id : "+id));
		FA.remake();
		System.out.println("VisiteurFiche");
	}	

}
