package playground;
public class MethodOverload {
	public void testOverloadedMethods() {
		System.out.println("Calling methods...");
	}
	protected double square(double number) { // Protected used to test the method scope. PROTECTED SET METHOD SCOPE TO THE PACKAGE
		System.out.printf("\nGenerating the square of double value %f\n", number);
		return number * number;
	} protected int square(int number) {
		System.out.printf("\nGenerating the square of int value %d\n", number);
		return number * number;
	}
}
