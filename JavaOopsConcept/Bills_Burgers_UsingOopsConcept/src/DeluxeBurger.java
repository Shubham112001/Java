
public class DeluxeBurger extends Hamburgers {
	public DeluxeBurger() {
		super("Deluxe", "Sausage", 13.5, "White");
		super.addition1("Chips", 2.5);
		super.addition2("Drinks", 1.5);
		}

	@Override
	public void addition1(String name, double price) {
		System.out.println("No additions applied");
	}

	@Override
	public void addition2(String name, double price) {
		System.out.println("No additions applied");
	}

	@Override
	public void addition3(String name, double price) {
		System.out.println("No additions applied");
	}

	@Override
	public void addition4(String name, double price) {
		System.out.println("No additions applied");
	}
	
	}
	


