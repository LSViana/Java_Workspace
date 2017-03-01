package chapter4;
public class Ex4_6 {
	public static void main(String[] args) {
		int x = 1, sum = 0	;
		while (x < 11) {
			sum += (x++);
		}
		System.out.printf("A soma é: %d\n", sum);
	}
}
