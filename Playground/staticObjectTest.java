package playground;
import java.awt.Color;
import playground.staticObject;
public class staticObjectTest {
	public static void main(String[] args) {
		System.out.printf("%s\n", Color.RED);
		System.out.println(Color.GREEN);
		System.out.println(Color.BLUE);
		System.out.println(staticObject.gray);
		System.out.println(staticObject.black);
		System.out.println(staticObject.Colors.BLUE);
		System.out.printf("%.2f\n", staticObject.staticVariable);
		print(staticObject.gray);
		print(staticObject.black);
	}
	static void print(staticObject objectOne) {
		System.out.println(objectOne.color);
	}
}

