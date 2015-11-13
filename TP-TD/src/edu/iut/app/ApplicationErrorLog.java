package edu.iut.app;

import java.util.ArrayList;

public class ApplicationErrorLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationErrorLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		//Firemessage appelle newmessage
		super.fireMessage("[ERROR]", this.message);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public void addListener(IApplicationLogListener listener) {
		listeners.add(listener);
		
	}

	@Override
	public ArrayList <IApplicationLogListener> getapplicationLogListeners() {
		return listeners;
	}


}
