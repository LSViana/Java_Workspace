package chapter5;
public class Ex5_22 {
	public static void main(String[] args) {
		System.out.println("\tTRIANGULES PRINTER\n");
		System.out.printf("%11s%12s%12s%12s\n", "(a)", "(b)", "(c)", "(d)");
		for(int i = 1; i <= 10; i++) {
			for(int ast = 1; ast <= i; ast++)
				System.out.print('*');
			for(int blank = 10; blank >= i; blank--)
				System.out.print(' ');
			System.out.print(' ');
			for(int ast = 10; ast >= i; ast--)
				System.out.print('*');
			for(int blank = 1; blank <= i; blank++)
				System.out.print(' ');
			System.out.print(' ');
			for(int blank = 1; blank <= i; blank++)
				System.out.print(' ');
			for(int ast = 10; ast >= i; ast--)
				System.out.print('*');
			System.out.print(' ');
			for(int blank = 10; blank >= i; blank--)
				System.out.print(' ');
			for(int ast = 1; ast <= i; ast++)
				System.out.print('*');
			System.out.println(' ');
		}
	}
}
