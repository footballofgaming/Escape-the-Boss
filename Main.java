

package unit2;

import java.util.Scanner;

/******************************
 * 	Nov 1 2022				  *
 * @author aruyanpuva23		  *
 *							  *
 * 	unit2				      *
 *							  *
 *	ICS4U1 Assignment-2		  *
 *	This assignment is about  *
 *	using object oriented 	  *
 *	method to create a game   *
 *  that involves with rooms. *
 *****************************/
public class Main {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in); 
		Title t = new Title(); // 
		int gameState = 1;  // the gameState is for the game to switch between the menu/title screen to the game screen. 
		int currentRoom = 36; // starting room of the game is room 36 
		Room[] theRooms = {  // the array of all the total rooms in the game.
			new Room(0,-1,-1,1,8), new Room(1,0,-1,-1,9), new Room(2,-1,-1,-1,10), new Room(3,-1,-1,4,-1),
			new Room(4,3,-1,5,12), new Room(5,4,-1,6,15), new Room(6,5,-1,7,14), new Room(7,6,-1,-1,15),
			new SouthKeyBossRoom(8,-1,0,-1,-1)/* Room 8 is a boss room */, new Room(9,-1,1,10,-1), new Room(10,9,2,11,18),
			new Room(11,10,-1,12,19), new Room(12,11,4,15,-1), new Room(13,12,5,14,21),new Room(14,13,6,-1,22),
			new SouthKeyBossRoom(15,-1,7,-1,-1), new Room(16,-1,-1,17,24),new Room(17,16,-1,18,25),new Room(18,17,10,19,-1),
			new Room(19,18,11,20,-1),new Room(20,19,-1,-1,-1),new Room(21,-1,13,22,29),new Room(22,21,14,23,-1),
			new Room(23,22,-1,-1,31),new Room(24,-1,16,-1,-1),new Room(25,-1,17,26,-1),new Room(26,25,-1,27,34),
			new Room(27,26,-1,28,-1),new Room(28,27,-1,29,36),new Room(29,28,21,-1,-1),new Room(30,-1,-1,31,38),
			new Room(31,30,23,-1,-1),new Room(32,-1,-1,33,40),new Room(33,32,-1,-1,41),new Room(34,-1,26,-1,42),
			new Room(35,-1,-1,36,-1),new Room(36,35,28,37,44),/* start Room */new Room(37,36,-1,38,-1),new Room(38,37,30,39,-1),new Room(39,38,-1,-1,47),
			new Room(40,-1,32,-1,48),new Room(41,-1,33,42,49),new Room(42,41,34,43,-1),new Room(43,42,-1,44,-1),new Room(44,43,36,45,-1),
			new Room(45,44,-1,46,-1),new Room(46,45,-1,-1,54),new Room(47,-1,39,-1,55),new Room(48,-1,40,49,56),new Room(49,48,41,50,-1),
			new Room(50, 49,-1,51,58),new Room(51,50,-1,52,59),new Room(52,51,-1,-1,60),new Room(53,-1,-1,54,61),new Room(54,53,46,55,-1),
			new Room(55,54,47,-1,-1),new Room(56,-1,48,-1,-1),
			new WestKeyBossRoom(57,-1,-1,58,-1),/* Room 57 is Boss Room  */new Room(58,57,50,-1,-1),
			new Room(59,-1,51,60,-1),new Room(60,59,52,61,-1),new Room(61,60,53,62,-1),new Room(62,61,-1,63,-1),new FinalBossRoom(63,62,-1,-1,-1)/* Room 63 is the Final boss Room */
		};
		while(gameState > 0) { // the loop when the gameState values are greater then 0. 
			gameState = gameState1(gameState,userInput,t);
			gameState = gameState2(currentRoom,theRooms,gameState,userInput);
		}
	}
	
	public static int gameState1(int gameState, Scanner userInput,Title t) { // the method when gameState = 1
		if( gameState == 1) { // gameState 1 is the title screen and once the user inputs the enter key, the user is directed to the game.  
			t.printTitle(); // calling the title class and printing the title
			while ( gameState == 1 ) {
				String enterKey = userInput.nextLine(); // reads the users input as a String 
				if ( enterKey == "") { // if the user pressed entered key, the gameState would be 2
					gameState = 2;
				}
				else { // if the user inputed anything other then the enter key, the system would print a Error message.
					System.out.println("Incorrect entry, please press the Enter key to begin the game "); 
				}
			}
		}
		return gameState; // return the gameState value 
	}
	public static int gameState2(int currentRoom,Room[] theRooms, int gameState, Scanner userInput) { // the method when gameState = 2 
		while (gameState == 2) { // loop when 
			Room room = theRooms[currentRoom]; // selecting the current room from the array based of currentRoom index. 
			room.draw(); // Draws the current room you're in. 
			System.out.println("Room "+ currentRoom);
			//System.out.println(theRooms[currentRoom].roomID);
			gameState = room.challenge(); // prints the challenge method
			System.out.println("where do you want to go?");
			System.out.println(" Enter 1 for North");
			System.out.println(" Enter 2 for East");
			System.out.println(" Enter 3 for South");
			System.out.println(" Enter 4 for West");
			System.out.println ("Enter -1 to return to menu");
			String roomdestination = userInput.nextLine();
			int nextRoom = currentRoom; // we're creating and initializing as well as creating an index for next room  
			switch (roomdestination) { // the switch is for when the user inputed the following 4 values:1,2,3,4.
		
			case "1": // when the user inputed 1, the next room would be in the north of the current room
				nextRoom = room.getDestinationNorth();
				break;
			case "2": // when the user inputed 2, the next room would be the east of the current room. 
				nextRoom = room.getDestinationEast();
				break;
			case "3": // when the user inputed 3, the next room would be south of the current room. 
				nextRoom = room.getDestinationSouth();
				break;
			case "4": // when the user inputed 4, the next room would be in the west of the current room 
				nextRoom = room.getDestinationWest();
				break;
			case "-1":
				gameState = 1;
				break;
			default:
				System.out.println("Invalid entry, please enter one of the 4 options.");
				break;
			}
			if(canEnterNxtRoom(nextRoom, theRooms)) { // checking whether we can enter the next room by calling the method canEnterNxtRoom
				currentRoom = nextRoom; 
			}
			 
		}
		return gameState;
	}
	public static boolean canEnterNxtRoom(int nextRoom, Room[] theRooms) { // method for checking whether if we can enter the final bossRoom, as you need at least 15 points to enter. 
		if (theRooms[nextRoom] instanceof FinalBossRoom && Room.pointTotal<15 ) {
			System.out.println("You don't have enough points, please travel to the other rooms to gain more points");
			return false;
		}
		else {
			return true; 
		}
	}
}
