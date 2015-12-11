package edu.iut.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import edu.iut.app.ExamEvent;


// Utiliser ObjectOutputStream pour sauvegarder l'état de l'application
// Vous sauvegarderez les objets qui vous paraissent important

public class AppStateWriter {
	public AppStateWriter(ArrayList<ExamEvent> ee, String fichier,String add) throws IOException {
		FileOutputStream fos = new FileOutputStream(add);
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(ee);
	    oos.writeChars(fichier);
	    oos.close();
	}
}
