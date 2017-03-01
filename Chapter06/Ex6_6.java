package chapter6;
import java.util.Scanner;
public class Ex6_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tCalculating the Sphere Volume\n");
		System.out.print("Make an input with sphere's radius: ");
		double radius = input.nextDouble();
		System.out.printf("\nThe sphere volume is %f u.m.².", sphereVolume(radius));
		input.close();
	}
	public static double sphereVolume(double radius) {
		return ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
	}
}
