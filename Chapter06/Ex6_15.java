package chapter6;
import java.util.Scanner;
public class Ex6_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tCalculating Hypotenuse (Enter 0 [zero] to exit)\n");
		double side1 = 1, side2 = 1;
		while(side1 != 0) {
			System.out.print("Digite a medida do lado 1: "); side1 = input.nextDouble(); 
			if(side1 > 0) {
				side2 = 1;
				while(side2 != 0) {
					System.out.print("Digite a medida do lado 2: "); side2 = input.nextDouble();
					if(side2 > 0) {
						System.out.printf("\tA medida da hipotenusa é de: %f\n", hypotenuse(side1, side2)); side2 = 0;
					} else if(side2 == 0) {
						System.out.println("A aplicação está sendo encerrada.");
						side1 = 0;
					} else {
						System.out.println("Medida inválida.");
					}
				}
			} else if(side1 == 0) {
				System.out.println("A aplicação está sendo encerrada.");
			} else {
				System.out.println("Medida inválida.");
			}
		}
		input.close();
	}
	public static double hypotenuse(double s1, double s2) {
		/*double hyp = */ return Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));
		/*return hyp;*/
	}
}
