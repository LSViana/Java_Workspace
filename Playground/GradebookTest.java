package playground;
import java.util.Scanner;
public class GradebookTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Gradebook myGradebook = new Gradebook();
		System.out.printf("Initial course name is: %s\n", myGradebook.getCourseName());
		myGradebook = new Gradebook("Java Programming");
		System.out.printf("Initial course name is: %s\n", myGradebook.getCourseName());
		System.out.print("Enter the course name: "); String courseName = input.nextLine(); myGradebook.setCourseName(courseName);
		myGradebook.displayMessage();
		input.close();
	}
}
