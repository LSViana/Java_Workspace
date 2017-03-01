package chapter5;
import java.util.Scanner;
public class Ex5_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tTHE FAIRTAX IN UNITED STATES - O IMPOSTO JUSTO NOS ESTADOS UNIDOS [Insert names without spaces and values with only numbers]\n");
		System.out.print("Enter the quantity of information to be inserted (Enter '0' to exit): "); int quantity = input.nextInt();
		if (quantity > 0) {
		double[] value = new double[quantity]; String[] name = new String[quantity]; double total = 0;
		for(int i = 1; i <= quantity; i++) {
			System.out.print("\nEnter the name of the service: "); name[i - 1] = input.next();
			System.out.print("Enter the cost of the service: "); value[i - 1] = input.nextDouble(); total += value[i - 1];
		} System.out.println("\nThe resume of information: ");
		for(int i = 1; i <= quantity; i++) {
			System.out.printf("[%d] %-15s → US$%.2f\n", i, name[i - 1], value[i - 1]);
		} System.out.printf("\n%-27sUS$%.2f\n%-27sUS$%.2f\n%-27sUS$%.2f\n\nWe see you!", "Total cost of services: ", total, "Total FairTax: ", total * 0.23, "Total value without taxes: ", total * 0.77);
		} System.out.print("\nAlright, you still can do it after!\n\nWe see you!");
		input.close();
	}
}
