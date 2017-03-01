package chapter5;
public class Ex5_14 {
	public static void main(String[] args) {
		double amount, principal = 1000.0, rate = 0.05;
		System.out.println("Interesting Calculator");
		// SOLUTION 1
			/*for(int year = 1; year <= 10; year++) {
				System.out.printf("\n%12s%27s \n", "Year", "Amount on deposit");	
				for(; rate <= 0.1; rate += 0.01) {
					amount = principal * Math.pow(1.0 + rate, year);
					System.out.printf("[%02.0f%%] %4d%,20.2f\n", rate * 100, year, amount);
				}
				rate = 0.05; principal = 1000.0;
			}*/
		// SOLUTION 2
		for(; rate <= 0.1; rate += 0.01) {
			System.out.printf("\n[%02.0f%%]%7s%22s \n", rate * 100, "Year", "Amount on deposit");
			for(int year = 1; year <= 10; year++) {
				amount = principal * Math.pow(1.0 + rate, year);
				System.out.printf("\t %02d%,20.2f\n", year, amount);
			}
		}
	}
}

// Additional
/*
	public static void main(String[] args) {
		double amount, principal = 1000.0, rate = 0.05;
		System.out.printf("%s%20s \n", "Year", "Amount on deposit");
		for(int year = 1; year <= 10; year++) {
			amount = principal * Math.pow(1.0 + rate, year);
			System.out.printf("%4d%,20.2f\n", year, amount);
		}
	}

 */
