//I Shobaki
//This program partially tests the Sportscar, Roadster, and Limo Classes
public class CarDriver {

	public static void main(String[] args) {
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println("++                        ++");
		System.out.println("++  Java Class Hierarchy  ++");
		System.out.println("++                        ++");
		System.out.println("++++++++++++++++++++++++++++\n");
		
		Car car01 = new Car();
		System.out.println("Default constructor " + car01.toString());
		
		Car car02 = new Car("Huyndai", -5);
		System.out.println(car02.toString());
		
		SportsCar car03 = new SportsCar("Orange" );
		System.out.println(car03.toString());
		
		Roadster car04 = new Roadster("GM",2,true );
		System.out.println(car04.toString());
		
		Limo car05 = new Limo(244);
		System.out.println(car05.toString());
		
		
		/*
		
		Car[] myCars = new Car[4];
		
		myCars[0] = new Car("Ford", 3);
		//System.out.println(myCars[0].toString());
		
		myCars[1] = new Limo("Ford",5,28);
		//System.out.println(myCars[1].toString());
		
		myCars[2] = new SportsCar("Chevy",1,"PURPLE");
		//System.out.println(myCars[2].toString());
		
		myCars[3] = new Roadster("Lincoln",4,true);
		//System.out.println(myCars[3].toString());
		
		for (int index = 0; index < myCars.length; index++) {
			System.out.println(myCars[index].toString());
		}
		
		for (int index = 0; index < myCars.length; index++) {
			if (myCars[index] instanceof SportsCar) {
				System.out.println("\n" + "myCar["+index+"]" + ": This car is a sports car");
			}
			else {
				System.out.println("\n" + "myCar["+index+"]" + ": This car is not a sports car");
			}
		}
		*/
	}

}
