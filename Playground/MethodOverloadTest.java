package playground;
public class MethodOverloadTest {
	public static void main(String[] args) {
		MethodOverload methodOverload = new MethodOverload();
		methodOverload.testOverloadedMethods();
		System.out.printf("Testing the method overload to square of INT value 7: %d", methodOverload.square(7));
		System.out.printf("Testing the method overload to square of DOUBLE value 7,5: %f", methodOverload.square(7.5));
	}
}
