package chapter6;
import java.util.Random;
public class Ex6_12 {
	public static void main(String[] args) {
		Random randomNumber = new Random();
		int number;
		System.out.println("\tGenerating Random Numbers in an Interval\n");
		System.out.println("\ta) 1	<= n <= 2");
		for(int i = 0; i < 50; i++) { number = randomNumber.nextInt(2) + 0001;		System.out.printf("%4d ", number); } System.out.println();
		System.out.println("\tb) 1	<= n <= 100");
		for(int i = 0; i < 50; i++) { number = randomNumber.nextInt(100) + 0001;	System.out.printf("%4d ", number); } System.out.println();
		System.out.println("\tc) 0	<= n <= 9");
		for(int i = 0; i < 50; i++) { number = randomNumber.nextInt(10) + 0000;		System.out.printf("%4d ", number); } System.out.println();
		System.out.println("\td) 1000	<= n <= 1112");
		for(int i = 0; i < 50; i++) { number = randomNumber.nextInt(113) + 1000;	System.out.printf("%4d ", number); } System.out.println();
		System.out.println("\te) -1	<= n <= 1");
		for(int i = 0; i < 50; i++) { number = randomNumber.nextInt(3) - 1;			System.out.printf("%4d ", number); } System.out.println();
		System.out.println("\tf) -3	<= n <= 11");
		for(int i = 0; i < 50; i++) { number = randomNumber.nextInt(15) - 3;		System.out.printf("%4d ", number); } System.out.println();
	}
}
