package edt.iut.entity;

import java.util.Date;

public class Disponibilite {
	private Date jour;
	private String hour;
	private Acteur sonActeur;
	
	public Disponibilite(Date jour,String hour,Acteur acteur){
		this.jour = jour;
		this.hour = hour;
		sonActeur = acteur;
	}

	public Date getJour() {
		return jour;
	}

	public String getHour() {
		return hour;
	}
	
	
}
