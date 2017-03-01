package chapter6;
import java.util.Scanner;
import java.util.Random;
public class Ex6_35 {
	private static Random randomNumber = new Random();
	private static Scanner input = new Scanner(System.in);
	static int executions = 1;
	public static void main(String[] args) {
		System.out.println("\tLearning to Multiply [Input 0 (zero) to exit]\n");
		while(multiply(executions) == 1) { executions++; }
		input.close();
	}
	public static int multiply(int counter) {
		int v1 = randomNumber.nextInt(10 * counter) + 1;
		int v2 = randomNumber.nextInt(10 * counter) + 1;
		String strTime; if(v1 == 1) strTime = "time"; else strTime = "times"; int answer = 0;
		System.out.printf("\tHow much is %d %s %d? ", v1, strTime, v2); answer = input.nextInt();
		while(answer != 0 && answer != (v1 * v2)) {
			System.out.printf("Oh, you've made a mistake! Try again, how much is %d %s %d? ", v1, strTime, v2); answer = input.nextInt();
		} if(answer == (v1 * v2)) { System.out.println("Alright! You were amazing, congratulations!"); return 1; }
		else { System.out.print("The program is shutting down."); return 0; }
	}
}
