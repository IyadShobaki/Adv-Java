//I Shobaki
//Lab11 Recursion
//Nov 06, 2019

import java.util.Random;

public class SquareRoot {
	
	//recursive method 
	public static double FindTheRoot(double preGuess, int number) {
		
		double nextGuess = (preGuess + number/preGuess)/2;
	
		if(Math.abs(preGuess - nextGuess) < .00001){ // test for base case
			return nextGuess;
		}
		
		else {  //recursion step
			System.out.printf("Next Guess: %f%n", nextGuess);
			return FindTheRoot(nextGuess, number);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Iyad Shobaki");
		System.out.println("Lab11 Recursion");
		System.out.println("Nov 06, 2019");
		System.out.println();
		
		
		//create an array of numbers
		int[] arrayOfNumbers = {9,17,25,37,49,55,999};
		
		
		Random rand = new Random();
		double root =0;
		
		//for loop
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			System.out.println("------------------------------------------");
			int previousGuess = rand.nextInt(arrayOfNumbers[i]) + 1;
			System.out.printf("Number: %d... First Guess: %d%n", arrayOfNumbers[i], previousGuess);
			root = FindTheRoot(previousGuess, arrayOfNumbers[i]);
			System.out.printf("%s %d %s %.4f \n","The square root of " ,arrayOfNumbers[i]," is: ", root);
			
		} //end for loop
		
		
	}//end main

}//end class SquareRoot 
