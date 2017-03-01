package chapter6;
import java.util.Scanner;
public class Ex6_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tCalculating distance between two points [Input all values as 0 (zero) to exit]\n");
		System.out.print("Insert the first x value: ");		double firstX = input.nextDouble();
		System.out.print("Insert the first y value: ");		double firstY = input.nextDouble();
		System.out.print("Insert the second x value: ");	double secondX = input.nextDouble();
		System.out.print("Insert the second y value: ");	double secondY = input.nextDouble();
		while(firstX != 0 || firstY != 0 || secondX != 0 || secondY != 0) {
			distance(firstX, firstY, secondX, secondY);
			System.out.print("Insert the first x value: ");		firstX = input.nextDouble();
			System.out.print("Insert the first y value: ");		firstY = input.nextDouble();
			System.out.print("Insert the second x value: ");	secondX = input.nextDouble();
			System.out.print("Insert the second y value: ");	secondY = input.nextDouble();
		}
		input.close();
	}
	public static void distance(double x1, double y1, double x2, double y2) {
		double distanceX = Math.abs(x1 - x2);
		double distanceY = Math.abs(y1 - y2);
		if(distanceX == 0)
			System.out.printf("The distance between the points is: %.2f\n", distanceY);
		else if(distanceY == 0)
			System.out.printf("The distance between the points is: %.2f\n", distanceX);
		else {
			System.out.printf("The distance between the points is: %.2f\n", Math.sqrt(distanceX * distanceX + distanceY * distanceY));
		} // System.out.printf("D(X): %.2f\nD(Y): %.2f\n", distanceX, distanceY);
	}
}
