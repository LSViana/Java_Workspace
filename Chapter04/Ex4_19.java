package chapter4;
import java.util.Scanner;
public class Ex4_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("CÁLCULO DE VENDAS E PAGAMENTO [Digite zero para ir à próxima fase]\n");
		byte aux = 1; 
		System.out.printf("Digite o salário base do vendedor: ");
		double value = 0, incr = 1, salary = input.nextDouble();
		while (incr > 0) {
			System.out.printf("Digite o valor da venda %d: ", aux); aux++;
			incr = input.nextDouble();
			value += incr;
		}
		System.out.printf("\nO salário semanal deste vendedor foi de: R$%6.2f", salary + (0.09 * value));
		input.close();
	}
}
