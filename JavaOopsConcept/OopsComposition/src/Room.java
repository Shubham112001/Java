
public class Room {
	private Furniture furniture;
	private Doors door;
	private Windows window;
	public Room(Furniture furniture, Doors door, Windows window) {
		this.furniture = furniture;
		this.door = door;
		this.window = window;
	}
	public void getRoom() {
		furniture.getFurniture("Bed");
		door.getDoors("Wooden");
		window.getWindows("Plastic", "Rolling");
	}
	
	
	
	

}
