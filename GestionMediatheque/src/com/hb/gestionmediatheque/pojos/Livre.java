package com.hb.gestionmediatheque.pojos;
public class Livre extends Media {
	
	public String auteur;
	public int nPage;
	
	//Getter Setter
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getnPage() {
		return nPage;
	}
	public void setnPage(int nPage) {
		this.nPage = nPage;
	}
	
	public Livre() {
		
	}
	
	public Livre(String titre, int numeroRecord, String auteur, int nPage) {
		super(titre, numeroRecord);
		this.auteur = auteur;
		this.nPage = nPage;
	}
	
	public void afficher() {
		System.out.println("===LIVRES=== : ");
		super.afficher();
		System.out.println("Nom auteur : "+auteur);
		System.out.println("Nombre de page : "+nPage);
		System.out.println("");
	}
	

}
