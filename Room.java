package unit2;

import java.util.Scanner;

/******************************
 * 	The room class handles all*
 * 	the rooms in the game	  *
 *	except from the boss Rooms*
 *							  *
 *							  *
 *							  *
 *							  *
 *							  *
 *							  *
 *****************************/
public class Room {
	public Scanner userInput = new Scanner(System.in); 
	public int roomID = 1;
	private boolean pathWest; 
	private boolean pathNorth;
	private boolean pathEast;
	private boolean pathSouth;
	private int destinationWest;
	private int destinationSouth;
	private int destinationEast;
	private int destinationNorth;
	static int pointTotal = 0; // total points earned for doing the math questions
	
	Room(int roomID, int w, int n, int e, int s){ // 
		this.roomID = roomID;
		this.destinationWest = w;
		this.destinationSouth = s; 
		this.destinationEast = e;
		this.destinationNorth = n;
		this.pathEast =  this.destinationEast>=0;
		this.pathWest =  this.destinationWest>=0;
		this.pathSouth = this.destinationSouth >=0;
		this.pathNorth =  this.destinationNorth >=0;
		
	}
	
	public int getDestinationEast() { // a getter method for the private destination east variable
		if (this.destinationEast>=0) { // if the destination east value in the array is greater then 0, then return the east room number. Else the system returns the current room.
			return this.destinationEast;
		}
		else {
			return this.roomID;
			//System.out.println("Invalid direction, please select a valid direction");
		}
	}
	
	public int getDestinationNorth() { //a getter method for the private destination North variable
		if (this.destinationNorth>=0) {// if the destination east value in the array is greater then 0, then return the north room number. Else the system returns the current room.
			return this.destinationNorth;
		}
		else {
			return this.roomID;
		}
	}
	
	public int getDestinationSouth() {
		if (this.destinationSouth>=0) {
			return this.destinationSouth;
		}
		else {
			return this.roomID;
		}
	}
	
	public int getDestinationWest() {
		if (this.destinationWest>=0) {
			return this.destinationWest;
		}
		else {
			return this.roomID;
		}
	}
	public void draw() { // prints all the regular rooms in the game. 
		if ( pathNorth == true && pathEast == true && pathSouth == true && pathWest == true) {
			System.out.println("      |		|		");
			System.out.println("______|		|_______");
			System.out.println("      				");
			System.out.println("______		 _______");
			System.out.println("      |		|		");
			System.out.println("      |		|		");
		}
		if ( this.pathNorth && this.pathEast && !this.pathSouth  && !this.pathWest) {
			System.out.println("      |     |		");
			System.out.println("      |     |		");
			System.out.println("      |     |		");
			System.out.println("      |     |______	");
			System.out.println("      |				");
			System.out.println("       --------------");
		}
		if (pathNorth == true && pathEast == false && pathSouth == true && pathWest == false) { 
			System.out.println("      |		|		");
			System.out.println("      |		|		");
			System.out.println("      |		|		");
			System.out.println("      |		|		");
			System.out.println("      |		|		");
			System.out.println("      |		|		");
		}
		if ( pathNorth == true && pathEast == false && pathSouth == false && pathWest == true) {
			System.out.println("      |     |		");
			System.out.println("______|     |		");
			System.out.println("            |		");
			System.out.println("____________|		");
		
		}
		if ( pathNorth == false && pathEast == false && pathSouth == true && pathWest == true) {
			System.out.println("      				");
			System.out.println("_____________		");
			System.out.println("            |		");
			System.out.println("______      |		");
			System.out.println("      |     |		");
			System.out.println("      |     |		");
		}
		if ( pathNorth == false && pathEast == true && pathSouth == true && pathWest == false) {
			System.out.println("     				");
			System.out.println("       ______________");
			System.out.println("      |				");
			System.out.println("      |      _______");
			System.out.println("      |     |		");
			System.out.println("      |     |		");
		}
		if ( pathNorth == false && pathEast == true && pathSouth == false && pathWest == true) {
			System.out.println("      				");
			System.out.println("____________________");
			System.out.println("      				");
			System.out.println("      				");
			System.out.println("____________________");
			System.out.println("      				");
		}
		if ( pathNorth == true && pathEast == true && pathSouth == false && pathWest == true) {
			System.out.println("     |      |		");
			System.out.println("     |      |		");
			System.out.println("_____|      |_______");
			System.out.println("      				");
			System.out.println("____________________");
			System.out.println("      				");
		}
		if ( pathNorth == false && pathEast == true && pathSouth == true && pathWest == true) {
			System.out.println("      				");
			System.out.println("____________________");
			System.out.println("      				");
			System.out.println("_______      _______");
			System.out.println("      |     |		");
			System.out.println("      |     |		");
			System.out.println("      |     |		");
		}
		
		if ( pathNorth == true && pathEast == true && pathSouth == true && pathWest == false) {
			System.out.println("      |     |		");
			System.out.println("      |     |_______");
			System.out.println("      |				");
			System.out.println("      |      _______");
			System.out.println("      |     |		");
			System.out.println("      |     |		");
		}
		if ( pathNorth == true && pathEast == false && pathSouth == true && pathWest == true) {
			System.out.println("      |     |		");
			System.out.println("______|     |		");
			System.out.println("            |		");
			System.out.println("______      | 		");
			System.out.println("      |     |		");
			System.out.println("      |     |		");
		}
		if (pathNorth == true && pathEast == false && pathSouth == false && pathWest == false) {
			System.out.println("      |     |		");
			System.out.println("      |     |		");
			System.out.println("      |     |		");
			System.out.println("      |     |		");
			System.out.println("      |     |		");
			System.out.println("      |_____|		");
		}
		if (pathNorth == false && pathEast == false && pathSouth == true && pathWest == false) {
			System.out.println("      _______		");
			System.out.println("      |     |		");
			System.out.println("      |     |		");
			System.out.println("      |     |		");
			System.out.println("      |     |		");
			System.out.println("      |     |		");
		}
		if ( pathNorth == false && pathEast == true && pathSouth == false && pathWest == false) {
			System.out.println("      				");
			System.out.println("____________________");
			System.out.println("|     				");
			System.out.println("|     				");
			System.out.println("|___________________");
			System.out.println("      				");
		}
		if ( pathNorth == false && pathEast == false && pathSouth == false && pathWest == true) {
			System.out.println("      				");
			System.out.println("____________________");
			System.out.println("                    |");
			System.out.println("                    |");
			System.out.println("____________________|");
			System.out.println("      				");
		}
	}
	public int challenge() { // This method is for the quick sand that appears randomly. Need to answer it correctly to escape.
		int random = (int) (Math.random()*10);
		int gameState =2;
		if (random>8) { // the challenge only appears every 2/10 times when moving through rooms. 
			int a = (int) (Math.random()*10); // creates a random integer between 0-9
			int b = (int) (Math.random()*10);// creates a random integer between 0-9
			int c = a*b;
			System.out.println("QUICK, YOU'RE STUCK! SOLVE THIS MATH PROBLEM TO RELEASE YOURSELF!");
			System.out.println(a + "X" + b + "= ?");
			boolean bCont= true;
			while(bCont){
				int output = userInput.nextInt();
				if(output == c) { // if the value that the user inputed is correct, then the user is freed from the quicksand and earned 1 point. The loop would exit and allow the user to travel to other rooms. 
					pointTotal++;
					System.out.println("CONGRATULATION'S, YOU CAN DO MATH & YOU'RE NOW FREE! ");
					System.out.println(" Congrats You've earned 1 point ");
					System.out.println("Earn atleast 15 points to enter the final boss room ");
					System.out.println("Total Points: " + pointTotal);
					bCont = false;
				}
				else {
					System.out.println("WRONG ANSWER! TRY AGAIN!");
				}
			}
			
		}
		return gameState;// returns the gameState values. 
	}
}
