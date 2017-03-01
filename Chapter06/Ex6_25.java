package chapter6;
import java.util.Scanner;
public class Ex6_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tCalculating Prime Numbers [Input 0 (zero) to exit]\n");
		System.out.println("\t1 - Input a manual number\n\t2 - Input automatic values\n\t3 - Input automatic values optimized");
		int choose = input.nextInt();
		while(choose != 0) {
			if(choose == 1) {
				System.out.print("Type a value to test: ");
				int value = input.nextInt(); 
				while(value != 0) {
					isPrimeManual(value);
					System.out.print("Type a value to test: ");
					value = input.nextInt();
				} choose = 0;
			} else if(choose == 2) {
				for(int i = 1; i <= 1000; i++)
					isPrimeAutomatic(i);
				choose = 0;
			} else if(choose == 3) {
				for(int i = 1; i <= 1000; i++)
					isPrimeAutomaticOpt(i);
				choose = 0;
			} else {
				System.out.println("Invalid input. Try again!");
				choose = input.nextInt();
			}
		}
		input.close();
	}
	public static void isPrimeManual(int number) {
		int valid = 0;
		for(int i = 1; i <= number / 2; i++) {
			if(number % i == 0)
				valid++;
		} valid++;
		if(valid == 2)
			System.out.printf("The value %d is prime.\t\tNumber of divisors %d\n", number, valid);
		else
			System.out.printf("The value %d isn't prime.\t\tNumber of divisors %d\n", number, valid);
	}
	public static void isPrimeAutomatic(int number) {
		int valid = 0;
		for(int i = 1; i <= number / 2; i++) {
			if(number % i == 0)
				valid++;
		} valid++;
		if(valid == 2)
			System.out.println(number);
	}
	public static void isPrimeAutomaticOpt(int number) { // This way to calculate if a number is prime is faster than another way that uses as the superior limit the half of the number
		int valid = 0;
		for(int i = 1; i <= Math.sqrt(number); i++) {
			if(number % i == 0)
				valid++;
		} valid++;
		if(valid == 2)
			System.out.println(number);
	}
}
