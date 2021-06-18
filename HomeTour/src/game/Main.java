package game;

import java.util.ArrayList;
import java.util.Scanner;

import fixtures.Room;

public class Main extends RoomManager {
	static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		
		
		Player printRoom = new Player();
		Room room = new Room();
		String[] directions = getExits();
		RoomManager roomManager = new RoomManager();
		boolean master = true;
		
		printRoom.intro();
		
		String line = scanner.nextLine();
		
		//Starting Room
		String previousR = "living room";
		String currentR = "living room";
		
		//Initial Room
		if(line.equals("continue")) {
			System.out.println("You decided to go into the house, everything is pitch dark. You take out your phone to turn on the light so you can see your surroundings\n");
			 System.out.println("Map: " + Room.displayMap() + "\n");
				roomManager.init();
				
				System.out.println("What direction would you like to go,");
				System.out.println(directions[0] + " , " + directions[1] + ", " + directions[3] + ", or " + directions[4] + "\n");
		} else {
			System.out.println("Scray Cat!");
			scanner.close();
		}
		
		
		
		String userChoice = scanner.nextLine();
		String userInput = userChoice;
		do {
			
			if(userInput.equals("left")) {
				if((previousR.equals("living room") & currentR.equals("bedroom")) || (previousR.equals("living room") & currentR.equals("living room"))) {
					roomManager.bedRoom();
					System.out.println("Map: " + Room.displayMap() + "\n");
					System.out.println("What direction do you wish to go?");
					System.out.println(directions[1] + " or " + directions[2] + "\n");
					userInput = scanner.nextLine();
					if(userInput.equals("right")) {
						currentR = "dinning room";
					}else {
						currentR = "living room";
					}
					previousR = "bedroom";
					master = true;
					}else if(previousR.equals("kitchen") & currentR.equals("dinning room")) {
						roomManager.kitchen();
						System.out.println("Map: " + Room.displayMap() + "\n");
						System.out.println("What direction do you wish to go?");
						System.out.println(directions[0] + " or " + directions[2] + "\n");
						userInput = scanner.nextLine();
						if(userInput.equals("left")) {
							currentR = "dinning room";
						}else {
							currentR = "living room";
						}
						previousR = "bedroom";
						master = true;
					}else {
						roomManager.bedRoom();
						System.out.println("Map: " + Room.displayMap() + "\n");
						System.out.println("What direction do you wish to go?");
						System.out.println(directions[1] + " or " + directions[2] + "\n");
						userInput = scanner.nextLine();
						
						if(userInput.equals("right")) {
							currentR = "dinning room";
						}else {
							currentR = "living room";
						}
						previousR = "bedroom";
						master = true;
					}
			}else if(userInput.equals("right")) {
					if((previousR.equals("living room") & currentR.equals("kitchen")) || (previousR.equals("living room") & currentR.equals("living room"))) {
						roomManager.kitchen();
						System.out.println("Map: " + Room.displayMap() + "\n");
						System.out.println("What direction do you wish to go?");
						System.out.println(directions[0] + " or " + directions[2] + "\n");
						userInput = scanner.nextLine();
						if(userInput.equals("left")) {
							currentR = "dinning room";
						}else {
							currentR = "living room";
						}
						previousR = "kitchen";
						master = true;
						}else if(previousR.equals("dinning room") & currentR.equals("kitchen")) {
							roomManager.kitchen();
							System.out.println("Map: " + Room.displayMap() + "\n");
							System.out.println("What direction do you wish to go?");
							System.out.println(directions[0] + " or " + directions[2] + "\n");
							userInput = scanner.nextLine();
							if(userInput.equals("left")) {
								currentR = "dinning room";
							}else {
								currentR = "living room";
							}
							previousR = "dinning room";
							master = true;
						}else {
							roomManager.dinningRoom();
							System.out.println("Map: " + Room.displayMap() + "\n");
							System.out.println("What direction do you wish to go?");
							System.out.println(directions[0] + ",  " + directions[1] + ", or " + directions[2] + "\n");
							userInput = scanner.nextLine();
							if(userInput.equals("left")) {
								currentR = "bedroom";
							} else if(userInput.equals("right")){
								currentR = "kitchen";
							} else {
								currentR = "living room";
							}
							previousR = "dinning room";
							master = true;
						}
			}else if(userInput.equals("back")) {
					roomManager.init();
					System.out.println("Map: " + Room.displayMap() + "\n");
					System.out.println("What direction do you wish to go?");
					System.out.println(directions[0] + ",  " + directions[1] + ", " + directions[2] + directions[3] + ", or " + directions[4] + "\n");
					if(currentR.equals("kitchen")) {
						userInput = scanner.nextLine();
						if(userInput.equals("left")) {
							currentR = "dinning room";
						}else {
							currentR = "living room";
						}
						previousR = "kitchen";
						master = true;
				} else if(currentR.equals("dinning room")) {
					userInput = scanner.nextLine();
					if(userInput.equals("left")) {
						currentR = "bedroom";
					} else if(userInput.equals("right")){
						currentR = "kitchen";
					} else {
						currentR = "living room";
					}
					previousR = "dinning room";
					master = true;
				} else {
					userInput = scanner.nextLine();
					if(userInput.equals("right")) {
						currentR = "dinning room";
					}else {
						currentR = "living room";
					}
					previousR = "bedroom";
					master = true;
				}
			}else if(userInput.equals("forward")) {
				if(previousR.equals("living room")) {
					roomManager.dinningRoom();
					System.out.println("Map: " + Room.displayMap() + "\n");
					System.out.println("What direction do you wish to go?");
					System.out.println(directions[0] + ",  " + directions[1] + ", or " + directions[2] +"\n");
					userInput = scanner.nextLine();
					if(userInput.equals("left")) {
						currentR = "bedroom";
					} else if(userInput.equals("right")){
						currentR = "kitchen";
					} else {
						currentR = "living room";
					}
					previousR = "dinning room";
					master = true;
				}
				
			} else if(userInput.equals("leave")) {
				System.out.println("Scary cat!!");
				master = false;
				
			} else {
				System.out.println("That is not an option");
				master = true;
			}

		} while(master);
	}
}

		

