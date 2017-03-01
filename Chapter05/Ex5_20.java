package chapter5;
public class Ex5_20 {
	public static void main(String[] args) {
		System.out.println("\tPI'S VALUE CALCULATOR\n");
		double pi = 0; int attempts = 0, i;
		i = 0;
		while(pi <= 3.141586 || pi >= 3.141594) {
			if(i % 2 == 0)
				pi += 4.0 / (i++ * 2 + 1);
			else
				pi -= 4.0 / (i++ * 2 + 1);
			attempts++;
		} pi = 0;
		// Trying to find how many times we need to have 3.14159
		for(i = 0; i < 150296; i++) {
			if(i % 2 == 0)
				pi += 4.0 / (i * 2 + 1);
			else
				pi -= 4.0 / (i * 2 + 1);
		} System.out.printf("After %d attempts the approximated value of PI number: %.5f\n", attempts, pi);
	}
}
