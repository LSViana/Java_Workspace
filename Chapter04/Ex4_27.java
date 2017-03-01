package chapter4;
public class Ex4_27 {
	public static void main(String[] args) {
		System.out.println("See the comments.");
		// Tests
		letterA();
		System.out.println();
		letterB();
		
	}
	public static void letterA() {
		int x = 11, y = 9;
		if (x < 10)
			if (y > 10)
				System.out.println("*****");
			else
				System.out.println("#####");
			System.out.println("$$$$$");
	}
	public static void letterB() {
		int x = 11, y = 9;
		if (x < 10) {
			if (y > 10)
				System.out.println("*****");
		} else {
			System.out.println("#####");
			System.out.println("$$$$$");
		}
	}
}

/* 4.27
 * 
 * a)	X = 9 ^ Y = 11
 * 		*****
 * 		$$$$$
 * 
 * 		X = 11 ^ Y = 9
 * 		$$$$$
 * 		
 * b)	X = 9 ^ Y = 11
 * 		*****
 * 
 * 		X = 11 ^ Y = 9
 * 		#####
 *		$$$$$
 * 
 */
