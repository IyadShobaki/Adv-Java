//Recursive factorial method

public class FactorialCalculator {

	//recursive method factorial (assume its parameter is >= 0)
	public static long factorial(long number) {
		if(number <= 1) // test for base case
			return 1;
		else //recursion step
			return number * factorial(number -1);
	}
	
	//output factorials for values 0-21
	public static void main(String[] args) {
		//calculate the factorials of 0 through 21
		for (int counter =0; counter <=21; counter++)
			System.out.printf("%d! = %d%n", counter, factorial(counter));

	}

}//end class FactorialCalculator

//12! causes overflow for int variables
//21! causes overflow for long variables
