package unit2;
/******************************
 * 	The class for BossRooms	  *
 * 	15&18					  *
 *	This class is primarily   *
 *	used for drawing the  	  *
 *	BossRooms.				  *
 *							  *
 *							  *
 *							  *
 *							  *
 *****************************/
public class SouthKeyBossRoom extends KeyBossRoom {

	SouthKeyBossRoom(int roomID, int w, int n, int e, int s) {
		super(roomID, w, n, e, s);
		
	}
	public void draw() { 		// (roomID == 15 || roomID == 8) 
		
		System.out.println("      |     |     ");
		System.out.println("      |     |     ");
		System.out.println("______|	    |_____");
		System.out.println("|                 |");
		System.out.println("|                 |");
		System.out.println("|                 |");
		System.out.println("|                 |");
		System.out.println("|                 |");
		System.out.println("|                 |");
		System.out.println("|_________________|");
	}
}
