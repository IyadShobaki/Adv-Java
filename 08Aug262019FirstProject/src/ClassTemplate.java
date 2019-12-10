//I Shobaki
//Parts of a well-formed class

public class ClassTemplate {
	//1.Instant Variables(Characteristics))
	//2.Constructors (see the instance variables)
	// -- default (preset values)
	// -- arg constructors ( values variable)
	//3. accessor methods (get)
	// -- return the values of the instance variables
	//4. mutator methods (set)
	// -- change the value of the instance variables
	//5. toString method 
	// -- return the values for the instance variables as labeled strings 
	//6.optional helper methods to solve problem at hand
	
	@SuppressWarnings("unused")
	private boolean used;
	@SuppressWarnings("unused")
	private String status;
	//default constructor
	public ClassTemplate() {
		status = "not used";
	}
	//other constructor as needed
	public ClassTemplate(boolean used) {
		if (used)
			status = "used";
		else {
			status = "not used";
		}
	}
}
