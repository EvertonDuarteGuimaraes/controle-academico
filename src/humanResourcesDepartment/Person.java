package humanResourcesDepartment;

abstract class Person {
	
	private final String name;
	private final int registration;
	
	public Person(String name, int registration) {
		super();
		this.name = name;
		this.registration = registration;
	}
	
	public String getName() {
		return name;
	}	
	
	public int getRegistration() {
		return registration;
	}	
}