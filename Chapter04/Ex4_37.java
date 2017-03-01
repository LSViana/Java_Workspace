package chapter4;
import java.util.Scanner;
public class Ex4_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tCÁLCULO DE FATORIAL E ASSUNTOS SEMELHANTES\n");
		System.out.print("Digite o valor para executar o método: "); int aux = input.nextInt();
		System.out.printf("\n[A] O resultado é: %d", letterA(aux));
		System.out.printf("\n[B] O resultado é: %.4f", letterB(aux));
		System.out.printf("\n[C] O resultado é: %.4f", letterC(aux));
		System.out.printf("\n[POWER] O resultado é: %.4f", power(letterB(aux), aux)); // Change the exponent
		
		input.close();
	}
	public static int letterA(int number) {
		int multiplier = number - 1;
		for (; multiplier > 0; multiplier--)
			number *= multiplier;
		return number;
	}
	public static double letterB(int number) {
		double e = 1;
		for (int count = 1; count <= number; count++) {
			e += (double) 1 / letterA(count);
		}
		return e;
	}
	public static double letterC(int number) {
		double result = 1;
		for (int count = 1; count <= number; count++) {
			result += power(number, count) / letterA(count);
		}
		return result;
	}
	public static double power(double base, int exponent) {
		double power = 1;
		for (int count = 0; count < exponent; count++) {
			power *= base;
		}
		return power;
	}
}