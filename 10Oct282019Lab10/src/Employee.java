//I Shobaki
//Employee class

public class Employee {
	private int groupID;
	private int ID;
	private String lastName;
	
	//default constructor
	public Employee() {
		this(0,0,"");
	}
	//constructor with parameters
	public Employee(int groupID, int ID, String lastName) {
		setGroupID(groupID);
		setID(ID);
		setLastName(lastName);
		
	}
	
	//get and set methods
	
	public int getGroupID() {
		return groupID;
	}
	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//another method
	public String toString() {
		return String.format("%-20d%-20d%-20s%n", getGroupID(),getID(), getLastName());
	}
}
