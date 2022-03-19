package humanResourcesDepartment;

import java.util.LinkedList;
import coordination.Discipline;

public class Teatcher extends Person {

	private String teaching;
	
	public Teatcher(String name, int registration, String discipline) {
		super(name, registration);
		this.teaching = discipline;
	}

	public String getTheDisciplineTeacher() {
		return teaching;
	}
}