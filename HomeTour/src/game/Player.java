package game;
import fixtures.Room;

public class Player extends RoomManager {
	
	Room room = new Room();
	
	public void intro () {
		System.out.println("In your neighborhood, there is an abandon house at the end of the street. The house has been abandon for almost a centry."
				+ "Today, as you are walking home from school you notice something strange through the window of the house. You know that you are not suppose to be there"
				+ "yet you decide to make your way to the house. You turn the knoob of the door, it is unlocked. \n to type continue to move forward");
	}
	
	public void currentLocation(String loc) {
		System.out.println("You are currently in the " + loc);
	}
	
	public void previous(String location) {
		System.out.println("You came from" + location);
	}
	}
