package addressBookPackage;

public class AddressBookManage
{
	private String firstName;
	private String secondName;
	private String address;
	private String city ;
	private String zip ;
	private String email ;
	
	public AddressBookManage( String firstName , String secondName , String address , String city , String zip , String email )
	{
		this.firstName = firstName ;
		this.secondName = secondName;
		this.address = address ;
		this.city = city ;
		this.zip = zip ;
		this.email = email ;
	}
	@Override
	public String toString() {
		return " firstName=" + firstName + ", secondName=" + secondName + ", address=" + address
				+ ", city=" + city + ", zip=" + zip + ", email=" + email ;
	}
	
	
}
