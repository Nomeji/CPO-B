package edt.iut.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edt.iut.boundary.EcranDisponibilite;
import edt.iut.entity.*;

public class ControleurDisponibilite implements ActionListener{
	EcranDisponibilite sonEcran;
	Disponibilite saDispo;
	Connexion saConnexion;
	
	public ControleurDisponibilite(EcranDisponibilite ecran, Connexion co){
		sonEcran = ecran;
		saConnexion = co;
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand() == "Valider"){
			saDispo = new Disponibilite(sonEcran.getModel(),sonEcran.getHour(),saConnexion.getSonActeur());
			System.out.println("Disponibilité ajouté");
		}
		else{
			System.out.println(saConnexion.getSonActeur().getPrenom()+" "+saConnexion.getSonActeur().getNom());
			System.out.print("Vous avez ajouté une diponibilité pour le : ");
			System.out.print(saDispo.getJourDispo().getDay()+"/"+saDispo.getJourDispo().getMonth()+"/"+saDispo.getJourDispo().getYear());
			System.out.println(" à "+saDispo.getHour()+"h");
		}
	}
}
