//Used for file processing

public class Student {
	private int idNumber;
	private String name;
	private int age;
	private double debt;
	
	public Student() {
		this(0,"",0,0.0);
		
	}
	public Student(int idNumber, String name, int age, double debt) {
		setIdNumber(idNumber);
		setName(name);
		setAge(age);
		setDebt(debt);
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getDebt() {
		return debt;
	}
	public void setDebt(double debt) {
		this.debt = debt;
	}
	
	public String toString() {
		return ("ID: " + idNumber +
				" Name: "+ name +
				" Age: " + age +
				" Debt: " + debt);
				
	}
}
