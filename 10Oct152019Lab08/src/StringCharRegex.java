//I Shobaki
//Lab08 Create, Modify, Tokenize a String
//Oct 16, 2019

import java.util.Random;

public class StringCharRegex {

	public static void main(String[] args) {
		System.out.println("Iyad Shobaki");
		System.out.println("Lab08 Create, Modify, Tokenize a String");
		System.out.println("Oct 16, 2019");
		System.out.println();
		
		//Create and populate 4 String arrays 
		String[] Articles = {"the", "a", "one","some","any"};
		String[] Nouns = {"dog", "cat", "cow","eagle","fish"};
		String[] Verbs = {"drove", "jumped", "ran","walked","skipped","swam"};
		String[] Prepositions = {"to", "from", "over","under","for"};
		
		//create an array and populated with each string has been created
		String[] strings = {"","",""};
		
		for(int i = 0; i < 3; i++) {
			
			String string = (createString(Articles, Nouns, Verbs, Prepositions,Articles,Nouns));
			
			System.out.println(string);
			//tokenString(string); //If you want to print tokens immediately 
			strings[i] = string;
			
			System.out.println(string.replaceAll("o", "X-X-X"));
			
		}
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		System.out.println("OK let's tokenize!");
		
		for(String string : strings) {
			System.out.println("ORIGINAL: " + string);
			tokenString(string);
			System.out.println("-----------------------------------");
		}		
		
	}
	//A method to create a string
	public static String createString(String[] a, String[] b, String[] c, String[] d , String[] e, String[] f) {
		Random random  = new Random();
		
		String resultString;
		resultString = a[random.nextInt(5)] + " " + b[random.nextInt(5)] + " " + c[random.nextInt(6)]+ " " + d[random.nextInt(5)] + " " + e[random.nextInt(5)] + " " + f[random.nextInt(5)] + ".";
		
		
		return resultString.substring(0,1).toUpperCase() + resultString.substring(1);
	}
	
	//A method to tokenize a string
	public static void  tokenString(String str) {
		int i =0;
		String[] tokens = str.split("o");
		System.out.printf("The number of splits is: %d%n", tokens.length);
		
		for (String token : tokens) {
			System.out.printf("Token %d is: %s%n",i, token);
			i++;
		}
			
		
	}

}
