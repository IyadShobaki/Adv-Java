// CommissionEmployee class extends Employee

public class CommissionEmployee extends Employee{
	private double grossSales; //gross weekly sales
	private double commissionRate;// commission percentage
	
	//constructor
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		if(commissionRate <=0.0 || commissionRate >= 1.0) //validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		
		if(grossSales < 0.0) //validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if(grossSales < 0.0) //validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if(commissionRate <=0.0 || commissionRate >= 1.0) //validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		this.commissionRate = commissionRate;
	}
	
	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}
	//return String representation of CommissionEmployee object
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %,.2f","Commission employee:",super.toString(),
				"Gross sales", getGrossSales(), "Commission rate", getCommissionRate());
	}
}// end class CommissionEmployee
