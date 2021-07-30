package com.hb.gestionmediatheque.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.hb.gestionmediatheque.pojos.Adherant;
import com.hb.gestionmediatheque.services.AdherantService;

public class AdherantServiceImpl implements AdherantService{
	
	private List<Adherant> adherants = new ArrayList<Adherant>();
	
	@Override
	public void ajouterAdherant(Adherant adherant) {
		adherants.add(adherant);
		
	}
	@Override
	public Adherant recupererAdherant(int id) {
		
	for (Adherant adherant : adherants) {
		if (id == adherant.getidAdherant()) {
			return adherant;
		}	
	}
		return null;
	}
	@Override
	public List<Adherant> recupererAdherants() {
		
		return adherants;
	}
	@Override
	public boolean supprimerAdherant(int id) {
		
		for (Adherant adherant : adherants) {
			if ( id == adherant.getidAdherant()) {
				adherants.remove(adherant);
				return true;
			}
		}
		return false;
	}

}
