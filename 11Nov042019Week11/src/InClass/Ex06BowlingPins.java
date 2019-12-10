package InClass;

import java.util.Scanner;

public class Ex06BowlingPins {

	public static int numberOfPins(int rows) {
		if(rows <= 0)
			return 0;
		else {
			return (rows) + numberOfPins(rows -1);
		}
	}
	public static void main(String[] args) {
		int num_rows;
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("How many rows of bowling pins will there be?");
		num_rows = scanner.nextInt();
		
		System.out.println("You will need to set up " + numberOfPins(num_rows) + " bowling pins.");

	}

}
