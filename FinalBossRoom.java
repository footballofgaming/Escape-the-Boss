package unit2;

import java.util.Scanner;

/*
import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
*/
/******************************
 * 	This class is for the 	  *
 * 	final boss Room in the 	  *
 *	game.					  *
 *							  *
 *							  *
 *							  *
 *							  *
 *							  *
 *							  *
 *****************************/
public class FinalBossRoom extends BossRoom {
	// 	(roomID == 63)
	FinalBossRoom(int roomID, int w, int n, int e, int s) {
		super(roomID, w, n, e, s);
		
	}
	public void draw() {
		System.out.println("     __________________");
		System.out.println("     |                 |");
		System.out.println("     |                 |");
		System.out.println("_____|                 |");
		System.out.println("                       |");
		System.out.println("                       |");
		System.out.println("_____                  |");
		System.out.println("     |                 |");
		System.out.println("     |                 |");
		System.out.println("     |_________________|");
	}
	public int challenge() {
		System.out.println("A WILD BOSS HAS APPEARED! TO ESCAPE THE BOSS & THE ROOMS, DEFEAT THE BOSS.");
		pic();
		int gameState = fight(); // the fight method is called, and returns the gameState value from the method. 
		return gameState; // the gameState value is returned. 
	}
	
	public int fight() {
		int bossHealth = 1000;
		int userHealth = 100;
		int gameState = 2;
		boolean bContinue = true;
		Scanner userInput = new Scanner(System.in);
		while(bContinue) {
			System.out.println("PRESS F to fight");
			System.out.println("PRESS H to hide");
			System.out.println("PRESS T for Talk no Jutsu");
			String option = userInput.nextLine();
			switch(option.toLowerCase()) {
			case "f":
				System.out.println(" You have thrown a bottle of Nitric acid");
				int healthLost1 = (int) (Math.random()*100)*3; // the amount of damage the boss takes from the user
				int healthLost2 = (int) (Math.random()*10); // the amount of damage the user takes from the boss
				bossHealth -= healthLost1;
				userHealth -= healthLost2; 
				System.out.println("The acid was effective and successful. The enemy now has " + bossHealth + " HP");
				System.out.println(" THE BOSS IS NOW ANGRY. THE BOSS SENT A FIREBALL AS AN ACT OF REVENGE! ");
				System.out.println("YOU HAVE TAKEN "+ healthLost2 + " Damage. Your current health is " +userHealth);
				break;
			case "h":
				System.out.println(" YOU HAVE DECIDED TO HIDE BEHIND THE BOSS. BUT! THE BOSS TURNED AROUND AND FOUND YOU!");
				System.out.println(" THE BOSS GRABED YOU AND BITE YOU IN YOUR NECK");
				int healthLost3 = (int) (Math.random()*10); // the amount of damage the user takes from the boss
				userHealth -= healthLost3; 
				System.out.println("YOU HAVE TAKEN "+ healthLost3 + " Damage. Your current health is " +userHealth);
				break;
			case "t":
				System.out.println(" YOU HAVE STARTED TALKING ABOUT YOUR DEPRESSING BACKSTORY TO MAKE THE USER SYMPATHIZE WITH YOU");
				System.out.println("*NARUTO THEME SONG STARTS TO PLAY*");
				int healthLost4 = (int) (Math.random()*100)*4; // the amount of damage the boss takes from the user
				bossHealth -= healthLost4;
				System.out.println(" THE BOSS HAS TAKEN "+ healthLost4+ " DAMAGE OF EMOTIONAL DAMAGE. THE CURRENT HP OF THE BOSS IS " +bossHealth);
				break;
				default:
					System.out.println("YOU HAVE ENTERED THE WRONG KEY. PLEASE SELECT ONE OF THE FOLLOWING KEYS");
					break;
				}
			if (bossHealth<=0) {
				System.out.println(" YOU HAVE DEFEATED & ESCAPED THE BOSS! THE BOSS IS NOW LAYING ON THE FLOOR UNCONSCIOUS.");
				System.out.println(" YOU HAVE NOW ESCAPED THE ROOMS AND YOUR NOW FREE!");
				bContinue = false;
				gameState = 3;
			}
			if (userHealth<=0) {
				System.out.println(" YOU HAVE BEEN DEFEATED BY THE BOSS! THE BOSS IS VERY DISAPPOINTED WITH THE FIGHT");
				System.out.println("YOUR NOW RESPONDING BACK TO THE STARTING ROOM");
				bContinue = false;
				gameState = 1; // the system goes to gameState = 2;
				
			}
		}
		return gameState;
	}
	public void pic() {
		
		System.out.println("▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░░▒▒██▒░▒░░░░▒░");
		System.out.println("░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒████░▒░▒░██▀");
		System.out.println("▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░░░░░░░░░▒░▒░░▒████▓░▒███░▒");
		System.out.println("░▒░▒░▒░▒░▒░▒░▒░▒░░░░▀█░░▀█░▒░▒░░░██████████░░▒");
		System.out.println("▒░▒░▒░▒░▒░▒░▒░▒░▀██████░░██░▒░▒░▒██████████▒▒░");
		System.out.println("░▒░▒░▒░▒░▒░▒░▒░░░▒██████░██▓░▒░▒▓███░░██████░▒");
		System.out.println("▒░▒░▒░▒░▒░▒░▒░░░░███████░███▓░░▒████░▒███████▒");
		System.out.println("░▒░▒░▒░▒░▒░▒░░░█░████████████▓░▓███▓░░███▒▒██░");
		System.out.println("▒░▒░▒░▒░▒░▒░▒░██▒█████████████▓████▒░▒██░░▒█░▒");
		System.out.println("░▒░▒░▒░▒░▒░▒░▒███████████████▒▓████░░░██░░▒░▒░");
		System.out.println("▒░▒░▒░▒░▒░▒░░████████████████▒▓████░░▒▒█▄░░░▒░");
	    System.out.println("░▒░▒░▒░▒░░▒█████████████──███▒▒███░░░░░▒░░▒░▒░");
	    System.out.println("▒░▒░▒░▒░░░▓██▒▒████████───██▒▒▒▒███░░░░░▒░░░▒░");
	    System.out.println("░▒░░▒░▒░▒████▒▒▒███████──░█▒▒▒▒▒░██░░▒░░░░░▒░▒");
	    System.out.println("░▒░▒▒░▒▒▓████▒▒▒▒██──██─◕▒▒██▒▒▒▒▒██░░▒░▒░▒░▒░");
	    System.out.println("░░░▒▓████████▒▒▒▒▒█─◕─█─▒▒▒███▒▒▒▒███▄░▒░▒░▒░▒");
	    System.out.println("▓███████████▒░▒▒███─██████▒▒██▒▒▒▒██░░▒░▒░▒░▒░");
	    System.out.println("███████████▒▒▒▒▒██▒▒██████▒▒██▒▒▒▒██▄▒░▒░▒░▒░▒");
	    System.out.println("██████████▒▒▒▒▒▒███▒▒▒▒▒▒▒▒▒██▒▒▒▒██░░▒░▒░▒░▒░");
	    System.out.println("█████░▒░██▒▒▒▒▒▒▒██▒▒█▒█▒█▒▒██▒▒▒▒██▒▒░▒░▒░▒░▒");
	    System.out.println("████░▒░▒██▒▒▒▒▒▒▒██──█─█─█──██▒▒▒▒██░░▒░▒░▒░▒░");
	    System.out.println("████▒░▒▄██▒▒▒▒▒▒▒███─█████─███▒▒▒▒██▒▒░▒░▒░▒░▒");
	    System.out.println("████▒░▒░███▒▒▒▒▒▒█████████████▒▒▒▒██▒░▒░▒░▒░▒░");
	    System.out.println("█████▒░▒▄███▒▒▒▒▒█████████████▒▒▒▒██▒░▒░▒░▒▒░▒");
	    System.out.println("██████▄▒░███▒▒▒▒▒████████▓▓▓▓▓▓▒▒▒██░░▒░▒░▒░▒░");
	    System.out.println("████▒░▒░░░███▒▒▒▒███████▓ ▓▓▓▓▓▓▓▒▒██░▒░▒░▒░▒░▒");
	    System.out.println("█████▄▒░▒░▒██░▒▒▒██████ ▓▓▓ ▓▓▓▓▓▓▓██░▒░▒░▒░▒░▒░");
	    System.out.println("████▒░▒░░▒░░██▒▒▒██████▓▓▓▓ ▓▓▓▓▓▓█░▒░▒░▒░▒░▒░▒");
	    System.out.println("█████▄▒░▒░▒░██░▒▒█████▓▓▓▓▓▓ ▓▓▓▓▓▓░░▒░▒░▒░▒░▒░");
	    System.out.println("▒░░▒░▒░▒░▒░▒██▒▒▒█████▓▓▓▓▓▓▓ ▓▓▓▓▓▓▒░▒░▒░▒░▒░▒");
	    System.out.println("▒░░▒░░░░▒░▒░██░▒▒████▓▓▓▓▓▓▓▓▓ ▓▓▓▓▓░▒░▒░▒░▒░▒░");
	    System.out.println("░░▒░▒░░▒░▒░▒██░▒▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░▒░▒░▒░▒░▒");
	    System.out.println("▒░░░▒░▒░▒░▒░██░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░▒░▒░▒░▒░");
	    System.out.println("░▒░▒░▒░▒░▒░▒██░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░▒░▒░▒░▒░▒");
	    System.out.println("▒░▒░▒░▒░▒░▒░███░▒▒─▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░▒░▒░▒░▒░");
	    System.out.println("░▒░▒░▒░▒░▒░▒███░▒──▒─▒▒─▓▓▓▓▓▓▓▓▓▓▓▒░▒░▒░▒░▒░▒");
	    System.out.println("▒░▒░▒░▒░▒░▒░████░──▒─▒▒─▓▓▓▓▓▓▓▓▓▓▒░▒░▒░▒░▒░▒░");
	    System.out.println("░▒░▒░▒░▒░▒░▒█████▒▒▒▒▒▒▒▒▒▒▒▒▒███░░▒░▒░▒░▒░▒░▒");
	    System.out.println("▒░▒░▒░▒░▒▒░░█████████▓▒▒▒▓██████░▒░░▒░▒░▒░▒░▒░");
	    System.out.println("░▒░▒░▒░▒░▒░░█████████████████████▓░▒░▒░▒░▒░░░▒");
	    System.out.println("▒░▒░▒░▒░▒▒░░██████▒░▒░▒░░░▒███████▓░▒░░░░░▒░▒░");
	    System.out.println("░▒░▒░▒░▒░░▒░░▒████▒░░▒░░░▒░▒░░█████░▒░▒░▒░▒░▒░");
	    System.out.println("▒░▒░▒▒░░▒▒░▒░░░████▒░░░░▒░░░░▒░███████████▄▒░▒");
	    System.out.println("░▒░▒░▒▄█████████████▒░░▒░▒░▒░▒░░░██████████▄▒░");
	    System.out.println("▒░▒░▒▄███████████▒░░░░▒░▒░▒░▒░▒░░░██████████▄▒");
	    System.out.println("░▒░▒░▄████████▓░▒░▒░░▒░▒░▒░▒░▒░▒░░░░████████▄▒");
	    System.out.println("░▒░░░▄██████░▒░▒░░▒░▒░▒░░▒░░▒░░▒░░▒░▒░░▒░▒▒░░▒");

	}
}
