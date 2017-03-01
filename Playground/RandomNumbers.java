package playground;
import java.util.Random;
public class RandomNumbers {
	public static void main(String[] args) {
		Random randomNumbers = new Random();
		int a = 0;
		for(int cont = 0; cont < 10; cont++) {
			a = randomNumbers.nextInt(11);
			System.out.println(a);
		}
	}
}
