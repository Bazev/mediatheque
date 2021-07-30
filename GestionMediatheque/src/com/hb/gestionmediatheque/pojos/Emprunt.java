package com.hb.gestionmediatheque.pojos;
import java.util.*;

public class Emprunt {
	
	public int id;
	public int idAdherant;
	public int numeroRecord;
	public Date dateEmprunt;
	public Date dateREtour;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int idAdherant() {
		return idAdherant;
	}
	public void idAdherant(int idAdherant) {
		this.idAdherant = idAdherant;
	}
	
	
	public int getNumeroRecord() {
		return numeroRecord;
	}
	public void setNumeroRecord(int numeroRecord) {
		this.numeroRecord = numeroRecord;
	}
	public Date getDateEmprunt() {
		return dateEmprunt;
	}
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	public Date getDateREtour() {
		return dateREtour;
	}
	public void setDateREtour(Date dateREtour) {
		this.dateREtour = dateREtour;
	}
	
	
	public Emprunt() {
		
	}
	
	public Emprunt(int id, int idAherent, int numeroMedia, Date dateEmprunt, Date dateRetour  ) {
		this.id = id;
		this.idAdherant = idAherent;
		this.numeroRecord = numeroMedia;
		this.dateEmprunt = dateEmprunt;
		this.dateREtour = dateRetour;
	}
	
	public void Afficher() {
		System.out.println("===EMPRUNTS===");
		System.out.println("ID : "+id);
		System.out.println("ID Adherant : "+idAdherant);
		System.out.println("N° Media : "+numeroRecord);
		System.out.println("Date d'emprunt : "+dateEmprunt);
		System.out.println("Date de retour : "+dateREtour);
	}
	

	


}
