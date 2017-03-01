package playground;
import java.util.Random;
public class RollDie {
	public static void main(String[] args) {
		Random randomNumber = new Random();
		int[] frequency = new int[6];
		for(int roll = 1; roll <= 6000; roll++)
				// Instruction of Pos-Increment
			// frequency[randomNumber.nextInt(6)]++;
				// Instruction of Pre-Increment
			++frequency[randomNumber.nextInt(6)];
		System.out.printf("%s%10s\n", "Face", "Frequency");
		for(int face = 0; face < frequency.length; face++)
			System.out.printf("%4d%10d\n", face + 1, frequency[face]);
	}
}
