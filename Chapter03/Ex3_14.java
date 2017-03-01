package chapter3;
import java.util.Scanner;
public class Ex3_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Employee EmployeeOne = new Employee ("Lucas", "Viana", 93142.85); 
		Employee EmployeeTwo = new Employee ("Vinícius", "Arraias", 93571.94);
		EmployeeOne.displayMessage();
		EmployeeTwo.displayMessage();
		EmployeeOne.setIncrease(input.nextDouble());
		EmployeeTwo.setIncrease(input.nextDouble());
		EmployeeOne.displayMessage();
		EmployeeTwo.displayMessage();
		input.close();
	}
}
class Employee {
	private String name;
	private String lastName;
	private double monthlySalary;
	public Employee (String n, String l, double m) {
		name = n;
		lastName = l;
		if (m > 0) monthlySalary = m;
	} public void setName (String n) {
		name = n;
	} public String getName () {
		return name;
	} public void setLastName (String l) {
		lastName = l;
	} public String getLastName () {
		return lastName;
	} public void setMonthlySalary (double m) {
		monthlySalary = m;
	} public double getMonthlySalary () {
		return monthlySalary;
	} public double getAnnualSalary () {
		return monthlySalary * 12;
	} public void setIncrease (double p) {
		monthlySalary = monthlySalary * (p / 100 + 1);
	}
	public void displayMessage () {
		System.out.printf("The name is: %s\nThe last name is: %s\nThe monthly salary is: %.2f\nThe annual salary is: %.2f\n", getName(), getLastName(), getMonthlySalary(), getAnnualSalary());
	}
}
