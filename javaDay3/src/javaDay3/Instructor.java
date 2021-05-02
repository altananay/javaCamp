package javaDay3;

public class Instructor extends User {
	private String firstName;
	private String lastName;
	
	public Instructor() {};
	
	public Instructor(int userID, String email, String firstName, String lastName) {
		super(userID, email);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
