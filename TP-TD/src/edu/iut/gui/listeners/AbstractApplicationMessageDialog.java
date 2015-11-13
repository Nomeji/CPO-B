package edu.iut.gui.listeners;

import edu.iut.app.IApplicationLogListener;

public abstract class AbstractApplicationMessageDialog implements
		IApplicationLogListener {

	//Attribut
	protected String message;
	
	
	@Override
	public void newMessage(String level, String message) {
		this.message=message;
		showMessage(message);
	}
	
	/* TP1 ajouter une méthode abstraite showMessage */
	protected abstract void showMessage(String message);

}
