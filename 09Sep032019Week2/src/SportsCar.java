//I Shobaki
//Sportscar class, another subclass of the class called Car

public class SportsCar extends Car {
	private String color;
	//constructor
	public SportsCar() {
		super();
		setColor("RED"); 
	}
	public SportsCar(String newColor) {
		super("Bugatti",2);
		setColor(newColor);
	}
	public SportsCar(String newManufacturer, int newNumberOfDoors, String newColor) {
		super(newManufacturer, newNumberOfDoors);
		setColor(newColor);
	}
	// get methods
	public String getColor() {
		return color;
		
	}
	//set methods
	public void setColor(String newColor) {
		if(newColor.isEmpty())
			color = "RED";
		else
			color = newColor;
	}
	//other methods
	public String toString() {
		return super.toString() + " .\n The color of the sports car is " + color + ".";
	}
}//end class
