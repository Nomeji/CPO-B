package edu.iut.io;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import edu.iut.app.ExamEvent;

//EX 1 Completer la classe 

public class XMLProjectWriter {
	
	public XMLProjectWriter() {		
	}
	
	public void save(ArrayList<ExamEvent> data, java.io.File xmlfile) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document= builder.parse(xmlfile);
		Element root = document.createElement("agenda");
		root.appendChild(document);
		
		int i = 0;
		for(ExamEvent dat: data ){
			i++;
			Element exam = document.createElement("exam");
			exam.setAttribute("public", "yes");
			exam.setAttribute("id",""+i);
			exam.setAttribute("date", dat.getDate().toString());
			exam.setAttribute("student", dat.getStudent().getLastname()+" "+dat.getStudent().getFirstname());
		
			Element examTitle = document.createElement("title");
			examTitle.appendChild(document.createTextNode("Examen "+i));
			
			Element examRoom = document.createElement("classroom");
			examRoom.setAttribute("salle", dat.getClassroom().toString());
			
			exam.appendChild(examTitle);
			exam.appendChild(examRoom);
			root.appendChild(exam);
		}
		document.appendChild(root);
	}
}
