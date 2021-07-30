package com.hb.gestionmediatheque.services;
import java.util.List;

import com.hb.gestionmediatheque.pojos.Adherant;

public interface AdherantService {
	
	void ajouterAdherant(Adherant adherant);  
	
	Adherant recupererAdherant(int id);
	
	List<Adherant> recupererAdherants();
	
	boolean supprimerAdherant(int id);
		
	

}
