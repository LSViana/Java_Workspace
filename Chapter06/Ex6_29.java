package chapter6;
import java.util.Scanner;
import java.util.Random;
public class Ex6_29 {
	public static Random randomNumber = new Random();
	enum Coin { HEAD, TAILS };
	public static void main(String[] args) {
		int head = 0, tails = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("\tTossing a Coin\n"); int choose = 1/*, controller = 0*/;
		while(choose == 1/* && controller < 1000*/) {
			// controller++;
			showMenu(); choose = input.nextInt();
			if(choose == 1) {
				if(flip() == Coin.HEAD) {
					System.out.println("HEAD!!!");
					head++;
				} else {
					System.out.println("TAILS!!!");
					tails++;
				}
				System.out.printf("Head flipped: %3d - Tails flipped: %3d\n\n", head, tails);
			}
		} System.out.println("The game is being terminated.");
		input.close();
	}
	public static void showMenu() {
		System.out.printf("\t1\t\t- Toss a coin\n\tAnother number\t- Leave the game\nEnter your choice: ");
	}
	public static Coin flip() {
		Coin coinFlipped;
		if(randomNumber.nextInt(2) == 1)
			coinFlipped = Coin.HEAD;
		else
			coinFlipped = Coin.TAILS;
		return coinFlipped;
	}
}
