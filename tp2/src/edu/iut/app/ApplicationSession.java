package edu.iut.app;

import java.util.ResourceBundle;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicationSession{
	
	// Exercice 1 : Gérer l'internationation
	protected ResourceBundle resourceBundle;
	protected Locale locale;
	
	// Exercice 2 : Logger
	protected Logger sessionGuiLogger;
	protected Logger sessionExceptionLogger;


	private static /*Qu'est ce qu'un singleton ?*/ ApplicationSession session = null;
	private ApplicationSession() {
		/* Definir US comme locale par défaut */
		locale= Locale.US;
		Locale.setDefault(locale);
		locale = Locale.getDefault();
		resourceBundle = ResourceBundle.getBundle("edu.iut.resources.strings.res", locale);
		sessionGuiLogger = Logger.getLogger("Jérémy"); /* Initialiser le logger */
		sessionGuiLogger.setLevel(Level.ALL);/* Touls les message doivent être affiché */
		sessionExceptionLogger =Logger.getLogger("Exception"); /* Logger pour exception */
		sessionExceptionLogger.setLevel(Level.ALL);//Tout les messages sont affiché
	}
	
	
	static public ApplicationSession instance() {
		if (session == null) {			
			session = new ApplicationSession();
		}
		return session;
	}
	
	public Logger getGUILogger() {
		return sessionGuiLogger;
	}
	public Logger getExceptionLogger() {
		return sessionExceptionLogger;
	}
	
	public void setLocale(Locale locale){
		this.locale = locale;
		Locale.setDefault(this.locale);
		resourceBundle=ResourceBundle.getBundle("edu.iut.resources.strings.res", locale);/* récupérer les resources */
	}
	
	public String getString(String key) {
		return resourceBundle.getString(key);
	}
	
	
}
