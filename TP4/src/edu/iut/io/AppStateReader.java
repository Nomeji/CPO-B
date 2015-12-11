package edu.iut.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import edu.iut.app.ExamEvent;


// EX3 Utiliser ObjectInputStream pour lire les object sauvegardé par AppStateWriter

public class AppStateReader {
	public AppStateReader(String s) throws ClassNotFoundException, IOException {
		FileInputStream fis = new FileInputStream(s);
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    ExamEvent ee= (ExamEvent) ois.readObject();
	    ois.close();
	}
}
