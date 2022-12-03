package co.edureka.spring.core.beans;

public class User {
	private String firstName;
	private String lastName;

	public User() {
		System.out.println("in no argument constructor");
	}

	public User(String firstName, String lastName) {
		System.out.println("in 2 arguments constructor");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		System.out.println("in getFirstName() method");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("in setFirstName() method");
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("in getLastName() method");
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("in setLastName() method");
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [First Name= " + firstName + " | Last Name= " + lastName + "]";
	}

}
