package chapter5;
public class Ex5_23 {
	public static void main(String[] args) {
		System.out.println("\tMORGAN'S LAW\n");
		int x = 5, y = 7, a = 1, b = 2, g = 4, i = 3, j = 6;
		System.out.printf("X: %d | Y: %d | A: %d | B: %d | G: %d | I: %d | J: %d\n\n", x, y, a, b, g, i, j);
		System.out.printf("[Common] !(x < 5) && !(y >= 7)   → %b\n", !(x < 5) && !(y >= 7));
		System.out.printf("[Morgan] !((x < 5) || (y >= 7))  → %b\n", !((x < 5) || (y >= 7)));
		System.out.println();
		System.out.printf("[Common] !(a == b) || !(g != 5)  → %b\n", !(a == b) || !(g != 5));
		System.out.printf("[Morgan] !((a == b) && (g != 5)) → %b\n", !((a == b) && (g != 5)));
		System.out.println();
		System.out.printf("[Common] !((x <= 8) && (y > 4))  → %b\n", !((x <= 8) && (y > 4)));
		System.out.printf("[Morgan] !(x <= 8) || !(y > 4)   → %b\n", !(x <= 8) || !(y > 4));
		System.out.println();
		System.out.printf("[Common] !((i > 4) || (j <= 6))  → %b\n", !((i > 4) || (j <= 6)));
		System.out.printf("[Morgan] !(i > 4) && !(j <= 6)   → %b\n", !(i > 4) && !(j <= 6));
	}
 }
