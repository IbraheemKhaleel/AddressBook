package addressBookPackage;

import java.util.Scanner;

public class AddressBook 
{
	Scanner input = new Scanner(System.in);
	public void contactDetails()
	{
		String firstName, secondName , address , city , zip , email ; 
		System.out.println(" Enter first name , second name , address , city , zip , email ");
		firstName = input.nextLine();
		secondName = input.nextLine();
		address = input.nextLine();
		city = input.nextLine();
		zip = input.nextLine();
		email = input.nextLine();
		System.out.println(" Your details are " + firstName + "  "  + secondName + "  " + address + "  " + city + "  " + zip + "  " + email );
	}
	public static void main(String[] args) 
	{
		AddressBook addressBook = new AddressBook();
		addressBook.contactDetails();
	}
}
