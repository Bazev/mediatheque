package com.hb.gestionmediatheque.pojos;

public class CDAudio extends Media{
	public String auteur;
	public String compositeur;
	public int nPistes;
	
	
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getCompositeur() {
		return compositeur;
	}
	public void setCompositeur(String compositeur) {
		this.compositeur = compositeur;
	}
	public int getnPistes() {
		return nPistes;
	}
	public void setnPistes(int nPistes) {
		this.nPistes = nPistes;
	}
	
	public CDAudio() {
		
	}
	
	public CDAudio(String titre, int numeroRecord, String auteur, String compositeur, int nPistes) {
		super(titre, numeroRecord);
		this.auteur = auteur;
		this.compositeur = compositeur;
		this.nPistes = nPistes;
	}
	
	public void afficher() {
		System.out.println("===CD  Audio=== : ");
		super.afficher();
		System.out.println("Auteur : "+auteur);
		System.out.println("Compositeur : "+compositeur);
		System.out.println("Nombre de pistes : "+nPistes);
		System.out.println("");
	}
	

}
