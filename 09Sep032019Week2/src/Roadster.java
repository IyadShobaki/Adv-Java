//I Shobaki
//Roadster clas, another subclass of the Car class

public class Roadster extends SportsCar{
	private boolean fogHorn;
	
	//constructors
	
	public Roadster() {
		super();
		setFogHorn(false);
	}
	public Roadster(String newManufacturer, int newNumberOfDoors, boolean fogVal) {
		super(newManufacturer, newNumberOfDoors, "BLACK");
		setFogHorn(fogVal);
	}
	//set methods 
	public void setFogHorn(boolean fogVal) {
		fogHorn = fogVal;
	}
	//get methods
	public boolean getFog() {
		return fogHorn;
	}
	//other methods
	public String toString() {
		return super.toString() + ".\n It is " + fogHorn + " that the car has a fog horn.";
	}
}
