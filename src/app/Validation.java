package app;

import java.util.List;

import coordination.Discipline;

public class Validation {
	
	private final static int DISCIPLINES_LIMIT = 3;
	private final static int CLASSROOMS_LIMIT = 2;

	public boolean validResistration(List<Discipline>  disciplines, Discipline element) {
		if(!(disciplines.size() == DISCIPLINES_LIMIT)) {
			if(!disciplines.contains(element) || element.situation().equals("REPROVADO")) {
				return true;
			}
		}
		return false;
	}
	
	public boolean validResistration(int classroomsLeading) {
		if(classroomsLeading < CLASSROOMS_LIMIT) {
			return true;
		}
		return false;
	}
	
	public boolean validQuit(List<Discipline>  disciplines, Discipline element) {
		if(element.isStudying() && disciplines.contains(element)) {
			return true;
		}
		return false;
	}
}
