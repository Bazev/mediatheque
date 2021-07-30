package com.hb.gestionmediatheque.exceptions;

public class AdherantNonTrouveException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public AdherantNonTrouveException( ) {
		System.out.println("***===L'adhérent saisie n'existe pas===***");
	}

}
