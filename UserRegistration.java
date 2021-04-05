package userreg;
import java.util.Scanner;
import java.util.regex.*;

//@Description User Registration System needs to ensure all validations are in place during the User Entry

public class UserRegistration {
	Scanner sc=new Scanner(System.in);

	
	 
	
	public String getFirstName()
	{
		System.out.println("*******FIRST NAME*******\n * First Name should start with a capital lettler \n * First Name should have minimum 3 characters \n");
		System.out.println("Enter a valid First Name :");
		String fname=sc.nextLine();
		return fname;
	}
	
	public void validateFirstName(String name) {
	String regexfirstName = "[A-Z]{1}[a-z]{2,}";
	boolean firstNameValidator = name.matches(regexfirstName);
	if(firstNameValidator)
	{
		System.out.println(name+" is a valid First Name");
	}
	else
	{
		System.out.println(name+" is not a valid First Name");
		//validateFirstName(String name);
	}
	}
	
	public static void main(String[] args) {
		UserRegistration usereg=new UserRegistration();
		String firstName=usereg.getFirstName();
		usereg.validateFirstName(firstName);
		
    }
	
}