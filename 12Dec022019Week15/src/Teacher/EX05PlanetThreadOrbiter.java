package Teacher;

public class EX05PlanetThreadOrbiter {

	public static void main(String[] args) {

		EX05PlanetThread mercury, mars, earth, venus, jupiter;
		mercury = new EX05PlanetThread("Mercury");
		mars = new EX05PlanetThread("Mars");
		earth = new EX05PlanetThread("Earth");
		venus = new EX05PlanetThread("Venus");
	    jupiter = new EX05PlanetThread("Jupiter");
		

		mercury.start();
		mars.start();
		earth.start();
		venus.start();
	    jupiter.start();
	}//end main

}//end class
