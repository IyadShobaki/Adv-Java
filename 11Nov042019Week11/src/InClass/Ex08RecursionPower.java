package InClass;

public class Ex08RecursionPower {

	
	public static void main(String[] args) {
		//System.out.println("3 to the power " + 0 + " is " + power(3,0));
		
		System.out.println("3 to the power " + 3 + " is " + power(3,3));

	}

	public static int power(int x, int n) {
		System.out.println("X = " + x + " N = " + n);
		
		if(n<0) {
			System.out.println("Illegal argument to power.");
			System.exit(0);
		}
		if(n>0) {
			return (power(x, n-1) * x);
			
		}else { //n ==0 
			return (1); // base case
		}
	}//end power
}//end class Ex08RecursionPower 
