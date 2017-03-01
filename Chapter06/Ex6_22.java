// Solve the next() and nextLine() bugs, t1hey are making me crazy. :P
// The program is working fine, but the bug wasn't solved yet.
package chapter6;
import java.util.Scanner;
public class Ex6_22 {
	// My try
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tConverting Fahrenheit and Celsius Temperatures [Input 0 (zero) to exit]\nInput the letter 'F' or 'C' to identify the temp. scale and the temp. value\n");
		double temp; char scale = ' ';
		while(scale != '0') {
			System.out.print("Input the scale letter:\t"); scale = input.next().charAt(0); scale = Character.toUpperCase(scale);
			if(scale == 'F') {
				System.out.print("Input the temp. value:\t"); temp = input.nextDouble();
				//System.out.printf("\tThe Fahrenheit temperature %.2fºF in Celsius scale is: %.2fºC\n", temp, 5.0 / 9.0 * (temp - 32));
				System.out.printf("\tFahrenheit [%.2fºF] in Celsius [%.2fºC]\n", temp, 5.0 / 9.0 * (temp - 32)); // input.nextLine();
				System.out.println("Value of scale → " + scale);
			} else if(scale == 'C') {
				System.out.print("Input the temp. value:\t"); temp = input.nextDouble();
				//System.out.printf("\tThe Celsius temperature %.2fºF in Fahrenheit scale is: %.2fºC\n", temp, 9.0 / 5.0 * temp + 32);
				System.out.printf("\tCelsius [%.2fºF] in Fahrenheit [%.2fºC]\n", temp, 9.0 / 5.0 * temp + 32); // input.nextLine();
				System.out.println("Value of scale → " + scale);
			} else {
				System.out.println("Invalid letter scale, try again or enter 0 (zero) to exit!");
			}
		} System.out.println("The application is exiting. → " + scale); 
		input.close();
	}
	// Try of Deitel
	public static void mainTwo(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tConverting Fahrenheit and Celsius Temperatures [Input 0 (zero) to exit]\nInput the letter 'F' or 'C' to identify the temp. scale and the temp. value\n");
		double temp;
		System.out.print("Input the scale letter:\t"); char scale = input.next().charAt(0); scale = Character.toUpperCase(scale);
		while(scale != '0') {
			System.out.print("Input the scale letter:\t"); scale = input.next().charAt(0); scale = Character.toUpperCase(scale);
			if(scale == 'F') {
				System.out.print("Input the temp. value:\t"); temp = input.nextDouble();
				//System.out.printf("\tThe Fahrenheit temperature %.2fºF in Celsius scale is: %.2fºC\n", temp, 5.0 / 9.0 * (temp - 32));
				System.out.printf("\tFahrenheit [%.2fºF] in Celsius [%.2fºC]\n", temp, 5.0 / 9.0 * (temp - 32));
			} else if(scale == 'C') {
				System.out.print("Input the temp. value:\t"); temp = input.nextDouble();
				//System.out.printf("\tThe Celsius temperature %.2fºF in Fahrenheit scale is: %.2fºC\n", temp, 9.0 / 5.0 * temp + 32);
				System.out.printf("\tCelsius [%.2fºF] in Fahrenheit [%.2fºC]\n", temp, 9.0 / 5.0 * temp + 32);
			} else {
				System.out.println("Invalid letter scale, try again or enter 0 (zero) to exit!");
				System.out.print("Input the scale letter:\t"); scale = input.next().charAt(0); scale = Character.toUpperCase(scale);
			}
		} System.out.println("The application is exiting."); 
		input.close();
	}
}