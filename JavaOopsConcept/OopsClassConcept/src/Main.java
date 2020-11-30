
public class Main {
	
	//oops concept of class using getters and setters

	public static void main(String[] args) {
		bankAccount Shubham= new bankAccount();
		Shubham.setAccountNo("43656");
		Shubham.setBalance(0.0);
		Shubham.setCustomerName("Shubham");
		Shubham.setEmail("shubham123@dgd.com");
		Shubham.setPhoneNo("846094586");
		
		Shubham.withdraw(100.0);
		Shubham.deposit(10000.00);
		Shubham.withdraw(200.0);
		Shubham.withdraw(1005.0);
		Shubham.withdraw(105.0);

	}

}
