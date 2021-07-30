package com.hb.gestionmediatheque.pojos;

public class Media implements Comparable<Media> {
	//Attributs
	public String titre;
	public int numeroRecord;
	public static int typeTri;
	
	public static final int TRI_NUMERO = 1;
	public static final int TRI_TITRE = 2;
	
	
	//Getter Setter
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getNumeroRecord() {
		return numeroRecord;
	}
	public void setNumeroRecord(int numeroRecord) {
		this.numeroRecord = numeroRecord;
	}
	
	//Générateur
	public Media() {
		
	}
	public Media(String titre,int numeroRecord ) {
		this.titre = titre;
		this.numeroRecord = numeroRecord;
	}
	public void afficher() {
		System.out.println("Titre : "+titre);
		System.out.println("Numéro d'enregistrement : "+numeroRecord);
	}
	@Override
	public int compareTo(Media o) {

		if (typeTri == TRI_NUMERO) {
			if (this.numeroRecord > o.numeroRecord) {
				return 1;
			}
			else if (this.numeroRecord < o.numeroRecord) {
				return -1;
			}
			else return 0;
		}
		else if (typeTri == TRI_TITRE) {
			return this.titre.compareTo(o.getTitre());
		}
		return 0;
	}	
}
