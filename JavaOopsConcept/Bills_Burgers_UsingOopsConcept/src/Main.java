
public class Main {

	public static void main(String[] args) {
		Hamburgers hamburger = new Hamburgers("Basic", "Sausage", 3.5, "White");
		double price= hamburger.overallOrder();
		hamburger.addition1("Onion", 0.25);
		hamburger.addition2("Tomato", 0.35);
		hamburger.addition3("Cheese", 0.75);
		price= hamburger.overallOrder();
		System.out.println("Total Amount to pay= "+hamburger.overallOrder());
		
		healthyHamburger healthyBurger= new healthyHamburger("Bacon", 3.97);
		healthyBurger.addHealthAdd1("Egg", 0.45);
		healthyBurger.addition1("Lentils", 2.42);
		healthyBurger.overallOrder();
		System.out.println("The total healthy hamburger price "+healthyBurger.overallOrder());
		
		DeluxeBurger deluxeBurger=new DeluxeBurger();
		deluxeBurger.addition3("Not to do this", 50.33);
		deluxeBurger.overallOrder();
	}

}
