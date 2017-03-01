// This program is to fuck. Haha, I'll be what I want ♥
package chapter6;
import java.util.Scanner;
import java.util.Random;
public class Ex6_39 {
	private static Random randomNumber = new Random();
	private static Scanner input = new Scanner(System.in);
	private static int rightAnswer = 0;
	private static int difficulty = -1;
	private static int operation = -1;
	static int executions = 0;
	public static void main(String[] args) {
		System.out.println("\tLearning to Mathematics Operations [Input 0 (zero) in difficulty level to exit]\n");
		while(difficulty <= 0) { // While loop to insert a valid difficulty value
			System.out.print("Insert the difficulty level\n\t1 - One digit values\n\t2 - Two digits values\n\tAnd it go away...\nWhat is your choice? "); 
			difficulty = input.nextInt(); 
			if(difficulty <= 0) System.out.println("\tInvalid try, you must insert a positive value!"); 
		} while(operation < 0 || operation > 5) { // While loop to insert a valid operation value
			System.out.print("Insert the operation ambient\n\t1 - Addition\n\t2 - Subtraction\n\t3 - Multiplication\n\t4 - Division\n\t5 - Aleatory combination of these operations\nWhat is your choice? "); 
			operation = input.nextInt(); 
			if(operation < 0 || operation > 5) System.out.println("\tInvalid try, you must insert a valid value!"); 
		} while(difficulty > 0 && operation > 0) {
			callOperation(operation); executions++; 
			if(executions % 10 == 0) { 
				if(rightAnswer > 7) 
					System.out.println("\t[" + rightAnswer + "/10 correct answers] Congratulations! You're ready to start next level.\n\tNow, let another person try this quiz.\n"); 
				else 
					System.out.println("\t[" + rightAnswer + "/10 correct answers] Ask your teacher to give more help at mathematic's content.\n\tNow, let another person try this quiz.\n"); rightAnswer = 0; difficulty = -1; 
					while(difficulty <= 0) { // While loop to insert a valid difficulty value
						System.out.print("Insert the difficulty level\n\t1 - One digit values\n\t2 - Two digits values\n\tAnd it go away...\nWhat is your choice? "); 
						difficulty = input.nextInt(); 
						if(difficulty < 0) 
							System.out.println("\tInvalid try, you must insert a positive value!"); 
					} operation = -1; 
					while(operation < 0 || operation > 5) { // While loop to insert a valid operation value 
						System.out.print("Insert the operation ambient\n\t1 - Addition\n\t2 - Subtraction\n\t3 - Multiplication\n\t4 - Division\n\t5 - Aleatory combination of these operations\nWhat is your choice? "); 
						operation = input.nextInt(); 
						if(operation < 0 || operation > 5) System.out.println("\tInvalid try, you must insert a valid value!"); 
					} 
			}
		} System.out.println("The program is shutting down.");
		input.close();
	}
	public static void callOperation(int op) {
		switch(op) {
		case 1: add(difficulty);		break;
		case 2: subtract(difficulty);	break;
		case 3: multiply(difficulty);	break;
		case 4: divide(difficulty);		break;
		case 5: int chooser = randomNumber.nextInt(3);
			switch(chooser) {
				case 0: add(difficulty);		break;
				case 1: subtract(difficulty);	break;
				case 2: multiply(difficulty);	break;
				case 3: divide(difficulty);		break;
			} 
		}
	}
	public static void add(int level) {
		int v1 = generateValues(level), v2 = generateValues(level), answer = 0;
		System.out.printf("\tHow much is %d plus %d? ", v1, v2); answer = input.nextInt();
		while(/*answer != 0 && */answer != (v1 + v2)) {
			wrongAnswer(); System.out.printf(" Try again, how much is %d plus %d? ", v1, v2); answer = input.nextInt();
		} correctAnswer(); rightAnswer++;
	}
	public static void subtract(int level) {
		int v1 = generateValues(level), v2 = generateValues(level), answer = 0;
		System.out.printf("\tHow much is %d minus %d? ", v1, v2); answer = input.nextInt();
		while(/*answer != 0 && */answer != (v1 - v2)) {
			wrongAnswer(); System.out.printf(" Try again, how much is %d minus %d? ", v1, v2); answer = input.nextInt();
		} correctAnswer(); rightAnswer++;
	}
	public static void divide(int level) {
		int v1 = generateValues(level), v2 = generateValues(level), answer = 0;
		System.out.printf("\tHow much is %d divided by %d? ", v1, v2); answer = input.nextInt();
		while(/*answer != 0 && */answer != (v1 / v2)) {
			wrongAnswer(); System.out.printf(" Stay on, it is an INTEGER DIVISION, so try again, how much is %d divided by %d? ", v1, v2); answer = input.nextInt();
		} correctAnswer(); rightAnswer++;
	}
	public static void multiply(int level) {
		int v1 = generateValues(level), v2 = generateValues(level);
		String strTime; if(v1 == 1) strTime = "time"; else strTime = "times"; int answer = 0;
		System.out.printf("\tHow much is %d %s %d? ", v1, strTime, v2); answer = input.nextInt();
		while(/*answer != 0 && */answer != (v1 * v2)) {
			wrongAnswer(); System.out.printf(" Try again, how much is %d %s %d? ", v1, strTime, v2); answer = input.nextInt();
		} correctAnswer(); rightAnswer++;
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
	public static int generateValues(int level) {
		/*int v1 = 0, v2 = 0, switchSignals = randomNumber.nextInt(8);
		while(v1 < Math.pow(10, level - 1)) v1 = randomNumber.nextInt((int) Math.pow(10, level) - 1) + 1;
		while(v2 < Math.pow(10, level - 1)) v2 = randomNumber.nextInt((int) Math.pow(10, level) - 1) + 1;
		switch(switchSignals) {
			case 0: v1 = -v1;
			case 1: v2 = -v2; break;
			case 2: v1 = -v1; break;
			case 3: v2 = -v2; break;
		}*/ // OLD CODE TO GENERATE A COUPLE OF VALUES, THEY CAN BE NEGATIVE OR POSITIVE, BOTH OR ONLY ONE OF THEM
		int value = 0, switchSignals = randomNumber.nextInt(4);
		while(value < Math.pow(10, level - 1)) value = randomNumber.nextInt((int) Math.pow(10, level) - 1) + 1;
		switch(switchSignals) {
		case 0: value = -value;
		} return value;
	}
}
