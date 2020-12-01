
public class Windows {
	private int height;
	private int breath;
	public Windows(int height, int breath) {
		this.height = height;
		this.breath = breath;
	}
	public void getWindows(String material, String type) {
		System.out.println("The Window of "+material+" material of "+type+" type is inserted");
	}
	public int getHeight() {
		return height;
	}
	public int getBreath() {
		return breath;
	}
	
	
	

}
