package coordination;

import java.util.LinkedList;
import java.util.List;

public class NoteBook {
	
	private List<Discipline> disciplines = new LinkedList<>();
	
	public void addNewDiscipline(Discipline discipline) {
		this.disciplines.add(discipline);
	}
	
	public void quitDiscipline(Discipline discipline) {
		discipline.setStudying(false);
	}

	public void retakeDiscipline(Discipline discipline) {
		discipline.setStudying(true);
	}

	public void addScoreToADiscipline(Discipline discipline, int period, double score) {
		for(Discipline element : disciplines) {
			if(element.getName().equalsIgnoreCase(discipline.getName())) {
				element.setScore(period, score);
			}
		}
	}
	
	public String showReportCard() {
		String reportCard = "Boletim		nota 1	nota 2	nota 3	média\n";
		for(Discipline element : this.disciplines) {
			reportCard += element.getName() 
					+ "	" + element.getScore(1)
					+ "	" + element.getScore(2)
					+ "	" + element.getScore(3)
					+ "	" + element.getAverege() + "\n";
		}
		return reportCard;
	}
	
	public String showHistoric() {
		String historic = "Histórico	média	situação\n";
		for(Discipline element : this.disciplines) {
			historic += element.getName()
					+ "	" + element.getAverege();
			if(element.isStudying()) {
				historic += " Cursando";
			} else if(!element.isStudying() && element.getAverege() >= 5) {
				historic += " Aprovado";
			} else if(!element.isStudying() && element.getAverege() < 5) {
				historic += " Reprovado";
			}
		}
		return historic;
	}
}
