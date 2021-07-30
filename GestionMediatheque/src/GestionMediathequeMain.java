import java.util.*;

import com.hb.gestionmediatheque.exceptions.AdherantNonTrouveException;
import com.hb.gestionmediatheque.exceptions.GestionMediException;
import com.hb.gestionmediatheque.pojos.Adherant;
import com.hb.gestionmediatheque.pojos.CDAudio;
import com.hb.gestionmediatheque.pojos.DVDVideo;
import com.hb.gestionmediatheque.pojos.Emprunt;
import com.hb.gestionmediatheque.pojos.Encyclopedie;
import com.hb.gestionmediatheque.pojos.Livre;
import com.hb.gestionmediatheque.services.AdherantService;
import com.hb.gestionmediatheque.services.impl.AdherantServiceImpl;
import com.hb.gestionmediatheque.services.impl.GestionDeMedias;
public class GestionMediathequeMain {
	static Scanner sc = new Scanner(System.in);
	static GestionDeMedias mediamanager = new GestionDeMedias();
	static AdherantService adherantService;
	
	
	public static void main(String[] args) {
		
		adherantService = new AdherantServiceImpl();
		
		Livre livre1 = new Livre("Glacé", 11, "Bernard Minier", 450);
		Encyclopedie encyc1 = new Encyclopedie("L'univers", 20, "Francais", 8);
		DVDVideo DVD1 = new DVDVideo("Star Wars",312, "Francais", 300);
		CDAudio CD1 = new CDAudio("TOP films",4, "NRJ", "John Willialms", 17);
		CDAudio CD2 = new CDAudio("Annee80",2, "Virgin", "Kattie Perry", 3);
		
		Adherant Adh1 = new Adherant(101, "Banner", "Bruce", "Hulk@avenger.fr", "555 888 777");
		Adherant Adh2 = new Adherant(102, "Stark", "Tony", "IronMan@avenger.fr", "555 878 366");
		
		Emprunt em1 = new Emprunt(12, 002, 11, new Date((2021/07/9)), new Date((2021/8/9)) );
		mediamanager.AddMedia(livre1);
		mediamanager.AddMedia(encyc1);
		mediamanager.AddMedia(DVD1);
		mediamanager.AddMedia(CD1);
		mediamanager.AddMedia(CD2);
		mediamanager.ajouterAdherent(Adh1);
		mediamanager.ajouterAdherent(Adh2);
		mediamanager.ajouterEmprunt(em1);
		String string;
		do { 
			try {
			System.out.println("=== Menu Principal ===");
			System.out.println("");
			System.out.println("1 > Ajouter un livre");
			System.out.println("2 > Ajouter une encyclopedie");
			System.out.println("3 > Ajouter un CD Audio");
			System.out.println("4 > Ajouter un DVD Video");
			System.out.println("5 > Créer un nouvel adhérent");
			System.out.println("6 > Ajouter un nouvel emprunt");
			System.out.println("");
			System.out.println("7 > Afficher tous les médias");
			System.out.println("8 > Afficher tous les auteurs");
			System.out.println("9 > Afficher toutes les langues");
			System.out.println("10 > Afficher tous les titres");
			System.out.println("11 > Afficher les emprunts");
			System.out.println("12 > Afficher les adhérants");
			System.out.println("13 > Rechercher un adhérant");
			System.out.println("14 > Rechercher un média");
			System.out.println("15 > Trier la liste par rapport au titre");
			System.out.println("16 > Trier la liste par rapport au numero d'enregistrement");
			System.out.println("=== ========= ===");
			System.out.println("==>Selectionnez une option :<==");
			
			int choix = Integer.parseInt(sc.nextLine());
			
			switch (choix) {
			
			case 1:
				ajouterLivre();
				mediamanager.afficherLesTitres();
				break;
			case 2:
				ajouterEncyclopedie();
				mediamanager.afficherLesTitres();
				break;
			case 3:
				ajouterCDaudio();
				mediamanager.afficherLesAuteurs();
				break;
			case 4:
				ajouterDVDvideo();
				mediamanager.afficherLesTitres();
				break;
			case 5:
				ajouterAdherant();
				mediamanager.afficherLesAdherants();
				break;
			case 6:
				ajouterEmprunt();
				mediamanager.afficherLesEmprunts();
				break;
			case 7 :
				mediamanager.afficherLesMedias();
				break;
			case 8 :
				mediamanager.afficherLesAuteurs();
				break;
			case 9 :
				mediamanager.afficherLesLangues();
				break;
			case 10:
				mediamanager.afficherLesTitres();
				break;
			case 11:
				mediamanager.afficherLesEmprunts();
				break;
			case 12:
				mediamanager.afficherLesAdherants();
				break;
			case 13 :
				rechercherAdherant(0);
				break;
			case 14 :
				rechercherMedia("");
				break;
			case 15 :
				mediamanager.TrierMedia(2);
				break;
			case 16:
				mediamanager.TrierMedia(1);
				break;
				
			default:
				System.out.println("Choix invalide");
				break;
			}
			System.out.println("Retour"
					+ " au menu ? O ou N ");
			
		} 
			
			catch (IllegalArgumentException e) {
				System.out.println("***===DATE au format annee/mois/jour ex 1987/01/19");	
			}
			catch (GestionMediException e) {	
			}
			string = sc.nextLine();
		} 
		while (!string.toLowerCase().equals("N"));
	}
	
	
	public static void ajouterLivre() {
		System.out.println("Titre :");
		String titrel = sc.nextLine();
		System.out.println("Numero Emplacement :");
		int numeroRecordl = sc.nextInt();
		System.out.println("Auteur :");
		String auteurl = sc.nextLine();
		System.out.println("Nombre de page :");
	
		int npage = Integer.parseInt(sc.nextLine());
		
		Livre livre2 = new Livre(titrel,numeroRecordl, auteurl, npage);
		mediamanager.AddMedia(livre2);
		System.out.println("Livre ajouté");
	}
	
	public static void ajouterEncyclopedie() {
		System.out.println("Titre :");
		String titree = sc.nextLine();
		System.out.println("Numero Emplacement :");
		int numeroRecorde = sc.nextInt();
		System.out.println("Langue :");
		String languee = sc.nextLine();
		System.out.println("Nombre de tomes :");
		int ntome = Integer.parseInt(sc.nextLine());
		
		Encyclopedie encyclopedie2 = new Encyclopedie(titree, numeroRecorde, languee, ntome);
		mediamanager.AddMedia(encyclopedie2);
	}
	
	public static void ajouterCDaudio() {
		System.out.println("Titre :");
		String titrecd = sc.nextLine();
		System.out.println("Numero Emplacement :");
		int numeroRecordcd = sc.nextInt();
		System.out.println("Auteur :");
		String auteurcd = sc.nextLine();
		System.out.println("Compositeur :");
		String compositeur = sc.nextLine();
		System.out.println("Nombre de piste :");
		
		int npiste = 0;
		try {
			npiste = Integer.parseInt(sc.nextLine());
		} 
		catch (NumberFormatException e) {
			throw new NumberFormatException("Le nombre de piste n'est pas un nombre");
			// TODO: handle exception
		}
		CDAudio CD3 = new CDAudio(titrecd, numeroRecordcd, auteurcd, compositeur, npiste);
		mediamanager.AddMedia(CD3);
	}
	
	public static void ajouterAdherant() {
		System.out.println("ID : ");
		int id = Integer.parseInt(sc.nextLine()); 
		System.out.println("Nom : ");
		String nom = sc.nextLine();
		System.out.println("Prenom : ");
		String prenom = sc.nextLine();
		System.out.println("Email : ");
		String email = sc.nextLine();
		System.out.println("Tel : ");
		String tel = sc.nextLine();
	
		try {
			id = Integer.parseInt(sc.nextLine());
		}
		catch (NumberFormatException e) {
			throw new NumberFormatException("Le format de l'ID est incorrect");
		}

		Adherant adherant = new Adherant();
		adherantService.ajouterAdherant(adherant);
	}
	
	public static void ajouterEmprunt() {
			System.out.println("Rentrez un ID");
			int ide = Integer.parseInt(sc.nextLine());
			
			System.out.println("Rentrez l'ID de l'adherent");
			int ida = sc.nextInt();
			try {
				ida = Integer.parseInt(sc.nextLine());
			}
			catch (NumberFormatException e) {
				throw new NumberFormatException("L'id de l'adherant est incorrect");
			}
			
			System.out.println("Rentrez le numero du média");
			int nr = 0;
			try {
				nr = Integer.parseInt(sc.nextLine());
			}
			catch (NumberFormatException e) {
				throw new NumberFormatException("l'identifiant du média est incorrect");
			}
			
			System.out.println("Rentrez la date de l'emprunt (annee/mois/jour) :");
			String dateE="";
			
			
			System.out.println("Rentrez la date de retour (annee/mois/jour) :");
			String dateR = sc.nextLine();
			
			Emprunt emprunt1 = new Emprunt(ide, ida, nr, new Date(Date.parse(dateE)), new Date(Date.parse(dateR)));
			mediamanager.ajouterEmprunt(emprunt1);	
	}
	public static void ajouterDVDvideo() {

		System.out.println("Titre :");
		String titredvd = sc.nextLine();
		System.out.println("Numero Emplacement :");
		int numeroRecordedvd = sc.nextInt();
		System.out.println("Langue :");
		String languedvd = sc.nextLine();
		System.out.println("Rentrez la durée");
		int duree = Integer.parseInt(sc.nextLine());
		
		DVDVideo DVD2 = new DVDVideo(titredvd, numeroRecordedvd, languedvd, duree);
		mediamanager.AddMedia(DVD2);
	}
	
	public static void rechercherAdherant(int ida) {
		System.out.println("Entre l'identifiant");
		ida = Integer.parseInt(sc.nextLine());
		mediamanager.rechercherAdherant(ida);
	}
	public static void AfficherAdherants() {
		int idadherant = 0;
		try {
			idadherant = Integer.parseInt(sc.nextLine());
		}
		catch (NumberFormatException e) {
			throw new NumberFormatException("Identifiant incorrect");	
		}
		Adherant adherant = adherantService.recupererAdherant(idadherant);
		
	}
	public static void rechercherMedia(String id) {
		System.out.println("Entre le numéro d'enregistrement");
		id = sc.nextLine();
		mediamanager.rechercherMedia(id);
	}
	
}
