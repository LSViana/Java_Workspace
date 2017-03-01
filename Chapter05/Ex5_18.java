// It just works until sixth month, but it's because a limit in the variable size
package chapter5;
import java.util.Scanner;
public class Ex5_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long amount, principal = 100000, rate = 105;
		System.out.printf("%s%20s \n", "Year", "Amount on deposit");
		for(int year = 1; year <= 10; year++) {
			amount = principal * power(100 + rate, year) / power(100, year);
			System.out.printf("%4d%,8d,%02d\n", year, amount / 100, amount % 100);
		}
		input.close();
	}
	public static long power(long number, long times) {
		long base = number;
		for(int i = 1; i < times; i++) {
			number *= base;
		} return number;
	}
}

// Additional
/*
	public static void main(String[] args) {
		double amount, principal = 1000.0, rate = 0.05;
		System.out.printf("%s%20s \n", "Year", "Amount on deposit");
		for(int year = 1; year <= 10; year++) {
			amount = principal * Math.pow(1.0 + rate, year);
			System.out.printf("%4d%,20.2f\n", year, amount);
		}
	}
 */
