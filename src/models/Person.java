package models;

abstract class Person {

	private final String name;
	private final Integer registration;
	
	public Person(String name, Integer registration) {
		super();
		this.name = name;
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public Integer getRegistration() {
		return registration;
	}
}
