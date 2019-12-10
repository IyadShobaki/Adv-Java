import java.util.Scanner;

//Input and validate data from user using the ValidateInput class

public class Validate {

	public static void main(String[] args) {
		//get user input
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first name:");
		String firstNameString  = scanner.nextLine();
		
		
		System.out.println("Please enter last name:");
		String lastNameString  = scanner.nextLine();
		
		System.out.println("Please enter address:");
		String addressString  = scanner.nextLine();
		
		System.out.println("Please enter city:");
		String cityString  = scanner.nextLine();
		
		System.out.println("Please enter state:");
		String stateString  = scanner.nextLine();
		
		System.out.println("Please enter zip:");
		String zipString  = scanner.nextLine();
		
		System.out.println("Please enter phone:");
		String phoneString  = scanner.nextLine();
		
		
		//validate user input and display error message
		System.out.println("\nValidate Result:");
		if(!ValidateInput.validateFirstName(firstNameString))
			System.out.println("Invalid first name");
		else if (!ValidateInput.validateLastName(lastNameString))
			System.out.println("Invalid last name");
		else if (!ValidateInput.validateAddress(addressString))
			System.out.println("Invalid address");
		else if(!ValidateInput.validateCity(cityString))
			System.out.println("Invalid city");
		else if(!ValidateInput.validateState(stateString))
			System.out.println("Invalid state");
		else if(!ValidateInput.validateZip(zipString))
			System.out.println("Invalid zip code");
		else if(!ValidateInput.validatePhone(phoneString))
			System.out.println("Invalid phone number");
		else {
			System.out.println("Valid input.  Thank you.");
		}
	}

}
