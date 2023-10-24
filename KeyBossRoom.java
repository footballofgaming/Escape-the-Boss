package unit2;
/******************************
 * 	The class for the method  *
 * 	when the user enters one  *
 *	of the 4 boss rooms but   *
 *	not the final boss room	  *
 *							  *
 *							  *
 *							  *
 *							  *
 *							  *
 *****************************/
public class KeyBossRoom extends BossRoom{

	KeyBossRoom(int roomID, int w, int n, int e, int s) {
		super(roomID, w, n, e, s);
		
		}
	public int challenge() { // This method is for the keyBossRoom challenge; where the user is stuck in room with the door closed.
		int gameState =2;
		int a = (int) (Math.random()*10)*2+10;
		int b = (int) (Math.random()*10)*2;
		int x = (a+b)/2;
		int y = (a-b)/2;
		System.out.println(" OH NO THE EXIT IS LOCKED! SOLVE THE WORD PROBLEM TO OPEN THE DOOR!");
		System.out.println(" For the positive whole numbers x, y the following is true: x + y =" + a + " , x-y = "+ b+ " What is the value of x & y?" );
		
		boolean bCont= true;
		while(bCont){
			System.out.println("ENTER X VALUE ");
			int input1 = userInput.nextInt();
			System.out.println("ENTER Y VALUE ");
			int input2 = userInput.nextInt();
			if(input1 == x && input2 == y) {
				pointTotal += 3;
				System.out.println("CONGRATULATION'S, YOU CAN DO MATH & YOU'RE NOW FREE TO LEAVE! ");
				System.out.println(" Congrats You've earned 3 point ");
				System.out.println("Earn atleast 15 points to enter the final boss room ");
				System.out.println("Total Points: " + pointTotal);
				bCont = false;
			}
			else {
				System.out.println("WRONG ANSWER! TRY AGAIN!");
			}
		}
		return gameState; // returns the gameState value.
	}
}
