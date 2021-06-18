package fixtures;

import java.util.ArrayList;

public class Room extends Fixture{
	
	
	public Room() {
	}
	
	
	public Room(String name, String shortDescription, String longDescription ) {
		super();
		System.out.println("Name: " + name + "\n");
		System.out.println("short Description: " +shortDescription + "\n");
		System.out.println("Long Description: " + longDescription + "\n");
	}

	
	
	public static ArrayList<String> displayMap() {
		ArrayList<String> displayMap = new ArrayList<String>();
		displayMap.add("Living Room");
		displayMap.add("Kitchen");
		displayMap.add("Dinning Room");
		displayMap.add("Bathroom");
		displayMap.add("Bedroom");
		return displayMap;
		
	}


	
	//Exits
	public static String[] getExits() {
		String[] array = new String[5];
		array[0] = "left";
		array[1] = "right";
		array[2] = "back";
		array[3] = "forward";
		array[4] = "leave";
		return array;
	
	}
	
	
}
