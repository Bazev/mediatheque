package com.hb.gestionmediatheque.pojos;
public class Encyclopedie extends Media{
	
	public String langue;
	public int nTome;
	
	
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	public int getnTome() {
		return nTome;
	}
	public void setnTome(int nTome) {
		this.nTome = nTome;
	}
	
	public Encyclopedie() {
		
	}
	
	public Encyclopedie(String titre, int numeroRecord, String langue, int nTome) {
		super(titre, numeroRecord);
		this.langue = langue;
		this.nTome = nTome;
	}
	
	public void afficher() {
		System.out.println("===ENCYCLOPEDIES=== : ");
		super.afficher();
		System.out.println("Langue : "+langue);
		System.out.println("Nombre de tomes : "+nTome);
		System.out.println("");
	}
	
	

}
