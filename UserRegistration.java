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
		{
			System.out.println(firstName+" is a valid First Name");
		}
		else
		{
			System.out.println(firstName+" is not a valid First Name");
			validateFirstName();
		}
			
		
	}
	public static void validateLastName()
	{
		System.out.println("*******LAST NAME*******\n * Last Name should start with a capital lettler \n * Last Name should have minimum 3 characters \n");
		System.out.println("Enter a valid Last Name :");
		
		Scanner sc = new Scanner(System.in);
		String lastName=sc.nextLine();
		String regexlastName = "[A-Z]{1}[a-z]{2,}";
		boolean lastNameValidator = lastName.matches(regexlastName);
		if(lastNameValidator)
		{
			System.out.println(lastName+" is a valid Last Name");
		}
		else
		{
			System.out.println(lastName+" is not a valid Last Name");
			validateLastName();
		}
	}
		public static void validateEmail() {
			System.out.println("*******EMAIL ID *******\n Email has 3 mandatory parts (abc, bl\r\n precise @ and . positions )\n");
			System.out.println("Enter a valid EMAIL-ID :");
			
			Scanner sc = new Scanner(System.in);
			String emailID=sc.nextLine();
			String regexemailId = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			boolean emailIdValidator = emailID.matches(regexemailId);
			if(emailIdValidator)
			{
				System.out.println(emailID+" is a valid Email Id");
			}
			else
			{
				System.out.println(emailID+" is not a valid Email Id");
				validateEmail();
			}
			
		}
		
	
	
	public static void main(String args[]) {
		System.out.println("WELCOME TO USER REGISTRATION VALIDATION");
		UserRegistration userreg = new UserRegistration();
		userreg.validateFirstName();
		userreg.validateLastName();
		userreg.validateEmail();
		
	}
}
