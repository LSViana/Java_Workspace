package chapter6;
import java.util.Scanner;
import java.util.Random;
public class Ex6_33 {
	protected static enum Status { CONTINUE, WON, LOST }; // 'ENUM' to define states to a Status variable
	private static final Random randomNumber = new Random(); // It could be declared as a 'FINAL' reference variable / object.
	private static double bankBalance = 1000.0; // The balance of the player
	private static final int SNAKE_EYES = 2, TREY = 3, SEVEN = 7, YO_LEVEN = 11, BOX_CARS = 12; // The values to define the game rules
	public static void main(String[] args) {
		Ex6_33 game = new Ex6_33();
		Scanner input = new Scanner(System.in);
		System.out.println("\tCraps Modificated Game [Input 0 (zero) to exit]\n");
		double wager = 1.0;
		while(bankBalance > 0 && wager != 0) {
			game.showBankBalance();
			System.out.print("Insert your wager: "); wager = input.nextDouble(); 
			if(wager > 0 && wager <= bankBalance) {
				if(game.play() == 1)
					bankBalance += wager;
				else
					bankBalance -= wager;
			} else if(wager!= 0)
				System.out.print("Invalid value to wager, try again! ");
			else
				System.out.print("Alright, you've chosen to let us alone, goodbye! ");
		} game.showBankBalance(); System.out.println("The game is over.");
		input.close();
	}
	public void showBankBalance() {
		System.out.printf("Your bank balance: US$%.2f\n", bankBalance);
	}
	public int play() {
		int myPoint = 0;
		Status gameStatus;
		int sumOfDice = rollDice();
		switch(sumOfDice) {
		case SEVEN:
		case YO_LEVEN: gameStatus = Status.WON; break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS: gameStatus = Status.LOST; break;
		default: gameStatus = Status.CONTINUE; myPoint = sumOfDice; System.out.printf("Point is %d\n", myPoint);
		}
		while(gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();
			if(sumOfDice == myPoint)
				gameStatus = Status.WON;
			else if(sumOfDice == SEVEN)
				gameStatus = Status.LOST;
		}
		if(gameStatus == Status.WON) {
			System.out.println("Player wins");
			goodChat();
			return 1;
		} else {
			System.out.println("Player loses");
			badChat();
			return 0;
		}
	}
	public int rollDice() {
		int die1 = 1 + randomNumber.nextInt(6), die2 = 1 + randomNumber.nextInt(6), sum = die1 + die2;
		System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);
		return sum;
	}
	public void goodChat() {
		int choice = randomNumber.nextInt(3);
		if(choice == 0)
			System.out.println("\tAw c'mon, take a chance!");
		else if(choice == 1)
			System.out.println("\tHey, homeboy, have a good luck!");
		else
			System.out.println("\tYou're up big. Now's the time to cash in your chips!");
	}
	public void badChat() {
		int choice = randomNumber.nextInt(3);
		if(choice == 0)
			System.out.println("\tOh, you're going for broke, huh!?");
		else if(choice == 1)
			System.out.println("\tDoes it seem something bad, baby?");
		else
			System.out.println("\tIt could be worst, or not?");
	}
}