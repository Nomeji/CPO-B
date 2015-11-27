package edu.iut.app;

import java.util.ArrayList;

public class Classroom implements Critere{
	
	public Classroom() {
		classRoomNumber="not affected";
	}
	public Classroom(String classRoomNumber) {
		this.classRoomNumber=classRoomNumber;
	}
	
	public void setClassroomNumber(String number) {
		classRoomNumber=number;
	}
	public String getClassRoomNumber() {
		return classRoomNumber;
	}
	
	protected String classRoomNumber;

	@Override
	public ArrayList<ExamEvent> meetCriteria(ArrayList<ExamEvent> exams,String roomNumber) {
		ArrayList<ExamEvent> classroom = new ArrayList<ExamEvent>();
		
		for(ExamEvent examEvent : exams){
			if(examEvent.getClassroom().getClassRoomNumber().equalsIgnoreCase(roomNumber)){
				classroom.add(examEvent);
			}
		}
		return classroom;
	}
}
