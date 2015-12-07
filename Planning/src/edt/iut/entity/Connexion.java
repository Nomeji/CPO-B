package edt.iut.entity;

import edt.iut.boundary.EcranDisponibilite;

public class Connexion { // Simulateur de connexion
	private Acteur sonActeur;
	
	public Connexion(String typeActeur, int idActeur, String nom, String prenom, String password, String numTel, String classe,
			String mailupsud){
		if(typeActeur == "etudiant"){
			sonActeur = new Etudiant(idActeur, nom, prenom, password, numTel, classe, mailupsud,this);
		}
	}

	public Acteur getSonActeur() {
		return sonActeur;
	}
	
	public static void main(String args[]){
		Connexion co = new Connexion("etudiant",1,"Flantier","Noël","blanquette","01010101","3B1","noel@oss.fr");
		EcranDisponibilite choix = new EcranDisponibilite(co);
	}

}
