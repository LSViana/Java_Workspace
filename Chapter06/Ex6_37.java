package chapter6;
import java.util.Scanner;
import java.util.Random;
public class Ex6_37 {
	private static Random randomNumber = new Random();
	private static Scanner input = new Scanner(System.in);
	private static int rightAnswer = 0;
	static int executions = 1;
	public static void main(String[] args) {
		System.out.println("\tLearning to Multiply [Input 0 (zero) to exit]\n");
			while(multiply(executions) == 1) {
				executions++; if(executions % 10 == 0) { if(rightAnswer > 7) System.out.println("\tCongratulations! You're ready to start next level.\n\tNow, let another person try this quiz.\n"); else System.out.println("\tAsk your teacher to give more help at mathematic's content.\n\tNow, let another person try this quiz.\n"); rightAnswer = 0; }
			}
		input.close();
	}
	public static int multiply(int counter) {
		int v1 = randomNumber.nextInt(10 * counter) + 1;
		int v2 = randomNumber.nextInt(10 * counter) + 1;
		String strTime; if(v1 == 1) strTime = "time"; else strTime = "times"; int answer = 0;
		System.out.printf("\tHow much is %d %s %d? ", v1, strTime, v2); answer = input.nextInt();
		while(/*answer != 0 && */answer != (v1 * v2)) {
			wrongAnswer(); System.out.printf(" Try again, how much is %d %s %d? ", v1, strTime, v2); answer = input.nextInt();
		} correctAnswer(); rightAnswer++; return 1;
	}
	public static void correctAnswer() {
		int choice = randomNumber.nextInt(4);
		switch(choice) {
		case 0: System.out.print("Very good!"); break;
		case 1: System.out.print("Excellent!"); break;
		case 2: System.out.print("Nice work!"); break;
		case 3: System.out.print("Keep up the good work!"); break;
		} System.out.println();
	}
	public static void wrongAnswer() {
		rightAnswer--;
		int choice = randomNumber.nextInt(4);
		switch(choice) {
		case 0: System.out.print("No."); break;
		case 1: System.out.print("Wrong. Try once more!"); break;
		case 2: System.out.print("Don't give up!"); break;
		case 3: System.out.print("No. Keep trying."); break;
		}
	}
}
