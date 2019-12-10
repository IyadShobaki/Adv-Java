//private superclass members cannot be accessed in a subclass
public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary; // base salary per week
	
	//six-argument constructor
	public BasePlusCommissionEmployee(String firstName, String lastName,
			String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		//explicit call to superclass CommissionEmployee constructor
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		//if baseSalary is invalid throw exception
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	//set base salary
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	//return base salary
	public double getBaseSalary() {
		return baseSalary;
	}
	//calculate earning
	@Override
	public double earnings() {
		//not allowed: commissionRate and grossSales private in superclass
		return baseSalary + (commissionRate * grossSales); 
		// called get methods if the instance variables
		//	are private in the super class.
	}
	//return String representation of BasePlusCommisionEmployee
	@Override
	public String toString()
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %5.2f", "base-salaried commision employee",
				firstName, lastName, "social security number", socialSecurityNumber,
				"gross sales", grossSales, "commission rate", commissionRate,
				"base salary", baseSalary);
	}
}//end class BasePlusCommissionEmployee
