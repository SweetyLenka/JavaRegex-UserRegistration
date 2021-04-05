package userreg;
import java.util.Scanner;
import java.util.regex.*;

//@Description User Registration System needs to ensure all validations are in place during the User Entry

public class UserRegistration {
	private static String firstName;
	private static String lastName;
	private static String email;
	private static String password;
	private static String mobile_no;
	Scanner sc=new Scanner(System.in);

	//Method to get First Name
	public String getFirstName()
		{
		System.out.println("*******FIRST NAME*******\n * First Name should start with a capital lettler \n * First Name should have minimum 3 characters \n");
		System.out.println("Enter a valid First Name :");
		String fname=sc.nextLine();
		return fname;
		}
	//Method to get Last Name
		public String getLastName()
			{
			System.out.println("*******LAST NAME*******\n * Last Name should start with a capital lettler \n * Last Name should have minimum 3 characters \n");
			System.out.println("Enter a valid Last Name :");
			String lname=sc.nextLine();
			return lname;
			}
		//Method to get Email
		public String getEmail() 
			{
			System.out.println("*******EMAIL ID *******\n Email has 3 mandatory parts (abc, bl\r\n precise @ and . positions )\n");
			System.out.println("Enter a valid Email:");
			String email=sc.nextLine();
			return email;
			}
		//Method to get mobile_number
		public String getMobileNo()
			{
			System.out.println("*******MOBILE NUMBER*******\n * Mobile Format - Country code follow by space and 10 digit number\n");
			System.out.println("Enter a valid MOBILE NUMBER :");
			String mobile_no=sc.nextLine();
			return mobile_no;
			}
	
	//Method to check whether First name is valid
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
			}
			}
	//Method to check whether Last name is valid
		public void validateLastName(String name) {
			String regexlastName = "[A-Z]{1}[a-z]{2,}";
			boolean lastNameValidator = name.matches(regexlastName);
			if(lastNameValidator)
			{
			System.out.println(name+" is a valid Last Name");
			}
			else
			{
			System.out.println(name+" is not a valid Last Name");
			}
			}
		//Method to check whether Email is valid
		public  void validateEmail(String emailID) {
			String regexemailId = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			boolean emailIdValidator = emailID.matches(regexemailId);
			if(emailIdValidator)
			{
				System.out.println(emailID+" is a valid Email Id");
			}
			else
			{
				System.out.println(emailID+" is not a valid Email Id");
			}
			}
			//Method to check whether mobile_no is valid
			public void mobilevalidation(String mobile) {
			String regexmobile = "[9]{1}[1]{1}[\s]{1}[0-9]{10}";
			boolean mobileValidator = mobile.matches(regexmobile);
			if(mobileValidator)
			{
				System.out.println(mobile+" is a valid Mobile Number");
			}
			else
			{
				System.out.println(mobile+" is not a valid Mobile Number");
		
			}
			}
			
			
	public static void main(String[] args) {
		UserRegistration usereg=new UserRegistration();
		firstName=usereg.getFirstName();
		usereg.validateFirstName(firstName);
		lastName=usereg.getLastName();
		usereg.validateLastName(lastName);
		email=usereg.getEmail();
		usereg.validateEmail(email);
		mobile_no=usereg.getMobileNo();
		usereg.mobilevalidation(mobile_no);
    }
	
}