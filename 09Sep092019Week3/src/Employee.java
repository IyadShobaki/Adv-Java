// Employee abstract superclass

public abstract class Employee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	//constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	//get methods
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	//return String representation of Employee object
	@Override
	public String toString() {
		return String.format("%s %s%nSocial security number: %s", getFirstName(),getLastName(),getSocialSecurityNumber());
	}
	
	//abstract method must be overridden by concrete subclass
	public abstract double earnings(); // no implementation here
}//end abstract class Employee
