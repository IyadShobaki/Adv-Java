
public class CommissionEmployee extends Object{
	// Better to keep them private and called get methods from the subclass 
	protected final String firstName;
	protected final String lastName;
	protected final String socialSecurityNumber;
	protected double grossSales; // gross weekly sales
	protected double commissionRate; // commission percentage
	
	//five-arg constructor
	
	public CommissionEmployee(String firstName, String lastName,String socialSecurityNumber, double grossSales, double commissionRate)
	{
		
		//implicit call to Object's default constructor occurs here 
		
		//if grossSales is invalid throw exception
		if(grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		
	}//end constructor
	
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
	public double getGrossSales() {
		return grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	
	//set methods
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		this.grossSales = grossSales;
	}
	public void setCommissionRate(double commissionRate) {
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		
		this.commissionRate = commissionRate;
	}
	
	//calculate earnings
	public double earnings() {
		return commissionRate * grossSales;
	}
	//return String representation of CommissionEmployee object 
	@Override // indecates that this method overrides a superclass method
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commission employee", firstName, lastName,
				"social security number", socialSecurityNumber, "gross sales", grossSales,
				"commission rate", commissionRate);
	}
	
}// end class CommissionEmployee
