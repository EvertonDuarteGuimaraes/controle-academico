package models;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
	
	private final String discipline;
	private final Integer teacher;
	private final Integer classroomNumber;
	
	private List<Integer> students = new ArrayList<>();
	
	public Classroom(String discipline, Integer teacher, Integer classroomNumber) {
		super();
		this.discipline = discipline;
		this.teacher = teacher;
		this.classroomNumber = classroomNumber;
	}

	public String getDiscipline() {
		return this.discipline;
	}

	public Integer getTeacher() {
		return this.teacher;
	}
	
	public Integer getClassroomNumber() {
		return this.classroomNumber;
	}

	public List<Integer> getStudents() {
		return this.students;
	}
	
	public void setStudents(Integer registration) {
		this.students.add(registration);
	}
}
