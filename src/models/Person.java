package models;

abstract class Person {

	private final String name;
	private final Integer registration;
	private Boolean bound;
	
	public Person(String name, Integer registration) {
		super();
		this.name = name;
		this.registration = registration;
		this.bound = true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((registration == null) ? 0 : registration.hashCode());
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
		Person other = (Person) obj;
		if (registration == null) {
			if (other.registration != null)
				return false;
		} else if (!registration.equals(other.registration))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public Integer getRegistration() {
		return registration;
	}
	
	public Boolean getBound() {
		return this.bound;
	}
	
	public void setBound(Boolean bound) {
		this.bound = bound;
	}
}
