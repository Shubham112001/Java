
public class Main {

	public static void main(String[] args) {
		Furniture theFurniture= new Furniture(5);
		Doors theDoor= new Doors(4,6);
		Windows theWindow= new Windows(2,3);
		
		Room theRoom= new Room(theFurniture, theDoor, theWindow);
		theRoom.getRoom();

	}

}
