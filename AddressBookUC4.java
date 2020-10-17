package addressBookPackage;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import addressBook.AddressBookRegister;

public class AddressBookUC4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<AddressBookManage> array = new LinkedList<AddressBookManage>();
		array.add(new AddressBookManage("daren", "Brown " ," 7Th street ", " Chennai", "781 356" , " daren@gmail.com"));
		array.add(new AddressBookManage( " lovist " , " Keith " ," 7ThAvenue ", " Delhi ", " 987 123" , "lovist@gmail.com"));
		array.add(new AddressBookManage( " kerin " , " lane " ," 16ThAvenue ", " Mumbai ", " 539 123" , "kerin234@gmail.com"));
		System.out.println("Enter one choice 1. Add data  2. Edit data 3 . Delete ");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:	for(AddressBookManage address:array)
			 		{
				 		System.out.println(address);
			 		}
			break;  
			case 2 :for(AddressBookManage address:array)
					{
					System.out.println(address);
					} 
					System.out.println("\n Enter the position to be edited ");
					int select=sc.nextInt();
					array.remove(select-1);
					array.add(new AddressBookManage(" kati " , " dane " ," 10ThAvenue ", " Mumbai ", " 539 123" , "katynin234@gmail.com"));
					for(AddressBookManage address:array)
					{
					System.out.println(address);
					} 
			break;
			case 3 :for(AddressBookManage address:array)
					{
						System.out.println(address);
					}
					System.out.println("Enter the position to be deleted");
					int position = sc.nextInt();
					array.remove(position-1);
					System.out.println("Updated array is\n" );
					for(AddressBookManage address:array)
					{
						System.out.println(address);
					}	
			break;
			default: System.out.println("Enter a valid choice");
		}
		sc.close();
	}
}
