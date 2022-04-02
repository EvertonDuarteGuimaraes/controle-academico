package repositories;

import models.Discipline;
import models.Student;

public class StudentRepository extends Repository<Student> {
	
	@Override
	public void update(Student status, Student newStatus) {
		
		status.setBound(newStatus.getBound());
		updateDiscipline(status, newStatus);
		
	}
	
	public Discipline searchDiscipline(Student student, Discipline searching) {
		for(Discipline discipline : student.getDisciplines()) {
			if(discipline.equals(searching)) {
				return discipline;
			}	
		}
		return  null;
	}
	
	private void updateScores(Student studentScores, Student newStudentScores)  {
		for(Discipline discipline : studentScores.getDisciplines()) {			
			discipline.getScores().clear();
			for(Double score : searchDiscipline(newStudentScores, discipline).getScores()) {
				discipline.setScore(score);
			}
		}
	}
	
	private void updateDiscipline(Student statusDisciplines, Student newStatusDisciplines) {
		for(Discipline discipline : newStatusDisciplines.getDisciplines()) {
			if(!statusDisciplines.getDisciplines().contains(discipline)) {
				statusDisciplines.getDisciplines().add(discipline);
			}
		}
		
		updateScores(statusDisciplines, newStatusDisciplines);
	}
}
