package humanResourcesDepartment;

import java.util.LinkedList;
import coordination.Discipline;

public class Teatcher extends Person {

	private String theDisciplineTeacher;
	
	public Teatcher(String name, int registration, String discipline) {
		super(name, registration);
		this.theDisciplineTeacher = discipline;
	}

	public String getTheDisciplineTeacher() {
		return theDisciplineTeacher;
	}
	
}