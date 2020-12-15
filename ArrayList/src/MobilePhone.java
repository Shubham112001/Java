import java.util.ArrayList;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contacts> myContact;
	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContact = new ArrayList<Contacts>();
	}
	
	
	public boolean addNewContact(Contacts contact) {
		if(findContact(contact.getName())>=0) {
			System.out.println("Contact is already in a System");
			return false;
		}
		myContact.add(contact);
		return true;
		
	}
	
	public boolean updateContact(Contacts oldContact, Contacts newContact) {
		int foundPosition= findContact(oldContact);
		if(foundPosition<0) {
			System.out.println(oldContact.getName()+" was not found");
			return false;
		}
		this.myContact.set(foundPosition, newContact);
		System.out.println(oldContact.getName()+" was replaced with "+newContact.getName());
		return true;
	}
	
	public boolean removeContact(Contacts contact) {
		int foundPosition= findContact(contact);
		if(foundPosition<0) {
			System.out.println(contact.getName()+" was not found");
			return false;
		}
		this.myContact.remove(foundPosition);
		System.out.println(contact.getName()+" was removed");
		return true;
	}
	
	private int findContact(Contacts contact) {
		return this.myContact.indexOf(contact);
	}
	
	private int findContact(String ContactName) {
		for(int i=0;i<this.myContact.size();i++) {
			Contacts contact= this.myContact.get(i);
			if(contact.getName().equals(ContactName)) {
				return i;
			}
		}
		return -1;
	}
	public String queryContact(Contacts contact) {
		if(findContact(contact)>=0) {
			return contact.getName();
		}
		return null;
	}
	public Contacts querContact(String name) {
		int position=findContact(name);
		if(position>=0) {
			return this.myContact.get(position);
		}
		return null;
	}
	public void printContacts() {
		System.out.println("Contact Lists");
		for(int i=0;i<this.myContact.size();i++) {
			System.out.println((i+1)+"."+
						this.myContact.get(i).getName()+ "->"+
						this.myContact.get(i).getContactNo());
		}
	}
}
