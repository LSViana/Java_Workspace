package chapter6;
import java.util.Scanner;
public class Ex6_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("[EXAMPLE] The method A call with 7 and 3: [%d]\n", methodA(7, 3));
		System.out.printf("[EXAMPLE] The method B call with 7 and 3: [%d]\n", methodB(7, 3));
		System.out.printf("[EXAMPLE] The method displayDigits call with 45629: "); displayDigits(45629);
		System.out.print("\nInput a value to display the digits: ");
		int value = input.nextInt();
		while(value != 0) {
			System.out.printf("\tThe method displayDigits call with %d: ", value); displayDigits(value);	
			System.out.print("\nInput a value to display the digits: ");
			value = input.nextInt();
		}
		input.close();
	}
	public static int methodA(int a, int b) { // Calcule a parte inteira do quociente quando o inteiro 'a' é dividido pelo inteiro 'b'
		return (a / b);
	}
	public static int methodB(int a, int b) { // Calcule o resto inteiro quando o inteiro 'a' é divido pelo inteiro 'b'
		return (a % b);
	}
	public static void displayDigits(int value) { // Recebe um inteiro entre 1 e 99999 e o exibe com dois espaços a cada caractere. Exemplo: [Entrada] 4562 → [Saída] 4  5  6  2
		if(value < 0)
			System.out.print("-  ");
		if(value / 10000 != 0)
			System.out.printf("%d  ", Math.abs(value / 10000));
		if(value / 1000 != 0)
			System.out.printf("%d  ", Math.abs(value / 1000 - (value / 10000) * 10));
		if(value / 100 != 0)
			System.out.printf("%d  ", Math.abs(value / 100 - (value / 1000) * 10));
		if(value / 10 != 0)
			System.out.printf("%d  ", Math.abs(value / 10 - (value / 100) * 10));
		if(value / 1 != 0)
			System.out.printf("%d  ", Math.abs(value / 1 - (value / 10) * 10));
	}
}
