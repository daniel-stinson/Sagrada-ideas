import java.util.Scanner;

public class structure_of_game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//for (int diceRolls = 1; diceRolls <= 5; diceRolls++) {
		//rollDice();
		//}
		
		
		// Start Game
		System.out.print("Do you want to play new game? Press 1 to play, or 2 to quit: ");
		int newGame = input.nextInt();
		System.out.println("\n");
		
		// Play new game or quit
		if (newGame == 1) {
			System.out.println("Welcome to the game of Segrada.");
			System.out.println("\n");
		} else {
			System.out.println("Please play again soon.");
			System.exit(1);
		}
		
		// Get Player names
		// Player 1
		System.out.print("Player one, please enter your name: ");
		String player1 = input.nextLine();
		// Player 2
		System.out.print("Player two, please enter your name: ");
		String player2 = input.nextLine();
		
		System.out.println("\n");
		System.out.println("Player 1 is " + player1);
		System.out.println("Player 2 is " + player2);
		System.out.println("\n");
		
		// Game Loop
		// 10 rounds
		for(int gameRound = 1; gameRound <= 10; gameRound++) {
			
			// Roll the dice 5 times
			System.out.println("Round " + gameRound);
				for (int diceRolls = 1; diceRolls <= 5; diceRolls++) {
				rollDice();
			}
			// Determines player order
			if (gameRound % 2 == 0) {
				System.out.println("");
				System.out.println(player2 + "\'s turn");
				System.out.println("");
				System.out.println(player2 + " please choose your die.");
				// Player 2 uses selectDice method
				System.out.println(player2 + " please place your die.");
				// Player 2 uses placeDice method
				System.out.println(player2 + " has placed their die.");
				System.out.println("");
				
				System.out.println(player1 + "\'s turn");
				System.out.println("");
				System.out.println(player1 + " please choose your die.");
				// Player 1 uses selectDice method
				System.out.println(player1 + " please place your die.");
				// Player 1 uses placeDice method
				System.out.println(player1 + " has placed their die.");
				System.out.println("");
				
				System.out.println(player1 + "\'s turn");
				System.out.println("");
				System.out.println(player1 + " please choose your die.");
				// Player 1 uses selectDice method
				System.out.println(player1 + " please place your die.");
				// Player 1 uses placeDice method
				System.out.println(player1 + " has placed their die.");
				System.out.println("");
				
				System.out.println(player2 + "\'s turn");
				System.out.println("");
				System.out.println(player2 + " please choose your die.");
				// Player 2 uses selectDice method
				System.out.println(player2 + " please place your die.");
				// Player 2 uses placeDice method
				System.out.println(player2 + " has placed their die.");
				System.out.println("");
				System.out.println("\n");
			} 
			else {
				System.out.println(player1 + "\'s turn");
				System.out.println("");
				System.out.println(player1 + " please choose your die.");
				// Player 1 uses selectDice method
				System.out.println(player1 + " please place your die.");
				// Player 1 uses placeDice method
				System.out.println(player1 + " has placed their die.");
				System.out.println("");
				
				System.out.println(player2 + "\'s turn");
				System.out.println("");
				System.out.println(player2 + " please choose your die.");
				// Player 2 uses selectDice method
				System.out.println(player2 + " please place your die.");
				// Player 2 uses placeDice method
				System.out.println(player2 + " has placed their die.");
				System.out.println("");
				
				System.out.println(player2 + "\'s turn");
				System.out.println("");
				System.out.println(player2 + " please choose your die.");
				// Player 2 uses selectDice method
				System.out.println(player2 + " please place your die.");
				// Player 2 uses placeDice method
				System.out.println(player2 + " has placed their die.");
				System.out.println("");
				
				System.out.println(player1 + "\'s turn");
				System.out.println(player1 + " please choose your die.");
				// Player 1 uses selectDice method
				System.out.println(player1 + " please place your die.");
				// Player 1 uses placeDice method
				System.out.println(player1 + " has placed their die.");
				System.out.println("");
				System.out.println("\n");
			}
		}
		
		// Game rounds are over, proceed to score points
			// This will be changed to a tally, not a random number
		int player1Score = (int) (Math.random() * 21);
		int player2Score = (int) (Math.random() * 21);
		
		
		// Declare winner and total points scored for each player
		System.out.println("The game has concluded. Here are the scores.");
		System.out.println(player1 + " has " + player1Score + " points.");
		System.out.println(player2 + " has " + player2Score + " points.");
		if(player1Score > player2Score) {
			System.out.println(player1 + " wins!");
		} else if (player2Score > player1Score) {
			System.out.println(player2 + " wins!");
		} else {
			System.out.println(player1 + " and " + player2 + " have tied!");
		}
		
		// Ends game
		System.exit(1);
		
	}
	
	// Methods used, approximately in order used
	
	// Selects game board
	public static void selectBoard() {
		
	}
	
	// Selects the dice to be rolled and rolls the dice (Will roll dice from a total pool of dice eventually)
	public static void rollDice() {
		System.out.print("The dice that is rolled is a: ");
		System.out.println((int)(Math.random() * 6 + 1));
	}
	
	// Removes the dice from total pool
	public static void removeTotalDice() {
		
	}
	
	// Selects the dice to be placed on the board 
	public static void selectDice() {
		
	}
	
	// Removes the dice from the pool of the ones rolled
	public static void removeRolledDice() {
		
	} 
	
	// Places dice on chosen spot
	public static void placeDice() {
		
	}

}
