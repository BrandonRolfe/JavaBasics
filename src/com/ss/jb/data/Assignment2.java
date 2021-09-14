/**
 * Allows the user to take 5 guesses at a random number
 * 
 */
package com.ss.jb.data;

/**
 * @author brandon
 *
 */
public class Assignment2 {

	/**
	 * @param args
	 */
	
	// Constant bounds for the guessing range
	final static int UPPERBOUND = 100; // used for number generation and output
	final static int LOWERBOUND = 1;   // only used for output
	
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		long randSeed = System.currentTimeMillis();
		java.util.Random RNG = new java.util.Random(randSeed);
		int chosenRandom;		 // Random number chosen by the computer
		int numberOfGuesses = 5; // Number of guesses allowed from the user
		int userGuess;			 // User guess

		// Generated the computer's non-zero random number
		do
		{
			chosenRandom = RNG.nextInt(UPPERBOUND);
		}while(chosenRandom == 0);
		
		// Gives the guessing range and the number of guesses available
		System.out.println("The computer has chosen a number between " + LOWERBOUND + " and " + UPPERBOUND + ".");
		System.out.println("You have " + numberOfGuesses + " guess(es).\n");
		
		// Receives a guess
		System.out.print("Take a guess: ");
		userGuess = input.nextInt();
		
		// Loops while the guess is too far from the computer's number
		while((userGuess - chosenRandom) < -10 || (userGuess - chosenRandom) > 10)
		{
			// States the outcome of the guess
			System.out.println("Not Close enough.");
			if(userGuess < LOWERBOUND || userGuess > UPPERBOUND)
			{
				System.out.println("(Your guess wasn't even in the range)");
			}
			
			// Tracks the number of guesses left
			// Breaks if out of guesses
			numberOfGuesses--;
			if(numberOfGuesses <= 0)
			{
				break;
			}
			
			// States the number of guesses left
			System.out.println("You have " + numberOfGuesses + " guess(es) left.\n");
			
			// Gets the next guess
			System.out.print("Guess again: ");
			userGuess = input.nextInt();
		};
		
		// If all guesses have been used
		if(numberOfGuesses <= 0)
		{
			System.out.println("You are out of guesses. Sorry.\n");
		}
		// if the number was guessed exactly
		else if(userGuess == chosenRandom)
		{
			System.out.println("You guessed it exactly!");
			System.out.println("You had " + (numberOfGuesses - 1) + " extra guess(es) left.\n");
		}
		// if the number was guessed close enough
		else
		{
			System.out.println("Close enough.");
			System.out.println("You had " + (numberOfGuesses - 1) + " extra guess(es) left.\n");
		}
		
		// States the computer's number regardless of the outcome
		System.out.println("The computer's number was " + chosenRandom + ".\n\n\n");
	}
}
