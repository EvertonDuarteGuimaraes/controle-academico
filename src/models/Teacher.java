package models;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
	
	private final String discipline;
	private List<Integer> classrooms = new ArrayList<>();

	public Teacher(String name, Integer registration, String discipline) {
		super(name, registration);
		this.discipline = discipline;
	}

	public List<Integer> getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(List<Integer> classrooms) {
		this.classrooms = classrooms;
	}

	public String getDiscipline() {
		return discipline;
	}
}
