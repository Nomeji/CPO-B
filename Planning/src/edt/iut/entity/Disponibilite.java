package edt.iut.entity;

import org.jdatepicker.impl.UtilDateModel;

public class Disponibilite {
	private UtilDateModel jourDispo;
	private String hour;
	
	public Disponibilite(UtilDateModel jourDispo,String hour){
		this.jourDispo = jourDispo;
		this.hour = hour;
	}

	public UtilDateModel getJourDispo() {
		return jourDispo;
	}

	public String getHour() {
		return hour;
	}
	
	
}
