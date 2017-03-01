package chapter6;
import java.util.Random;
public class Ex6_13 {
	public static void main(String[] args) {
		Random randomNumber = new Random();
		int number;
		System.out.println("\tGenerating Random Numbers in an Interval\n");
		System.out.println("\ta) 2, 4, 6, 8, 10");
/*L*///	for(int i = 0; i < 50; i++) { number = (randomNumber.nextInt(5) + 1) * 2;			System.out.printf("%4d ", number); } System.out.println();
/*D*/	for(int i = 0; i < 50; i++) { number = 2 + 2 * randomNumber.nextInt(5);				System.out.printf("%4d ", number); } System.out.println();
		System.out.println("\ta) 3, 5, 7, 9, 11");
/*L*///	for(int i = 0; i < 50; i++) { number = ((randomNumber.nextInt(5) + 1) * 2) + 1;		System.out.printf("%4d ", number); } System.out.println();
/*D*/	for(int i = 0; i < 50; i++) { number = 3 + 2 * randomNumber.nextInt(5);				System.out.printf("%4d ", number); } System.out.println();
		System.out.println("\tc) 6, 10, 14, 18, 22");
/*L*///	for(int i = 0; i < 50; i++) { number = ((randomNumber.nextInt(5) + 1) * 4) + 2;		System.out.printf("%4d ", number); } System.out.println(); 
/*D*/	for(int i = 0; i < 50; i++) { number = 6 + 4 * randomNumber.nextInt(5);				System.out.printf("%4d ", number); } System.out.println();
	}
}
