package edt.iut.boundary;

import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import edt.iut.control.*;

public class EcranDisponibilite {
	private ControleurDisponibilite sonControleur;
	
	private JFrame fenetre; // Fenêtre et panel
	private JPanel panel;
	
	private JLabel datemsg; // Gestion du choix de la date
	private UtilDateModel model;
	private JDatePanelImpl datePanel;
	private JDatePickerImpl datePicker;
	private Properties p;
	
	private JTextField hour; // Choix de l'heure
	private JLabel hourmsg;
	
	private JButton submit;
	
	private JButton show;
	
	public EcranDisponibilite(){
		sonControleur  = new ControleurDisponibilite(this);
		
		fenetre = new JFrame("Choix de la disponibilité"); // On initialise la fenêtre
		panel = new JPanel();
		
		p = new Properties(); // On ajoute le choix de la date
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		model = new UtilDateModel();
		datePanel = new JDatePanelImpl(model,p);
		datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datemsg = new JLabel("Choisissez une date");
		
		hour = new JTextField(15); // Choix de l'heure
		hourmsg = new JLabel("Choisissez une heure de passage");
		
		submit = new JButton("Valider"); // Gestion du boutton de validation
		submit.addActionListener(sonControleur);
		show = new JButton("Afficher");
		show.addActionListener(sonControleur);
		
		
		panel.add(datemsg); // On ajoute les compsants au panel
		panel.add(datePicker);
		panel.add(hourmsg);
		panel.add(hour);
		panel.add(submit);
		panel.add(show);
		
		fenetre.add(panel);
		
		fenetre.setSize(300,300);
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public UtilDateModel getModel() {
		return model;
	}

	public String getHour() {
		return hour.getText();
	}
	public static void main(String args[]){
		EcranDisponibilite choix = new EcranDisponibilite();
	}
}
