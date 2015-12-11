package edt.iut.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edt.iut.boundary.EcranDisponibilite;
import edt.iut.entity.*;
import edt.iut.entity.Connexion;

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
			saDispo = new Disponibilite(sonEcran.getModel().getValue(),sonEcran.getHour(),saConnexion.getSonActeur());
			saConnexion.getSonActeur().addDispo(saDispo);
			System.out.println("Disponibilitée ajoutée");
		}
		else{
			sonEcran.afficherDispo(saConnexion.getSonActeur().getDispo());
			System.out.println(saConnexion.getSonActeur().getPrenom()+" "+saConnexion.getSonActeur().getNom());
			System.out.print("Vous avez des diponibilitées pour le : \n");
			for(int i=0; i<saConnexion.getSonActeur().getDispo().size();i++){
				System.out.println(saConnexion.getSonActeur().getDispo().get(i).getJour()/*+"/"+saConnexion.getSonActeur().getDispo().get(i).getJourDispo().getMonth()+"/"+saConnexion.getSonActeur().getDispo().get(i).getJourDispo().getYear()+" � "+saConnexion.getSonActeur().getDispo().get(i).getHour()*/);
							
			}
		}
	}
}
