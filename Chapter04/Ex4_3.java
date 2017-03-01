package chapter4;
public class Ex4_3 {
	public static void main(String[] args) {
		int X = 0;
		System.out.println("Four ways to increment the X variable (initialized in 0):\n");
		System.out.println("X: " + X + " > (X = X + 1) > " + ++X);
		System.out.println("X: " + X + " > (X++) > " + X++);
		System.out.println("X: " + X + " > (++X) > " + ++X);
		System.out.println("X: " + X + " > (X += 1) > " + ++X);
	}
}
