class Cars {
	private String name;
	private boolean engine= true;
	private int cylinders;
	private int wheels=4;
	public Cars(String name, int cylinders) {
		this.name = name;
		this.cylinders = cylinders;
	}
	public String startEngine() {
		return "Start Engine";
	}
	public String accelerate() {
		return "Car Accerlerate";
	}
	public String brake() {
		return "Brakes Applied";
	}
	public String getName() {
		return name;
	}
	public boolean isEngine() {
		return engine;
	}
	public int getCylinders() {
		return cylinders;
	}
	public int getWheels() {
		return wheels;
	}
	
}

class Skoda extends Cars {

	public Skoda(String name, int cylinders) {
		super("Laura", 4);
		
	}

	@Override
	public String startEngine() {
		return "Skoda :-Engine Started";
	}

	@Override
	public String accelerate() {
		return "Skoda :- Accelerated";
	}

	@Override
	public String brake() {
		return "Skoda :- Brakes Applied";
	}
	
}
class Ford extends Cars {

	public Ford(String name, int cylinders) {
		super("Figo", 4);
		
	}

	@Override
	public String startEngine() {
		return "Ford :- Engine Started";
	}

	@Override
	public String accelerate() {
		return "Ford :- Accelerated";
	}

	@Override
	public String brake() {
		return "Ford :- Brakes Applied";
	}
	
}
class BMW extends Cars {

	public BMW(String name, int cylinders) {
		super("i8", 4);
		
	}

	@Override
	public String startEngine() {
		return "BMW :- Engine Started";
	}

	@Override
	public String accelerate() {
		return "BMW :- Accelerated";
	}

	@Override
	public String brake() {
		return "BMW :- Brakes Applied";
	}
	
}
public class Main {

	public static void main(String[] args) {
		Cars car = new Cars("Base Car",8);
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		Skoda sk = new Skoda("Laura",8);
		System.out.println(sk.startEngine());
		System.out.println(sk.accelerate());
		System.out.println(sk.brake());
		
		Ford fo = new Ford("Figo",8);
		System.out.println(fo.startEngine());
		System.out.println(fo.accelerate());
		System.out.println(fo.brake());
		
		BMW bmw = new BMW("i8",8);
		System.out.println(bmw.startEngine());
		System.out.println(bmw.accelerate());
		System.out.println(bmw.brake());

	}

}
