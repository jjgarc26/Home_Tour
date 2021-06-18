package game;

import fixtures.Room;


public class RoomManager extends Room{
	
	
	public RoomManager() {};
	String[] directions = getExits();
	//living Room
	public void init() {
		new Room("Living Room","The living room is the place that we enter when walking in from the front doors.",
				"Most living rooms are clean and since it is the place where guest come for gatherings. However, this room is different. The floors a full of dust ");
	}
	public void kitchen() {
		Room kitchen = new Room("Kitchen","The kitchen is a place where people come and cook some nasty stuff",
				"The kitchen seems to be in a very bad condition. The fridge is completely empty. There is nothing but an open box of cheese"
				+ "that seems to be growing mold. There is a statue of head siting on the middle of the table. There are some letters that are dated back"
				+ "from the 1980's");
	}
	
	public void dinningRoom() {
		new Room("Dinning Room", "The dinning room is a room where folks come and eat their nasty food", "The dinning room has a funky smell. It smells as if there own had "
				+ "wrapped a piece of cheese better his toes. The dinning table seems to be big, yet there is only one chair. Sitting in the chair is a small doll with button eyes"
				+ "The doll seems to be holding something odd. You look at the floor, footprints of some sort are leading to another room. ");
		
	}
	
	public void bedRoom() {
		new Room("BedRoom", "The bedroom is a place where people sleep or make babbies", "The bedroom is a mess!! luckily you do not live here. The first thing you notice"
				+ "was that there is no sheets on the bed. The bed itself is just made of a straws like a bed in a barn. There seems to be a photo album laying under the "
				+ "bedroom.");
		
	}
	
	
	
	

	
	public void startingRoom(String startingRoom) {
		this.startingRoom(startingRoom);
		
	}
	
	
	



	
}
