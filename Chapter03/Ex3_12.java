package chapter3;

public class Ex3_12 { // Classe Account modificada, figura 3.13
	private double balance;
	public static void main(String[] args) {
		Ex3_12 Account = new Ex3_12(500);
		Account.debit(500);
	} public Ex3_12(double initialBalance) {
		if(initialBalance > 0.0) balance = initialBalance;
	} public void credit(double amount) {
		balance += amount;
	} public double getBalance() {
		return balance;
	} public void debit(double amount) {
		if (amount <= balance) balance -= amount;
		else System.out.println("Debit amount exceeded account balance");
		System.out.printf("The balance is: %.2f\n", balance);
	}
}
