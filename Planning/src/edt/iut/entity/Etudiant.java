package edt.iut.entity;

import java.util.ArrayList;

import edt.iut.entity.Acteur;
import edt.iut.entity.Connexion;

public class Etudiant extends Acteur{
	private String classe;
	private String mailupsud;
	private ArrayList<Disponibilite> dispo;
	public Etudiant(int idActeur, String nom, String prenom, String password, String numTel, String classe,
			String mailupsud,Connexion co) {
		super(idActeur, nom, prenom, password, numTel,co);
		this.classe = classe;
		this.mailupsud = mailupsud;
	}
	
}
