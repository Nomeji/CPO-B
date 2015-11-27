package edu.iut.app;

import java.util.ArrayList;

public interface Critere {
	public ArrayList <ExamEvent> meetCriteria(ArrayList <ExamEvent> exams,String critere); // On compare le nom donnée et le nom présent dans la liste. Si le prénom correspond à notre critère, on l'ajoute à la collection.
}
