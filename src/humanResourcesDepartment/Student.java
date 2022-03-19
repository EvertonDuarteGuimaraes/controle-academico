package humanResourcesDepartment;

import coordination.Discipline;
import coordination.NoteBook;

public class Student extends Person {
	
	NoteBook ownNoteBook = new NoteBook();

	public Student(String name, int registration) {
		super(name, registration);
	}
	
	public void register(Discipline element) {
		ownNoteBook.addNewDiscipline(element);
	}
	
	public void score(Discipline discipline, double noteOne, double noteTwo, double noteThree) throws Exception {
		ownNoteBook.addScoreTo(discipline, noteOne, noteTwo, noteThree);
	}
	
	public void quit(Discipline element) throws Exception {
		ownNoteBook.quitDiscipline(element);
	}
}