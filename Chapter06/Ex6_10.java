package chapter6;
import java.util.Scanner;
public class Ex6_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tArrendondando inteiros para casas decimais e inteiras mais próximas (Digite zero para sair)\n");
		System.out.print("Digite o valor para arredondar: ");
		double value = input.nextDouble();
		while(value != 0.0) {
			System.out.printf("Valor original:\t\t%f\nValor inteiro:\t\t%f\nValor decimal:\t\t%f\nValor centesimal:\t%f\n\n", value, roundToInteger(value), roundToTenths(value), roundToHundredths(value), roundToThousandths(value));
			System.out.print("Digite o valor para arredondar: ");
			value = input.nextDouble();	
		} System.out.println("A aplicação está encerrando.");
		input.close();
	}
	public static double roundToInteger(double number) {
		return Math.floor(number + 0.5);
	}
	public static double roundToTenths(double number) {
		return Math.floor(number * 10 + 0.5) / 10;
	}
	public static double roundToHundredths(double number) {
		return Math.floor(number * 100 + 0.5) / 100;
	}
	public static double roundToThousandths(double number) {
		return Math.floor(number * 1000 + 0.5) / 1000;
	}
}
