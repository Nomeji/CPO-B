package edt.iut.entity;

public abstract class Acteur {
	private int idActeur;
	private String nom;
	private String prenom;
	private String password;
	private String numTel;
	private Connexion saConnexion;
	
	public Acteur(int idActeur, String nom, String prenom, String password, String numTel,Connexion co) {
		super();
		this.idActeur = idActeur;
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.numTel = numTel;
		saConnexion = co;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}
}
