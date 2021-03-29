package userreg;
import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	//@Description User Registration System needs to ensure all validations are in place during the User Entry
	
	public static void validateFirstName()
	{
		
		System.out.println("*******FIRST NAME*******\n * First Name should start with a capital lettler \n * First Name should have minimum 3 characters \n");
		System.out.println("Enter a valid First Name :");
		
		Scanner sc = new Scanner(System.in);
		String firstName=sc.nextLine();
		String regexfirstName = "[A-Z]{1}[a-z]{2,}";
		boolean firstNameValidator = firstName.matches(regexfirstName);
		if(firstNameValidator)
			System.out.println(firstName+" is a valid First Name");
		else
			System.out.println(firstName+" is not a valid First Name");
	}
	
	public static void main(String args[]) {
		System.out.println("WELCOME TO USER REGISTRATION VALIDATION");
		UserRegistration userreg = new UserRegistration();
		userreg.validateFirstName();
		
	}
}
