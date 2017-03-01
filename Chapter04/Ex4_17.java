package chapter4;
import java.util.Scanner;
public class Ex4_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int aux = 1, aux2 = 1;
		double gasTotal = 0, kmTotal = 0;
		System.out.println("Cálculo de Rendimento de Motor em Combustível [Digite 0 (zero) para sair)");
		while (aux > 0 & aux2 > 0) {
			System.out.printf("\nDigite a quantidade de combustível consumida: ");
			aux = input.nextInt();
			if (aux > 0) {
				gasTotal += aux;
				System.out.printf("Digite a quantidade de quilômetros percorridos: ");
				aux2 = input.nextInt();
				if (aux2 > 0) {
					kmTotal += aux2;
					System.out.printf("\tMédia de rendimento: %.2f km/l\n", (double) aux / aux2);
				} else
					gasTotal -= aux;
			}
		}
		if (gasTotal != 0 && kmTotal != 0)
			System.out.printf("\nConsumo total de combustível: %.2f\nTotal de quilômetros percorridos: %.2f\nMédia geral de rendimento: %.2f km/l\n", gasTotal, kmTotal, gasTotal / kmTotal);
		input.close();
	}
}
