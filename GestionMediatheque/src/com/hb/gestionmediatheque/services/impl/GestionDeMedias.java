package com.hb.gestionmediatheque.services.impl;
import java.util.*;


import com.hb.gestionmediatheque.exceptions.GestionMediException;
import com.hb.gestionmediatheque.pojos.Adherant;
import com.hb.gestionmediatheque.pojos.CDAudio;
import com.hb.gestionmediatheque.pojos.DVDVideo;
import com.hb.gestionmediatheque.pojos.Emprunt;
import com.hb.gestionmediatheque.pojos.Encyclopedie;
import com.hb.gestionmediatheque.pojos.Livre;
import com.hb.gestionmediatheque.pojos.Media;
public class GestionDeMedias {
	
	public List<Media> listmedias = new ArrayList<Media>();
	public List<Adherant> listAdherant = new ArrayList<Adherant>();
	public List<Emprunt> listEmprunt = new ArrayList<Emprunt>();
	
	public void AddMedia(Media media) {
		listmedias.add(media);
	}
	
	public void afficherLesMedias() {
		for (Media media : listmedias) {
			media.afficher();
		}
		
	}
	public void afficherLesAuteurs( ) {
		
		System.out.println("===Auteurs=== : ");
		for(Media media : listmedias) {
			if (media instanceof Livre) {
			// cast le Livre en Livre
				Livre livre = (Livre)media;
				System.out.println(livre.getAuteur());
			}
			
			if (media instanceof CDAudio ) {
				CDAudio cdaudio = (CDAudio)media;
				System.out.println(cdaudio.getAuteur());
			}
		}
			System.out.println("");
	}
	public void afficherLesLangues() {
			System.out.println("===Langue=== : ");
			for (Media media : listmedias) {
				if (media instanceof Encyclopedie) {
				Encyclopedie encyclopedie = (Encyclopedie)media;
				System.out.println(encyclopedie.getLangue());
				
			}
				if (media instanceof DVDVideo) {
					DVDVideo dvd =(DVDVideo)media;
					System.out.println(dvd.getLangue());
				}	
			}
			System.out.println("");
		}
	public void afficherLesTitres() {
			System.out.println("===Titre=== : ");
			for (Media media : listmedias) {
				if (media instanceof Media) {
					Media title = (Media)media;
					System.out.println(title.getTitre());
					System.out.println("Emplacement " +title.getNumeroRecord());
					System.out.println("");
				}
			}	
		}
	public void ajouterAdherent(Adherant adherant) {
		listAdherant.add(adherant);
	}
	public void ajouterEmprunt(Emprunt emprunt) {
		listEmprunt.add(emprunt);
	}
	public void afficherLesEmprunts() {
		for(Emprunt emprunt : listEmprunt) {
			emprunt.Afficher();
		}
	}
	public void afficherLesAdherants() {
		for (Adherant adherants : listAdherant) {
			adherants.Afficher();
		}
	}
	public void ajouterEmprunt() {
		
	}
	public Adherant rechercherAdherant(int id) {
		Adherant adherantTrouve = null;
		
		for (Adherant adherant : listAdherant) {
			if (id == adherant.getidAdherant()) {
				adherantTrouve = adherant;	
				adherantTrouve.Afficher();
			}		
		}
		if (adherantTrouve == null) {
			throw new GestionMediException();
		}
		return adherantTrouve;
	}
	public Media rechercherMedia(String id) {
		Media mediaTrouve = null;
		
		for (Media media : listmedias) {
			if (id.equals(media.getNumeroRecord())) {
				mediaTrouve = media;
				mediaTrouve.afficher();
			}
		}
		if (mediaTrouve == null) {
			throw new GestionMediException();
		}
		return mediaTrouve;
	}
	
	public void TrierMedia(int typeDeTri) {
		Media.typeTri = typeDeTri;
	Collections.sort(listmedias);
	System.out.println("Tri Effectué");
	}
		
}
