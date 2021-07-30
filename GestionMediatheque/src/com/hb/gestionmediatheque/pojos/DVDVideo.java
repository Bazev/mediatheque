package com.hb.gestionmediatheque.pojos;
public class DVDVideo extends Media{
	public String langue;
	public int duree;
	
	
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	public double getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	public DVDVideo() {
		
	}
	
	public DVDVideo(String titre, int numeroRecord, String langue, int duree) {
		super(titre, numeroRecord);
		this.langue = langue;
		this.duree= duree;
	}
	
	public void afficher() {
		System.out.println("===DVD VIDEOS=== : ");
		super.afficher();
		System.out.println("Langue : "+langue);
		System.out.println("Durée : "+duree);
		System.out.println("");
	}

}
