import java.util.Scanner;

public class Main {
	private static Scanner s=new Scanner(System.in);
	private static MobilePhone mobilePhone= new MobilePhone("0093 2423 45");
	public static void main(String[] args) {
		boolean quits=false;
		startPhone();
		printActions();
		while(!quits) {
			System.out.println("\nEnter actions(6 to show available actions)");
			int action=s.nextInt();
			s.nextLine();
			switch(action) {
			case 0:
				System.out.println("\nShutting down...");
				quits=true;
				break;
			case 1:
				mobilePhone.printContacts();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printActions();
				break;
			}
			
		}
		

	}
	private static void addNewContact() {
		System.out.println("Enter new Contact name");
		String name=s.nextLine();
		System.out.println("Enter new Phone No");
		String phone=s.nextLine();
		Contacts newContact= Contacts.createContact(name, phone);
		if(mobilePhone.addNewContact(newContact)) {
			System.out.println("New Contact added: Name- "+name+" Phone- "+phone);
		}else {
			System.out.println("Cannot add "+name+" is already on file");
		}
	}
	private static void updateContact() {
		System.out.println("Enter Existing Contact name");
		String name=s.nextLine();
		Contacts existingContactRecord=mobilePhone.querContact(name);
		if(existingContactRecord==null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Enter new Contact name");
		String newName=s.nextLine();
		System.out.println("Enter new phone number");
		String newNumber=s.nextLine();
		Contacts newContact=Contacts.createContact(newName, newNumber);
		if(mobilePhone.updateContact(existingContactRecord, newContact)) {
			System.out.println("Updated");
		}else {
			System.out.println("Error Updating");
		}
	}
	
	private static void removeContact() {
		System.out.println("Enter Existing Contact name");
		String name=s.nextLine();
		Contacts existingContactRecord=mobilePhone.querContact(name);
		if(existingContactRecord==null) {
			System.out.println("Contact not found");
			return;
		}
		if(mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("Number Deleted");
		}else {
			System.out.println("Error Deleting");
		}
	}
	private static void queryContact() {
		System.out.println("Enter Existing Contact name");
		String name=s.nextLine();
		Contacts existingContactRecord=mobilePhone.querContact(name);
		if(existingContactRecord==null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Name: "+existingContactRecord.getName()+" Phone No: "+existingContactRecord.getContactNo());
	}
	
	private static void startPhone() {
		System.out.println("Starting Phone....");
	}
	private static void printActions() {
		System.out.println("\nAvailable Actions:\n Press");
		System.out.println("0 - to Shutdown\n"+
						   "1 - to Print Contacts"+
						   "2 - to add a new Contact"+
						   "3 - to update existing contact"+
						   "4 - to remove an existing Contact"+
						   "5 - query if any existing contact exists"+
						   "6 - to print a list of available actions");
		System.out.println("Choose your actions:");
		
		
	}

}
