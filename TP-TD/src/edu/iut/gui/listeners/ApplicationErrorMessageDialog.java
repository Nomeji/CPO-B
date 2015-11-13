package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationErrorMessageDialog extends
		AbstractApplicationMessageDialog {

	@Override
	//affiche un message d'erreur
	protected void showMessage(String level, String message) {
		System.out.println(level+" "+message);
	}

}
