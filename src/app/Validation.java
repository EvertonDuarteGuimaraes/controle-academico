package app;

import java.util.List;

import coordination.Discipline;

public class Validation {
	
	private final static int DISCIPLINES_LIMIT = 3;

	public boolean validDisciplineRegistration(List<Discipline>  disciplines, Discipline discipline) {
		if(!(disciplines.size() == DISCIPLINES_LIMIT)) {
			return disciplines.contains(discipline.getName());
		}
		return false;
	}
	
	public boolean validDisciplineQuit(List<Discipline>  disciplines, Discipline discipline) {
		if(!(disciplines.size() == DISCIPLINES_LIMIT)) {
			if(disciplines.contains(discipline.getName()) && discipline.isStudying()) {
				return true;
			}
		}
		return false;
	}
	
	public boolean validDisciplineRetake(List<Discipline>  disciplines, Discipline discipline) {
		if(!(disciplines.size() == DISCIPLINES_LIMIT)) {
			if(disciplines.contains(discipline.getName()) && !discipline.isStudying()) {
				return true;
			}
		}
		return false;
	}
}
