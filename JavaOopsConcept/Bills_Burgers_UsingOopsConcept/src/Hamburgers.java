
public class Hamburgers {
		private String name;
		private String meat;
		private double price;
		private String breadRollType;
		
		private String add1;
		private double add1price;
		
		private String add2;
		private double add2price;
		
		private String add3;
		private double add3price;
		
		private String add4;
		private double add4price;
		public Hamburgers(String name, String meat, double price, String breadRollType) {
			this.name = name;
			this.meat = meat;
			this.price = price;
			this.breadRollType = breadRollType;
		}
		
		public void addition1(String name, double price) {
			this.add1=name;
			this.add1price=price;
			}
		public void addition2(String name, double price) {
			this.add2=name;
			this.add2price=price;
			}
		public void addition3(String name, double price) {
			this.add3=name;
			this.add3price=price;
			}
		public void addition4(String name, double price) {
			this.add4=name;
			this.add4price=price;
			}
		public double overallOrder() {
			double burgerPrice=this.price;
			System.out.println("The "+this.name+" hamburger has been selected with a "+this.meat+" and "+this.breadRollType+" of "+this.price);
			if(this.add1 != null) {
				burgerPrice+=this.add1price;
				System.out.println(this.add1+" is added which cost "+this.add1price);
			}
			if(this.add2 != null) {
				burgerPrice+=this.add2price;
				System.out.println(this.add2+" is added which cost "+this.add2price);
			}
			if(this.add3 != null) {
				burgerPrice+=this.add3price;
				System.out.println(this.add3+" is added which cost "+this.add3price);
			}
			if(this.add4 != null) {
				burgerPrice+=this.add4price;
				System.out.println(this.add4+" is added which cost "+this.add4price);
			}
			return burgerPrice;
		}
			
		
	}



