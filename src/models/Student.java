package models;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	
	private List<Discipline> disciplines = new ArrayList<>();

	public Student(String name, Integer registration) {
		super(name, registration);

	}

	public List<Discipline> getDisciplines() {
		return disciplines;
	}		
}
