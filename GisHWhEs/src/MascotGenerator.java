// Megan Holmberg

// This program generates random mascots for an
// item in GisHWhEs 2015

import java.util.*;

public class MascotGenerator {
	public static void main(String[] args) {
		//get a random number generator
		Random rand = new Random();
		//create a scanner to read keyboard input
		Scanner keyboard = new Scanner(System.in);
		//set the number of options
		int options = 21;
		
		//list the full animal names
		String[] animal = {"elephant", "octopus", "dinosaur", 
				"dust mite", "wolf", "rooster", "fog falcon", 
				"rat", "kangaroo", "monkey", "skunk", "buffalo", 
				"porcupine", "parrot", "alligator", "beaver", 
				"caterpillar", "dogfish", "fox", "dragon", "baboon"};
		//list just the first parts
		String[] first = {"ele", "oct", "dino", "dust", "w", "roo", 
				"fog", "rat", "kanga", "mon", "sku", "buff", "porcu", 
				"par", "alli", "bea", "cat", "dog", "f", "drag", "bab"};
		//list just the last parts
		String[] last = {"phant", "opus", "saur", "mite", "olf", "ooster", 
				"falcon", "rat", "roo", "key", "unk", "alo", "pine", 
				"rot", "gator", "ver", "erpillar", "fish", "ox", "gon", "boon"};
		
		//make new ones
		do {
			//pick the first animal half
			int firstChoice = rand.nextInt(options);
			//pick the second animal half and make sure they don't match
			int secondChoice = rand.nextInt(options);
			while(firstChoice == secondChoice) {
				secondChoice = rand.nextInt(options);
			}
			
			//print out the results
			System.out.println("The randomly generated mascot is a: ");
			System.out.println(first[firstChoice] + last[secondChoice]);
			System.out.println("This is a(n) " + animal[firstChoice] + 
					" and a(n) " + animal[secondChoice]);
			
			//check if the user wants to play again
		} while(playAgain(keyboard));
		
	}
	
	public static boolean playAgain(Scanner keyboard) {
		//ask if user wants to play again
		System.out.println();
		System.out.println("Do you want to try again? (Y|N)");
		
		//set the first character of the users response to uppercase
		char ch = keyboard.next().toUpperCase().charAt(0);
		System.out.println();
		
		//true if user enters Y
		return ch=='Y';
	}
}
