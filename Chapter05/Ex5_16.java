package chapter5;
import java.util.Scanner;
public class Ex5_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tIMPRESSÃO DE GRÁFICOS E BARRAS\n");
		int[] number = new int[5];
		for(byte i = 0; i < number.length; i++) {
			System.out.print("Digite o " + (i + 1) + " valor: ");
			number[i] = input.nextInt();
		} System.out.println();
		for(byte i = 0; i < number.length; i++) {
			System.out.printf("[%d]: ", i + 1);
			for(byte ast = 0; ast < number[i]; ast++)
				System.out.print('*');
			System.out.println();
		}
		input.close();
	}
}
