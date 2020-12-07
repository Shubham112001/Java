
public class healthyHamburger extends Hamburgers {
	private String healthyExtra1Name;
	private double healthyExtra1Price;
	
	private String healthyExtra2Name;
	private double healthyExtra2Price;
	public healthyHamburger(String meat, double price) {
		super("Healthy", meat, price, "Brown");
	}
	public void addHealthAdd1(String name, double price) {
		this.healthyExtra1Name=name;
		this.healthyExtra1Price=price;
	}
	public void addHealthAdd2(String name, double price) {
		this.healthyExtra2Name=name;
		this.healthyExtra2Price=price;
	}
	@Override
	public double overallOrder() {
		double burgerPrice=super.overallOrder();
		if(this.healthyExtra1Name != null) {
			burgerPrice+=this.healthyExtra1Price;
			System.out.println(this.healthyExtra1Name+" is added which cost "+this.healthyExtra1Price);
		}
		if(this.healthyExtra2Name != null) {
			burgerPrice+=this.healthyExtra2Price;
			System.out.println(this.healthyExtra2Name+" is added which cost "+this.healthyExtra2Price);
		}
		return burgerPrice;
	}
	
	
	
	
	

}
