package chapter6;
import java.util.Scanner;
public class Ex6_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tArrendondando números para o inteiro mais próximo (Digite zero para sair)\n");
		System.out.print("Digite um valor para arredondar: ");
		double value = input.nextDouble();
		while(value != 0.0) {
			System.out.printf("Valor original: %10f\tValor arredondado: %10f\n", value, Math.floor(value + 0.5));
			System.out.print("Digite um valor para arredondar: ");
			value = input.nextDouble();
		} System.out.println("A aplicação está encerrando.");
		input.close();
	}
}
