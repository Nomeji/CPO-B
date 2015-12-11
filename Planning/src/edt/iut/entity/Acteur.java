package edt.iut.entity;

import java.util.ArrayList;

import edt.iut.entity.Connexion;

public abstract class Acteur {
	private int idActeur;
	private String nom;
	private String prenom;
	private String password;
	private String numTel;
	private Connexion saConnexion;
	private ArrayList<Disponibilite> dispo;
	
	public Acteur(int idActeur, String nom, String prenom, String password, String numTel,Connexion co) {
		super();
		this.idActeur = idActeur;
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.numTel = numTel;
		saConnexion = co;
		dispo = new ArrayList<Disponibilite>();
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public ArrayList<Disponibilite> getDispo() {
		return dispo;
	}
	
	public void addDispo(Disponibilite d){
		dispo.add(d);
	}


}
