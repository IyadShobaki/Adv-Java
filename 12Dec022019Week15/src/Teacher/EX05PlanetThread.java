//This class represents planet orbits
//Class wil
//   - count each orbits
//   - have each planet sleep in relation to their orbit
//     1 orbit day = 1 millisecond of sleep
//   - will end the demo when earth has 15 orbits

package Teacher;

public class EX05PlanetThread extends Thread{

	private static boolean orbitNow;
	private int orbit;
	private static final int earthOrbitMax = 35;
	public EX05PlanetThread(String s) {
		super(s);
		orbitNow = true; //all planets orbit until earth turns this to false
		orbit = 0;
		
	}
	public void run() {
		int earthOrbits = 0; //all planets have an earthOrbits variable but only earth uses it
		do { //our solar system will exit for 35 earth orbits
			orbit++; //each planet counts its own orbits
			try { 
				//find out who I am then sleep for 1 of my "years", represented in milliseconds
				if(getName().equals("Mercury")) {
					System.out.println("Hello, I am " + getName() + " on orbit " + orbit);
					Thread.sleep(88); // sleep times are orbit of the planet in days represented
				}
				else if(getName().equals("Mars")) {
					System.out.println("Hello, I am " + getName() + " on orbit " + orbit);
					Thread.sleep(687); 
				}
				else if(getName().equals("Earth")) {
					earthOrbits++; //count an earth orbit
					System.out.println("**********************");
					System.out.println("      Hello, I am " + getName() + " on orbit " + orbit);
					System.out.println("**********************");
					Thread.sleep(365); 
				}else if(getName().equals("Venus")) {
					System.out.println("Hello, I am " + getName() + " on orbit " + orbit);
					Thread.sleep(224); 
				}
				else if(getName().equals("Jupiter")) {
					System.out.println("Hello, I am " + getName() + " on orbit " + orbit);
					Thread.sleep(4331); 
				}
			} catch (InterruptedException e) {
				
				System.out.println("Can't Orbit...nuclear disaster..." + e);

			}
			if(earthOrbits >= earthOrbitMax) // if earth is greater than the max "years" old, 
				orbitNow = false;
			
			
		} while (orbitNow); //end do loop
	}//end run method
	
}//end planet thread class
