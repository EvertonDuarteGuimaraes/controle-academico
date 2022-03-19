package coordination;

public class Discipline {
	
	private final String name;
	private Double[]scores = new Double[3];
	private boolean studying = true;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (studying ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discipline other = (Discipline) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (studying != other.studying)
			return false;
		return true;
	}

	public Discipline(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setNotes(double noteOne, double noteTwo, double noteThree) {
		this.scores[0] = noteOne;
		this.scores[1] = noteTwo;
		this.scores[2] = noteThree;
	}
	
	public Double[] getAllScores() {
		return this.scores;
	}
	
	public double getSingleScore(int position) {
		return scores[position];
	}

	public Double getAverege() {
		Double averege = 0.0;
		for(Double score : this.scores) {
			if(score != null) {
				averege += score;
			}
		}
		if(averege != null) {
			return averege = averege/ scores.length;
		}
		return null;
	}
	
	public String situation() {
		if(!this.isStudying()) {
			if(this.getAverege() >= 5) {
				return "APROVADO";
			} else if (this.getAverege() < 5) {
				return "REPROVADO";
			}			
		} 
		return "CURSANDO";
	}

	public boolean isStudying() {
		return studying;
	}

	public void setStudying(boolean studying) {
		this.studying = studying;
	}	
}