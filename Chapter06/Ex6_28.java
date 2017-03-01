package chapter6;
import java.util.Scanner;
public class Ex6_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tCalculating Quality Points of an Average [Input -1 (negative one) to exit]\n");
		System.out.print("Input an average: "); int average = input.nextInt();
		while(average != -1) {
			if(average >= 0 && average <= 100) {
				System.out.printf("The quality point of the average %d is: %d\n", average, qualityPoints(average));
			} else 
				System.out.println("Invalid average, try again!");
			System.out.print("Input an average: "); average = input.nextInt();
		} System.out.println("The application is exiting.");
		input.close();
	}
	public static int qualityPoints(int avg) {
		if(avg >= 90)
			return 4;
		else if(avg >= 80)
			return 3;
		else if(avg >= 70)
			return 2;
		else if(avg >= 60)
			return 1;
		else
			return 0;
	}
}
