// I Shobaki
//Car Class defined as a superclass

public class Car {
	//instance variables
	private String manufacturer;
	private int numberOfDoors;
	
	//constructors
	public Car() {
		manufacturer = "Ford";
		numberOfDoors = 2;
	}
	public Car(String mVal, int doorVal) {
		
		setManufacturer(mVal);
		setNumberOfDoors(doorVal);
		
	}
	//set methods ... mutator
	
	public void setManufacturer(String mVal) {
		this.manufacturer = mVal;
	}
	
	public void setNumberOfDoors(int doorVal) {
		if (doorVal < 0 )
			this.numberOfDoors = 0;
		else 
			this.numberOfDoors = doorVal;
	}
	//get methods
	public String getManufacturer() {
		return manufacturer;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	//other methods
	public String toString() {
		return "\nThe manufacturer is " + manufacturer +
				"\n and the number of doors it has is " + numberOfDoors + ".";
	}
}//end class car
