package coordination;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
	
	private List<Discipline> disciplines = new ArrayList<>();
	
	public void addNewDiscipline(Discipline discipline) {
		this.disciplines.add(discipline);
	}
	
	private Discipline searchFor(Discipline discipline) throws Exception {
		for(Discipline element : this.disciplines) {
			if(element.equals(discipline)) {
				return element;
			}
		}
		throw new Exception("Disciplina não encontrada!");
	}

	public void addScoreTo(Discipline discipline, double noteOne, double noteTwo, double noteThree) throws Exception {
			this.searchFor(discipline).setNotes(noteOne, noteTwo, noteThree);
	}
	
	public void quitDiscipline(Discipline discipline) throws Exception {
		this.searchFor(discipline).setStudying(false);
	}
}
