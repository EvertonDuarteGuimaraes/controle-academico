package humanResourcesDepartment;

import coordination.Discipline;
import coordination.NoteBook;

public class Student extends Person {
	
	NoteBook ownNoteBook = new NoteBook();

	public Student(String name, int registration) {
		super(name, registration);
	}
	
	public void register(Discipline discipline) {
		ownNoteBook.addNewDiscipline(discipline);
	}
	
	public void quit(Discipline discipline) {
		ownNoteBook.quitDiscipline(discipline);
	}
	
	public void retake(Discipline discipline) {
		ownNoteBook.retakeDiscipline(discipline);;
	}
	
	public String reportCard() {
		return ownNoteBook.showReportCard();
	}
	
	public String historic() {
		return ownNoteBook.showHistoric();
	}
}