package unit2;
/******************************
 * 	This class prints out the *
 * 	the boss Room in room 57  *
 *	It is a superclass of 	  *
 *	KeyBossRoom				  *
 *							  *
 *							  *
 *							  *
 *							  *
 *							  *
 *****************************/
public class WestKeyBossRoom extends KeyBossRoom {

	WestKeyBossRoom(int roomID, int w, int n, int e, int s) {
		super(roomID, w, n, e, s);
		
	}
	public void draw() {
		//if (roomID == 57) {
		System.out.println("__________________");
		System.out.println("|                 |");
		System.out.println("|                 |");
		System.out.println("|                 |____");
		System.out.println("|                      ");
		System.out.println("|                      ");
		System.out.println("|                  ____");
		System.out.println("|                 |");
		System.out.println("|                 |");
		System.out.println("|_________________|");
		
	}
}
