package oopsConstructor;

public class VipCustomer {
	private String name;
	private double CLimit;
	private String email;
	public VipCustomer() {
		this("Default Name",50000.0,"abcd@hsdf.com");
	}
	public VipCustomer(String name, double CLimit) {
		
		this(name,CLimit,"abcd@hsdf.com");
	}

	public VipCustomer(String name, double CLimit, String email) {
		this.name=name;
		this.CLimit=CLimit;
		this.email=email;
	}
	public String getName() {
		return name;
	}
	public double getCLimit() {
		return CLimit;
	}
	public String getEmail() {
		return email;
	}
	

}
