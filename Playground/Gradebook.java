package playground;
public class Gradebook {
	private String courseName;
	public Gradebook() {
		courseName = "Standard Course Name";
	}
	public Gradebook(String name) {
		courseName = name;
	}
	public void setCourseName(String name) {
		courseName = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void displayMessage() {
		System.out.printf("Welcome to the Gradebook for \n%s!\n", getCourseName());
	}
}
