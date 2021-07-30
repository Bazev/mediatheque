package com.hb.gestionmediatheque.pojos;

public class Adherant {
	
	private int idAdherant;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	
	
	public int getidAdherant() {
		return idAdherant;
	}
	public void setidAdherant(int id) {
		this.idAdherant = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public Adherant() {
		
	}
	
	public Adherant(int id, String nom, String prenom, String email, String tel) {
		this.idAdherant = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		
	}
	
	public void Afficher() {
		System.out.println("===ADHERENT===");
		System.out.println("ID : "+idAdherant);
		System.out.println("Nom : "+nom);
		System.out.println("Prenom : "+prenom);
		System.out.println("Email : "+email);
		System.out.println("Tel : "+tel);
	}
	
	

}
