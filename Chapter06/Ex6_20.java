package chapter6;
import java.util.Scanner;
public class Ex6_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tCalculating Circle Area [Input 0 (zero) to exit]\n");
		System.out.println("Input the circle radius: ");
		double radius = input.nextDouble();
		while(radius != 0) {
			if(radius < 0)
				System.out.println("Invalid value, please, try again!");
			else {
				System.out.printf("The circle area is: %.3f u.m.²\n", circleArea(radius));
			}
			System.out.println("Input the circle radius: ");
			radius = input.nextDouble();
		}
		input.close();
	}
	public static double circleArea(double r) {
		return (Math.PI * r * r);
	}
}
