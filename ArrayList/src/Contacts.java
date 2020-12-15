
public class Contacts {
	private String name;
	private String ContactNo;
	
	
	public Contacts(String name, String contactNo) {
		this.name = name;
		ContactNo = contactNo;
	}


	public String getName() {
		return name;
	}


	public String getContactNo() {
		return ContactNo;
	}
	
	public static Contacts createContact(String name, String contactNo) {
		return new Contacts(name,contactNo);
		
	}
	
	

}
