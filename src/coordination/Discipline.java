package coordination;

public class Discipline {
	
	private final String name;
	private double[]scores = new double[3];
	private boolean studying;
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		return true;
	}

	public Discipline(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setScore(int period, double score) {
		this.scores[period - 1] = score;
	}
	
	public double getScore(int period) {
		return scores[period - 1];
	}

	public double getAverege() {
		double averege = 0;
		for(double score : this.scores) {
			averege += score;
		}
		return averege / scores.length;
	}

	public boolean isStudying() {
		return studying;
	}

	public void setStudying(boolean studying) {
		this.studying = studying;
	}	
}