package Interface;
//Payable interface test program processing Invoice and
//Employee polymorphically
public class PayableInterfaceTest {

	public static void main(String[] args) {
		//create four-element Payable array
		Payable[] payablesObjects = new Payable[4];
		//populate array with objects that implement Payable
		payablesObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payablesObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payablesObjects[2] = new SalariedEmployee("Jhon", "Smith", "111-11-1111", 800.00);
		payablesObjects[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);
		
		System.out.println("Invoices and Employees processed polymorphically:");
		
		//generically process each element in array payableObjects
		for (Payable currentPayable : payablesObjects) {
			//output currentPayable and its appropriate payment amount
			System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());
		}

	}//end main
	

}//end class PayableInterfaceTest
