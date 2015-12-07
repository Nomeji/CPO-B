package edt.iut.entity;

import org.jdatepicker.impl.UtilDateModel;

public class Disponibilite {
	private UtilDateModel jourDispo;
	private String hour;
	private Acteur sonActeur;
	
	public Disponibilite(UtilDateModel jourDispo,String hour,Acteur acteur){
		this.jourDispo = jourDispo;
		this.hour = hour;
		sonActeur = acteur;
	}

	public UtilDateModel getJourDispo() {
		return jourDispo;
	}

	public String getHour() {
		return hour;
	}
	
	
}
