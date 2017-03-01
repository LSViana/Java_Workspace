package chapter4;
import java.util.Scanner;
public class Ex4_24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//
		int passes = 0, failures = 0, studentCounter = 1, result;
		while (studentCounter <= 10) {
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			result = input.nextInt();
			
			if (result == 1)
				passes++;
			else if (result == 2)
				failures++;
			else
				studentCounter--;
			studentCounter++;
		}
		System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);
		if (passes > 8)
			System.out.println("Bonus to instructor!");
		//
		input.close();
	}
}

// Addittional
/*	
	Figure FOUR dot TWELVE (4.12)

		int passes = 0; failures = 0, studentCounter = 1, result;
		
		while (studentCounter <= 10) {
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			result = input.nextInt();
			
			if (result == 1)
				passes++;
			else
				failures++;
			studentCounter++;
		}
		System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);
		if (passes > 8)
			System.out.println("Bonus to instructor!");
	 
 */
