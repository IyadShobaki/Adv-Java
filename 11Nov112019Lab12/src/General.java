//I Shobaki
//class General
import java.io.Serializable;

public class General implements Serializable{
	private int ID;
	private String name;
	private int age;
	
	public General() {
		this(0, "", 0);
	}
	public General(int ID, String name , int age) {
		this.ID = ID;
		this.name = name;
		this.age = age;
	}
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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
	public String toString() {
		return ("ID: " + ID + "\nNAME: \t" + name +"\nAGE: \t" + age);
	}
}
