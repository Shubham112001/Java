package oopsConstructor;

public class Main {

	public static void main(String[] args) {
		VipCustomer customer1= new VipCustomer();
		System.out.println(customer1.getName());
		
		VipCustomer customer2= new VipCustomer("Shubh",20000.0);
		System.out.println(customer2.getName());
		
		VipCustomer customer3= new VipCustomer("Shubham",30000.0,"abcf@khsfd.com");
		System.out.println(customer3.getName());

	}

}
