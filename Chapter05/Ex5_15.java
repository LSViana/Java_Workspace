package chapter5;
public class Ex5_15 {
	public static void main(String[] args) {
		System.out.println("\tIMPRESSÃO DE PADRÕES TRIANGULARES\n");
		patternA();
		System.out.println();
		patternB();
		System.out.println();
		patternC();
		System.out.println();
		patternD();
		
	}
	public static void patternA() {
		System.out.printf("%10s\n", "(a)");
		for(int i = 1; i <= 10; i++) {
			for(int ast = 1; ast <= i; ast++)
				System.out.print('*');
			for(int blank = 10; blank > i; blank --)
				System.out.print(' ');
			System.out.println();
		}
	}
	public static void patternB() {
		System.out.printf("%10s\n", "(b)");
		for(int i = 1; i <= 10; i++) {
			for(int ast = 10; ast >= i; ast--)
				System.out.print('*');
			for(int blank = 1; blank < i; blank++)
				System.out.print(' ');
			System.out.println();
		}
	} 
	public static void patternC() {
		System.out.printf("%10s\n", "(c)");
		for(int i = 1; i <= 10; i++) {
			for(int blank = 1; blank < i; blank++)
				System.out.print(' ');
			for(int ast = 10; ast >= i; ast--) 
				System.out.print('*');
			System.out.println();
		}
	}
	public static void patternD() {
		System.out.printf("%10s\n", "(d)");
		for(int i = 1; i <= 10; i++) {
			for(int blank = 10; blank > i; blank--)
				System.out.print(' ');
			for(int ast = 1; ast <= i; ast++)
				System.out.print('*');
			System.out.println();
		}
	}
}
