// My Craps (Without Enumerations)
/*package playground;
import java.util.Random;
public class Craps {
	int a;
	static Craps objCraps = new Craps();
	/*public static void main(String[] args) {
		Craps c = new Craps();
		System.out.println(c.objCraps);
		System.out.println(c.a);
		c.a = 1;
		System.out.println(c.a);
		System.out.println(c.objCraps);
		c.objCraps = new Craps();
		System.out.println(c.objCraps);
		c.objCraps.a = 1;
		System.out.println(c.objCraps.a);
		//c.objCraps = new Craps();
		System.out.println(c.objCraps);
		System.out.println(c.objCraps.objCraps);
		System.out.println(c.objCraps.objCraps.objCraps);
		System.out.println(c.objCraps.objCraps.objCraps.objCraps);
		System.out.println(c.objCraps.objCraps.objCraps.objCraps.objCraps);
		System.out.println(c.objCraps.objCraps.objCraps.objCraps.objCraps.objCraps);
	}
	public void play() {
		System.out.println("\tWELCOME TO CRAPS GAME\n");
		int sum = rollDice(), state, score = 0;
		switch(sum) {
			case 7: case 11:
				state = 1;  break;// State equals 1 means WON
			case 2: case 3: case 12:
				state = 0; break;// State equals 0 means LOST
			default:
				state = 2; score = sum; System.out.printf("Player score: %d\n", score); // State equals 2 means CONTINUE
		}
		if(state == 1)
			System.out.println("Player won, congratulations!");
		else if(state == 0)
			System.out.println("Player lose, try again!");
		else {
			while(state == 2) {
				sum = rollDice();
				if(sum == score) {
					state = 1;
					System.out.println("Player won, congratulations!");
				} else if(sum == 7) {
					state = 0;
					System.out.println("Player lose, try again!");
					}
			}
		}
	}
	public static int rollDice() {
		Random randomNumber = new Random();
		int n1 = 1 + randomNumber.nextInt(6), n2 = 1 + randomNumber.nextInt(6);
		System.out.printf("Numbers - %d + %d = %d\n", n1, n2, n1 + n2);
		return n1 + n2;
	}
}*/
// Deitel Craps (With Enumerations)
package playground;
import java.util.Random;
public class Craps {
	protected static enum Status { CONTINUE, WON, LOST }; // 'ENUM' to define states to a Status variable
	private static final Random randomNumber = new Random(); // It could be declared as a 'FINAL' reference variable / object.
	private static final int SNAKE_EYES = 2, TREY = 3, SEVEN = 7, YO_LEVEN = 11, BOX_CARS = 12; // The values to define the game rules
	public void play() {
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
		if(gameStatus == Status.WON)
			System.out.println("Player wins");
		else
			System.out.println("Player loses");
	}
	public int rollDice() {
		int die1 = 1 + randomNumber.nextInt(6), die2 = 1 + randomNumber.nextInt(6), sum = die1 + die2;
		System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);
		return sum;
	}
}