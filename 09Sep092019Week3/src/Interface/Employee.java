package Interface;
//Employee abstract superclass that implements Payable
public abstract class Employee implements Payable {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	//constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName =firstName;
		this.lastName = lastName;
		this.socialSecurityNumber =socialSecurityNumber;
	}

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
	//Note: we do not implement Payable method getPaymentAmount here so
	//this class must be declared abstract to avoid a compilation error 
}// end abstract class Employee
