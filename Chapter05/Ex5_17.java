package chapter5;
import java.util.Scanner;
public class Ex5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tSELL CALCULATOR [Enter 0 to exit]\n");
		double total = 0.0, price = 0, p1 = 2.98, p2 = 4.5, p3 = 9.98, p4 = 4.49, p5 = 6.87; int choice = -1, quantity = 0;
		System.out.printf(" PRODUCT'S PRICES\n\n%s%.2f\n%s%.2f\n%s%.2f\n%s%.2f\n%s%.2f\n\n", "Product 1: US$", p1, "Product 2: US$", p2, "Product 3: US$", p3, "Product 4: US$", p4, "Product 5: US$", p5);
		while(choice != 0) {
			System.out.print("Enter the product code: "); choice = input.nextInt();
			if(choice != 0) {
				System.out.print("Enter the quantity of products: "); quantity = input.nextInt();
				if(quantity != 0) {
					switch (choice) {
					case 1: price = p1; break;
					case 2: price = p2; break;
					case 3: price = p3; break;
					case 4: price = p4; break;
					case 5: price = p5; break;
					default: System.out.println("Invalid product code.");
					}
					for(int i = 0; i < quantity; i++)
						total += price;
				} else
					choice = 0;
			}
		}
		System.out.printf("\nTotal of sells: US$%.2f", total);
		input.close();
	}
}
