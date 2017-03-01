package chapter4;
public class Ex4_28 {
	public static void main(String[] args) {
		// Tests
		// letterA();
		// letterB();
		letterC();
	}
	public static void letterA() {
		int x = 5, y = 8;
		if (y == 8) {
			if (x == 5)
				System.out.println("@@@@@");
		} else
		System.out.println("#####");
		System.out.println("$$$$$");
		System.out.println("&&&&&");
	}
	public static void letterB() {
		int x = 5, y = 8;
		if (y == 8)
			if (x == 5)
				System.out.println("@@@@@");
			else {
				System.out.println("#####");
				System.out.println("$$$$$");
				System.out.println("&&&&&");
			}
	}
	public static void letterC() {
		int x = 5, y = 7;
		if (y == 8) {
			if (x == 5)
				System.out.println("@@@@@");
		} else {
		System.out.println("#####");
		System.out.println("$$$$$");
		System.out.println("&&&&&");
		}
	}
}
