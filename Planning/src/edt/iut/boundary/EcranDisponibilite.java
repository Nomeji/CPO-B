package edt.iut.boundary;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import edt.iut.control.ControleurDisponibilite;
import edt.iut.entity.Connexion;
import edt.iut.entity.Disponibilite;

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
	
	private JPanel panelDispo; // Panel contenant les disponibilités
	ArrayList<JLabel>labelDispo;
	
	public EcranDisponibilite(Connexion co){
		sonControleur  = new ControleurDisponibilite(this,co);
		
		fenetre = new JFrame("Choix de la disponibilitée"); // On initialise la fenêtre		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		fenetre.setContentPane(panel);
		
		//info = new JText();
		
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
		
		panelDispo = new JPanel();
		panel.add(datemsg); // On ajoute les compsants au panel
		panel.add(datePicker);
		panel.add(hourmsg);
		panel.add(hour);
		panel.add(submit);
		panel.add(show);
		panel.add(panelDispo);
		//fenetre.add(panel);
		
			
		fenetre.setSize(300,300);
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public UtilDateModel getModel() {
		return model;
	}

	public String getHour() {
		return hour.getText();
	}
	public void afficherDispo(ArrayList<Disponibilite> date){
		
		labelDispo = new ArrayList<JLabel>();
		for(int i=0;i<date.size();i++){
			System.out.println(String.valueOf(date.get(i).getJour().getDay())+"/"+String.valueOf(date.get(i).getJour().getMonth())+"/"+String.valueOf(date.get(i).getJour().getYear()));
			labelDispo.add(new JLabel(String.valueOf(date.get(i).getJour().getDay())+"/"+String.valueOf(date.get(i).getJour().getMonth())+"/"+String.valueOf(date.get(i).getJour().getYear())));
			panelDispo.add(labelDispo.get(i));
		}
		fenetre.getContentPane().add(panelDispo);
		fenetre.getContentPane().repaint();
		fenetre.setVisible(false);
		fenetre.setVisible(true);
		fenetre.repaint();
	}
}
