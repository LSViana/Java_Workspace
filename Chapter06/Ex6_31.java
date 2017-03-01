package chapter6;
import java.util.Scanner;
import java.util.Random;
public class Ex6_31 {
	public static Random randomNumber = new Random();
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("\tGuessing Randomic Numbers [Input 0 (zero) to exit]\n");
		int choice = 1;
		while(choice != 0) {
			showMenu(); choice = input.nextInt();
			if(choice == 1)
				guessNumber();
			else if(choice != 0)
				System.out.println("Invalid input, try again!");
		}
		input.close();
	}
	public static void showMenu() {
		System.out.printf("\t0 - Leave the game\n\t1 - Guess a randomic number\nInput your choice: ");
	}
	public static void guessNumber() {
		int value = randomNumber.nextInt(1000) + 1, tries = 0;
		System.out.print("Enter your try: "); int userTry = input.nextInt();
		while(userTry != value) {
			if(userTry < value) {
				System.out.println("Too low, try again!"); tries++;
			} else if(userTry > value) {
				System.out.println("Too high, try again!"); tries++;
			}
			System.out.print("Enter your try: "); userTry = input.nextInt();
		} System.out.print("Congratulations! You guessed the number. ");
		if(tries < 10)
			System.out.printf("Either you know the secret or you got lucky! %d\n\n", tries);
		else if(tries == 10)
			System.out.printf("Aha! You know the secret! %d\n\n", tries);
		else
			System.out.printf("You should be able to do better! %d\n\n", tries);
	}
}
