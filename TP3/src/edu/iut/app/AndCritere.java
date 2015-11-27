package edu.iut.app;

import java.util.ArrayList;

public class AndCritere implements Critere{
	 private String critere1;

	 public AndCritere(String critere1) {
	     this.critere1 = critere1; 
	 }

	   @Override
	   public ArrayList<ExamEvent> meetCriteria(ArrayList<ExamEvent> examEvent, String critere2) {
	      ArrayList<ExamEvent> firstCriterePersons = meetCriteria(examEvent, critere1);
	      return meetCriteria(firstCriterePersons,critere2);
	   }
}
