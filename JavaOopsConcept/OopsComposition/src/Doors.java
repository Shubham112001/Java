
public class Doors {
	private int height;
	private int breath;
	public Doors(int height, int breath) {
		this.height = height;
		this.breath = breath;
	}
	public void getDoors(String material) {
		System.out.println("The door of "+material+" is inserted");
	}
	public int getHeight() {
		return height;
	}
	public int getBreath() {
		return breath;
	}
	
	
	
}
